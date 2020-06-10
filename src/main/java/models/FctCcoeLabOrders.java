package models;

import java.io.Serializable;
import java.util.Date;
import java.util.HashMap;

import javax.persistence.*;


/**
 * The persistent class for the FCT_CCOE_LAB_ORDERS database table.
 * 
 */
@Entity
@Table(name="FCT_CCOE_LAB_ORDERS")
@NamedQuery(name="FctCcoeLabOrders.findAll", query="SELECT f FROM FctCcoeLabOrders f")
public class FctCcoeLabOrders implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="LAB_ORDER_SID")
	private Integer labOrderSid;

	@Column(name="ACCESSION_NO")
	private String accessionNo;

	@Column(name="ACTUAL_LAB_ACCESSION_NO")
	private String actualLabAccessionNo;

	@Column(name="ADD_ON_IND")
	private Integer addOnInd;

	@Column(name="ASSIGNING_AUTHORITY_NAME")
	private String assigningAuthorityName;

	@Column(name="CHARGE_STATUS_CODE")
	private String chargeStatusCode;

	@Column(name="COLLECTED_USER_SID")
	private Integer collectedUserSid;

	@Column(name="COLLECTION_DATETIME")
	private Date collectionDatetime;

	@Column(name="COLLECTION_ID")
	private String collectionId;

	@Column(name="CONSULTANT_INCHARGE_USER_SID")
	private Integer consultantInchargeUserSid;

	@Column(name="CREATE_USER_SID")
	private Integer createUserSid;

	@Column(name="ENCOUNTER_SID")
	private Integer encounterSid;

	@Column(name="EXPECTED_TCU_CODE")
	private String expectedTcuCode;

	@Column(name="EXTERNAL_SERVICE_CODE")
	private String externalServiceCode;

	@Column(name="INSTITUTION_SID")
	private Integer institutionSid;

	@Column(name="LIS_REQUEST_ID")
	private Integer lisRequestId;

	@Column(name="MODIFICATION_USER_SID")
	private Integer modificationUserSid;

	@Column(name="ORDER_CANCEL_REASON_SID")
	private Integer orderCancelReasonSid;

	@Column(name="ORDER_CREATION_DATE_SID")
	private Integer orderCreationDateSid;

	@Column(name="ORDER_CREATION_DATETIME")
	private Date orderCreationDatetime;

	@Column(name="ORDER_MODIFICATION_DATETIME")
	private Date orderModificationDatetime;

	@Column(name="ORDER_STATUS_SID")
	private Integer orderStatusSid;

	@Column(name="ORDER_TYPE")
	private String orderType;

	@Column(name="ORDERING_DOCTOR_USER_SID")
	private Integer orderingDoctorUserSid;

	@Column(name="ORDERING_LOCATION")
	private String orderingLocation;

	@Column(name="PATIENT_LOCATION")
	private String patientLocation;

	@Column(name="PATIENT_MRN")
	private String patientMrn;

	@Column(name="PATIENT_TYPE")
	private String patientType;

	@Column(name="PHLEBO_CHARGING_STATUS")
	private String phleboChargingStatus;

	@Column(name="PRIORITY_OF_ORDER")
	private String priorityOfOrder;

	@Column(name="RELHISTORY_STATUS_CODE")
	private String relhistoryStatusCode;

	@Column(name="REQUEST_STATUS_CODE")
	private String requestStatusCode;

	@Column(name="SERVICE_SID")
	private Integer serviceSid;

	@Column(name="STATUS_CODE")
	private String statusCode;

	@Column(name="TEST_COMPLETED_DATETIME")
	private Date testCompletedDatetime;

	@Column(name="TEST_DATE_SID")
	private Integer testDateSid;

	@Column(name="TEST_DATE_TIME")
	private Date testDateTime;

	@Column(name="TEST_PERFORM_DATETIME")
	private Date testPerformDatetime;

	public static HashMap<String,Integer> mappingInfo = new HashMap<String,Integer>(){
		{
			put("labOrderSid",0);
			put("accessionNo",1);
			put("actualLabAccessionNo",2);
			put("addOnInd",3);
			put("assigningAuthorityName",4);
			put("chargeStatusCode",5);
			put("collectedUserSid",6);
			put("collectionDatetime",7);
			put("collectionId",8);
			put("consultantInchargeUserSid",9);
			put("createUserSid",10);
			put("encounterSid",11);
			put("expectedTcuCode",12);
			put("externalServiceCode",13);
			put("institutionSid",14);
			put("lisRequestId",15);
			put("modificationUserSid",16);
			put("orderCancelReasonSid",17);
			put("orderCreationDateSid",18);
			put("orderCreationDatetime",19);
			put("orderModificationDatetime",20);
			put("orderStatusSid",21);
			put("orderType",22);
			put("orderingDoctorUserSid",23);
			put("orderingLocation",24);
			put("patientLocation",25);
			put("patientMrn",26);
			put("patientType",27);
			put("phleboChargingStatus",28);
			put("priorityOfOrder",29);
			put("relhistoryStatusCode",30);
			put("requestStatusCode",31);
			put("serviceSid",32);
			put("statusCode",33);
			put("testCompletedDatetime",34);
			put("testDateSid",35);
			put("testDateTime",36);
			put("testPerformDatetime",37);
			
			
		}};
		public static Integer columnCount = 38;
	public FctCcoeLabOrders() {
	}

	public Integer getLabOrderSid() {
		return this.labOrderSid;
	}

	public void setLabOrderSid(int labOrderSid) {
		this.labOrderSid = labOrderSid;
	}

	public String getAccessionNo() {
		return this.accessionNo;
	}

	public void setAccessionNo(String accessionNo) {
		this.accessionNo = accessionNo;
	}

	public String getActualLabAccessionNo() {
		return this.actualLabAccessionNo;
	}

	public void setActualLabAccessionNo(String actualLabAccessionNo) {
		this.actualLabAccessionNo = actualLabAccessionNo;
	}

	public int getAddOnInd() {
		return this.addOnInd;
	}

	public void setAddOnInd(int addOnInd) {
		this.addOnInd = addOnInd;
	}

	public String getAssigningAuthorityName() {
		return this.assigningAuthorityName;
	}

	public void setAssigningAuthorityName(String assigningAuthorityName) {
		this.assigningAuthorityName = assigningAuthorityName;
	}

	public String getChargeStatusCode() {
		return this.chargeStatusCode;
	}

	public void setChargeStatusCode(String chargeStatusCode) {
		this.chargeStatusCode = chargeStatusCode;
	}

	public int getCollectedUserSid() {
		return this.collectedUserSid;
	}

	public void setCollectedUserSid(int collectedUserSid) {
		this.collectedUserSid = collectedUserSid;
	}

	public Object getCollectionDatetime() {
		return this.collectionDatetime;
	}

	public void setCollectionDatetime(Date collectionDatetime) {
		this.collectionDatetime = collectionDatetime;
	}

	public String getCollectionId() {
		return this.collectionId;
	}

	public void setCollectionId(String collectionId) {
		this.collectionId = collectionId;
	}

	public int getConsultantInchargeUserSid() {
		return this.consultantInchargeUserSid;
	}

	public void setConsultantInchargeUserSid(int consultantInchargeUserSid) {
		this.consultantInchargeUserSid = consultantInchargeUserSid;
	}

	public int getCreateUserSid() {
		return this.createUserSid;
	}

	public void setCreateUserSid(int createUserSid) {
		this.createUserSid = createUserSid;
	}

	public int getEncounterSid() {
		return this.encounterSid;
	}

	public void setEncounterSid(int encounterSid) {
		this.encounterSid = encounterSid;
	}

	public String getExpectedTcuCode() {
		return this.expectedTcuCode;
	}

	public void setExpectedTcuCode(String expectedTcuCode) {
		this.expectedTcuCode = expectedTcuCode;
	}

	public String getExternalServiceCode() {
		return this.externalServiceCode;
	}

	public void setExternalServiceCode(String externalServiceCode) {
		this.externalServiceCode = externalServiceCode;
	}

	public int getInstitutionSid() {
		return this.institutionSid;
	}

	public void setInstitutionSid(int institutionSid) {
		this.institutionSid = institutionSid;
	}

	public int getLisRequestId() {
		return this.lisRequestId;
	}

	public void setLisRequestId(int lisRequestId) {
		this.lisRequestId = lisRequestId;
	}

	public int getModificationUserSid() {
		return this.modificationUserSid;
	}

	public void setModificationUserSid(int modificationUserSid) {
		this.modificationUserSid = modificationUserSid;
	}

	public int getOrderCancelReasonSid() {
		return this.orderCancelReasonSid;
	}

	public void setOrderCancelReasonSid(int orderCancelReasonSid) {
		this.orderCancelReasonSid = orderCancelReasonSid;
	}

	public int getOrderCreationDateSid() {
		return this.orderCreationDateSid;
	}

	public void setOrderCreationDateSid(int orderCreationDateSid) {
		this.orderCreationDateSid = orderCreationDateSid;
	}

	public Object getOrderCreationDatetime() {
		return this.orderCreationDatetime;
	}

	public void setOrderCreationDatetime(Date orderCreationDatetime) {
		this.orderCreationDatetime = orderCreationDatetime;
	}

	public Object getOrderModificationDatetime() {
		return this.orderModificationDatetime;
	}

	public void setOrderModificationDatetime(Date orderModificationDatetime) {
		this.orderModificationDatetime = orderModificationDatetime;
	}

	public int getOrderStatusSid() {
		return this.orderStatusSid;
	}

	public void setOrderStatusSid(int orderStatusSid) {
		this.orderStatusSid = orderStatusSid;
	}

	public String getOrderType() {
		return this.orderType;
	}

	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}

	public int getOrderingDoctorUserSid() {
		return this.orderingDoctorUserSid;
	}

	public void setOrderingDoctorUserSid(int orderingDoctorUserSid) {
		this.orderingDoctorUserSid = orderingDoctorUserSid;
	}

	public String getOrderingLocation() {
		return this.orderingLocation;
	}

	public void setOrderingLocation(String orderingLocation) {
		this.orderingLocation = orderingLocation;
	}

	public String getPatientLocation() {
		return this.patientLocation;
	}

	public void setPatientLocation(String patientLocation) {
		this.patientLocation = patientLocation;
	}

	public String getPatientMrn() {
		return this.patientMrn;
	}

	public void setPatientMrn(String patientMrn) {
		this.patientMrn = patientMrn;
	}

	public String getPatientType() {
		return this.patientType;
	}

	public void setPatientType(String patientType) {
		this.patientType = patientType;
	}

	public String getPhleboChargingStatus() {
		return this.phleboChargingStatus;
	}

	public void setPhleboChargingStatus(String phleboChargingStatus) {
		this.phleboChargingStatus = phleboChargingStatus;
	}

	public String getPriorityOfOrder() {
		return this.priorityOfOrder;
	}

	public void setPriorityOfOrder(String priorityOfOrder) {
		this.priorityOfOrder = priorityOfOrder;
	}

	public String getRelhistoryStatusCode() {
		return this.relhistoryStatusCode;
	}

	public void setRelhistoryStatusCode(String relhistoryStatusCode) {
		this.relhistoryStatusCode = relhistoryStatusCode;
	}

	public String getRequestStatusCode() {
		return this.requestStatusCode;
	}

	public void setRequestStatusCode(String requestStatusCode) {
		this.requestStatusCode = requestStatusCode;
	}

	public int getServiceSid() {
		return this.serviceSid;
	}

	public void setServiceSid(int serviceSid) {
		this.serviceSid = serviceSid;
	}

	public String getStatusCode() {
		return this.statusCode;
	}

	public void setStatusCode(String statusCode) {
		this.statusCode = statusCode;
	}

	public Object getTestCompletedDatetime() {
		return this.testCompletedDatetime;
	}

	public void setTestCompletedDatetime(Date testCompletedDatetime) {
		this.testCompletedDatetime = testCompletedDatetime;
	}

	public int getTestDateSid() {
		return this.testDateSid;
	}

	public void setTestDateSid(int testDateSid) {
		this.testDateSid = testDateSid;
	}

	public Object getTestDateTime() {
		return this.testDateTime;
	}

	public void setTestDateTime(Date testDateTime) {
		this.testDateTime = testDateTime;
	}

	public Object getTestPerformDatetime() {
		return this.testPerformDatetime;
	}

	public void setTestPerformDatetime(Date testPerformDatetime) {
		this.testPerformDatetime = testPerformDatetime;
	}

}