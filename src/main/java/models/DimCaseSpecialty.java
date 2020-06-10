package models;

import java.io.Serializable;
import java.util.HashMap;

import javax.persistence.*;


/**
 * The persistent class for the DIM_CASE_SPECIALTY database table.
 * 
 */
@Entity
@Table(name="DIM_CASE_SPECIALTY")
@NamedQuery(name="DimCaseSpecialty.findAll", query="SELECT d FROM DimCaseSpecialty d")
public class DimCaseSpecialty implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="CASE_SPECIALTY_KEY")
	private Integer caseSpecialtyKey;

	@Column(name="CASE_SPECIALTY")
	private String caseSpecialty;

	@Column(name="CASE_SPECIALTY_CD")
	private String caseSpecialtyCd;

	public static HashMap<String,Integer> mappingInfo = new HashMap<String,Integer>(){
		{
			put("caseSpecialtyKey",0);
			put("caseSpecialty",1);
			put("caseSpecialtyCd",2);
		}};
		
	public static Integer columnCount = 3;
	public DimCaseSpecialty() {
	}

	public int getCaseSpecialtyKey() {
		return this.caseSpecialtyKey;
	}

	public void setCaseSpecialtyKey(int caseSpecialtyKey) {
		this.caseSpecialtyKey = caseSpecialtyKey;
	}

	public String getCaseSpecialty() {
		return this.caseSpecialty;
	}

	public void setCaseSpecialty(String caseSpecialty) {
		this.caseSpecialty = caseSpecialty;
	}

	public String getCaseSpecialtyCd() {
		return this.caseSpecialtyCd;
	}

	public void setCaseSpecialtyCd(String caseSpecialtyCd) {
		this.caseSpecialtyCd = caseSpecialtyCd;
	}

}