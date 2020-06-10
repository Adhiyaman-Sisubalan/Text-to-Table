package models;

import java.io.Serializable;
import java.util.HashMap;

import javax.persistence.*;


/**
 * The persistent class for the DIM_AGE_GROUP database table.
 * 
 */
@Entity
@Table(name="DIM_AGE_GROUP")
@NamedQuery(name="DimAgeGroup.findAll", query="SELECT d FROM DimAgeGroup d")
public class DimAgeGroup implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="AGE_GROUP_KEY")
	private Integer ageGroupKey;

	@Column(name="AGE")
	private String age;

	@Column(name="AGE_GROUP_DESC")
	private String ageGroupDesc;

	@Column(name="AGE_INTERVAL_DESC")
	private String ageIntervalDesc;
	
	public static HashMap<String,Integer> mappingInfo = new HashMap<String,Integer>(){
		{
			put("ageGroupKey",0);
			put("age",1);
			put("ageGroupDesc",2);
			put("ageIntervalDesc",3);
		}
	};
	public static Integer columnCount = 4;
	public DimAgeGroup() {
	}

	public int getAgeGroupKey() {
		return this.ageGroupKey;
	}

	public void setAgeGroupKey(int ageGroupKey) {
		this.ageGroupKey = ageGroupKey;
	}

	public String getAge() {
		return this.age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getAgeGroupDesc() {
		return this.ageGroupDesc;
	}

	public void setAgeGroupDesc(String ageGroupDesc) {
		this.ageGroupDesc = ageGroupDesc;
	}

	public String getAgeIntervalDesc() {
		return this.ageIntervalDesc;
	}

	public void setAgeIntervalDesc(String ageIntervalDesc) {
		this.ageIntervalDesc = ageIntervalDesc;
	}

}