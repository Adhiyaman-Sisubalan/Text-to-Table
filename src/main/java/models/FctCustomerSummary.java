package models;

import java.io.Serializable;
import java.util.Date;
import java.util.HashMap;

import javax.persistence.*;


/**
 * The persistent class for the FCT_CUSTOMER_SUMMARY database table.
 * 
 */
@Entity
@Table(name="FCT_CUSTOMER_SUMMARY")
@NamedQuery(name="FctCustomerSummary.findAll", query="SELECT f FROM FctCustomerSummary f")
public class FctCustomerSummary implements Serializable {
	private static final long serialVersionUID = 1L;

//	@Id
//	@Column(name="COMPANY_KEY")
//	private Integer companyKey;

	@EmbeddedId
	private FctCustomerSummaryPK id;
	
	@Column(name="BADDEBT_WRITEOFF_IND")
	private String baddebtWriteoffInd;

	@Column(name="CANCEL_IND")
	private String cancelInd;

//	@Column(name="CUSTOMER_KEY")
//	private Integer customerKey;

	@Column(name="INFLIGHT_IND")
	private String inflightInd;

	@Column(name="LATEST_BILL_DATE")
	private Date latestBillDate;

	@Column(name="LATEST_PAYMENT_AMT")
	private Integer latestPaymentAmt;

	@Column(name="LATEST_PAYMENT_DATE")
	private Date latestPaymentDate;

	@Column(name="N1SG_BDEBT_CASE_CNT")
	private Integer n1sgBdebtCaseCnt;

	@Column(name="NEXT_TCU_DATE")
	private Date nextTcuDate;

	@Column(name="PREV_MDF_USE_IND")
	private String prevMdfUseInd;

	public static HashMap<String,Integer> mappingInfo = new HashMap<String,Integer>(){
		{
			put("id",-1);
			
			put("baddebtWriteoffInd",2);
			put("cancelInd",3);
			put("inflightInd",4);
			put("latestBillDate",5);
			put("latestPaymentAmt",6);
			put("latestPaymentDate",7);
			put("n1sgBdebtCaseCnt",8);
			put("nextTcuDate",9);
			put("prevMdfUseInd",10);
			
		}};
		public static Integer columnCount = 11;
	public FctCustomerSummary() {
	}

//	public int getCompanyKey() {
//		return this.companyKey;
//	}
//
//	public void setCompanyKey(int companyKey) {
//		this.companyKey = companyKey;
//	}

	public String getBaddebtWriteoffInd() {
		return this.baddebtWriteoffInd;
	}

	public void setBaddebtWriteoffInd(String baddebtWriteoffInd) {
		this.baddebtWriteoffInd = baddebtWriteoffInd;
	}

	public String getCancelInd() {
		return this.cancelInd;
	}

	public void setCancelInd(String cancelInd) {
		this.cancelInd = cancelInd;
	}

//	public int getCustomerKey() {
//		return this.customerKey;
//	}
//
//	public void setCustomerKey(int customerKey) {
//		this.customerKey = customerKey;
//	}

	public String getInflightInd() {
		return this.inflightInd;
	}

	public void setInflightInd(String inflightInd) {
		this.inflightInd = inflightInd;
	}

	public Object getLatestBillDate() {
		return this.latestBillDate;
	}

	public void setLatestBillDate(Date latestBillDate) {
		this.latestBillDate = latestBillDate;
	}

	public int getLatestPaymentAmt() {
		return this.latestPaymentAmt;
	}

	public void setLatestPaymentAmt(int latestPaymentAmt) {
		this.latestPaymentAmt = latestPaymentAmt;
	}

	public Object getLatestPaymentDate() {
		return this.latestPaymentDate;
	}

	public void setLatestPaymentDate(Date latestPaymentDate) {
		this.latestPaymentDate = latestPaymentDate;
	}

	public int getN1sgBdebtCaseCnt() {
		return this.n1sgBdebtCaseCnt;
	}

	public void setN1sgBdebtCaseCnt(int n1sgBdebtCaseCnt) {
		this.n1sgBdebtCaseCnt = n1sgBdebtCaseCnt;
	}

	public Object getNextTcuDate() {
		return this.nextTcuDate;
	}

	public void setNextTcuDate(Date nextTcuDate) {
		this.nextTcuDate = nextTcuDate;
	}

	public String getPrevMdfUseInd() {
		return this.prevMdfUseInd;
	}

	public void setPrevMdfUseInd(String prevMdfUseInd) {
		this.prevMdfUseInd = prevMdfUseInd;
	}

}