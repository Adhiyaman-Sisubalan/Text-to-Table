package models;

import java.io.Serializable;
import java.util.Date;
import java.util.HashMap;

import javax.persistence.*;


/**
 * The persistent class for the FCT_ORDER_MEDICATIONS database table.
 * 
 */
@Entity
@Table(name="FCT_ORDER_MEDICATIONS")
@NamedQuery(name="FctOrderMedications.findAll", query="SELECT f FROM FctOrderMedications f")
public class FctOrderMedications implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private FctOrderMedicationPK id;

	@Column(name="ADVERSE_REACTION")
	private String adverseReaction;

	@Column(name="DOSAGE_AMT")
	private String dosageAmt;

	@Column(name="DRUG_CODE")
	private String drugCode;

	@Column(name="DRUG_FORM_DESC")
	private String drugFormDesc;

	@Column(name="DRUG_GROUP_CD")
	private String drugGroupCd;

	@Column(name="DRUG_NAME")
	private String drugName;

	@Column(name="DRUG_STRENGTH_AMT")
	private String drugStrengthAmt;

	@Column(name="ENC_KEY")
	private Integer encKey;

	@Column(name="EXT_DRUG_IND")
	private String extDrugInd;

	@Column(name="INST_KEY")
	private Integer instKey;

	@Column(name="ITEM_SEQUENCE")
	private String itemSequence;

	@Column(name="MODIFICATION_DATE_TIME")
	private Date modificationDateTime;

	@Column(name="ORDER_DURATION_CD")
	private String orderDurationCd;

	@Column(name="ORDER_DURATION_DESC")
	private String orderDurationDesc;

	@Column(name="ORDER_FREQUENCY_CD")
	private String orderFrequencyCd;

	@Column(name="ORDER_FREQUENCY_DESC")
	private String orderFrequencyDesc;

	@Column(name="ORDER_INSTRUCTION_DESC")
	private String orderInstructionDesc;

	@Column(name="ORDER_QTY_AMT")
	private Integer orderQtyAmt;

	@Column(name="ORDER_QTY_UNIT_CD")
	private String orderQtyUnitCd;

	@Column(name="ORDER_QTY_UNIT_DESC")
	private String orderQtyUnitDesc;

	@Column(name="ORDER_SEQ")
	private String orderSeq;

	@Column(name="OVERRIDE_CD")
	private String overrideCd;

	@Column(name="OVERRIDE_DESC")
	private String overrideDesc;

	@Column(name="OVERRIDE_IND")
	private String overrideInd;

	@Column(name="PACKAGING_CD")
	private String packagingCd;

	@Column(name="REPEAT_NO")
	private String repeatNo;

	@Column(name="ROUTE_CD")
	private String routeCd;

	@Column(name="ROUTE_CD_DESC")
	private String routeCdDesc;

	@Column(name="STEP_CHANGE_CD")
	private String stepChangeCd;

	public static HashMap<String,Integer> mappingInfo = new HashMap<String,Integer>(){
		{
			put("id",-1);
		
		
			put("adverseReaction",2);
			put("dosageAmt",3);
			put("drugCode",4);
			put("drugFormDesc",5);
			put("drugGroupCd",6);
			put("drugName",7);
			put("drugStrengthAmt",8);
			put("encKey",9);
			put("extDrugInd",10);
			put("instKey",11);
			put("itemSequence",12);
			put("modificationDateTime",13);
			put("orderDurationCd",14);
			put("orderDurationDesc",15);
			put("orderFrequencyCd",16);
			put("orderFrequencyDesc",17);
			put("orderInstructionDesc",18);
			put("orderQtyAmt",19);
			put("orderQtyUnitCd",20);
			put("orderQtyUnitDesc",21);
			put("orderSeq",22);
			put("overrideCd",23);
			put("overrideDesc",24);
			put("overrideInd",25);
			put("packagingCd",26);
			put("repeatNo",27);
			put("routeCd",28);
			put("routeCdDesc",29);
			put("stepChangeCd",30);
			
		}};
	public static Integer columnCount = 31;
	public FctOrderMedications() {
	}

	public FctOrderMedicationPK getId() {
		return this.id;
	}

	public void setId(FctOrderMedicationPK id) {
		this.id = id;
	}

	public String getAdverseReaction() {
		return this.adverseReaction;
	}

	public void setAdverseReaction(String adverseReaction) {
		this.adverseReaction = adverseReaction;
	}

	public String getDosageAmt() {
		return this.dosageAmt;
	}

	public void setDosageAmt(String dosageAmt) {
		this.dosageAmt = dosageAmt;
	}

	public String getDrugCode() {
		return this.drugCode;
	}

	public void setDrugCode(String drugCode) {
		this.drugCode = drugCode;
	}

	public String getDrugFormDesc() {
		return this.drugFormDesc;
	}

	public void setDrugFormDesc(String drugFormDesc) {
		this.drugFormDesc = drugFormDesc;
	}

	public String getDrugGroupCd() {
		return this.drugGroupCd;
	}

	public void setDrugGroupCd(String drugGroupCd) {
		this.drugGroupCd = drugGroupCd;
	}

	public String getDrugName() {
		return this.drugName;
	}

	public void setDrugName(String drugName) {
		this.drugName = drugName;
	}

	public String getDrugStrengthAmt() {
		return this.drugStrengthAmt;
	}

	public void setDrugStrengthAmt(String drugStrengthAmt) {
		this.drugStrengthAmt = drugStrengthAmt;
	}

	public int getEncKey() {
		return this.encKey;
	}

	public void setEncKey(int encKey) {
		this.encKey = encKey;
	}

	public String getExtDrugInd() {
		return this.extDrugInd;
	}

	public void setExtDrugInd(String extDrugInd) {
		this.extDrugInd = extDrugInd;
	}

	public int getInstKey() {
		return this.instKey;
	}

	public void setInstKey(int instKey) {
		this.instKey = instKey;
	}

	public String getItemSequence() {
		return this.itemSequence;
	}

	public void setItemSequence(String itemSequence) {
		this.itemSequence = itemSequence;
	}

	public Date getModificationDateTime() {
		return this.modificationDateTime;
	}

	public void setModificationDateTime(Date modificationDateTime) {
		this.modificationDateTime = modificationDateTime;
	}

	public String getOrderDurationCd() {
		return this.orderDurationCd;
	}

	public void setOrderDurationCd(String orderDurationCd) {
		this.orderDurationCd = orderDurationCd;
	}

	public String getOrderDurationDesc() {
		return this.orderDurationDesc;
	}

	public void setOrderDurationDesc(String orderDurationDesc) {
		this.orderDurationDesc = orderDurationDesc;
	}

	public String getOrderFrequencyCd() {
		return this.orderFrequencyCd;
	}

	public void setOrderFrequencyCd(String orderFrequencyCd) {
		this.orderFrequencyCd = orderFrequencyCd;
	}

	public String getOrderFrequencyDesc() {
		return this.orderFrequencyDesc;
	}

	public void setOrderFrequencyDesc(String orderFrequencyDesc) {
		this.orderFrequencyDesc = orderFrequencyDesc;
	}

	public String getOrderInstructionDesc() {
		return this.orderInstructionDesc;
	}

	public void setOrderInstructionDesc(String orderInstructionDesc) {
		this.orderInstructionDesc = orderInstructionDesc;
	}

	public int getOrderQtyAmt() {
		return this.orderQtyAmt;
	}

	public void setOrderQtyAmt(int orderQtyAmt) {
		this.orderQtyAmt = orderQtyAmt;
	}

	public String getOrderQtyUnitCd() {
		return this.orderQtyUnitCd;
	}

	public void setOrderQtyUnitCd(String orderQtyUnitCd) {
		this.orderQtyUnitCd = orderQtyUnitCd;
	}

	public String getOrderQtyUnitDesc() {
		return this.orderQtyUnitDesc;
	}

	public void setOrderQtyUnitDesc(String orderQtyUnitDesc) {
		this.orderQtyUnitDesc = orderQtyUnitDesc;
	}

	public String getOrderSeq() {
		return this.orderSeq;
	}

	public void setOrderSeq(String orderSeq) {
		this.orderSeq = orderSeq;
	}

	public String getOverrideCd() {
		return this.overrideCd;
	}

	public void setOverrideCd(String overrideCd) {
		this.overrideCd = overrideCd;
	}

	public String getOverrideDesc() {
		return this.overrideDesc;
	}

	public void setOverrideDesc(String overrideDesc) {
		this.overrideDesc = overrideDesc;
	}

	public String getOverrideInd() {
		return this.overrideInd;
	}

	public void setOverrideInd(String overrideInd) {
		this.overrideInd = overrideInd;
	}

	public String getPackagingCd() {
		return this.packagingCd;
	}

	public void setPackagingCd(String packagingCd) {
		this.packagingCd = packagingCd;
	}

	public String getRepeatNo() {
		return this.repeatNo;
	}

	public void setRepeatNo(String repeatNo) {
		this.repeatNo = repeatNo;
	}

	public String getRouteCd() {
		return this.routeCd;
	}

	public void setRouteCd(String routeCd) {
		this.routeCd = routeCd;
	}

	public String getRouteCdDesc() {
		return this.routeCdDesc;
	}

	public void setRouteCdDesc(String routeCdDesc) {
		this.routeCdDesc = routeCdDesc;
	}

	public String getStepChangeCd() {
		return this.stepChangeCd;
	}

	public void setStepChangeCd(String stepChangeCd) {
		this.stepChangeCd = stepChangeCd;
	}

}