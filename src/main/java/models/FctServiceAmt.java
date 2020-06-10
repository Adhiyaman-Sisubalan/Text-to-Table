package models;

import java.io.Serializable;
import java.util.HashMap;

import javax.persistence.*;


/**
 * The persistent class for the FCT_SERVICE_AMT database table.
 * 
 */
@Entity
@Table(name="FCT_SERVICE_AMT")
@NamedQuery(name="FctServiceAmt.findAll", query="SELECT f FROM FctServiceAmt f")
public class FctServiceAmt implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="SERVICE_AMT_KEY")
	private Integer serviceAmtKey;

	@Column(name="ADDL_MTO_CASEMIX_AMT")
	private Integer addlMtoCasemixAmt;

	@Column(name="CANCEL_IND")
	private String cancelInd;

	@Column(name="CHAS_AMT")
	private Integer chasAmt;

	@Column(name="ENC_KEY")
	private Integer encKey;

	@Column(name="GP_SUBSIDY_AMT")
	private Integer gpSubsidyAmt;

	@Column(name="GROSS_AMT")
	private Integer grossAmt;

	@Column(name="INSTITUTION_KEY")
	private Integer institutionKey;

	@Column(name="MTO_SUBSIDY_AMT")
	private Integer mtoSubsidyAmt;

	@Column(name="PAYABLE_BEF_GP_AMT")
	private Integer payableBefGpAmt;

	@Column(name="PAYABLE_BEF_MTO_AMT")
	private Integer payableBefMtoAmt;

	@Column(name="SERVICE_SEQ_NO")
	private String serviceSeqNo;

	@Column(name="SUBSIDY_AMT")
	private Integer subsidyAmt;

	@Column(name="SURCHARGE_AMT")
	private Integer surchargeAmt;

	@Column(name="WAIVER_AMT")
	private Integer waiverAmt;

	public static HashMap<String,Integer> mappingInfo = new HashMap<String,Integer>(){
		{
			put("serviceAmtKey",0);
			put("addlMtoCasemixAmt",1);
			put("cancelInd",2);
			put("chasAmt",3);
			put("encKey",4);
			put("gpSubsidyAmt",5);
			put("grossAmt",6);
			put("institutionKey",7);
			put("mtoSubsidyAmt",8);
			put("payableBefGpAmt",9);
			put("payableBefMtoAmt",10);
			put("serviceSeqNo",11);
			put("subsidyAmt",12);
			put("surchargeAmt",13);
			put("waiverAmt",14);
		}};
		public static Integer columnCount = 15;
	public FctServiceAmt() {
	}

	public int getServiceAmtKey() {
		return this.serviceAmtKey;
	}

	public void setServiceAmtKey(int serviceAmtKey) {
		this.serviceAmtKey = serviceAmtKey;
	}

	public int getAddlMtoCasemixAmt() {
		return this.addlMtoCasemixAmt;
	}

	public void setAddlMtoCasemixAmt(int addlMtoCasemixAmt) {
		this.addlMtoCasemixAmt = addlMtoCasemixAmt;
	}

	public String getCancelInd() {
		return this.cancelInd;
	}

	public void setCancelInd(String cancelInd) {
		this.cancelInd = cancelInd;
	}

	public int getChasAmt() {
		return this.chasAmt;
	}

	public void setChasAmt(int chasAmt) {
		this.chasAmt = chasAmt;
	}

	public int getEncKey() {
		return this.encKey;
	}

	public void setEncKey(int encKey) {
		this.encKey = encKey;
	}

	public int getGpSubsidyAmt() {
		return this.gpSubsidyAmt;
	}

	public void setGpSubsidyAmt(int gpSubsidyAmt) {
		this.gpSubsidyAmt = gpSubsidyAmt;
	}

	public int getGrossAmt() {
		return this.grossAmt;
	}

	public void setGrossAmt(int grossAmt) {
		this.grossAmt = grossAmt;
	}

	public int getInstitutionKey() {
		return this.institutionKey;
	}

	public void setInstitutionKey(int institutionKey) {
		this.institutionKey = institutionKey;
	}

	public int getMtoSubsidyAmt() {
		return this.mtoSubsidyAmt;
	}

	public void setMtoSubsidyAmt(int mtoSubsidyAmt) {
		this.mtoSubsidyAmt = mtoSubsidyAmt;
	}

	public int getPayableBefGpAmt() {
		return this.payableBefGpAmt;
	}

	public void setPayableBefGpAmt(int payableBefGpAmt) {
		this.payableBefGpAmt = payableBefGpAmt;
	}

	public int getPayableBefMtoAmt() {
		return this.payableBefMtoAmt;
	}

	public void setPayableBefMtoAmt(int payableBefMtoAmt) {
		this.payableBefMtoAmt = payableBefMtoAmt;
	}

	public String getServiceSeqNo() {
		return this.serviceSeqNo;
	}

	public void setServiceSeqNo(String serviceSeqNo) {
		this.serviceSeqNo = serviceSeqNo;
	}

	public int getSubsidyAmt() {
		return this.subsidyAmt;
	}

	public void setSubsidyAmt(int subsidyAmt) {
		this.subsidyAmt = subsidyAmt;
	}

	public int getSurchargeAmt() {
		return this.surchargeAmt;
	}

	public void setSurchargeAmt(int surchargeAmt) {
		this.surchargeAmt = surchargeAmt;
	}

	public int getWaiverAmt() {
		return this.waiverAmt;
	}

	public void setWaiverAmt(int waiverAmt) {
		this.waiverAmt = waiverAmt;
	}

}