package models;

import java.io.Serializable;
import java.util.Date;
import java.util.HashMap;

import javax.persistence.*;


/**
 * The persistent class for the FCT_DIAGNOSIS_ORDER database table.
 * 
 */
@Entity
@Table(name="FCT_DIAGNOSIS_ORDER")
@NamedQuery(name="FctDiagnosisOrder.findAll", query="SELECT f FROM FctDiagnosisOrder f")
public class FctDiagnosisOrder implements Serializable {
	private static final long serialVersionUID = 1L;

//	@Id
//	@Column(name="DIAGNOSIS_ORDER_SID")
//	private Integer diagnosisOrderSid;
	
	@EmbeddedId
	private FctDiagnosisOrderPK id;

	@Column(name="ACCESSION_NO")
	private String accessionNo;

	@Column(name="COLLECTION_DATE_SID")
	private Integer collectionDateSid;

	@Column(name="CREATE_USER_SID")
	private Integer createUserSid;

	@Column(name="ENCOUNTER_SID")
	private Integer encounterSid;

	@Column(name="INSTITUTION_SID")
	private Integer institutionSid;

	@Column(name="MODIFICATION_USER_SID")
	private Integer modificationUserSid;

	@Column(name="ORDER_CATALOG_CODE")
	private String orderCatalogCode;

	@Column(name="ORDER_CATALOG_DESCRIPTION")
	private String orderCatalogDescription;

	@Column(name="ORDER_CREATION_DATETIME")
	private Date orderCreationDatetime;

	@Column(name="ORDER_MODIFICATION_DATETIME")
	private Date orderModificationDatetime;

	@Column(name="ORDER_STATE")
	private String orderState;

	@Column(name="ORDER_STATUS")
	private String orderStatus;

	@Column(name="ORDER_TYPE")
	private String orderType;

	@Column(name="PL_ORDER_KEY")
	private Integer plOrderKey;

	@Column(name="PRIORITY")
	private String priority;

//	@Column(name="SERVICE_SID")
//	private Integer serviceSid;

	public static HashMap<String,Integer> mappingInfo = new HashMap<String,Integer>(){
		{
			put("id",-1);
			
			put("accessionNo",2);
			put("collectionDateSid",3);
			put("createUserSid",4);
			put("encounterSid",5);
			put("institutionSid",6);
			put("modificationUserSid",7);
			put("orderCatalogCode",8);
			put("orderCatalogDescription",9);
			put("orderCreationDatetime",10);
			put("orderModificationDatetime",11);
			put("orderState",12);
			put("orderStatus",13);
			put("orderType",14);
			put("plOrderKey",15);
			put("priority",16);
			
		}};
		public static Integer columnCount = 17;
	public FctDiagnosisOrder() {
	}

//	public int getDiagnosisOrderSid() {
//		return this.diagnosisOrderSid;
//	}
//
//	public void setDiagnosisOrderSid(int diagnosisOrderSid) {
//		this.diagnosisOrderSid = diagnosisOrderSid;
//	}

	public String getAccessionNo() {
		return this.accessionNo;
	}

	public void setAccessionNo(String accessionNo) {
		this.accessionNo = accessionNo;
	}

	public int getCollectionDateSid() {
		return this.collectionDateSid;
	}

	public void setCollectionDateSid(int collectionDateSid) {
		this.collectionDateSid = collectionDateSid;
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

	public int getInstitutionSid() {
		return this.institutionSid;
	}

	public void setInstitutionSid(int institutionSid) {
		this.institutionSid = institutionSid;
	}

	public int getModificationUserSid() {
		return this.modificationUserSid;
	}

	public void setModificationUserSid(int modificationUserSid) {
		this.modificationUserSid = modificationUserSid;
	}

	public String getOrderCatalogCode() {
		return this.orderCatalogCode;
	}

	public void setOrderCatalogCode(String orderCatalogCode) {
		this.orderCatalogCode = orderCatalogCode;
	}

	public String getOrderCatalogDescription() {
		return this.orderCatalogDescription;
	}

	public void setOrderCatalogDescription(String orderCatalogDescription) {
		this.orderCatalogDescription = orderCatalogDescription;
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

	public String getOrderState() {
		return this.orderState;
	}

	public void setOrderState(String orderState) {
		this.orderState = orderState;
	}

	public String getOrderStatus() {
		return this.orderStatus;
	}

	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}

	public String getOrderType() {
		return this.orderType;
	}

	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}

	public int getPlOrderKey() {
		return this.plOrderKey;
	}

	public void setPlOrderKey(int plOrderKey) {
		this.plOrderKey = plOrderKey;
	}

	public String getPriority() {
		return this.priority;
	}

	public void setPriority(String priority) {
		this.priority = priority;
	}

//	public int getServiceSid() {
//		return this.serviceSid;
//	}
//
//	public void setServiceSid(int serviceSid) {
//		this.serviceSid = serviceSid;
//	}

}