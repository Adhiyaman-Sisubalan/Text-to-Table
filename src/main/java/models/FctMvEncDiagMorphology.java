package models;

import java.io.Serializable;
import java.util.HashMap;

import javax.persistence.*;


/**
 * The persistent class for the FCT_MV_ENC_DIAG_MORPHOLOGY database table.
 * 
 */
@Entity
@Table(name="FCT_MV_ENC_DIAG_MORPHOLOGY")
@NamedQuery(name="FctMvEncDiagMorphology.findAll", query="SELECT f FROM FctMvEncDiagMorphology f")
public class FctMvEncDiagMorphology implements Serializable {
	private static final long serialVersionUID = 1L;

//	@Id
//	@Column(name="ENC_DIAGNOSIS_KEY")
//	private int encDiagnosisKey;

	@EmbeddedId
	private FctMvEncDiagMorphologyPK id;
	
	@Column(name="CANCEL_IND")
	private String cancelInd;

	@Column(name="COMPLICATION_LEVEL_DIAGNOSIS")
	private String complicationLevelDiagnosis;

	@Column(name="DIAGNOSIS_KEY")
	private int diagnosisKey;

	@Column(name="DIAGNOSIS_QUALIFIER")
	private String diagnosisQualifier;

	@Column(name="DIAGNOSIS_TYPE")
	private String diagnosisType;

	@Column(name="DRG_IMPACT")
	private String drgImpact;

	@Column(name="DRG_RELEVANT_IND")
	private String drgRelevantInd;

//	@Column(name="ENC_KEY")
//	private int encKey;

	@Column(name="INSTITUTION_KEY")
	private int institutionKey;

	@Column(name="MORPHOLOGY_KEY")
	private int morphologyKey;

	public static HashMap<String,Integer> mappingInfo = new HashMap<String,Integer>(){
		{
			put("id",-1);
			
			
			put("cancelInd",2);
			put("complicationLevelDiagnosis",3);
			put("diagnosisKey",4);
			put("diagnosisQualifier",5);
			put("diagnosisType",6);
			put("drgImpact",7);
			put("drgRelevantInd",8);
			put("institutionKey",9);
			put("morphologyKey",10);
			
		}};
		public static Integer columnCount = 11;
	public FctMvEncDiagMorphology() {
	}

//	public int getEncDiagnosisKey() {
//		return this.encDiagnosisKey;
//	}
//
//	public void setEncDiagnosisKey(int encDiagnosisKey) {
//		this.encDiagnosisKey = encDiagnosisKey;
//	}

	public String getCancelInd() {
		return this.cancelInd;
	}

	public void setCancelInd(String cancelInd) {
		this.cancelInd = cancelInd;
	}

	public String getComplicationLevelDiagnosis() {
		return this.complicationLevelDiagnosis;
	}

	public void setComplicationLevelDiagnosis(String complicationLevelDiagnosis) {
		this.complicationLevelDiagnosis = complicationLevelDiagnosis;
	}

	public int getDiagnosisKey() {
		return this.diagnosisKey;
	}

	public void setDiagnosisKey(int diagnosisKey) {
		this.diagnosisKey = diagnosisKey;
	}

	public String getDiagnosisQualifier() {
		return this.diagnosisQualifier;
	}

	public void setDiagnosisQualifier(String diagnosisQualifier) {
		this.diagnosisQualifier = diagnosisQualifier;
	}

	public String getDiagnosisType() {
		return this.diagnosisType;
	}

	public void setDiagnosisType(String diagnosisType) {
		this.diagnosisType = diagnosisType;
	}

	public String getDrgImpact() {
		return this.drgImpact;
	}

	public void setDrgImpact(String drgImpact) {
		this.drgImpact = drgImpact;
	}

	public String getDrgRelevantInd() {
		return this.drgRelevantInd;
	}

	public void setDrgRelevantInd(String drgRelevantInd) {
		this.drgRelevantInd = drgRelevantInd;
	}

//	public int getEncKey() {
//		return this.encKey;
//	}
//
//	public void setEncKey(int encKey) {
//		this.encKey = encKey;
//	}

	public int getInstitutionKey() {
		return this.institutionKey;
	}

	public void setInstitutionKey(int institutionKey) {
		this.institutionKey = institutionKey;
	}

	public int getMorphologyKey() {
		return this.morphologyKey;
	}

	public void setMorphologyKey(int morphologyKey) {
		this.morphologyKey = morphologyKey;
	}

}