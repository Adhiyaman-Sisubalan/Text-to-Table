package models;

import java.io.Serializable;
import java.util.HashMap;

import javax.persistence.*;


/**
 * The persistent class for the FCT_PAYER_BILL database table.
 * 
 */
@Entity
@Table(name="FCT_PAYER_BILL")
@NamedQuery(name="FctPayerBill.findAll", query="SELECT f FROM FctPayerBill f")
public class FctPayerBill implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="PAYER_BILL_KEY")
	private Integer payerBillKey;

	@Column(name="BILL_DOC_NO")
	private String billDocNo;

	@Column(name="BILL_DT_KEY")
	private Integer billDtKey;

	@Column(name="BILL_PRINT_DT_KEY")
	private Integer billPrintDtKey;

	@Column(name="BILL_STATUS")
	private String billStatus;

	@Column(name="ENC_KEY")
	private Integer encKey;

	@Column(name="GROSS_TAX_AMT")
	private Integer grossTaxAmt;

	@Column(name="INS_PROV_CD")
	private String insProvCd;

	@Column(name="INS_PROV_NAME")
	private String insProvName;

	@Column(name="INSTITUTION_KEY")
	private Integer institutionKey;

	@Column(name="NET_PAYABLE_AMT")
	private Integer netPayableAmt;

	@Column(name="PAYABLE_AMT")
	private Integer payableAmt;

	@Column(name="PAYABLE_AMT_BEF_MT")
	private Integer payableAmtBefMt;

	@Column(name="PAYER_TYPE_KEY")
	private Integer payerTypeKey;

	@Column(name="PERFORMING_OU_KEY")
	private Integer performingOuKey;

	@Column(name="REQ_OU_KEY")
	private Integer reqOuKey;

	@Column(name="SERVICE_SEQ_NO")
	private String serviceSeqNo;

	@Column(name="SOURCE_SYSTEM")
	private String sourceSystem;

	@Column(name="TAX_AMT")
	private Integer taxAmt;

	public static HashMap<String,Integer> mappingInfo = new HashMap<String,Integer>(){
		{
			put("payerBillKey",0);
			put("billDocNo",1);
			put("billDtKey",2);
			put("billPrintDtKey",3);
			put("billStatus",4);
			put("encKey",5);
			put("grossTaxAmt",6);
			put("insProvCd",7);
			put("insProvName",8);
			put("institutionKey",9);
			put("netPayableAmt",10);
			put("payableAmt",11);
			put("payableAmtBefMt",12);
			put("payerTypeKey",13);
			put("performingOuKey",14);
			put("reqOuKey",15);
			put("serviceSeqNo",16);
			put("sourceSystem",17);
			put("taxAmt",18);
		}};
		public static Integer columnCount = 19;
	public FctPayerBill() {
	}

	public int getPayerBillKey() {
		return this.payerBillKey;
	}

	public void setPayerBillKey(int payerBillKey) {
		this.payerBillKey = payerBillKey;
	}

	public String getBillDocNo() {
		return this.billDocNo;
	}

	public void setBillDocNo(String billDocNo) {
		this.billDocNo = billDocNo;
	}

	public int getBillDtKey() {
		return this.billDtKey;
	}

	public void setBillDtKey(int billDtKey) {
		this.billDtKey = billDtKey;
	}

	public int getBillPrintDtKey() {
		return this.billPrintDtKey;
	}

	public void setBillPrintDtKey(int billPrintDtKey) {
		this.billPrintDtKey = billPrintDtKey;
	}

	public String getBillStatus() {
		return this.billStatus;
	}

	public void setBillStatus(String billStatus) {
		this.billStatus = billStatus;
	}

	public int getEncKey() {
		return this.encKey;
	}

	public void setEncKey(int encKey) {
		this.encKey = encKey;
	}

	public int getGrossTaxAmt() {
		return this.grossTaxAmt;
	}

	public void setGrossTaxAmt(int grossTaxAmt) {
		this.grossTaxAmt = grossTaxAmt;
	}

	public String getInsProvCd() {
		return this.insProvCd;
	}

	public void setInsProvCd(String insProvCd) {
		this.insProvCd = insProvCd;
	}

	public String getInsProvName() {
		return this.insProvName;
	}

	public void setInsProvName(String insProvName) {
		this.insProvName = insProvName;
	}

	public int getInstitutionKey() {
		return this.institutionKey;
	}

	public void setInstitutionKey(int institutionKey) {
		this.institutionKey = institutionKey;
	}

	public int getNetPayableAmt() {
		return this.netPayableAmt;
	}

	public void setNetPayableAmt(int netPayableAmt) {
		this.netPayableAmt = netPayableAmt;
	}

	public int getPayableAmt() {
		return this.payableAmt;
	}

	public void setPayableAmt(int payableAmt) {
		this.payableAmt = payableAmt;
	}

	public int getPayableAmtBefMt() {
		return this.payableAmtBefMt;
	}

	public void setPayableAmtBefMt(int payableAmtBefMt) {
		this.payableAmtBefMt = payableAmtBefMt;
	}

	public int getPayerTypeKey() {
		return this.payerTypeKey;
	}

	public void setPayerTypeKey(int payerTypeKey) {
		this.payerTypeKey = payerTypeKey;
	}

	public int getPerformingOuKey() {
		return this.performingOuKey;
	}

	public void setPerformingOuKey(int performingOuKey) {
		this.performingOuKey = performingOuKey;
	}

	public int getReqOuKey() {
		return this.reqOuKey;
	}

	public void setReqOuKey(int reqOuKey) {
		this.reqOuKey = reqOuKey;
	}

	public String getServiceSeqNo() {
		return this.serviceSeqNo;
	}

	public void setServiceSeqNo(String serviceSeqNo) {
		this.serviceSeqNo = serviceSeqNo;
	}

	public String getSourceSystem() {
		return this.sourceSystem;
	}

	public void setSourceSystem(String sourceSystem) {
		this.sourceSystem = sourceSystem;
	}

	public int getTaxAmt() {
		return this.taxAmt;
	}

	public void setTaxAmt(int taxAmt) {
		this.taxAmt = taxAmt;
	}

}