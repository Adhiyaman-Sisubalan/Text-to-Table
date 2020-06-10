package models;

import java.io.Serializable;
import java.util.Date;
import java.util.HashMap;

import javax.persistence.*;


/**
 * The persistent class for the FCT_RENDERED_SERVICES database table.
 * 
 */
@Entity
@Table(name="FCT_RENDERED_SERVICES")
@NamedQuery(name="FctRenderedServices.findAll", query="SELECT f FROM FctRenderedServices f")
public class FctRenderedServices implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="SRV_TRX_KEY")
	private Integer srvTrxKey;

	@Column(name="ATTENDING_DOCTOR_KEY")
	private Integer attendingDoctorKey;

	@Column(name="BILL_CAT")
	private String billCat;

	@Column(name="BILL_CLS_KEY")
	private Integer billClsKey;

	@Column(name="BILL_IND")
	private String billInd;

	@Column(name="CANCEL_IND")
	private String cancelInd;

	@Column(name="CUSTOM_CHECKBOX_1")
	private String customCheckbox1;

	@Column(name="CUSTOM_CHECKBOX_2")
	private String customCheckbox2;

	@Column(name="CUSTOM_FIELD_1")
	private String customField1;

	@Column(name="CUSTOM_FIELD_2")
	private String customField2;

	@Column(name="CUSTOM_FIELD_3")
	private String customField3;

	@Column(name="CUSTOM_FIELD_END_DATE")
	private Date customFieldEndDate;

	@Column(name="CUSTOM_FIELD_QTY")
	private Integer customFieldQty;

	@Column(name="CUSTOM_FIELD_START_DATE")
	private Date customFieldStartDate;

	@Column(name="CUSTOM_FIELD_UNIT")
	private Integer customFieldUnit;

	@Column(name="ENC_KEY")
	private Integer encKey;

	@Column(name="INSTITUTION_KEY")
	private Integer institutionKey;

	@Column(name="MOVE_TYPE_KEY")
	private Integer moveTypeKey;

	@Column(name="PACKAGE_TYPE")
	private String packageType;

	@Column(name="PERF_DOC_1_FN")
	private String perfDoc1Fn;

	@Column(name="PERF_DOC_1_KEY")
	private Integer perfDoc1Key;

	@Column(name="PERF_DOC_1_RANK_CD")
	private String perfDoc1RankCd;

	@Column(name="PERF_DOC_2_FN")
	private String perfDoc2Fn;

	@Column(name="PERF_DOC_2_KEY")
	private Integer perfDoc2Key;

	@Column(name="PERF_DOC_2_RANK_CD")
	private String perfDoc2RankCd;

	@Column(name="PERF_DOC_3_FN")
	private String perfDoc3Fn;

	@Column(name="PERF_DOC_3_KEY")
	private Integer perfDoc3Key;

	@Column(name="PERF_DOC_3_RANK_CD")
	private String perfDoc3RankCd;

	@Column(name="PERF_DOC_4_FN")
	private String perfDoc4Fn;

	@Column(name="PERF_DOC_4_KEY")
	private Integer perfDoc4Key;

	@Column(name="PERF_DOC_4_RANK_CD")
	private String perfDoc4RankCd;

	@Column(name="PERF_DOC_5_FN")
	private String perfDoc5Fn;

	@Column(name="PERF_DOC_5_KEY")
	private Integer perfDoc5Key;

	@Column(name="PERF_DOC_5_RANK_CD")
	private String perfDoc5RankCd;

	@Column(name="PERF_ORDER_DOCTOR_FN")
	private String perfOrderDoctorFn;

	@Column(name="PERF_ORDER_DOCTOR_KEY")
	private Integer perfOrderDoctorKey;

	@Column(name="PERF_ORDER_DOCTOR_RANK_CD")
	private String perfOrderDoctorRankCd;

	@Column(name="PERFORMING_OU_KEY")
	private Integer performingOuKey;

	@Column(name="PHARMACY_IND")
	private String pharmacyInd;

	@Column(name="REQ_DEPT_OU_KEY")
	private Integer reqDeptOuKey;

	@Column(name="REQ_NURSING_OU_KEY")
	private Integer reqNursingOuKey;

	@Column(name="SERVICE_AMT")
	private Integer serviceAmt;

	@Column(name="SERVICE_BASE_PRICE")
	private Integer serviceBasePrice;

	@Column(name="SERVICE_END_DATE")
	private Date serviceEndDate;

	@Column(name="SERVICE_KEY")
	private Integer serviceKey;

	@Column(name="SERVICE_QTY")
	private Integer serviceQty;

	@Column(name="SERVICE_SEQ_NO")
	private String serviceSeqNo;

	@Column(name="SERVICE_START_DT_KEY")
	private Date serviceStartDtKey;

	@Column(name="SERVICE_UNIT_PRICE")
	private Integer serviceUnitPrice;

	@Column(name="SHORT_TEXT")
	private String shortText;

	public static HashMap<String,Integer> mappingInfo = new HashMap<String,Integer>(){
		{
			put("srvTrxKey",0);
			put("attendingDoctorKey",1);
			put("billCat",2);
			put("billClsKey",3);
			put("billInd",4);
			put("cancelInd",5);
			put("customCheckbox1",6);
			put("customCheckbox2",7);
			put("customField1",8);
			put("customField2",9);
			put("customField3",10);
			put("customFieldEndDate",11);
			put("customFieldQty",12);
			put("customFieldStartDate",13);
			put("customFieldUnit",14);
			put("encKey",15);
			put("institutionKey",16);
			put("moveTypeKey",17);
			put("packageType",18);
			put("perfDoc1Fn",19);
			put("perfDoc1Key",20);
			put("perfDoc1RankCd",21);
			put("perfDoc2Fn",22);
			put("perfDoc2Key",23);
			put("perfDoc2RankCd",24);
			put("perfDoc3Fn",25);
			put("perfDoc3Key",26);
			put("perfDoc3RankCd",27);
			put("perfDoc4Fn",28);
			put("perfDoc4Key",29);
			put("perfDoc4RankCd",30);
			put("perfDoc5Fn",31);
			put("perfDoc5Key",32);
			put("perfDoc5RankCd",33);
			put("perfOrderDoctorFn",34);
			put("perfOrderDoctorKey",35);
			put("perfOrderDoctorRankCd",36);
			put("performingOuKey",37);
			put("pharmacyInd",38);
			put("reqDeptOuKey",39);
			put("reqNursingOuKey",40);
			put("serviceAmt",41);
			put("serviceBasePrice",42);
			put("serviceEndDate",43);
			put("serviceKey",44);
			put("serviceQty",45);
			put("serviceSeqNo",46);
			put("serviceStartDtKey",47);
			put("serviceUnitPrice",48);
			put("shortText",49);
		}};
		public static Integer columnCount = 50;
	public FctRenderedServices() {
	}

	public int getSrvTrxKey() {
		return this.srvTrxKey;
	}

	public void setSrvTrxKey(int srvTrxKey) {
		this.srvTrxKey = srvTrxKey;
	}

	public int getAttendingDoctorKey() {
		return this.attendingDoctorKey;
	}

	public void setAttendingDoctorKey(int attendingDoctorKey) {
		this.attendingDoctorKey = attendingDoctorKey;
	}

	public String getBillCat() {
		return this.billCat;
	}

	public void setBillCat(String billCat) {
		this.billCat = billCat;
	}

	public int getBillClsKey() {
		return this.billClsKey;
	}

	public void setBillClsKey(int billClsKey) {
		this.billClsKey = billClsKey;
	}

	public String getBillInd() {
		return this.billInd;
	}

	public void setBillInd(String billInd) {
		this.billInd = billInd;
	}

	public String getCancelInd() {
		return this.cancelInd;
	}

	public void setCancelInd(String cancelInd) {
		this.cancelInd = cancelInd;
	}

	public String getCustomCheckbox1() {
		return this.customCheckbox1;
	}

	public void setCustomCheckbox1(String customCheckbox1) {
		this.customCheckbox1 = customCheckbox1;
	}

	public String getCustomCheckbox2() {
		return this.customCheckbox2;
	}

	public void setCustomCheckbox2(String customCheckbox2) {
		this.customCheckbox2 = customCheckbox2;
	}

	public String getCustomField1() {
		return this.customField1;
	}

	public void setCustomField1(String customField1) {
		this.customField1 = customField1;
	}

	public String getCustomField2() {
		return this.customField2;
	}

	public void setCustomField2(String customField2) {
		this.customField2 = customField2;
	}

	public String getCustomField3() {
		return this.customField3;
	}

	public void setCustomField3(String customField3) {
		this.customField3 = customField3;
	}

	public Date getCustomFieldEndDate() {
		return this.customFieldEndDate;
	}

	public void setCustomFieldEndDate(Date customFieldEndDate) {
		this.customFieldEndDate = customFieldEndDate;
	}

	public int getCustomFieldQty() {
		return this.customFieldQty;
	}

	public void setCustomFieldQty(int customFieldQty) {
		this.customFieldQty = customFieldQty;
	}

	public Date getCustomFieldStartDate() {
		return this.customFieldStartDate;
	}

	public void setCustomFieldStartDate(Date customFieldStartDate) {
		this.customFieldStartDate = customFieldStartDate;
	}

	public int getCustomFieldUnit() {
		return this.customFieldUnit;
	}

	public void setCustomFieldUnit(int customFieldUnit) {
		this.customFieldUnit = customFieldUnit;
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

	public int getMoveTypeKey() {
		return this.moveTypeKey;
	}

	public void setMoveTypeKey(int moveTypeKey) {
		this.moveTypeKey = moveTypeKey;
	}

	public String getPackageType() {
		return this.packageType;
	}

	public void setPackageType(String packageType) {
		this.packageType = packageType;
	}

	public String getPerfDoc1Fn() {
		return this.perfDoc1Fn;
	}

	public void setPerfDoc1Fn(String perfDoc1Fn) {
		this.perfDoc1Fn = perfDoc1Fn;
	}

	public int getPerfDoc1Key() {
		return this.perfDoc1Key;
	}

	public void setPerfDoc1Key(int perfDoc1Key) {
		this.perfDoc1Key = perfDoc1Key;
	}

	public String getPerfDoc1RankCd() {
		return this.perfDoc1RankCd;
	}

	public void setPerfDoc1RankCd(String perfDoc1RankCd) {
		this.perfDoc1RankCd = perfDoc1RankCd;
	}

	public String getPerfDoc2Fn() {
		return this.perfDoc2Fn;
	}

	public void setPerfDoc2Fn(String perfDoc2Fn) {
		this.perfDoc2Fn = perfDoc2Fn;
	}

	public int getPerfDoc2Key() {
		return this.perfDoc2Key;
	}

	public void setPerfDoc2Key(int perfDoc2Key) {
		this.perfDoc2Key = perfDoc2Key;
	}

	public String getPerfDoc2RankCd() {
		return this.perfDoc2RankCd;
	}

	public void setPerfDoc2RankCd(String perfDoc2RankCd) {
		this.perfDoc2RankCd = perfDoc2RankCd;
	}

	public String getPerfDoc3Fn() {
		return this.perfDoc3Fn;
	}

	public void setPerfDoc3Fn(String perfDoc3Fn) {
		this.perfDoc3Fn = perfDoc3Fn;
	}

	public int getPerfDoc3Key() {
		return this.perfDoc3Key;
	}

	public void setPerfDoc3Key(int perfDoc3Key) {
		this.perfDoc3Key = perfDoc3Key;
	}

	public String getPerfDoc3RankCd() {
		return this.perfDoc3RankCd;
	}

	public void setPerfDoc3RankCd(String perfDoc3RankCd) {
		this.perfDoc3RankCd = perfDoc3RankCd;
	}

	public String getPerfDoc4Fn() {
		return this.perfDoc4Fn;
	}

	public void setPerfDoc4Fn(String perfDoc4Fn) {
		this.perfDoc4Fn = perfDoc4Fn;
	}

	public int getPerfDoc4Key() {
		return this.perfDoc4Key;
	}

	public void setPerfDoc4Key(int perfDoc4Key) {
		this.perfDoc4Key = perfDoc4Key;
	}

	public String getPerfDoc4RankCd() {
		return this.perfDoc4RankCd;
	}

	public void setPerfDoc4RankCd(String perfDoc4RankCd) {
		this.perfDoc4RankCd = perfDoc4RankCd;
	}

	public String getPerfDoc5Fn() {
		return this.perfDoc5Fn;
	}

	public void setPerfDoc5Fn(String perfDoc5Fn) {
		this.perfDoc5Fn = perfDoc5Fn;
	}

	public int getPerfDoc5Key() {
		return this.perfDoc5Key;
	}

	public void setPerfDoc5Key(int perfDoc5Key) {
		this.perfDoc5Key = perfDoc5Key;
	}

	public String getPerfDoc5RankCd() {
		return this.perfDoc5RankCd;
	}

	public void setPerfDoc5RankCd(String perfDoc5RankCd) {
		this.perfDoc5RankCd = perfDoc5RankCd;
	}

	public String getPerfOrderDoctorFn() {
		return this.perfOrderDoctorFn;
	}

	public void setPerfOrderDoctorFn(String perfOrderDoctorFn) {
		this.perfOrderDoctorFn = perfOrderDoctorFn;
	}

	public int getPerfOrderDoctorKey() {
		return this.perfOrderDoctorKey;
	}

	public void setPerfOrderDoctorKey(int perfOrderDoctorKey) {
		this.perfOrderDoctorKey = perfOrderDoctorKey;
	}

	public String getPerfOrderDoctorRankCd() {
		return this.perfOrderDoctorRankCd;
	}

	public void setPerfOrderDoctorRankCd(String perfOrderDoctorRankCd) {
		this.perfOrderDoctorRankCd = perfOrderDoctorRankCd;
	}

	public int getPerformingOuKey() {
		return this.performingOuKey;
	}

	public void setPerformingOuKey(int performingOuKey) {
		this.performingOuKey = performingOuKey;
	}

	public String getPharmacyInd() {
		return this.pharmacyInd;
	}

	public void setPharmacyInd(String pharmacyInd) {
		this.pharmacyInd = pharmacyInd;
	}

	public int getReqDeptOuKey() {
		return this.reqDeptOuKey;
	}

	public void setReqDeptOuKey(int reqDeptOuKey) {
		this.reqDeptOuKey = reqDeptOuKey;
	}

	public int getReqNursingOuKey() {
		return this.reqNursingOuKey;
	}

	public void setReqNursingOuKey(int reqNursingOuKey) {
		this.reqNursingOuKey = reqNursingOuKey;
	}

	public int getServiceAmt() {
		return this.serviceAmt;
	}

	public void setServiceAmt(int serviceAmt) {
		this.serviceAmt = serviceAmt;
	}

	public int getServiceBasePrice() {
		return this.serviceBasePrice;
	}

	public void setServiceBasePrice(int serviceBasePrice) {
		this.serviceBasePrice = serviceBasePrice;
	}

	public Date getServiceEndDate() {
		return this.serviceEndDate;
	}

	public void setServiceEndDate(Date serviceEndDate) {
		this.serviceEndDate = serviceEndDate;
	}

	public int getServiceKey() {
		return this.serviceKey;
	}

	public void setServiceKey(int serviceKey) {
		this.serviceKey = serviceKey;
	}

	public int getServiceQty() {
		return this.serviceQty;
	}

	public void setServiceQty(int serviceQty) {
		this.serviceQty = serviceQty;
	}

	public String getServiceSeqNo() {
		return this.serviceSeqNo;
	}

	public void setServiceSeqNo(String serviceSeqNo) {
		this.serviceSeqNo = serviceSeqNo;
	}

	public Date getServiceStartDtKey() {
		return this.serviceStartDtKey;
	}

	public void setServiceStartDtKey(Date serviceStartDtKey) {
		this.serviceStartDtKey = serviceStartDtKey;
	}

	public int getServiceUnitPrice() {
		return this.serviceUnitPrice;
	}

	public void setServiceUnitPrice(int serviceUnitPrice) {
		this.serviceUnitPrice = serviceUnitPrice;
	}

	public String getShortText() {
		return this.shortText;
	}

	public void setShortText(String shortText) {
		this.shortText = shortText;
	}

}