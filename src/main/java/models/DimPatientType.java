package models;

import java.io.Serializable;
import java.util.HashMap;

import javax.persistence.*;


/**
 * The persistent class for the DIM_PATIENT_TYPE database table.
 * 
 */
@Entity
@Table(name="DIM_PATIENT_TYPE")
@NamedQuery(name="DimPatientType.findAll", query="SELECT d FROM DimPatientType d")
public class DimPatientType implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="PAT_TYPE_KEY")
	private Integer patTypeKey;

	@Column(name="PAT_TYPE")
	private String patType;

	@Column(name="PAT_TYPE_DESC")
	private String patTypeDesc;

	@Column(name="PAT_TYPE_GROUP")
	private String patTypeGroup;

	public static HashMap<String,Integer> mappingInfo = new HashMap<String,Integer>(){
		{
			put("patTypeKey",0);
			put("patType",1);
			put("patTypeDesc",2);
			put("patTypeGroup",3);
			
		}};
		public static Integer columnCount = 4;
	public DimPatientType() {
	}

	public int getPatTypeKey() {
		return this.patTypeKey;
	}

	public void setPatTypeKey(int patTypeKey) {
		this.patTypeKey = patTypeKey;
	}

	public String getPatType() {
		return this.patType;
	}

	public void setPatType(String patType) {
		this.patType = patType;
	}

	public String getPatTypeDesc() {
		return this.patTypeDesc;
	}

	public void setPatTypeDesc(String patTypeDesc) {
		this.patTypeDesc = patTypeDesc;
	}

	public String getPatTypeGroup() {
		return this.patTypeGroup;
	}

	public void setPatTypeGroup(String patTypeGroup) {
		this.patTypeGroup = patTypeGroup;
	}

}