package models;

import java.io.Serializable;
import java.util.HashMap;

import javax.persistence.*;


/**
 * The persistent class for the FCT_MTO_CASE_VISIT database table.
 * 
 */
@Entity
@Table(name="FCT_MTO_CASE_VISIT")
@NamedQuery(name="FctMtoCaseVisit.findAll", query="SELECT f FROM FctMtoCaseVisit f")
public class FctMtoCaseVisit implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="MTO_CASE_VISIT_KEY")
	private Integer mtoCaseVisitKey;

	@Column(name="ENC_KEY")
	private Integer encKey;

	@Column(name="INACTIVE_IND")
	private String inactiveInd;

	@Column(name="INSTITUTION_KEY")
	private String institutionKey;

	@Column(name="MTO_CHAS_STATUS_CD")
	private String mtoChasStatusCd;

	@Column(name="MTO_EXEMPTION_CD")
	private String mtoExemptionCd;

	@Column(name="MTO_GP_IND_CD")
	private String mtoGpIndCd;

	@Column(name="MTO_OUTCOME_IND")
	private String mtoOutcomeInd;

	public static HashMap<String,Integer> mappingInfo = new HashMap<String,Integer>(){
		{
			put("mtoCaseVisitKey",0);
			put("encKey",1);
			put("inactiveInd",2);
			put("institutionKey",3);
			put("mtoChasStatusCd",4);
			put("mtoExemptionCd",5);
			put("mtoGpIndCd",6);
			put("mtoOutcomeInd",7);
			
			
		}};
	public static Integer columnCount = 8;
	public FctMtoCaseVisit() {
	}

	public int getMtoCaseVisitKey() {
		return this.mtoCaseVisitKey;
	}

	public void setMtoCaseVisitKey(int mtoCaseVisitKey) {
		this.mtoCaseVisitKey = mtoCaseVisitKey;
	}

	public int getEncKey() {
		return this.encKey;
	}

	public void setEncKey(int encKey) {
		this.encKey = encKey;
	}

	public String getInactiveInd() {
		return this.inactiveInd;
	}

	public void setInactiveInd(String inactiveInd) {
		this.inactiveInd = inactiveInd;
	}

	public String getInstitutionKey() {
		return this.institutionKey;
	}

	public void setInstitutionKey(String institutionKey) {
		this.institutionKey = institutionKey;
	}

	public String getMtoChasStatusCd() {
		return this.mtoChasStatusCd;
	}

	public void setMtoChasStatusCd(String mtoChasStatusCd) {
		this.mtoChasStatusCd = mtoChasStatusCd;
	}

	public String getMtoExemptionCd() {
		return this.mtoExemptionCd;
	}

	public void setMtoExemptionCd(String mtoExemptionCd) {
		this.mtoExemptionCd = mtoExemptionCd;
	}

	public String getMtoGpIndCd() {
		return this.mtoGpIndCd;
	}

	public void setMtoGpIndCd(String mtoGpIndCd) {
		this.mtoGpIndCd = mtoGpIndCd;
	}

	public String getMtoOutcomeInd() {
		return this.mtoOutcomeInd;
	}

	public void setMtoOutcomeInd(String mtoOutcomeInd) {
		this.mtoOutcomeInd = mtoOutcomeInd;
	}

}