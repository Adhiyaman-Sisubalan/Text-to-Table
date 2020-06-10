package models;

import java.io.Serializable;
import java.util.Date;
import java.util.HashMap;

import javax.persistence.*;


/**
 * The persistent class for the FCT_MOVEMENT database table.
 * 
 */
@Entity
@Table(name="FCT_MOVEMENT")
@NamedQuery(name="FctMovement.findAll", query="SELECT f FROM FctMovement f")
public class FctMovement implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private FctMovementPK id;

	@Column(name="ACCOMODATION_CAT_CD")
	private String accomodationCatCd;

	@Column(name="BED_CD")
	private String bedCd;

	@Column(name="CANCEL_DATE")
	private Date cancelDate;

	@Column(name="CANCEL_IND")
	private String cancelInd;

	@Column(name="CHECK_DIGIT")
	private String checkDigit;

	@Column(name="CLINIC_DEPT_CASE_ORG_UNIT_SID")
	private Integer clinicDeptCaseOrgUnitSid;

	@Column(name="CLINIC_DIAG_SPECIALTY_OU_KEY")
	private Integer clinicDiagSpecialtyOuKey;

	@Column(name="CLINICAL_DEPT_CASE")
	private String clinicalDeptCase;

	@Column(name="DEPT_OU")
	private String deptOu;

	@Column(name="ENCOUNTER_SID")
	private Integer encounterSid;

	@Column(name="INSTITUTION_SID")
	private Integer institutionSid;

	@Column(name="MOVEMENT_END_DATE")
	private Date movementEndDate;

	@Column(name="MOVEMENT_START_DATE")
	private Date movementStartDate;

	@Column(name="MOVEMENT_TYPE")
	private String movementType;

	@Column(name="MOVEMENT_TYPE_SID")
	private Integer movementTypeSid;

	@Column(name="NURSING_ORG_UNIT_SID")
	private Integer nursingOrgUnitSid;

	@Column(name="NURSING_OU")
	private String nursingOu;

	@Column(name="PAT_LOC_BED_ID")
	private String patLocBedId;

	@Column(name="PAT_LOC_BED_NAME")
	private String patLocBedName;

	@Column(name="PAT_LOC_FACILITY_ID")
	private String patLocFacilityId;

	@Column(name="PAT_LOC_FACILITY_NAME")
	private String patLocFacilityName;

	@Column(name="PATIENT_CLASS")
	private String patientClass;

	@Column(name="PLAN_IND")
	private String planInd;

	@Column(name="PLAN_MOVEMENT_DATE")
	private Date planMovementDate;

	@Column(name="ROOM_CD")
	private String roomCd;

	@Column(name="SUB_SPECIALTY_ORG_UNIT_SID")
	private Integer subSpecialtyOrgUnitSid;

	@Column(name="TREATMENT_CAT")
	private String treatmentCat;

	@Column(name="TREATMENT_CATEGORY_SID")
	private Integer treatmentCategorySid;

	public static HashMap<String,Integer> mappingInfo = new HashMap<String,Integer>(){
		{
			put("id",-1);
			
			
			
			put("accomodationCatCd",3);
			put("bedCd",4);
			put("cancelDate",5);
			put("cancelInd",6);
			put("checkDigit",7);
			put("clinicDeptCaseOrgUnitSid",8);
			put("clinicDiagSpecialtyOuKey",9);
			put("clinicalDeptCase",10);
			put("deptOu",11);
			put("encounterSid",12);
			put("institutionSid",13);
			put("movementEndDate",14);
			put("movementStartDate",15);
			put("movementType",16);
			put("movementTypeSid",17);
			put("nursingOrgUnitSid",18);
			put("nursingOu",19);
			put("patLocBedId",20);
			put("patLocBedName",21);
			put("patLocFacilityId",22);
			put("patLocFacilityName",23);
			put("patientClass",24);
			put("planInd",25);
			put("planMovementDate",26);
			put("roomCd",27);
			put("subSpecialtyOrgUnitSid",28);
			put("treatmentCat",29);
			put("treatmentCategorySid",30);
			
		}};
	public static Integer columnCount = 31;
	public FctMovement() {
	}

	public FctMovementPK getId() {
		return this.id;
	}

	public void setId(FctMovementPK id) {
		this.id = id;
	}

	public String getAccomodationCatCd() {
		return this.accomodationCatCd;
	}

	public void setAccomodationCatCd(String accomodationCatCd) {
		this.accomodationCatCd = accomodationCatCd;
	}

	public String getBedCd() {
		return this.bedCd;
	}

	public void setBedCd(String bedCd) {
		this.bedCd = bedCd;
	}

	public Date getCancelDate() {
		return this.cancelDate;
	}

	public void setCancelDate(Date cancelDate) {
		this.cancelDate = cancelDate;
	}

	public String getCancelInd() {
		return this.cancelInd;
	}

	public void setCancelInd(String cancelInd) {
		this.cancelInd = cancelInd;
	}

	public String getCheckDigit() {
		return this.checkDigit;
	}

	public void setCheckDigit(String checkDigit) {
		this.checkDigit = checkDigit;
	}

	public int getClinicDeptCaseOrgUnitSid() {
		return this.clinicDeptCaseOrgUnitSid;
	}

	public void setClinicDeptCaseOrgUnitSid(int clinicDeptCaseOrgUnitSid) {
		this.clinicDeptCaseOrgUnitSid = clinicDeptCaseOrgUnitSid;
	}

	public int getClinicDiagSpecialtyOuKey() {
		return this.clinicDiagSpecialtyOuKey;
	}

	public void setClinicDiagSpecialtyOuKey(int clinicDiagSpecialtyOuKey) {
		this.clinicDiagSpecialtyOuKey = clinicDiagSpecialtyOuKey;
	}

	public String getClinicalDeptCase() {
		return this.clinicalDeptCase;
	}

	public void setClinicalDeptCase(String clinicalDeptCase) {
		this.clinicalDeptCase = clinicalDeptCase;
	}

	public String getDeptOu() {
		return this.deptOu;
	}

	public void setDeptOu(String deptOu) {
		this.deptOu = deptOu;
	}

	public int getEncounterSid() {
		return this.encounterSid;
	}

	public void setEncounterSid(int encounterSid) {
		this.encounterSid = encounterSid;
	}

	public int getInstitutionSid() {
		return this.institutionSid;
	}

	public void setInstitutionSid(int institutionSid) {
		this.institutionSid = institutionSid;
	}

	public Date getMovementEndDate() {
		return this.movementEndDate;
	}

	public void setMovementEndDate(Date movementEndDate) {
		this.movementEndDate = movementEndDate;
	}

	public Date getMovementStartDate() {
		return this.movementStartDate;
	}

	public void setMovementStartDate(Date movementStartDate) {
		this.movementStartDate = movementStartDate;
	}

	public String getMovementType() {
		return this.movementType;
	}

	public void setMovementType(String movementType) {
		this.movementType = movementType;
	}

	public int getMovementTypeSid() {
		return this.movementTypeSid;
	}

	public void setMovementTypeSid(int movementTypeSid) {
		this.movementTypeSid = movementTypeSid;
	}

	public int getNursingOrgUnitSid() {
		return this.nursingOrgUnitSid;
	}

	public void setNursingOrgUnitSid(int nursingOrgUnitSid) {
		this.nursingOrgUnitSid = nursingOrgUnitSid;
	}

	public String getNursingOu() {
		return this.nursingOu;
	}

	public void setNursingOu(String nursingOu) {
		this.nursingOu = nursingOu;
	}

	public String getPatLocBedId() {
		return this.patLocBedId;
	}

	public void setPatLocBedId(String patLocBedId) {
		this.patLocBedId = patLocBedId;
	}

	public String getPatLocBedName() {
		return this.patLocBedName;
	}

	public void setPatLocBedName(String patLocBedName) {
		this.patLocBedName = patLocBedName;
	}

	public String getPatLocFacilityId() {
		return this.patLocFacilityId;
	}

	public void setPatLocFacilityId(String patLocFacilityId) {
		this.patLocFacilityId = patLocFacilityId;
	}

	public String getPatLocFacilityName() {
		return this.patLocFacilityName;
	}

	public void setPatLocFacilityName(String patLocFacilityName) {
		this.patLocFacilityName = patLocFacilityName;
	}

	public String getPatientClass() {
		return this.patientClass;
	}

	public void setPatientClass(String patientClass) {
		this.patientClass = patientClass;
	}

	public String getPlanInd() {
		return this.planInd;
	}

	public void setPlanInd(String planInd) {
		this.planInd = planInd;
	}

	public Date getPlanMovementDate() {
		return this.planMovementDate;
	}

	public void setPlanMovementDate(Date planMovementDate) {
		this.planMovementDate = planMovementDate;
	}

	public String getRoomCd() {
		return this.roomCd;
	}

	public void setRoomCd(String roomCd) {
		this.roomCd = roomCd;
	}

	public int getSubSpecialtyOrgUnitSid() {
		return this.subSpecialtyOrgUnitSid;
	}

	public void setSubSpecialtyOrgUnitSid(int subSpecialtyOrgUnitSid) {
		this.subSpecialtyOrgUnitSid = subSpecialtyOrgUnitSid;
	}

	public String getTreatmentCat() {
		return this.treatmentCat;
	}

	public void setTreatmentCat(String treatmentCat) {
		this.treatmentCat = treatmentCat;
	}

	public int getTreatmentCategorySid() {
		return this.treatmentCategorySid;
	}

	public void setTreatmentCategorySid(int treatmentCategorySid) {
		this.treatmentCategorySid = treatmentCategorySid;
	}

}