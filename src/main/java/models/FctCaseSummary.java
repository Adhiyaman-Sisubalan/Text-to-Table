package models;

import java.io.Serializable;
import java.util.Date;
import java.util.HashMap;

import javax.persistence.*;


/**
 * The persistent class for the FCT_CASE_SUMMARY database table.
 * 
 */
@Entity
@Table(name="FCT_CASE_SUMMARY")
@NamedQuery(name="FctCaseSummary.findAll", query="SELECT f FROM FctCaseSummary f")
public class FctCaseSummary implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ENC_KEY")
	private Integer encKey;

	@Column(name="AE_TURN_IP_CASE_NO")
	private String aeTurnIpCaseNo;

	@Column(name="AE_TURN_IP_IND")
	private String aeTurnIpInd;

	@Column(name="BILL_STATUS")
	private String billStatus;

	@Column(name="CANCEL_IND")
	private String cancelInd;

	@Column(name="CASE_APV_MSHL_AMT")
	private Integer caseApvMshlAmt;

	@Column(name="CASE_OSTD_MSHL_AMT")
	private Integer caseOstdMshlAmt;

	@Column(name="CASE_VISIT_STATUS")
	private String caseVisitStatus;

	@Column(name="FIRST_FB_DATE_KEY")
	private Integer firstFbDateKey;

	@Column(name="FIRST_FB_DOC_NO")
	private String firstFbDocNo;

	@Column(name="INS_P1_ALL_OTHER_AMT")
	private Integer insP1AllOtherAmt;

	@Column(name="INS_P1_CD")
	private String insP1Cd;

	@Column(name="INS_P1_NAME")
	private String insP1Name;

	@Column(name="INS_P1_NET_PAY_AMT")
	private Integer insP1NetPayAmt;

	@Column(name="INS_P1_PAID_AMT")
	private Integer insP1PaidAmt;

	@Column(name="INS_P1_RANK")
	private String insP1Rank;

	@Column(name="INS_P1_REFUND_AMT")
	private Integer insP1RefundAmt;

	@Column(name="INS_P1_TAX_AMT")
	private Integer insP1TaxAmt;

	@Column(name="INS_P2_ALL_OTHER_AMT")
	private Integer insP2AllOtherAmt;

	@Column(name="INS_P2_CD")
	private String insP2Cd;

	@Column(name="INS_P2_NAME")
	private String insP2Name;

	@Column(name="INS_P2_NET_PAY_AMT")
	private Integer insP2NetPayAmt;

	@Column(name="INS_P2_PAID_AMT")
	private Integer insP2PaidAmt;

	@Column(name="INS_P2_RANK")
	private String insP2Rank;

	@Column(name="INS_P2_REFUND_AMT")
	private Integer insP2RefundAmt;

	@Column(name="INS_P2_TAX_AMT")
	private Integer insP2TaxAmt;

	@Column(name="INS_P3_ALL_OTHER_AMT")
	private Integer insP3AllOtherAmt;

	@Column(name="INS_P3_CD")
	private String insP3Cd;

	@Column(name="INS_P3_NAME")
	private String insP3Name;

	@Column(name="INS_P3_NET_PAY_AMT")
	private Integer insP3NetPayAmt;

	@Column(name="INS_P3_PAID_AMT")
	private Integer insP3PaidAmt;

	@Column(name="INS_P3_RANK")
	private String insP3Rank;

	@Column(name="INS_P3_REFUND_AMT")
	private Integer insP3RefundAmt;

	@Column(name="INS_P3_TAX_AMT")
	private Integer insP3TaxAmt;

	@Column(name="INS_P4_ALL_OTHER_AMT")
	private Integer insP4AllOtherAmt;

	@Column(name="INS_P4_CD")
	private String insP4Cd;

	@Column(name="INS_P4_NAME")
	private String insP4Name;

	@Column(name="INS_P4_NET_PAY_AMT")
	private Integer insP4NetPayAmt;

	@Column(name="INS_P4_PAID_AMT")
	private Integer insP4PaidAmt;

	@Column(name="INS_P4_RANK")
	private String insP4Rank;

	@Column(name="INS_P4_REFUND_AMT")
	private Integer insP4RefundAmt;

	@Column(name="INS_P4_TAX_AMT")
	private Integer insP4TaxAmt;

	@Column(name="INS_P5_ALL_OTHER_AMT")
	private Integer insP5AllOtherAmt;

	@Column(name="INS_P5_CD")
	private String insP5Cd;

	@Column(name="INS_P5_NAME")
	private String insP5Name;

	@Column(name="INS_P5_NET_PAY_AMT")
	private Integer insP5NetPayAmt;

	@Column(name="INS_P5_PAID_AMT")
	private Integer insP5PaidAmt;

	@Column(name="INS_P5_RANK")
	private String insP5Rank;

	@Column(name="INS_P5_REFUND_AMT")
	private Integer insP5RefundAmt;

	@Column(name="INS_P5_TAX_AMT")
	private Integer insP5TaxAmt;

	@Column(name="INS_P6_ALL_OTHER_AMT")
	private Integer insP6AllOtherAmt;

	@Column(name="INS_P6_CD")
	private String insP6Cd;

	@Column(name="INS_P6_NAME")
	private String insP6Name;

	@Column(name="INS_P6_NET_PAY_AMT")
	private Integer insP6NetPayAmt;

	@Column(name="INS_P6_PAID_AMT")
	private Integer insP6PaidAmt;

	@Column(name="INS_P6_RANK")
	private String insP6Rank;

	@Column(name="INS_P6_REFUND_AMT")
	private Integer insP6RefundAmt;

	@Column(name="INS_P6_TAX_AMT")
	private Integer insP6TaxAmt;

	@Column(name="INS_P7_ALL_OTHER_AMT")
	private Integer insP7AllOtherAmt;

	@Column(name="INS_P7_CD")
	private String insP7Cd;

	@Column(name="INS_P7_NAME")
	private String insP7Name;

	@Column(name="INS_P7_NET_PAY_AMT")
	private Integer insP7NetPayAmt;

	@Column(name="INS_P7_PAID_AMT")
	private Integer insP7PaidAmt;

	@Column(name="INS_P7_RANK")
	private String insP7Rank;

	@Column(name="INS_P7_REFUND_AMT")
	private Integer insP7RefundAmt;

	@Column(name="INS_P7_TAX_AMT")
	private Integer insP7TaxAmt;

	@Column(name="INS_P8_ALL_OTHER_AMT")
	private Integer insP8AllOtherAmt;

	@Column(name="INS_P8_CD")
	private String insP8Cd;

	@Column(name="INS_P8_NAME")
	private String insP8Name;

	@Column(name="INS_P8_NET_PAY_AMT")
	private Integer insP8NetPayAmt;

	@Column(name="INS_P8_PAID_AMT")
	private Integer insP8PaidAmt;

	@Column(name="INS_P8_RANK")
	private String insP8Rank;

	@Column(name="INS_P8_REFUND_AMT")
	private Integer insP8RefundAmt;

	@Column(name="INS_P8_TAX_AMT")
	private Integer insP8TaxAmt;

	@Column(name="INSTITUTION_KEY")
	private Integer institutionKey;

	@Column(name="IPHARM_ADJUSTMENT_AMT")
	private Integer ipharmAdjustmentAmt;

	@Column(name="IPHARM_AMT_PAID_3RDP")
	private Integer ipharmAmtPaid3rdp;

	@Column(name="IPHARM_AMT_PAID_AIP")
	private Integer ipharmAmtPaidAip;

	@Column(name="IPHARM_AMT_PAID_MDF")
	private Integer ipharmAmtPaidMdf;

	@Column(name="IPHARM_AMT_PAID_MSH")
	private Integer ipharmAmtPaidMsh;

	@Column(name="IPHARM_AMT_PAID_MSV")
	private Integer ipharmAmtPaidMsv;

	@Column(name="IPHARM_AMT_PAID_PMI")
	private Integer ipharmAmtPaidPmi;

	@Column(name="IPHARM_AMT_PAID_SELF")
	private Integer ipharmAmtPaidSelf;

	@Column(name="IPHARM_MISC_AMT")
	private Integer ipharmMiscAmt;

	@Column(name="IPHARM_NET_PAY_AMT")
	private Integer ipharmNetPayAmt;

	@Column(name="IPHARM_OS_AMT")
	private Integer ipharmOsAmt;

	@Column(name="IPHARM_OTHERS_AMT")
	private Integer ipharmOthersAmt;

	@Column(name="IPHARM_TAX_AMT")
	private Integer ipharmTaxAmt;

	@Column(name="IPHARM_WAIVER_AMT")
	private Integer ipharmWaiverAmt;

	@Column(name="IPHARM_WRITE_OFF_AMT")
	private Integer ipharmWriteOffAmt;

	@Column(name="LATEST_BILL_DATE")
	private Date latestBillDate;

	@Column(name="MIXCASEVISIT")
	private String mixcasevisit;

	@Column(name="P1_CUST_KEY")
	private Integer p1CustKey;

	@Column(name="P2_CUST_KEY")
	private Integer p2CustKey;

	@Column(name="P3_CUST_KEY")
	private Integer p3CustKey;

	@Column(name="P4_CUST_KEY")
	private Integer p4CustKey;

	@Column(name="P5_CUST_KEY")
	private Integer p5CustKey;

	@Column(name="P6_CUST_KEY")
	private Integer p6CustKey;

	@Column(name="P7_CUST_KEY")
	private Integer p7CustKey;

	@Column(name="P8_CUST_KEY")
	private Integer p8CustKey;

	@Column(name="SAP_ADJUSTMENT_AMT")
	private Integer sapAdjustmentAmt;

	@Column(name="SAP_AMT_PAID_3RDP")
	private Integer sapAmtPaid3rdp;

	@Column(name="SAP_AMT_PAID_AIP")
	private Integer sapAmtPaidAip;

	@Column(name="SAP_AMT_PAID_MDF")
	private Integer sapAmtPaidMdf;

	@Column(name="SAP_AMT_PAID_MSH")
	private Integer sapAmtPaidMsh;

	@Column(name="SAP_AMT_PAID_MSV")
	private Integer sapAmtPaidMsv;

	@Column(name="SAP_AMT_PAID_PMI")
	private Integer sapAmtPaidPmi;

	@Column(name="SAP_AMT_PAID_SELF")
	private Integer sapAmtPaidSelf;

	@Column(name="SAP_AMT_REFUND_3RDP")
	private Integer sapAmtRefund3rdp;

	@Column(name="SAP_AMT_REFUND_AIP")
	private Integer sapAmtRefundAip;

	@Column(name="SAP_AMT_REFUND_MDF")
	private Integer sapAmtRefundMdf;

	@Column(name="SAP_AMT_REFUND_MSH")
	private Integer sapAmtRefundMsh;

	@Column(name="SAP_AMT_REFUND_MSV")
	private Integer sapAmtRefundMsv;

	@Column(name="SAP_AMT_REFUND_PMI")
	private Integer sapAmtRefundPmi;

	@Column(name="SAP_AMT_REFUND_SELF")
	private Integer sapAmtRefundSelf;

	@Column(name="SAP_APV_MSHL_AMT")
	private Integer sapApvMshlAmt;

	@Column(name="SAP_MISC_AMT")
	private Integer sapMiscAmt;

	@Column(name="SAP_NET_PAY_AMT")
	private Integer sapNetPayAmt;

	@Column(name="SAP_OS_AMT")
	private Integer sapOsAmt;

	@Column(name="SAP_OSTD_MSHL_AMT")
	private Integer sapOstdMshlAmt;

	@Column(name="SAP_OTHERS_AMT")
	private Integer sapOthersAmt;

	@Column(name="SAP_TAX_AMT")
	private Integer sapTaxAmt;

	@Column(name="SAP_WAIVER_AMT")
	private Integer sapWaiverAmt;

	@Column(name="SAP_WRITE_OFF_AMT")
	private Integer sapWriteOffAmt;

	public static HashMap<String,Integer> mappingInfo = new HashMap<String,Integer>(){
		{
			put("encKey",0);
			put("aeTurnIpCaseNo",1);
			put("aeTurnIpInd",2);
			put("billStatus",3);
			put("cancelInd",4);
			put("caseApvMshlAmt",5);
			put("caseOstdMshlAmt",6);
			put("caseVisitStatus",7);
			put("firstFbDateKey",8);
			put("firstFbDocNo",9);
			put("insP1AllOtherAmt",10);
			put("insP1Cd",11);
			put("insP1Name",12);
			put("insP1NetPayAmt",13);
			put("insP1PaidAmt",14);
			put("insP1Rank",15);
			put("insP1RefundAmt",16);
			put("insP1TaxAmt",17);
			put("insP2AllOtherAmt",18);
			put("insP2Cd",19);
			put("insP2Name",20);
			put("insP2NetPayAmt",21);
			put("insP2PaidAmt",22);
			put("insP2Rank",23);
			put("insP2RefundAmt",24);
			put("insP2TaxAmt",25);
			put("insP3AllOtherAmt",26);
			put("insP3Cd",27);
			put("insP3Name",28);
			put("insP3NetPayAmt",29);
			put("insP3PaidAmt",30);
			put("insP3Rank",31);
			put("insP3RefundAmt",32);
			put("insP3TaxAmt",33);
			put("insP4AllOtherAmt",34);
			put("insP4Cd",35);
			put("insP4Name",36);
			put("insP4NetPayAmt",37);
			put("insP4PaidAmt",38);
			put("insP4Rank",39);
			put("insP4RefundAmt",40);
			put("insP4TaxAmt",41);
			put("insP5AllOtherAmt",42);
			put("insP5Cd",43);
			put("insP5Name",44);
			put("insP5NetPayAmt",45);
			put("insP5PaidAmt",46);
			put("insP5Rank",47);
			put("insP5RefundAmt",48);
			put("insP5TaxAmt",49);
			put("insP6AllOtherAmt",50);
			put("insP6Cd",51);
			put("insP6Name",52);
			put("insP6NetPayAmt",53);
			put("insP6PaidAmt",54);
			put("insP6Rank",55);
			put("insP6RefundAmt",56);
			put("insP6TaxAmt",57);
			put("insP7AllOtherAmt",58);
			put("insP7Cd",59);
			put("insP7Name",60);
			put("insP7NetPayAmt",61);
			put("insP7PaidAmt",62);
			put("insP7Rank",63);
			put("insP7RefundAmt",64);
			put("insP7TaxAmt",65);
			put("insP8AllOtherAmt",66);
			put("insP8Cd",67);
			put("insP8Name",68);
			put("insP8NetPayAmt",69);
			put("insP8PaidAmt",70);
			put("insP8Rank",71);
			put("insP8RefundAmt",72);
			put("insP8TaxAmt",73);
			put("institutionKey",74);
			put("ipharmAdjustmentAmt",75);
			put("ipharmAmtPaid3rdp",76);
			put("ipharmAmtPaidAip",77);
			put("ipharmAmtPaidMdf",78);
			put("ipharmAmtPaidMsh",79);
			put("ipharmAmtPaidMsv",80);
			put("ipharmAmtPaidPmi",81);
			put("ipharmAmtPaidSelf",82);
			put("ipharmMiscAmt",83);
			put("ipharmNetPayAmt",84);
			put("ipharmOsAmt",85);
			put("ipharmOthersAmt",86);
			put("ipharmTaxAmt",87);
			put("ipharmWaiverAmt",88);
			put("ipharmWriteOffAmt",89);
			put("latestBillDate",90);
			put("mixcasevisit",91);
			put("p1CustKey",92);
			put("p2CustKey",93);
			put("p3CustKey",94);
			put("p4CustKey",95);
			put("p5CustKey",96);
			put("p6CustKey",97);
			put("p7CustKey",98);
			put("p8CustKey",99);
			put("sapAdjustmentAmt",100);
			put("sapAmtPaid3rdp",101);
			put("sapAmtPaidAip",102);
			put("sapAmtPaidMdf",103);
			put("sapAmtPaidMsh",104);
			put("sapAmtPaidMsv",105);
			put("sapAmtPaidPmi",106);
			put("sapAmtPaidSelf",107);
			put("sapAmtRefund3rdp",108);
			put("sapAmtRefundAip",109);
			put("sapAmtRefundMdf",110);
			put("sapAmtRefundMsh",111);
			put("sapAmtRefundMsv",112);
			put("sapAmtRefundPmi",113);
			put("sapAmtRefundSelf",114);
			put("sapApvMshlAmt",115);
			put("sapMiscAmt",116);
			put("sapNetPayAmt",117);
			put("sapOsAmt",118);
			put("sapOstdMshlAmt",119);
			put("sapOthersAmt",120);
			put("sapTaxAmt",121);
			put("sapWaiverAmt",122);
			put("sapWriteOffAmt",123);
			
			
		}};
		public static Integer columnCount = 124;
	public FctCaseSummary() {
	}

	public Integer getEncKey() {
		return this.encKey;
	}

	public void setEncKey(int encKey) {
		this.encKey = encKey;
	}

	public String getAeTurnIpCaseNo() {
		return this.aeTurnIpCaseNo;
	}

	public void setAeTurnIpCaseNo(String aeTurnIpCaseNo) {
		this.aeTurnIpCaseNo = aeTurnIpCaseNo;
	}

	public String getAeTurnIpInd() {
		return this.aeTurnIpInd;
	}

	public void setAeTurnIpInd(String aeTurnIpInd) {
		this.aeTurnIpInd = aeTurnIpInd;
	}

	public String getBillStatus() {
		return this.billStatus;
	}

	public void setBillStatus(String billStatus) {
		this.billStatus = billStatus;
	}

	public String getCancelInd() {
		return this.cancelInd;
	}

	public void setCancelInd(String cancelInd) {
		this.cancelInd = cancelInd;
	}

	public int getCaseApvMshlAmt() {
		return this.caseApvMshlAmt;
	}

	public void setCaseApvMshlAmt(int caseApvMshlAmt) {
		this.caseApvMshlAmt = caseApvMshlAmt;
	}

	public int getCaseOstdMshlAmt() {
		return this.caseOstdMshlAmt;
	}

	public void setCaseOstdMshlAmt(int caseOstdMshlAmt) {
		this.caseOstdMshlAmt = caseOstdMshlAmt;
	}

	public String getCaseVisitStatus() {
		return this.caseVisitStatus;
	}

	public void setCaseVisitStatus(String caseVisitStatus) {
		this.caseVisitStatus = caseVisitStatus;
	}

	public int getFirstFbDateKey() {
		return this.firstFbDateKey;
	}

	public void setFirstFbDateKey(int firstFbDateKey) {
		this.firstFbDateKey = firstFbDateKey;
	}

	public String getFirstFbDocNo() {
		return this.firstFbDocNo;
	}

	public void setFirstFbDocNo(String firstFbDocNo) {
		this.firstFbDocNo = firstFbDocNo;
	}

	public int getInsP1AllOtherAmt() {
		return this.insP1AllOtherAmt;
	}

	public void setInsP1AllOtherAmt(int insP1AllOtherAmt) {
		this.insP1AllOtherAmt = insP1AllOtherAmt;
	}

	public String getInsP1Cd() {
		return this.insP1Cd;
	}

	public void setInsP1Cd(String insP1Cd) {
		this.insP1Cd = insP1Cd;
	}

	public String getInsP1Name() {
		return this.insP1Name;
	}

	public void setInsP1Name(String insP1Name) {
		this.insP1Name = insP1Name;
	}

	public int getInsP1NetPayAmt() {
		return this.insP1NetPayAmt;
	}

	public void setInsP1NetPayAmt(int insP1NetPayAmt) {
		this.insP1NetPayAmt = insP1NetPayAmt;
	}

	public int getInsP1PaidAmt() {
		return this.insP1PaidAmt;
	}

	public void setInsP1PaidAmt(int insP1PaidAmt) {
		this.insP1PaidAmt = insP1PaidAmt;
	}

	public String getInsP1Rank() {
		return this.insP1Rank;
	}

	public void setInsP1Rank(String insP1Rank) {
		this.insP1Rank = insP1Rank;
	}

	public int getInsP1RefundAmt() {
		return this.insP1RefundAmt;
	}

	public void setInsP1RefundAmt(int insP1RefundAmt) {
		this.insP1RefundAmt = insP1RefundAmt;
	}

	public int getInsP1TaxAmt() {
		return this.insP1TaxAmt;
	}

	public void setInsP1TaxAmt(int insP1TaxAmt) {
		this.insP1TaxAmt = insP1TaxAmt;
	}

	public int getInsP2AllOtherAmt() {
		return this.insP2AllOtherAmt;
	}

	public void setInsP2AllOtherAmt(int insP2AllOtherAmt) {
		this.insP2AllOtherAmt = insP2AllOtherAmt;
	}

	public String getInsP2Cd() {
		return this.insP2Cd;
	}

	public void setInsP2Cd(String insP2Cd) {
		this.insP2Cd = insP2Cd;
	}

	public String getInsP2Name() {
		return this.insP2Name;
	}

	public void setInsP2Name(String insP2Name) {
		this.insP2Name = insP2Name;
	}

	public int getInsP2NetPayAmt() {
		return this.insP2NetPayAmt;
	}

	public void setInsP2NetPayAmt(int insP2NetPayAmt) {
		this.insP2NetPayAmt = insP2NetPayAmt;
	}

	public int getInsP2PaidAmt() {
		return this.insP2PaidAmt;
	}

	public void setInsP2PaidAmt(int insP2PaidAmt) {
		this.insP2PaidAmt = insP2PaidAmt;
	}

	public String getInsP2Rank() {
		return this.insP2Rank;
	}

	public void setInsP2Rank(String insP2Rank) {
		this.insP2Rank = insP2Rank;
	}

	public int getInsP2RefundAmt() {
		return this.insP2RefundAmt;
	}

	public void setInsP2RefundAmt(int insP2RefundAmt) {
		this.insP2RefundAmt = insP2RefundAmt;
	}

	public int getInsP2TaxAmt() {
		return this.insP2TaxAmt;
	}

	public void setInsP2TaxAmt(int insP2TaxAmt) {
		this.insP2TaxAmt = insP2TaxAmt;
	}

	public int getInsP3AllOtherAmt() {
		return this.insP3AllOtherAmt;
	}

	public void setInsP3AllOtherAmt(int insP3AllOtherAmt) {
		this.insP3AllOtherAmt = insP3AllOtherAmt;
	}

	public String getInsP3Cd() {
		return this.insP3Cd;
	}

	public void setInsP3Cd(String insP3Cd) {
		this.insP3Cd = insP3Cd;
	}

	public String getInsP3Name() {
		return this.insP3Name;
	}

	public void setInsP3Name(String insP3Name) {
		this.insP3Name = insP3Name;
	}

	public int getInsP3NetPayAmt() {
		return this.insP3NetPayAmt;
	}

	public void setInsP3NetPayAmt(int insP3NetPayAmt) {
		this.insP3NetPayAmt = insP3NetPayAmt;
	}

	public int getInsP3PaidAmt() {
		return this.insP3PaidAmt;
	}

	public void setInsP3PaidAmt(int insP3PaidAmt) {
		this.insP3PaidAmt = insP3PaidAmt;
	}

	public String getInsP3Rank() {
		return this.insP3Rank;
	}

	public void setInsP3Rank(String insP3Rank) {
		this.insP3Rank = insP3Rank;
	}

	public int getInsP3RefundAmt() {
		return this.insP3RefundAmt;
	}

	public void setInsP3RefundAmt(int insP3RefundAmt) {
		this.insP3RefundAmt = insP3RefundAmt;
	}

	public int getInsP3TaxAmt() {
		return this.insP3TaxAmt;
	}

	public void setInsP3TaxAmt(int insP3TaxAmt) {
		this.insP3TaxAmt = insP3TaxAmt;
	}

	public int getInsP4AllOtherAmt() {
		return this.insP4AllOtherAmt;
	}

	public void setInsP4AllOtherAmt(int insP4AllOtherAmt) {
		this.insP4AllOtherAmt = insP4AllOtherAmt;
	}

	public String getInsP4Cd() {
		return this.insP4Cd;
	}

	public void setInsP4Cd(String insP4Cd) {
		this.insP4Cd = insP4Cd;
	}

	public String getInsP4Name() {
		return this.insP4Name;
	}

	public void setInsP4Name(String insP4Name) {
		this.insP4Name = insP4Name;
	}

	public int getInsP4NetPayAmt() {
		return this.insP4NetPayAmt;
	}

	public void setInsP4NetPayAmt(int insP4NetPayAmt) {
		this.insP4NetPayAmt = insP4NetPayAmt;
	}

	public int getInsP4PaidAmt() {
		return this.insP4PaidAmt;
	}

	public void setInsP4PaidAmt(int insP4PaidAmt) {
		this.insP4PaidAmt = insP4PaidAmt;
	}

	public String getInsP4Rank() {
		return this.insP4Rank;
	}

	public void setInsP4Rank(String insP4Rank) {
		this.insP4Rank = insP4Rank;
	}

	public int getInsP4RefundAmt() {
		return this.insP4RefundAmt;
	}

	public void setInsP4RefundAmt(int insP4RefundAmt) {
		this.insP4RefundAmt = insP4RefundAmt;
	}

	public int getInsP4TaxAmt() {
		return this.insP4TaxAmt;
	}

	public void setInsP4TaxAmt(int insP4TaxAmt) {
		this.insP4TaxAmt = insP4TaxAmt;
	}

	public int getInsP5AllOtherAmt() {
		return this.insP5AllOtherAmt;
	}

	public void setInsP5AllOtherAmt(int insP5AllOtherAmt) {
		this.insP5AllOtherAmt = insP5AllOtherAmt;
	}

	public String getInsP5Cd() {
		return this.insP5Cd;
	}

	public void setInsP5Cd(String insP5Cd) {
		this.insP5Cd = insP5Cd;
	}

	public String getInsP5Name() {
		return this.insP5Name;
	}

	public void setInsP5Name(String insP5Name) {
		this.insP5Name = insP5Name;
	}

	public int getInsP5NetPayAmt() {
		return this.insP5NetPayAmt;
	}

	public void setInsP5NetPayAmt(int insP5NetPayAmt) {
		this.insP5NetPayAmt = insP5NetPayAmt;
	}

	public int getInsP5PaidAmt() {
		return this.insP5PaidAmt;
	}

	public void setInsP5PaidAmt(int insP5PaidAmt) {
		this.insP5PaidAmt = insP5PaidAmt;
	}

	public String getInsP5Rank() {
		return this.insP5Rank;
	}

	public void setInsP5Rank(String insP5Rank) {
		this.insP5Rank = insP5Rank;
	}

	public int getInsP5RefundAmt() {
		return this.insP5RefundAmt;
	}

	public void setInsP5RefundAmt(int insP5RefundAmt) {
		this.insP5RefundAmt = insP5RefundAmt;
	}

	public int getInsP5TaxAmt() {
		return this.insP5TaxAmt;
	}

	public void setInsP5TaxAmt(int insP5TaxAmt) {
		this.insP5TaxAmt = insP5TaxAmt;
	}

	public int getInsP6AllOtherAmt() {
		return this.insP6AllOtherAmt;
	}

	public void setInsP6AllOtherAmt(int insP6AllOtherAmt) {
		this.insP6AllOtherAmt = insP6AllOtherAmt;
	}

	public String getInsP6Cd() {
		return this.insP6Cd;
	}

	public void setInsP6Cd(String insP6Cd) {
		this.insP6Cd = insP6Cd;
	}

	public String getInsP6Name() {
		return this.insP6Name;
	}

	public void setInsP6Name(String insP6Name) {
		this.insP6Name = insP6Name;
	}

	public int getInsP6NetPayAmt() {
		return this.insP6NetPayAmt;
	}

	public void setInsP6NetPayAmt(int insP6NetPayAmt) {
		this.insP6NetPayAmt = insP6NetPayAmt;
	}

	public int getInsP6PaidAmt() {
		return this.insP6PaidAmt;
	}

	public void setInsP6PaidAmt(int insP6PaidAmt) {
		this.insP6PaidAmt = insP6PaidAmt;
	}

	public String getInsP6Rank() {
		return this.insP6Rank;
	}

	public void setInsP6Rank(String insP6Rank) {
		this.insP6Rank = insP6Rank;
	}

	public int getInsP6RefundAmt() {
		return this.insP6RefundAmt;
	}

	public void setInsP6RefundAmt(int insP6RefundAmt) {
		this.insP6RefundAmt = insP6RefundAmt;
	}

	public int getInsP6TaxAmt() {
		return this.insP6TaxAmt;
	}

	public void setInsP6TaxAmt(int insP6TaxAmt) {
		this.insP6TaxAmt = insP6TaxAmt;
	}

	public int getInsP7AllOtherAmt() {
		return this.insP7AllOtherAmt;
	}

	public void setInsP7AllOtherAmt(int insP7AllOtherAmt) {
		this.insP7AllOtherAmt = insP7AllOtherAmt;
	}

	public String getInsP7Cd() {
		return this.insP7Cd;
	}

	public void setInsP7Cd(String insP7Cd) {
		this.insP7Cd = insP7Cd;
	}

	public String getInsP7Name() {
		return this.insP7Name;
	}

	public void setInsP7Name(String insP7Name) {
		this.insP7Name = insP7Name;
	}

	public int getInsP7NetPayAmt() {
		return this.insP7NetPayAmt;
	}

	public void setInsP7NetPayAmt(int insP7NetPayAmt) {
		this.insP7NetPayAmt = insP7NetPayAmt;
	}

	public int getInsP7PaidAmt() {
		return this.insP7PaidAmt;
	}

	public void setInsP7PaidAmt(int insP7PaidAmt) {
		this.insP7PaidAmt = insP7PaidAmt;
	}

	public String getInsP7Rank() {
		return this.insP7Rank;
	}

	public void setInsP7Rank(String insP7Rank) {
		this.insP7Rank = insP7Rank;
	}

	public int getInsP7RefundAmt() {
		return this.insP7RefundAmt;
	}

	public void setInsP7RefundAmt(int insP7RefundAmt) {
		this.insP7RefundAmt = insP7RefundAmt;
	}

	public int getInsP7TaxAmt() {
		return this.insP7TaxAmt;
	}

	public void setInsP7TaxAmt(int insP7TaxAmt) {
		this.insP7TaxAmt = insP7TaxAmt;
	}

	public int getInsP8AllOtherAmt() {
		return this.insP8AllOtherAmt;
	}

	public void setInsP8AllOtherAmt(int insP8AllOtherAmt) {
		this.insP8AllOtherAmt = insP8AllOtherAmt;
	}

	public String getInsP8Cd() {
		return this.insP8Cd;
	}

	public void setInsP8Cd(String insP8Cd) {
		this.insP8Cd = insP8Cd;
	}

	public String getInsP8Name() {
		return this.insP8Name;
	}

	public void setInsP8Name(String insP8Name) {
		this.insP8Name = insP8Name;
	}

	public int getInsP8NetPayAmt() {
		return this.insP8NetPayAmt;
	}

	public void setInsP8NetPayAmt(int insP8NetPayAmt) {
		this.insP8NetPayAmt = insP8NetPayAmt;
	}

	public int getInsP8PaidAmt() {
		return this.insP8PaidAmt;
	}

	public void setInsP8PaidAmt(int insP8PaidAmt) {
		this.insP8PaidAmt = insP8PaidAmt;
	}

	public String getInsP8Rank() {
		return this.insP8Rank;
	}

	public void setInsP8Rank(String insP8Rank) {
		this.insP8Rank = insP8Rank;
	}

	public int getInsP8RefundAmt() {
		return this.insP8RefundAmt;
	}

	public void setInsP8RefundAmt(int insP8RefundAmt) {
		this.insP8RefundAmt = insP8RefundAmt;
	}

	public int getInsP8TaxAmt() {
		return this.insP8TaxAmt;
	}

	public void setInsP8TaxAmt(int insP8TaxAmt) {
		this.insP8TaxAmt = insP8TaxAmt;
	}

	public int getInstitutionKey() {
		return this.institutionKey;
	}

	public void setInstitutionKey(int institutionKey) {
		this.institutionKey = institutionKey;
	}

	public int getIpharmAdjustmentAmt() {
		return this.ipharmAdjustmentAmt;
	}

	public void setIpharmAdjustmentAmt(int ipharmAdjustmentAmt) {
		this.ipharmAdjustmentAmt = ipharmAdjustmentAmt;
	}

	public int getIpharmAmtPaid3rdp() {
		return this.ipharmAmtPaid3rdp;
	}

	public void setIpharmAmtPaid3rdp(int ipharmAmtPaid3rdp) {
		this.ipharmAmtPaid3rdp = ipharmAmtPaid3rdp;
	}

	public int getIpharmAmtPaidAip() {
		return this.ipharmAmtPaidAip;
	}

	public void setIpharmAmtPaidAip(int ipharmAmtPaidAip) {
		this.ipharmAmtPaidAip = ipharmAmtPaidAip;
	}

	public int getIpharmAmtPaidMdf() {
		return this.ipharmAmtPaidMdf;
	}

	public void setIpharmAmtPaidMdf(int ipharmAmtPaidMdf) {
		this.ipharmAmtPaidMdf = ipharmAmtPaidMdf;
	}

	public int getIpharmAmtPaidMsh() {
		return this.ipharmAmtPaidMsh;
	}

	public void setIpharmAmtPaidMsh(int ipharmAmtPaidMsh) {
		this.ipharmAmtPaidMsh = ipharmAmtPaidMsh;
	}

	public int getIpharmAmtPaidMsv() {
		return this.ipharmAmtPaidMsv;
	}

	public void setIpharmAmtPaidMsv(int ipharmAmtPaidMsv) {
		this.ipharmAmtPaidMsv = ipharmAmtPaidMsv;
	}

	public int getIpharmAmtPaidPmi() {
		return this.ipharmAmtPaidPmi;
	}

	public void setIpharmAmtPaidPmi(int ipharmAmtPaidPmi) {
		this.ipharmAmtPaidPmi = ipharmAmtPaidPmi;
	}

	public int getIpharmAmtPaidSelf() {
		return this.ipharmAmtPaidSelf;
	}

	public void setIpharmAmtPaidSelf(int ipharmAmtPaidSelf) {
		this.ipharmAmtPaidSelf = ipharmAmtPaidSelf;
	}

	public int getIpharmMiscAmt() {
		return this.ipharmMiscAmt;
	}

	public void setIpharmMiscAmt(int ipharmMiscAmt) {
		this.ipharmMiscAmt = ipharmMiscAmt;
	}

	public int getIpharmNetPayAmt() {
		return this.ipharmNetPayAmt;
	}

	public void setIpharmNetPayAmt(int ipharmNetPayAmt) {
		this.ipharmNetPayAmt = ipharmNetPayAmt;
	}

	public int getIpharmOsAmt() {
		return this.ipharmOsAmt;
	}

	public void setIpharmOsAmt(int ipharmOsAmt) {
		this.ipharmOsAmt = ipharmOsAmt;
	}

	public int getIpharmOthersAmt() {
		return this.ipharmOthersAmt;
	}

	public void setIpharmOthersAmt(int ipharmOthersAmt) {
		this.ipharmOthersAmt = ipharmOthersAmt;
	}

	public int getIpharmTaxAmt() {
		return this.ipharmTaxAmt;
	}

	public void setIpharmTaxAmt(int ipharmTaxAmt) {
		this.ipharmTaxAmt = ipharmTaxAmt;
	}

	public int getIpharmWaiverAmt() {
		return this.ipharmWaiverAmt;
	}

	public void setIpharmWaiverAmt(int ipharmWaiverAmt) {
		this.ipharmWaiverAmt = ipharmWaiverAmt;
	}

	public int getIpharmWriteOffAmt() {
		return this.ipharmWriteOffAmt;
	}

	public void setIpharmWriteOffAmt(int ipharmWriteOffAmt) {
		this.ipharmWriteOffAmt = ipharmWriteOffAmt;
	}

	public Object getLatestBillDate() {
		return this.latestBillDate;
	}

	public void setLatestBillDate(Date latestBillDate) {
		this.latestBillDate = latestBillDate;
	}

	public String getMixcasevisit() {
		return this.mixcasevisit;
	}

	public void setMixcasevisit(String mixcasevisit) {
		this.mixcasevisit = mixcasevisit;
	}

	public int getP1CustKey() {
		return this.p1CustKey;
	}

	public void setP1CustKey(int p1CustKey) {
		this.p1CustKey = p1CustKey;
	}

	public int getP2CustKey() {
		return this.p2CustKey;
	}

	public void setP2CustKey(int p2CustKey) {
		this.p2CustKey = p2CustKey;
	}

	public int getP3CustKey() {
		return this.p3CustKey;
	}

	public void setP3CustKey(int p3CustKey) {
		this.p3CustKey = p3CustKey;
	}

	public int getP4CustKey() {
		return this.p4CustKey;
	}

	public void setP4CustKey(int p4CustKey) {
		this.p4CustKey = p4CustKey;
	}

	public int getP5CustKey() {
		return this.p5CustKey;
	}

	public void setP5CustKey(int p5CustKey) {
		this.p5CustKey = p5CustKey;
	}

	public int getP6CustKey() {
		return this.p6CustKey;
	}

	public void setP6CustKey(int p6CustKey) {
		this.p6CustKey = p6CustKey;
	}

	public int getP7CustKey() {
		return this.p7CustKey;
	}

	public void setP7CustKey(int p7CustKey) {
		this.p7CustKey = p7CustKey;
	}

	public int getP8CustKey() {
		return this.p8CustKey;
	}

	public void setP8CustKey(int p8CustKey) {
		this.p8CustKey = p8CustKey;
	}

	public int getSapAdjustmentAmt() {
		return this.sapAdjustmentAmt;
	}

	public void setSapAdjustmentAmt(int sapAdjustmentAmt) {
		this.sapAdjustmentAmt = sapAdjustmentAmt;
	}

	public int getSapAmtPaid3rdp() {
		return this.sapAmtPaid3rdp;
	}

	public void setSapAmtPaid3rdp(int sapAmtPaid3rdp) {
		this.sapAmtPaid3rdp = sapAmtPaid3rdp;
	}

	public int getSapAmtPaidAip() {
		return this.sapAmtPaidAip;
	}

	public void setSapAmtPaidAip(int sapAmtPaidAip) {
		this.sapAmtPaidAip = sapAmtPaidAip;
	}

	public int getSapAmtPaidMdf() {
		return this.sapAmtPaidMdf;
	}

	public void setSapAmtPaidMdf(int sapAmtPaidMdf) {
		this.sapAmtPaidMdf = sapAmtPaidMdf;
	}

	public int getSapAmtPaidMsh() {
		return this.sapAmtPaidMsh;
	}

	public void setSapAmtPaidMsh(int sapAmtPaidMsh) {
		this.sapAmtPaidMsh = sapAmtPaidMsh;
	}

	public int getSapAmtPaidMsv() {
		return this.sapAmtPaidMsv;
	}

	public void setSapAmtPaidMsv(int sapAmtPaidMsv) {
		this.sapAmtPaidMsv = sapAmtPaidMsv;
	}

	public int getSapAmtPaidPmi() {
		return this.sapAmtPaidPmi;
	}

	public void setSapAmtPaidPmi(int sapAmtPaidPmi) {
		this.sapAmtPaidPmi = sapAmtPaidPmi;
	}

	public int getSapAmtPaidSelf() {
		return this.sapAmtPaidSelf;
	}

	public void setSapAmtPaidSelf(int sapAmtPaidSelf) {
		this.sapAmtPaidSelf = sapAmtPaidSelf;
	}

	public int getSapAmtRefund3rdp() {
		return this.sapAmtRefund3rdp;
	}

	public void setSapAmtRefund3rdp(int sapAmtRefund3rdp) {
		this.sapAmtRefund3rdp = sapAmtRefund3rdp;
	}

	public int getSapAmtRefundAip() {
		return this.sapAmtRefundAip;
	}

	public void setSapAmtRefundAip(int sapAmtRefundAip) {
		this.sapAmtRefundAip = sapAmtRefundAip;
	}

	public int getSapAmtRefundMdf() {
		return this.sapAmtRefundMdf;
	}

	public void setSapAmtRefundMdf(int sapAmtRefundMdf) {
		this.sapAmtRefundMdf = sapAmtRefundMdf;
	}

	public int getSapAmtRefundMsh() {
		return this.sapAmtRefundMsh;
	}

	public void setSapAmtRefundMsh(int sapAmtRefundMsh) {
		this.sapAmtRefundMsh = sapAmtRefundMsh;
	}

	public int getSapAmtRefundMsv() {
		return this.sapAmtRefundMsv;
	}

	public void setSapAmtRefundMsv(int sapAmtRefundMsv) {
		this.sapAmtRefundMsv = sapAmtRefundMsv;
	}

	public int getSapAmtRefundPmi() {
		return this.sapAmtRefundPmi;
	}

	public void setSapAmtRefundPmi(int sapAmtRefundPmi) {
		this.sapAmtRefundPmi = sapAmtRefundPmi;
	}

	public int getSapAmtRefundSelf() {
		return this.sapAmtRefundSelf;
	}

	public void setSapAmtRefundSelf(int sapAmtRefundSelf) {
		this.sapAmtRefundSelf = sapAmtRefundSelf;
	}

	public int getSapApvMshlAmt() {
		return this.sapApvMshlAmt;
	}

	public void setSapApvMshlAmt(int sapApvMshlAmt) {
		this.sapApvMshlAmt = sapApvMshlAmt;
	}

	public int getSapMiscAmt() {
		return this.sapMiscAmt;
	}

	public void setSapMiscAmt(int sapMiscAmt) {
		this.sapMiscAmt = sapMiscAmt;
	}

	public int getSapNetPayAmt() {
		return this.sapNetPayAmt;
	}

	public void setSapNetPayAmt(int sapNetPayAmt) {
		this.sapNetPayAmt = sapNetPayAmt;
	}

	public int getSapOsAmt() {
		return this.sapOsAmt;
	}

	public void setSapOsAmt(int sapOsAmt) {
		this.sapOsAmt = sapOsAmt;
	}

	public int getSapOstdMshlAmt() {
		return this.sapOstdMshlAmt;
	}

	public void setSapOstdMshlAmt(int sapOstdMshlAmt) {
		this.sapOstdMshlAmt = sapOstdMshlAmt;
	}

	public int getSapOthersAmt() {
		return this.sapOthersAmt;
	}

	public void setSapOthersAmt(int sapOthersAmt) {
		this.sapOthersAmt = sapOthersAmt;
	}

	public int getSapTaxAmt() {
		return this.sapTaxAmt;
	}

	public void setSapTaxAmt(int sapTaxAmt) {
		this.sapTaxAmt = sapTaxAmt;
	}

	public int getSapWaiverAmt() {
		return this.sapWaiverAmt;
	}

	public void setSapWaiverAmt(int sapWaiverAmt) {
		this.sapWaiverAmt = sapWaiverAmt;
	}

	public int getSapWriteOffAmt() {
		return this.sapWriteOffAmt;
	}

	public void setSapWriteOffAmt(int sapWriteOffAmt) {
		this.sapWriteOffAmt = sapWriteOffAmt;
	}

}