package models;

import java.io.Serializable;
import java.util.HashMap;

import javax.persistence.*;

/**
 * The primary key class for the FCT_MOVEMENT database table.
 * 
 */
@Embeddable
public class FctMovementPK implements Serializable, CompoundedPKInterface {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="CASE_NO")
	private String caseNo;

	@Column(name="INSTITUTION_CD")
	private String institutionCd;

	@Column(name="MOVEMENT_SEQ")
	private String movementSeq;

	public static HashMap<String,Integer> mappingInfo = new HashMap<String,Integer>(){
		{
			put("caseNo",0);
			put("institutionCd",1);
			put("movementSeq",2);
		}
	};
	public FctMovementPK() {
	}
	public String getCaseNo() {
		return this.caseNo;
	}
	public void setCaseNo(String caseNo) {
		this.caseNo = caseNo;
	}
	public String getInstitutionCd() {
		return this.institutionCd;
	}
	public void setInstitutionCd(String institutionCd) {
		this.institutionCd = institutionCd;
	}
	public String getMovementSeq() {
		return this.movementSeq;
	}
	public void setMovementSeq(String movementSeq) {
		this.movementSeq = movementSeq;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof FctMovementPK)) {
			return false;
		}
		FctMovementPK castOther = (FctMovementPK)other;
		return 
			this.caseNo.equals(castOther.caseNo)
			&& this.institutionCd.equals(castOther.institutionCd)
			&& this.movementSeq.equals(castOther.movementSeq);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.caseNo.hashCode();
		hash = hash * prime + this.institutionCd.hashCode();
		hash = hash * prime + this.movementSeq.hashCode();
		
		return hash;
	}
}