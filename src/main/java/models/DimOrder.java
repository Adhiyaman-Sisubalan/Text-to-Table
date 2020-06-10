package models;

import java.io.Serializable;
import java.util.Date;
import java.util.HashMap;

import javax.persistence.*;


/**
 * The persistent class for the DIM_ORDER database table.
 * 
 */
@Entity
@Table(name="DIM_ORDER")
@NamedQuery(name="DimOrder.findAll", query="SELECT d FROM DimOrder d")
public class DimOrder implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ORDER_KEY")
	private Integer orderKey;

	@Column(name="CANCELLATION_DATE")
	private Date cancellationDate;

	@Column(name="CANCELLATION_REASON")
	private String cancellationReason;

	@Column(name="CARE_PROV_NAME")
	private String careProvName;

	@Column(name="CARE_PROVIDER_LICENSE_NUMBER")
	private String careProviderLicenseNumber;

	@Column(name="CARE_PROVIDER_ROLE_CD")
	private String careProviderRoleCd;

	@Column(name="CASE_NO")
	private String caseNo;

	@Column(name="CREATION_DATE_KEY")
	private Integer creationDateKey;

	@Column(name="ENC_KEY")
	private Integer encKey;

	@Column(name="INSTITUTION_KEY")
	private Integer institutionKey;

	@Column(name="MOVEMENT_BED_FACILITY_UNIT_CD")
	private String movementBedFacilityUnitCd;

	@Column(name="MOVEMENT_FACILITY_UNIT_CD")
	private String movementFacilityUnitCd;

	@Column(name="MOVEMENT_FACILITY_UNIT_NAME")
	private String movementFacilityUnitName;

	@Column(name="MOVEMENT_OU_KEY")
	private Integer movementOuKey;

	@Column(name="MOVEMENT_SEQ")
	private String movementSeq;

	@Column(name="ORDER_DESC")
	private String orderDesc;

	@Column(name="ORDER_IDENTIFIER")
	private String orderIdentifier;

	@Column(name="ORDER_INSTRUCTION_CODE")
	private String orderInstructionCode;

	@Column(name="ORDER_OU_KEY")
	private Integer orderOuKey;

	@Column(name="ORDER_STATUS_CD")
	private String orderStatusCd;

	@Column(name="ORDER_STATUS_DESC")
	private String orderStatusDesc;

	@Column(name="ORDER_TYPE_CD")
	private String orderTypeCd;

	public static HashMap<String,Integer> mappingInfo = new HashMap<String,Integer>(){
		{
			put("orderKey",0);
			put("cancellationDate",1);
			put("cancellationReason",2);
			put("careProvName",3);
			put("careProviderLicenseNumber",4);
			put("careProviderRoleCd",5);
			put("caseNo",6);
			put("creationDateKey",7);
			put("encKey",8);
			put("institutionKey",9);
			put("movementBedFacilityUnitCd",10);
			put("movementFacilityUnitCd",11);
			put("movementFacilityUnitName",12);
			put("movementOuKey",13);
			put("movementSeq",14);
			put("orderDesc",15);
			put("orderIdentifier",16);
			put("orderInstructionCode",17);
			put("orderOuKey",18);
			put("orderStatusCd",19);
			put("orderStatusDesc",20);
			put("orderTypeCd",21);
		}};
		public static Integer columnCount = 22;
	public DimOrder() {
	}

	public int getOrderKey() {
		return this.orderKey;
	}

	public void setOrderKey(int orderKey) {
		this.orderKey = orderKey;
	}

	public Object getCancellationDate() {
		return this.cancellationDate;
	}

	public void setCancellationDate(Date cancellationDate) {
		this.cancellationDate = cancellationDate;
	}

	public String getCancellationReason() {
		return this.cancellationReason;
	}

	public void setCancellationReason(String cancellationReason) {
		this.cancellationReason = cancellationReason;
	}

	public String getCareProvName() {
		return this.careProvName;
	}

	public void setCareProvName(String careProvName) {
		this.careProvName = careProvName;
	}

	public String getCareProviderLicenseNumber() {
		return this.careProviderLicenseNumber;
	}

	public void setCareProviderLicenseNumber(String careProviderLicenseNumber) {
		this.careProviderLicenseNumber = careProviderLicenseNumber;
	}

	public String getCareProviderRoleCd() {
		return this.careProviderRoleCd;
	}

	public void setCareProviderRoleCd(String careProviderRoleCd) {
		this.careProviderRoleCd = careProviderRoleCd;
	}

	public String getCaseNo() {
		return this.caseNo;
	}

	public void setCaseNo(String caseNo) {
		this.caseNo = caseNo;
	}

	public int getCreationDateKey() {
		return this.creationDateKey;
	}

	public void setCreationDateKey(int creationDateKey) {
		this.creationDateKey = creationDateKey;
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

	public String getMovementBedFacilityUnitCd() {
		return this.movementBedFacilityUnitCd;
	}

	public void setMovementBedFacilityUnitCd(String movementBedFacilityUnitCd) {
		this.movementBedFacilityUnitCd = movementBedFacilityUnitCd;
	}

	public String getMovementFacilityUnitCd() {
		return this.movementFacilityUnitCd;
	}

	public void setMovementFacilityUnitCd(String movementFacilityUnitCd) {
		this.movementFacilityUnitCd = movementFacilityUnitCd;
	}

	public String getMovementFacilityUnitName() {
		return this.movementFacilityUnitName;
	}

	public void setMovementFacilityUnitName(String movementFacilityUnitName) {
		this.movementFacilityUnitName = movementFacilityUnitName;
	}

	public int getMovementOuKey() {
		return this.movementOuKey;
	}

	public void setMovementOuKey(int movementOuKey) {
		this.movementOuKey = movementOuKey;
	}

	public String getMovementSeq() {
		return this.movementSeq;
	}

	public void setMovementSeq(String movementSeq) {
		this.movementSeq = movementSeq;
	}

	public String getOrderDesc() {
		return this.orderDesc;
	}

	public void setOrderDesc(String orderDesc) {
		this.orderDesc = orderDesc;
	}

	public String getOrderIdentifier() {
		return this.orderIdentifier;
	}

	public void setOrderIdentifier(String orderIdentifier) {
		this.orderIdentifier = orderIdentifier;
	}

	public String getOrderInstructionCode() {
		return this.orderInstructionCode;
	}

	public void setOrderInstructionCode(String orderInstructionCode) {
		this.orderInstructionCode = orderInstructionCode;
	}

	public int getOrderOuKey() {
		return this.orderOuKey;
	}

	public void setOrderOuKey(int orderOuKey) {
		this.orderOuKey = orderOuKey;
	}

	public String getOrderStatusCd() {
		return this.orderStatusCd;
	}

	public void setOrderStatusCd(String orderStatusCd) {
		this.orderStatusCd = orderStatusCd;
	}

	public String getOrderStatusDesc() {
		return this.orderStatusDesc;
	}

	public void setOrderStatusDesc(String orderStatusDesc) {
		this.orderStatusDesc = orderStatusDesc;
	}

	public String getOrderTypeCd() {
		return this.orderTypeCd;
	}

	public void setOrderTypeCd(String orderTypeCd) {
		this.orderTypeCd = orderTypeCd;
	}

}