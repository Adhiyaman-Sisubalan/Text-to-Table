package models;

import java.io.Serializable;
import java.util.Date;
import java.util.HashMap;

import javax.persistence.*;


/**
 * The persistent class for the FCT_LIS_REQUEST database table.
 * 
 */
@Entity
@Table(name="FCT_LIS_REQUEST")
@NamedQuery(name="FctLisRequest.findAll", query="SELECT f FROM FctLisRequest f")
public class FctLisRequest implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="LIS_REQUEST_SID")
	private Integer lisRequestSid;

	@Column(name="CANCEL_IND")
	private String cancelInd;

	@Column(name="CATEGORY")
	private Integer category;

	@Column(name="COLLECTION_DATE")
	private Date collectionDate;

	@Column(name="COLLECTION_DATE_SID")
	private Integer collectionDateSid;

	@Column(name="ENCOUNTER_SID")
	private Integer encounterSid;

	@Column(name="HOSPITID")
	private Integer hospitid;

	@Column(name="HOSPITINT")
	private String hospitint;

	@Column(name="INSTITUTION_SID")
	private Integer institutionSid;

	@Column(name="LAB_ACCESS_INT")
	private String labAccessInt;

	@Column(name="LASTUPDTESTDATE")
	private Date lastupdtestdate;

	@Column(name="LISDATE")
	private Date lisdate;

	@Column(name="LOG_DATE")
	private Date logDate;

	@Column(name="PATIENT_NRIC")
	private String patientNric;

	@Column(name="RECEIVEDDATE")
	private Date receiveddate;

	@Column(name="REQ_LOCATION")
	private String reqLocation;

	@Column(name="REQCREATIONDATE")
	private Integer reqcreationdate;

	@Column(name="REQSTATUS")
	private Integer reqstatus;

	@Column(name="REQTOVALID")
	private Integer reqtovalid;

	@Column(name="REQUEST_DATE")
	private Date requestDate;

	@Column(name="REQUEST_DATE_SID")
	private Integer requestDateSid;

	@Column(name="REQUEST_ID")
	private Integer requestId;

	@Column(name="STATUSDATE")
	private Date statusdate;

	@Column(name="URGENCY_STATUS")
	private String urgencyStatus;

	public static HashMap<String,Integer> mappingInfo = new HashMap<String,Integer>(){
		{
			put("lisRequestSid",0);
			put("cancelInd",1);
			put("category",2);
			put("collectionDate",3);
			put("collectionDateSid",4);
			put("encounterSid",5);
			put("hospitid",6);
			put("hospitnumber",7);
			put("institutionSid",8);
			put("labAccessNumber",9);
			put("lastupdtestdate",10);
			put("lisdate",11);
			put("logDate",12);
			put("patientNric",13);
			put("receiveddate",14);
			put("reqLocation",15);
			put("reqcreationdate",16);
			put("reqstatus",17);
			put("reqtovalid",18);
			put("requestDate",19);
			put("requestDateSid",20);
			put("requestId",21);
			put("statusdate",22);
			put("urgencyStatus",23);
			
		}};
	public static Integer columnCount = 24;
	public FctLisRequest() {
	}

	public int getLisRequestSid() {
		return this.lisRequestSid;
	}

	public void setLisRequestSid(int lisRequestSid) {
		this.lisRequestSid = lisRequestSid;
	}

	public String getCancelInd() {
		return this.cancelInd;
	}

	public void setCancelInd(String cancelInd) {
		this.cancelInd = cancelInd;
	}

	public int getCategory() {
		return this.category;
	}

	public void setCategory(int category) {
		this.category = category;
	}

	public Date getCollectionDate() {
		return this.collectionDate;
	}

	public void setCollectionDate(Date collectionDate) {
		this.collectionDate = collectionDate;
	}

	public int getCollectionDateSid() {
		return this.collectionDateSid;
	}

	public void setCollectionDateSid(int collectionDateSid) {
		this.collectionDateSid = collectionDateSid;
	}

	public int getEncounterSid() {
		return this.encounterSid;
	}

	public void setEncounterSid(int encounterSid) {
		this.encounterSid = encounterSid;
	}

	public int getHospitid() {
		return this.hospitid;
	}

	public void setHospitid(int hospitid) {
		this.hospitid = hospitid;
	}

	public String getHospitint() {
		return this.hospitint;
	}

	public void setHospitint(String hospitint) {
		this.hospitint = hospitint;
	}

	public int getInstitutionSid() {
		return this.institutionSid;
	}

	public void setInstitutionSid(int institutionSid) {
		this.institutionSid = institutionSid;
	}

	public String getLabAccessInt() {
		return this.labAccessInt;
	}

	public void setLabAccessInt(String labAccessInt) {
		this.labAccessInt = labAccessInt;
	}

	public Date getLastupdtestdate() {
		return this.lastupdtestdate;
	}

	public void setLastupdtestdate(Date lastupdtestdate) {
		this.lastupdtestdate = lastupdtestdate;
	}

	public Date getLisdate() {
		return this.lisdate;
	}

	public void setLisdate(Date lisdate) {
		this.lisdate = lisdate;
	}

	public Date getLogDate() {
		return this.logDate;
	}

	public void setLogDate(Date logDate) {
		this.logDate = logDate;
	}

	public String getPatientNric() {
		return this.patientNric;
	}

	public void setPatientNric(String patientNric) {
		this.patientNric = patientNric;
	}

	public Date getReceiveddate() {
		return this.receiveddate;
	}

	public void setReceiveddate(Date receiveddate) {
		this.receiveddate = receiveddate;
	}

	public String getReqLocation() {
		return this.reqLocation;
	}

	public void setReqLocation(String reqLocation) {
		this.reqLocation = reqLocation;
	}

	public int getReqcreationdate() {
		return this.reqcreationdate;
	}

	public void setReqcreationdate(int reqcreationdate) {
		this.reqcreationdate = reqcreationdate;
	}

	public int getReqstatus() {
		return this.reqstatus;
	}

	public void setReqstatus(int reqstatus) {
		this.reqstatus = reqstatus;
	}

	public int getReqtovalid() {
		return this.reqtovalid;
	}

	public void setReqtovalid(int reqtovalid) {
		this.reqtovalid = reqtovalid;
	}

	public Date getRequestDate() {
		return this.requestDate;
	}

	public void setRequestDate(Date requestDate) {
		this.requestDate = requestDate;
	}

	public int getRequestDateSid() {
		return this.requestDateSid;
	}

	public void setRequestDateSid(int requestDateSid) {
		this.requestDateSid = requestDateSid;
	}

	public int getRequestId() {
		return this.requestId;
	}

	public void setRequestId(int requestId) {
		this.requestId = requestId;
	}

	public Date getStatusdate() {
		return this.statusdate;
	}

	public void setStatusdate(Date statusdate) {
		this.statusdate = statusdate;
	}

	public String getUrgencyStatus() {
		return this.urgencyStatus;
	}

	public void setUrgencyStatus(String urgencyStatus) {
		this.urgencyStatus = urgencyStatus;
	}

}