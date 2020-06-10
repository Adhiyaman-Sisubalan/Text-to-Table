package models;

import java.io.Serializable;
import java.util.HashMap;

import javax.persistence.*;


/**
 * The persistent class for the DIM_ENCOUNTER database table.
 * 
 */
@Entity
@Table(name="DIM_ENCOUNTER")
@NamedQuery(name="DimEncounter.findAll", query="SELECT d FROM DimEncounter d")
public class DimEncounter implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ENC_KEY")
	private Integer encKey;

	@Column(name="CANCEL_IND")
	private String cancelInd;

	@Column(name="CASE_NO")
	private String caseNo;

	@Column(name="CASE_TYPE")
	private String caseType;

	@Column(name="CASE_VISIT_STATUS")
	private String caseVisitStatus;

	@Column(name="CHECK_DIGIT")
	private String checkDigit;

	@Column(name="CUR_NURSING_OU_KEY")
	private Integer curNursingOuKey;

	@Column(name="CUR_TRTMT_CAT_KEY")
	private Integer curTrtmtCatKey;

	@Column(name="ENC_END_DT_KEY")
	private Integer encEndDtKey;

	@Column(name="ENC_START_DT_KEY")
	private Integer encStartDtKey;

	@Column(name="INSTITUTION_KEY")
	private Integer institutionKey;

	@Column(name="IPDSC_OPVISIT_DT_KEY")
	private Integer ipdscOpvisitDtKey;

	@Column(name="PAT_CLS_KEY")
	private Integer patClsKey;

	@Column(name="PAT_KEY")
	private Integer patKey;

	@Column(name="PAT_TYPE_KEY")
	private Integer patTypeKey;

	@Column(name="VISIT_NO")
	private String visitNo;

	public static HashMap<String,Integer> mappingInfo = new HashMap<String,Integer>(){
		{
			put("encKey",0);
			put("cancelInd",1);
			put("caseNo",2);
			put("caseType",3);
			put("caseVisitStatus",4);
			put("checkDigit",5);
			put("curNursingOuKey",6);
			put("curTrtmtCatKey",7);
			put("encEndDtKey",8);
			put("encStartDtKey",9);
			put("institutionKey",10);
			put("ipdscOpvisitDtKey",11);
			put("patClsKey",12);
			put("patTypeKey",13);
			put("visitNo",14);
			
		}};
		public static Integer columnCount = 15;
	public DimEncounter() {
	}

	public int getEncKey() {
		return this.encKey;
	}

	public void setEncKey(int encKey) {
		this.encKey = encKey;
	}

	public String getCancelInd() {
		return this.cancelInd;
	}

	public void setCancelInd(String cancelInd) {
		this.cancelInd = cancelInd;
	}

	public String getCaseNo() {
		return this.caseNo;
	}

	public void setCaseNo(String caseNo) {
		this.caseNo = caseNo;
	}

	public String getCaseType() {
		return this.caseType;
	}

	public void setCaseType(String caseType) {
		this.caseType = caseType;
	}

	public String getCaseVisitStatus() {
		return this.caseVisitStatus;
	}

	public void setCaseVisitStatus(String caseVisitStatus) {
		this.caseVisitStatus = caseVisitStatus;
	}

	public String getCheckDigit() {
		return this.checkDigit;
	}

	public void setCheckDigit(String checkDigit) {
		this.checkDigit = checkDigit;
	}

	public int getCurNursingOuKey() {
		return this.curNursingOuKey;
	}

	public void setCurNursingOuKey(int curNursingOuKey) {
		this.curNursingOuKey = curNursingOuKey;
	}

	public int getCurTrtmtCatKey() {
		return this.curTrtmtCatKey;
	}

	public void setCurTrtmtCatKey(int curTrtmtCatKey) {
		this.curTrtmtCatKey = curTrtmtCatKey;
	}

	public int getEncEndDtKey() {
		return this.encEndDtKey;
	}

	public void setEncEndDtKey(int encEndDtKey) {
		this.encEndDtKey = encEndDtKey;
	}

	public int getEncStartDtKey() {
		return this.encStartDtKey;
	}

	public void setEncStartDtKey(int encStartDtKey) {
		this.encStartDtKey = encStartDtKey;
	}

	public int getInstitutionKey() {
		return this.institutionKey;
	}

	public void setInstitutionKey(int institutionKey) {
		this.institutionKey = institutionKey;
	}

	public int getIpdscOpvisitDtKey() {
		return this.ipdscOpvisitDtKey;
	}

	public void setIpdscOpvisitDtKey(int ipdscOpvisitDtKey) {
		this.ipdscOpvisitDtKey = ipdscOpvisitDtKey;
	}

	public int getPatClsKey() {
		return this.patClsKey;
	}

	public void setPatClsKey(int patClsKey) {
		this.patClsKey = patClsKey;
	}

	public int getPatKey() {
		return this.patKey;
	}

	public void setPatKey(int patKey) {
		this.patKey = patKey;
	}

	public int getPatTypeKey() {
		return this.patTypeKey;
	}

	public void setPatTypeKey(int patTypeKey) {
		this.patTypeKey = patTypeKey;
	}

	public String getVisitNo() {
		return this.visitNo;
	}

	public void setVisitNo(String visitNo) {
		this.visitNo = visitNo;
	}

}