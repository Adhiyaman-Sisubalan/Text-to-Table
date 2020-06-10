package models;

import java.io.Serializable;
import java.util.HashMap;

import javax.persistence.*;


/**
 * The persistent class for the DIM_CLINICAL_DIAGNOSIS database table.
 * 
 */
@Entity
@Table(name="DIM_CLINICAL_DIAGNOSIS")
@NamedQuery(name="DimClinicalDiagnosis.findAll", query="SELECT d FROM DimClinicalDiagnosis d")
public class DimClinicalDiagnosis implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="CLINICAL_DIAGNOSIS_KEY")
	private Integer clinicalDiagnosisKey;

	@Column(name="CODE_SYSTEM")
	private String codeSystem;

	@Column(name="CODE_SYSTEM_NAME")
	private String codeSystemName;

	@Column(name="DISPLAY_TEXT")
	private String displayText;

	public static HashMap<String,Integer> mappingInfo = new HashMap<String,Integer>(){
		{
			put("clinicalDiagnosisKey",0);
			put("codeSystem",1);
			put("codeSystemName",2);
			put("displayText",3);
		}};
		public static Integer columnCount = 4;
	public DimClinicalDiagnosis() {
	}

	public int getClinicalDiagnosisKey() {
		return this.clinicalDiagnosisKey;
	}

	public void setClinicalDiagnosisKey(int clinicalDiagnosisKey) {
		this.clinicalDiagnosisKey = clinicalDiagnosisKey;
	}

	public String getCodeSystem() {
		return this.codeSystem;
	}

	public void setCodeSystem(String codeSystem) {
		this.codeSystem = codeSystem;
	}

	public String getCodeSystemName() {
		return this.codeSystemName;
	}

	public void setCodeSystemName(String codeSystemName) {
		this.codeSystemName = codeSystemName;
	}

	public String getDisplayText() {
		return this.displayText;
	}

	public void setDisplayText(String displayText) {
		this.displayText = displayText;
	}

}