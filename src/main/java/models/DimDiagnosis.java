package models;

import java.io.Serializable;
import java.util.HashMap;

import javax.persistence.*;


/**
 * The persistent class for the DIM_DIAGNOSIS database table.
 * 
 */
@Entity
@Table(name="DIM_DIAGNOSIS")
@NamedQuery(name="DimDiagnosis.findAll", query="SELECT d FROM DimDiagnosis d")
public class DimDiagnosis implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="DIAGNOSIS_KEY")
	private Integer diagnosisKey;

	@Column(name="DIAGNOSIS_CAT")
	private String diagnosisCat;

	@Column(name="DIAGNOSIS_CD")
	private String diagnosisCd;

	@Column(name="DIAGNOSIS_DESC")
	private String diagnosisDesc;

	public static HashMap<String,Integer> mappingInfo = new HashMap<String,Integer>(){
		{
			put("diagnosisKey",0);
			put("diagnosisCat",1);
			put("diagnosisCd",2);
			put("diagnosisDesc",3);
		}};
		public static Integer columnCount = 4;
	public DimDiagnosis() {
	}

	public int getDiagnosisKey() {
		return this.diagnosisKey;
	}

	public void setDiagnosisKey(int diagnosisKey) {
		this.diagnosisKey = diagnosisKey;
	}

	public String getDiagnosisCat() {
		return this.diagnosisCat;
	}

	public void setDiagnosisCat(String diagnosisCat) {
		this.diagnosisCat = diagnosisCat;
	}

	public String getDiagnosisCd() {
		return this.diagnosisCd;
	}

	public void setDiagnosisCd(String diagnosisCd) {
		this.diagnosisCd = diagnosisCd;
	}

	public String getDiagnosisDesc() {
		return this.diagnosisDesc;
	}

	public void setDiagnosisDesc(String diagnosisDesc) {
		this.diagnosisDesc = diagnosisDesc;
	}

}