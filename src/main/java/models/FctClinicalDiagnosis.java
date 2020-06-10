package models;

import java.io.Serializable;
import java.util.Date;
import java.util.HashMap;

import javax.persistence.*;


/**
 * The persistent class for the FCT_CLINICAL_DIAGNOSIS database table.
 * 
 */
@Entity
@Table(name="FCT_CLINICAL_DIAGNOSIS")
@NamedQuery(name="FctClinicalDiagnosis.findAll", query="SELECT f FROM FctClinicalDiagnosis f")
public class FctClinicalDiagnosis implements Serializable {
	private static final long serialVersionUID = 1L;

	
//	@Column(name="CLINICAL_DIAGNOSIS_KEY")
//	private Integer clinicalDiagnosisKey;

	@EmbeddedId
	private FctClinicalDiagnosisPK id;

	@Column(name="CASE_DIAG_TYPE_CD")
	private String caseDiagTypeCd;

	@Column(name="CASE_DIAG_TYPE_CD_DESC")
	private String caseDiagTypeCdDesc;

	@Column(name="CLINICAL_SUMMARY_DESC")
	private String clinicalSummaryDesc;

	@Column(name="CONCEPT_ID")
	private String conceptId;

	@Column(name="CREATION_BY")
	private String creationBy;

	@Column(name="CREATION_DATE_TIME")
	private Date creationDateTime;

	@Column(name="DIAG_COMMENTS")
	private String diagComments;

	@Column(name="DIAG_DATE_IND")
	private String diagDateInd;

	@Column(name="DIAG_NATURE_CODE")
	private String diagNatureCode;

	@Column(name="DIAG_NATURE_DESC")
	private String diagNatureDesc;

	@Column(name="DIAG_STATUS_DESC")
	private String diagStatusDesc;

	@Column(name="DIAGNOSIS_CD")
	private String diagnosisCd;

	@Column(name="DIAGNOSIS_DATE_KEY")
	private Integer diagnosisDateKey;

	@Column(name="DIAGNOSIS_TYPE")
	private String diagnosisType;

	@Column(name="DIAGNOSIS_TYPE_DESC")
	private String diagnosisTypeDesc;

//	@Column(name="ENC_KEY")
//	private Integer encKey;

	@Column(name="INST_KEY")
	private Integer instKey;

	@Column(name="MODIFICATION_BY")
	private String modificationBy;

	@Column(name="MODIFICATION_DATE_TIME")
	private Date modificationDateTime;

	@Column(name="MOVEMENT_SEQ")
	private String movementSeq;

//	@Column(name="ORDER_KEY")
//	private Integer orderKey;

	@Column(name="PROB_LIST_IND")
	private String probListInd;

//	@Column(name="SOURCE_REF_ID")
//	private String sourceRefId;

	@Column(name="TRANS_DATE_KEY")
	private Integer transDateKey;

	@Column(name="[VERSION]")
	private String version;

	public static HashMap<String,Integer> mappingInfo = new HashMap<String,Integer>(){
		{
			put("id",-1);
			
			put("caseDiagTypeCd",4);
			put("caseDiagTypeCdDesc",5);
			put("clinicalSummaryDesc",6);
			put("conceptId",7);
			put("creationBy",8);
			put("creationDateTime",9);
			put("diagComments",10);
			put("diagDateInd",11);
			put("diagNatureCode",12);
			put("diagNatureDesc",13);
			put("diagStatusDesc",14);
			put("diagnosisCd",15);
			put("diagnosisDateKey",16);
			put("diagnosisType",17);
			put("diagnosisTypeDesc",18);
			put("instKey",19);
			put("modificationBy",20);
			put("modificationDateTime",21);
			put("movementSeq",22);
			put("probListInd",23);
			put("transDateKey",24);
			put("version",25);
			
			
		}};
		public static Integer columnCount = 26;
	public FctClinicalDiagnosis() {
	}

//	public int getClinicalDiagnosisKey() {
//		return this.clinicalDiagnosisKey;
//	}
//
//	public void setClinicalDiagnosisKey(int clinicalDiagnosisKey) {
//		this.clinicalDiagnosisKey = clinicalDiagnosisKey;
//	}

	public String getCaseDiagTypeCd() {
		return this.caseDiagTypeCd;
	}

	public void setCaseDiagTypeCd(String caseDiagTypeCd) {
		this.caseDiagTypeCd = caseDiagTypeCd;
	}

