package models;

import java.io.Serializable;
import java.util.HashMap;

import javax.persistence.*;


/**
 * The persistent class for the FCT_MV_ENC_PROCEDURE database table.
 * 
 */
@Entity
@Table(name="FCT_MV_ENC_PROCEDURE")
@NamedQuery(name="FctMvEncProcedure.findAll", query="SELECT f FROM FctMvEncProcedure f")
public class FctMvEncProcedure implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private FctMvEncProcedurePK id;

	@Column(name="CANCEL_IND")
	private String cancelInd;

	@Column(name="COMPLICATION_LEVEL_PROCEDURE")
	private String complicationLevelProcedure;

	@Column(name="DRG_IMPACT")
	private String drgImpact;

	@Column(name="DRG_PROC_CAT")
	private String drgProcCat;

	@Column(name="INSTITUTION_KEY")
	private Integer institutionKey;

	@Column(name="PROCEDURE_KEY")
	private Integer procedureKey;

	public static HashMap<String,Integer> mappingInfo = new HashMap<String,Integer>(){
		{
			put("id",-1);
		
			put("cancelInd",2);
			put("complicationLevelProcedure",3);
			put("drgImpact",4);
			put("drgProcCat",5);
			put("institutionKey",6);
			put("procedureKey",7);
			
			
		}};
	public static Integer columnCount = 8;
	public FctMvEncProcedure() {
	}

	public FctMvEncProcedurePK getId() {
		return this.id;
	}

	public void setId(FctMvEncProcedurePK id) {
		this.id = id;
	}

	public String getCancelInd() {
		return this.cancelInd;
	}

	public void setCancelInd(String cancelInd) {
		this.cancelInd = cancelInd;
	}

	public String getComplicationLevelProcedure() {
		return this.complicationLevelProcedure;
	}

	public void setComplicationLevelProcedure(String complicationLevelProcedure) {
		this.complicationLevelProcedure = complicationLevelProcedure;
	}

	public String getDrgImpact() {
		return this.drgImpact;
	}

	public void setDrgImpact(String drgImpact) {
		this.drgImpact = drgImpact;
	}

	public String getDrgProcCat() {
		return this.drgProcCat;
	}

	public void setDrgProcCat(String drgProcCat) {
		this.drgProcCat = drgProcCat;
	}

	public int getInstitutionKey() {
		return this.institutionKey;
	}

	public void setInstitutionKey(int institutionKey) {
		this.institutionKey = institutionKey;
	}

	public int getProcedureKey() {
		return this.procedureKey;
	}

	public void setProcedureKey(int procedureKey) {
		this.procedureKey = procedureKey;
	}

}