package models;

import java.io.Serializable;
import java.util.Date;
import java.util.HashMap;

import javax.persistence.*;


/**
 * The persistent class for the FCT_CASE_PAT_DAYS database table.
 * 
 */
@Entity
@Table(name="FCT_CASE_PAT_DAYS")
@NamedQuery(name="FctCasePatDays.findAll", query="SELECT f FROM FctCasePatDays f")
public class FctCasePatDays implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="CASE_PAT_DAYS_KEY")
	private Integer casePatDaysKey;

	@Column(name="ACCOMODATION_CAT_CD")
	private String accomodationCatCd;

	@Column(name="BED_CD")
	private String bedCd;

	@Column(name="BILL_CLS_KEY")
	private Integer billClsKey;

	@Column(name="CANCEL_IND")
	private String cancelInd;

	@Column(name="[CLASS]")
	private String class_;

	@Column(name="DEPT_OU_KEY")
	private Integer deptOuKey;

	@Column(name="ENC_KEY")
	private Integer encKey;

	@Column(name="INSTITUTION_KEY")
	private Integer institutionKey;

	@Column(name="MONTH_KEY")
	private Integer monthKey;

	@Column(name="MOVEMENT_END_DATE")
	private Date movementEndDate;

	@Column(name="MOVEMENT_SEQ")
	private String movementSeq;

	@Column(name="MOVEMENT_START_DATE")
	private Date movementStartDate;

	@Column(name="NURSING_OU_KEY")
	private Integer nursingOuKey;

	@Column(name="PAT_DAYS_ACUTE")
	private Integer patDaysAcute;

	@Column(name="PAT_DAYS_HD")
	private Integer patDaysHd;

	@Column(name="PAT_DAYS_ICU")
	private Integer patDaysIcu;

	@Column(name="PAT_DAYS_ISO")
	private Integer patDaysIso;

	@Column(name="PAT_DAYS_REHAB")
	private Integer patDaysRehab;

	@Column(name="PAT_DAYS_SURGICAL")
	private Integer patDaysSurgical;

	@Column(name="PATIENT_CLASS_KEY")
	private Integer patientClassKey;

	@Column(name="PLAN_IND")
	private String planInd;

	@Column(name="TREATMENT_CAT_KEY")
	private Integer treatmentCatKey;

	public static HashMap<String,Integer> mappingInfo = new HashMap<String,Integer>(){
		{
			put("casePatDaysKey",0);
			put("accomodationCatCd",1);
			put("bedCd",2);
			put("billClsKey",3);
			put("cancelInd",4);
			put("class",5);
			put("deptOuKey",6);
			put("encKey",7);
			put("institutionKey",8);
			put("monthKey",9);
			put("movementEndDate",10);
			put("movementSeq",11);
			put("movementStartDate",12);
			put("nursingOuKey",13);
			put("patDaysAcute",14);
			put("patDaysHd",15);
			put("patDaysIcu",16);
			put("patDaysIso",17);
			put("patDaysRehab",18);
			put("patDaysSurgical",19);
			put("patientClassKey",20);
			put("planInd",21);
			put("treatmentCatKey",22);
			
			
		}};
		public static Integer columnCount = 23;
	public FctCasePatDays() {
	}

	public int getCasePatDaysKey() {
		return this.casePatDaysKey;
	}

	public void setCasePatDaysKey(int casePatDaysKey) {
		this.casePatDaysKey = casePatDaysKey;
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

	public int getBillClsKey() {
		return this.billClsKey;
	}

	public void setBillClsKey(int billClsKey) {
		this.billClsKey = billClsKey;
	}

	public String getCancelInd() {
		return this.cancelInd;
	}

	public void setCancelInd(String cancelInd) {
		this.cancelInd = cancelInd;
	}

	public String getClass_() {
		return this.class_;
	}

	public void setClass_(String class_) {
		this.class_ = class_;
	}

	public int getDeptOuKey() {
		return this.deptOuKey;
	}

	public void setDeptOuKey(int deptOuKey) {
		this.deptOuKey = deptOuKey;
	}

	public int getEncKey() {
		return this.encKey;
	}

	public void setEncKey(int encKey) {
		this.encKey = encKey;
	}

	public int getInstitutionKey() {
		return this.institutionKey;
	}

	public void setInstitutionKey(int institutionKey) {
		this.institutionKey = institutionKey;
	}

	public int getMonthKey() {
		return this.monthKey;
	}

	public void setMonthKey(int monthKey) {
		this.monthKey = monthKey;
	}

	public Object getMovementEndDate() {
		return this.movementEndDate;
	}

	public void setMovementEndDate(Date movementEndDate) {
		this.movementEndDate = movementEndDate;
	}

	public String getMovementSeq() {
		return this.movementSeq;
	}

	public void setMovementSeq(String movementSeq) {
		this.movementSeq = movementSeq;
	}

	public Object getMovementStartDate() {
		return this.movementStartDate;
	}

	public void setMovementStartDate(Date movementStartDate) {
		this.movementStartDate = movementStartDate;
	}

	public int getNursingOuKey() {
		return this.nursingOuKey;
	}

	public void setNursingOuKey(int nursingOuKey) {
		this.nursingOuKey = nursingOuKey;
	}

	public int getPatDaysAcute() {
		return this.patDaysAcute;
	}

	public void setPatDaysAcute(int patDaysAcute) {
		this.patDaysAcute = patDaysAcute;
	}

	public int getPatDaysHd() {
		return this.patDaysHd;
	}

	public void setPatDaysHd(int patDaysHd) {
		this.patDaysHd = patDaysHd;
	}

	public int getPatDaysIcu() {
		return this.patDaysIcu;
	}

	public void setPatDaysIcu(int patDaysIcu) {
		this.patDaysIcu = patDaysIcu;
	}

	public int getPatDaysIso() {
		return this.patDaysIso;
	}

	public void setPatDaysIso(int patDaysIso) {
		this.patDaysIso = patDaysIso;
	}

	public int getPatDaysRehab() {
		return this.patDaysRehab;
	}

	public void setPatDaysRehab(int patDaysRehab) {
		this.patDaysRehab = patDaysRehab;
	}

	public int getPatDaysSurgical() {
		return this.patDaysSurgical;
	}

	public void setPatDaysSurgical(int patDaysSurgical) {
		this.patDaysSurgical = patDaysSurgical;
	}

	public int getPatientClassKey() {
		return this.patientClassKey;
	}

	public void setPatientClassKey(int patientClassKey) {
		this.patientClassKey = patientClassKey;
	}

	public String getPlanInd() {
		return this.planInd;
	}

	public void setPlanInd(String planInd) {
		this.planInd = planInd;
	}

	public int getTreatmentCatKey() {
		return this.treatmentCatKey;
	}

	public void setTreatmentCatKey(int treatmentCatKey) {
		this.treatmentCatKey = treatmentCatKey;
	}

}