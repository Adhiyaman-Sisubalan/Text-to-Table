package models;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.FilenameFilter;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Properties;
import java.text.SimpleDateFormat;  

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.hibernate.exception.DataException;

public class App {

	 public static void main(String[] args) throws IOException {
		 
		 FileReader reader=new FileReader("./src/main/java/models/property.properties");  
		 Properties p=new Properties();  
	     p.load(reader);
		 
		 
		 File file = new File(p.getProperty("folderLocation"));
	        File[] files = file.listFiles(new FilenameFilter() {
	             
	            public boolean accept(File dir, String name) {
	                if(name.toLowerCase().endsWith(".txt")){
	                    return true;
	                } else {
	                    return false;
	                }
	            }
	        });
	        
	        List<String> list = new ArrayList<String>();
	        for(File f:files){
	            list.add(f.getName());
	        }
		 
	        EntityManagerFactory emf = Persistence.createEntityManagerFactory("PERSISTENCE");
		     EntityManager em = emf.createEntityManager();
		     int rowCnt = 0;
	     for (int i =0; i < list.size(); i++ ) {
	     
	    	 String  tableName = (list.get(i));
			 tableName = (tableName.substring(0, tableName.length() - 13)).toUpperCase();
			 System.out.println("Table name: "+tableName);
	    	 name(tableName);
		     BufferedReader br = null;
		 

		
		 try {
			br = new BufferedReader(new FileReader(new File(p.getProperty("folderLocation")+list.get(i))));
			 String line = null;
	         String [] row = null;
            
			 em.getTransaction().begin();
	       
			 line = br.readLine();
			 BufferedWriter bufferedWriter = new BufferedWriter( new FileWriter(p.getProperty("errorFileLocation")+name(tableName)+"Error.txt",true));
			 try {
				 String name = "models." + name(tableName);
				 Class cl = Class.forName(name);
				 Object newObj = cl.newInstance();
				 Field fields[]= cl.getDeclaredFields();
				
				 while((line = br.readLine()) != null) {
						
						row = line.split(p.getProperty("delimiter"));
						HashMap<String,Integer> mappingInfo = (HashMap<String,Integer>)cl.getField("mappingInfo").get(null);
						Integer columnCount = (Integer)cl.getField("columnCount").get(null);
						if(row.length != columnCount) {
							for (int i1=0; i1<row.length; i1++) {
		                    	bufferedWriter.write(row[i1]);
		                    	bufferedWriter.write(p.getProperty("delimiter"));
		                    		};
		                     bufferedWriter.newLine();
						}else {
						try
						{
						
						
						for(Field field : fields) {
							String className = field.getType().getCanonicalName();
							String fieldName = field.getName();
							Object value = null;
							if(className.indexOf("Integer") != -1 && mappingInfo.containsKey(fieldName)) {
								value = Integer.parseInt(row[mappingInfo.get(fieldName)]);
							}else if(className.indexOf("String") != -1 && mappingInfo.containsKey(fieldName)) {
								value = row[mappingInfo.get(fieldName)];
							}else if(className.indexOf("Date") != -1 && mappingInfo.containsKey(fieldName)){
								  
							    value=new SimpleDateFormat("yyyy-mm-dd").parse(row[mappingInfo.get(fieldName)]);  
								 
							}
							else { // handling PKClass
								if( CompoundedPKInterface.class.isAssignableFrom(field.getType()) && mappingInfo.containsKey(fieldName)) {
									Class pkClass = field.getType();
									Object childObj = pkClass.newInstance();
									HashMap<String,Integer> pkMappingInfo = (HashMap<String,Integer>)pkClass.getField("mappingInfo").get(null);
									Field pkFields[] = pkClass.getDeclaredFields();
									for(Field pkField : pkFields) {
										String pkClassName = pkField.getType().getCanonicalName();
										String pkFieldName = pkField.getName();
										Object pkValue = null;
										if(pkClassName.indexOf("Integer") != -1) {
											pkValue = Integer.parseInt(row[pkMappingInfo.get(pkFieldName)]);
										}else if(pkClassName.indexOf("String") != -1) {
											pkValue = row[pkMappingInfo.get(pkFieldName)];
										}else if(pkClassName.indexOf("Date") != -1 && pkMappingInfo.containsKey(pkFieldName)){
											  
											pkValue=new SimpleDateFormat("yyyy-mm-dd").parse(row[pkMappingInfo.get(pkFieldName)]);  
											 
										}
										if(pkMappingInfo.containsKey(pkFieldName)) {
											pkField.setAccessible(true);
											pkField.set(childObj, pkValue);
										}
									}
									value = childObj;
								}
							}
							if(mappingInfo.containsKey(fieldName)) {
								field.setAccessible(true);
								field.set(newObj,value);
							}
						}
						em.merge(newObj);
						}
						catch(DataException e)
						{
							e.printStackTrace();
						}
						
						}
						
			     
				 } 
				rowCnt= (Integer) em.createNativeQuery("SELECT count(*) FROM "+tableName).getSingleResult();
				  
			     System.out.println("The Number of rows in the table are: "+rowCnt);
				em.getTransaction().commit();
				
			 }catch (NumberFormatException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}  
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
	     }
	     
	     
	     em.close();
	     
	     //moveFile(list);
}
	 
	 public static StringBuilder name(String tableName) {
		 
		 StringBuilder result = new StringBuilder(tableName.length());
		 String words[] = tableName.toLowerCase().split("_");
		 for (int i = 0; i < words.length; i++)
	        {
	            result.append(Character.toUpperCase(words[i].charAt(0))).append(words[i].substring(1));
	 
	        }
		 return result;
	 }
	 
	 
//	 public static void moveFile(List<String> list) {
//			
//			for(int i=0; i< list.size(); i++) {
//				File file1 = new File("C:\\Users\\ADHIYAMAN SISUBALAN\\Desktop\\Internship\\csvFile\\"+list.get(i)); 
//				System.out.println(file1);
//			    // renaming the file and moving it to a new location 
//			    if(file1.renameTo 
//			       (new File("C:\\Users\\ADHIYAMAN SISUBALAN\\Desktop\\Internship\\New folder"+list.get(i)))) 
//			    { 
//			        // if file copied successfully then delete the original file 
//			        file1.delete(); 
//			        System.out.println("File moved successfully"); 
//			    } 
//			    else
//			    { 
//			        System.out.println("Failed to move the file"); 
//			    } 
//			}
//			
//			
//		}



}
