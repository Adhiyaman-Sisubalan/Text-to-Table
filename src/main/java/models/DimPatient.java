package models;

import java.io.Serializable;
import java.util.Date;
import java.util.HashMap;

import javax.persistence.*;


/**
 * The persistent class for the DIM_PATIENT database table.
 * 
 */
@Entity
@Table(name="DIM_PATIENT")
@NamedQuery(name="DimPatient.findAll", query="SELECT d FROM DimPatient d")
public class DimPatient implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="PATIENT_KEY")
	private Integer patientKey;

	@Column(name="BIRTH_DATE")
	private Date birthDate;

	@Column(name="BUILDING_BLOCK")
	private String buildingBlock;

	@Column(name="BUILDING_FLOOR")
	private String buildingFloor;

	@Column(name="BUILDING_UNIT")
	private String buildingUnit;

	@Column(name="CITY")
	private String city;

	@Column(name="COUNTRY_KEY")
	private Integer countryKey;

	@Column(name="DEATH_DATE")
	private Date deathDate;

	@Column(name="DECEASE_IND")
	private String deceaseInd;

	@Column(name="DOCUMENT_NO")
	private String documentNo;

	@Column(name="DOCUMENT_TYPE_KEY")
	private Integer documentTypeKey;

	@Column(name="EMAIL")
	private String email;

	@Column(name="EXT_PATIENT_CD")
	private String extPatientCd;

	@Column(name="FIRST_NAME")
	private String firstName;

	@Column(name="GENDER_KEY")
	private Integer genderKey;

	@Column(name="HIGHEST_EDU_LVL")
	private String highestEduLvl;

	@Column(name="HOME_NO")
	private String homeNo;

	@Column(name="LAST_NAME")
	private String lastName;

	@Column(name="MARITAL_STAT_KEY")
	private Integer maritalStatKey;

	@Column(name="MOBILE_NO")
	private String mobileNo;

	@Column(name="NON_RESIDENT_IND")
	private String nonResidentInd;

	@Column(name="OFFICE_NO")
	private String officeNo;

	@Column(name="OTHER_DESIGNATION")
	private String otherDesignation;

	@Column(name="PAGER_NO")
	private String pagerNo;

	@Column(name="PAT_COUNTRY_KEY")
	private Integer patCountryKey;

	@Column(name="PATIENT_NAME")
	private String patientName;

	@Column(name="PATIENT_NO")
	private String patientNo;

	@Column(name="POSTAL_CODE")
	private String postalCode;

	@Column(name="RACE_KEY")
	private Integer raceKey;

	@Column(name="RELIGION_KEY")
	private Integer religionKey;

	@Column(name="STREET")
	private Integer street;

	public static HashMap<String,Integer> mappingInfo = new HashMap<String,Integer>(){
		{
			put("patientKey",0);
			put("birthDate",1);
			put("buildingBlock",2);
			put("buildingFloor",3);
			put("buildingUnit",4);
			put("city",5);
			put("countryKey",6);
			put("deathDate",7);
			put("deceaseInd",8);
			put("documentNo",9);
			put("documentTypeKey",10);
			put("email",11);
			put("extPatientCd",12);
			put("firstName",13);
			put("genderKey",14);
			put("highestEduLvl",15);
			put("homeNo",16);
			put("lastName",17);
			put("maritalStatKey",18);
			put("mobileNo",19);
			put("nonResidentInd",20);
			put("officeNo",21);
			put("otherDesignation",22);
			put("pagerNo",23);
			put("patCountryKey",24);
			put("patientName",25);
			put("patientNo",26);
			put("postalCode",27);
			put("raceKey",28);
			put("religionKey",29);
			put("street",30);
		}};
		public static Integer columnCount = 31;
	public DimPatient() {
	}

	public int getPatientKey() {
		return this.patientKey;
	}

	public void setPatientKey(int patientKey) {
		this.patientKey = patientKey;
	}

	public Object getBirthDate() {
		return this.birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public String getBuildingBlock() {
		return this.buildingBlock;
	}

	public void setBuildingBlock(String buildingBlock) {
		this.buildingBlock = buildingBlock;
	}

	public String getBuildingFloor() {
		return this.buildingFloor;
	}

	public void setBuildingFloor(String buildingFloor) {
		this.buildingFloor = buildingFloor;
	}

	public String getBuildingUnit() {
		return this.buildingUnit;
	}

	public void setBuildingUnit(String buildingUnit) {
		this.buildingUnit = buildingUnit;
	}

	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getCountryKey() {
		return this.countryKey;
	}

	public void setCountryKey(int countryKey) {
		this.countryKey = countryKey;
	}

	public Object getDeathDate() {
		return this.deathDate;
	}

	public void setDeathDate(Date deathDate) {
		this.deathDate = deathDate;
	}

	public String getDeceaseInd() {
		return this.deceaseInd;
	}

	public void setDeceaseInd(String deceaseInd) {
		this.deceaseInd = deceaseInd;
	}

	public String getDocumentNo() {
		return this.documentNo;
	}

	public void setDocumentNo(String documentNo) {
		this.documentNo = documentNo;
	}

	public int getDocumentTypeKey() {
		return this.documentTypeKey;
	}

	public void setDocumentTypeKey(int documentTypeKey) {
		this.documentTypeKey = documentTypeKey;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getExtPatientCd() {
		return this.extPatientCd;
	}

	public void setExtPatientCd(String extPatientCd) {
		this.extPatientCd = extPatientCd;
	}

	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public int getGenderKey() {
		return this.genderKey;
	}

	public void setGenderKey(int genderKey) {
		this.genderKey = genderKey;
	}

	public String getHighestEduLvl() {
		return this.highestEduLvl;
	}

	public void setHighestEduLvl(String highestEduLvl) {
		this.highestEduLvl = highestEduLvl;
	}

	public String getHomeNo() {
		return this.homeNo;
	}

	public void setHomeNo(String homeNo) {
		this.homeNo = homeNo;
	}

	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getMaritalStatKey() {
		return this.maritalStatKey;
	}

	public void setMaritalStatKey(int maritalStatKey) {
		this.maritalStatKey = maritalStatKey;
	}

	public String getMobileNo() {
		return this.mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getNonResidentInd() {
		return this.nonResidentInd;
	}

	public void setNonResidentInd(String nonResidentInd) {
		this.nonResidentInd = nonResidentInd;
	}

	public String getOfficeNo() {
		return this.officeNo;
	}

	public void setOfficeNo(String officeNo) {
		this.officeNo = officeNo;
	}

	public String getOtherDesignation() {
		return this.otherDesignation;
	}

	public void setOtherDesignation(String otherDesignation) {
		this.otherDesignation = otherDesignation;
	}

	public String getPagerNo() {
		return this.pagerNo;
	}

	public void setPagerNo(String pagerNo) {
		this.pagerNo = pagerNo;
	}

	public int getPatCountryKey() {
		return this.patCountryKey;
	}

	public void setPatCountryKey(int patCountryKey) {
		this.patCountryKey = patCountryKey;
	}

	public String getPatientName() {
		return this.patientName;
	}

	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}

	public String getPatientNo() {
		return this.patientNo;
	}

	public void setPatientNo(String patientNo) {
		this.patientNo = patientNo;
	}

	public String getPostalCode() {
		return this.postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public int getRaceKey() {
		return this.raceKey;
	}

	public void setRaceKey(int raceKey) {
		this.raceKey = raceKey;
	}

	public int getReligionKey() {
		return this.religionKey;
	}

	public void setReligionKey(int religionKey) {
		this.religionKey = religionKey;
	}

	public int getStreet() {
		return this.street;
	}

	public void setStreet(int street) {
		this.street = street;
	}

}