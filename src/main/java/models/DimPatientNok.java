package models;

import java.io.Serializable;
import java.util.HashMap;

import javax.persistence.*;


/**
 * The persistent class for the DIM_PATIENT_NOK database table.
 * 
 */
@Entity
@Table(name="DIM_PATIENT_NOK")
@NamedQuery(name="DimPatientNok.findAll", query="SELECT d FROM DimPatientNok d")
public class DimPatientNok implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="PATIENT_NOK_KEY")
	private Integer patientNokKey;

	@Column(name="NOK_BUILDING_BLOCK")
	private String nokBuildingBlock;

	@Column(name="NOK_BUILDING_FLOOR")
	private String nokBuildingFloor;

	@Column(name="NOK_BUILDING_UNIT")
	private String nokBuildingUnit;

	@Column(name="NOK_CITY")
	private String nokCity;

	@Column(name="NOK_NAME")
	private String nokName;

	@Column(name="NOK_POSTAL_CODE")
	private String nokPostalCode;

	@Column(name="NOK_STREET")
	private String nokStreet;

	@Column(name="NOK_TEL_NO")
	private String nokTelNo;

	@Column(name="PATIENT_KEY")
	private Integer patientKey;

	@Column(name="RELATIONSHIP_KEY")
	private Integer relationshipKey;

	public static HashMap<String,Integer> mappingInfo = new HashMap<String,Integer>(){
		{
			put("patientNokKey",0);
			put("nokBuildingBlock",1);
			put("nokBuildingFloor",2);
			put("nokBuildingUnit",3);
			put("nokCity",4);
			put("nokName",5);
			put("nokPostalCode",6);
			put("nokStreet",7);
			put("nokTelNo",8);
			put("patientKey",9);
			put("relationshipKey",10);
			
			
		}};
		public static Integer columnCount = 11;
	public DimPatientNok() {
	}

	public int getPatientNokKey() {
		return this.patientNokKey;
	}

	public void setPatientNokKey(int patientNokKey) {
		this.patientNokKey = patientNokKey;
	}

	public String getNokBuildingBlock() {
		return this.nokBuildingBlock;
	}

	public void setNokBuildingBlock(String nokBuildingBlock) {
		this.nokBuildingBlock = nokBuildingBlock;
	}

	public String getNokBuildingFloor() {
		return this.nokBuildingFloor;
	}

	public void setNokBuildingFloor(String nokBuildingFloor) {
		this.nokBuildingFloor = nokBuildingFloor;
	}

	public String getNokBuildingUnit() {
		return this.nokBuildingUnit;
	}

	public void setNokBuildingUnit(String nokBuildingUnit) {
		this.nokBuildingUnit = nokBuildingUnit;
	}

	public String getNokCity() {
		return this.nokCity;
	}

	public void setNokCity(String nokCity) {
		this.nokCity = nokCity;
	}

	public String getNokName() {
		return this.nokName;
	}

	public void setNokName(String nokName) {
		this.nokName = nokName;
	}

	public String getNokPostalCode() {
		return this.nokPostalCode;
	}

	public void setNokPostalCode(String nokPostalCode) {
		this.nokPostalCode = nokPostalCode;
	}

	public String getNokStreet() {
		return this.nokStreet;
	}

	public void setNokStreet(String nokStreet) {
		this.nokStreet = nokStreet;
	}

	public String getNokTelNo() {
		return this.nokTelNo;
	}

	public void setNokTelNo(String nokTelNo) {
		this.nokTelNo = nokTelNo;
	}

	public int getPatientKey() {
		return this.patientKey;
	}

	public void setPatientKey(int patientKey) {
		this.patientKey = patientKey;
	}

	public int getRelationshipKey() {
		return this.relationshipKey;
	}

	public void setRelationshipKey(int relationshipKey) {
		this.relationshipKey = relationshipKey;
	}

}