	public String getCaseDiagTypeCdDesc() {
		return this.caseDiagTypeCdDesc;
	}

	public void setCaseDiagTypeCdDesc(String caseDiagTypeCdDesc) {
		this.caseDiagTypeCdDesc = caseDiagTypeCdDesc;
	}

	public String getClinicalSummaryDesc() {
		return this.clinicalSummaryDesc;
	}

	public void setClinicalSummaryDesc(String clinicalSummaryDesc) {
		this.clinicalSummaryDesc = clinicalSummaryDesc;
	}

	public String getConceptId() {
		return this.conceptId;
	}

	public void setConceptId(String conceptId) {
		this.conceptId = conceptId;
	}

	public String getCreationBy() {
		return this.creationBy;
	}

	public void setCreationBy(String creationBy) {
		this.creationBy = creationBy;
	}

	public Object getCreationDateTime() {
		return this.creationDateTime;
	}

	public void setCreationDateTime(Date creationDateTime) {
		this.creationDateTime = creationDateTime;
	}

	public String getDiagComments() {
		return this.diagComments;
	}

	public void setDiagComments(String diagComments) {
		this.diagComments = diagComments;
	}

	public String getDiagDateInd() {
		return this.diagDateInd;
	}

	public void setDiagDateInd(String diagDateInd) {
		this.diagDateInd = diagDateInd;
	}

	public String getDiagNatureCode() {
		return this.diagNatureCode;
	}

	public void setDiagNatureCode(String diagNatureCode) {
		this.diagNatureCode = diagNatureCode;
	}

	public String getDiagNatureDesc() {
		return this.diagNatureDesc;
	}

	public void setDiagNatureDesc(String diagNatureDesc) {
		this.diagNatureDesc = diagNatureDesc;
	}

	public String getDiagStatusDesc() {
		return this.diagStatusDesc;
	}

	public void setDiagStatusDesc(String diagStatusDesc) {
		this.diagStatusDesc = diagStatusDesc;
	}

	public String getDiagnosisCd() {
		return this.diagnosisCd;
	}

	public void setDiagnosisCd(String diagnosisCd) {
		this.diagnosisCd = diagnosisCd;
	}

	public int getDiagnosisDateKey() {
		return this.diagnosisDateKey;
	}

	public void setDiagnosisDateKey(int diagnosisDateKey) {
		this.diagnosisDateKey = diagnosisDateKey;
	}

	public String getDiagnosisType() {
		return this.diagnosisType;
	}

	public void setDiagnosisType(String diagnosisType) {
		this.diagnosisType = diagnosisType;
	}

	public String getDiagnosisTypeDesc() {
		return this.diagnosisTypeDesc;
	}

	public void setDiagnosisTypeDesc(String diagnosisTypeDesc) {
		this.diagnosisTypeDesc = diagnosisTypeDesc;
	}

//	public int getEncKey() {
//		return this.encKey;
//	}
//
//	public void setEncKey(int encKey) {
//		this.encKey = encKey;
//	}

	public int getInstKey() {
		return this.instKey;
	}

	public void setInstKey(int instKey) {
		this.instKey = instKey;
	}

	public String getModificationBy() {
		return this.modificationBy;
	}

	public void setModificationBy(String modificationBy) {
		this.modificationBy = modificationBy;
	}

	public Object getModificationDateTime() {
		return this.modificationDateTime;
	}

	public void setModificationDateTime(Date modificationDateTime) {
		this.modificationDateTime = modificationDateTime;
	}

	public String getMovementSeq() {
		return this.movementSeq;
	}

	public void setMovementSeq(String movementSeq) {
		this.movementSeq = movementSeq;
	}

//	public int getOrderKey() {
//		return this.orderKey;
//	}
//
//	public void setOrderKey(int orderKey) {
//		this.orderKey = orderKey;
//	}

	public String getProbListInd() {
		return this.probListInd;
	}

	public void setProbListInd(String probListInd) {
		this.probListInd = probListInd;
	}

//	public String getSourceRefId() {
//		return this.sourceRefId;
//	}
//
//	public void setSourceRefId(String sourceRefId) {
//		this.sourceRefId = sourceRefId;
//	}

	public int getTransDateKey() {
		return this.transDateKey;
	}

	public void setTransDateKey(int transDateKey) {
		this.transDateKey = transDateKey;
	}

	public String getVersion() {
		return this.version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

}