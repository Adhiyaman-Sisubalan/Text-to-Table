package models;

import java.io.Serializable;
import java.util.HashMap;

import javax.persistence.*;


/**
 * The persistent class for the FCT_TEST_BILL database table.
 * 
 */
@Entity
@Table(name="FCT_TEST_BILL")
@NamedQuery(name="FctTestBill.findAll", query="SELECT f FROM FctTestBill f")
public class FctTestBill implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="TEST_BILL_KEY")
	private Integer testBillKey;

	@Column(name="BILL_DT_KEY")
	private Integer billDtKey;

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

	@Column(name="SEPARATION_BILL_STATUS")
	private String separationBillStatus;

	@Column(name="SERVICE_SEQ_NO")
	private String serviceSeqNo;

	@Column(name="TAX_AMT")
	private Integer taxAmt;

	public static HashMap<String,Integer> mappingInfo = new HashMap<String,Integer>(){
		{
			put("testBillKey",0);
			put("billDtKey",1);
			put("encKey",2);
			put("grossTaxAmt",3);
			put("insProvCd",4);
			put("institutionKey",5);
			put("netPayableAmt",6);
			put("payableAmt",7);
			put("payableAmtBefMt",8);
			put("payerTypeKey",9);
			put("separationBillStatus",10);
			put("serviceSeqNo",11);
			put("taxAmt",12);
			
		}};
		public static Integer columnCount = 13;
	public FctTestBill() {
	}

	public int getTestBillKey() {
		return this.testBillKey;
	}

	public void setTestBillKey(int testBillKey) {
		this.testBillKey = testBillKey;
	}

	public int getBillDtKey() {
		return this.billDtKey;
	}

	public void setBillDtKey(int billDtKey) {
		this.billDtKey = billDtKey;
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

	public String getSeparationBillStatus() {
		return this.separationBillStatus;
	}

	public void setSeparationBillStatus(String separationBillStatus) {
		this.separationBillStatus = separationBillStatus;
	}

	public String getServiceSeqNo() {
		return this.serviceSeqNo;
	}

	public void setServiceSeqNo(String serviceSeqNo) {
		this.serviceSeqNo = serviceSeqNo;
	}

	public int getTaxAmt() {
		return this.taxAmt;
	}

	public void setTaxAmt(int taxAmt) {
		this.taxAmt = taxAmt;
	}

}