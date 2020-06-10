package models;

import java.io.Serializable;
import java.util.HashMap;

import javax.persistence.*;


/**
 * The persistent class for the DIM_PATIENT_MERGE database table.
 * 
 */
@Entity
@Table(name="DIM_PATIENT_MERGE")
@NamedQuery(name="DimPatientMerge.findAll", query="SELECT d FROM DimPatientMerge d")
public class DimPatientMerge implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="PAT_KEY")
	private Integer patKey;

	@Column(name="GLOBAL_PAT_KEY")
	private Integer globalPatKey;

	public static HashMap<String,Integer> mappingInfo = new HashMap<String,Integer>(){
		{
			put("patKey",0);
			put("globalPatKey",1);
			
			
			
		}};
		public static Integer columnCount = 2;
	public DimPatientMerge() {
	}

	public int getPatKey() {
		return this.patKey;
	}

	public void setPatKey(int patKey) {
		this.patKey = patKey;
	}

	public int getGlobalPatKey() {
		return this.globalPatKey;
	}

	public void setGlobalPatKey(int globalPatKey) {
		this.globalPatKey = globalPatKey;
	}

}