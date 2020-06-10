package models;

import java.io.Serializable;
import java.util.HashMap;

import javax.persistence.*;

/**
 * The primary key class for the FCT_LIS_TEST_RESULT database table.
 * 
 */
@Embeddable
public class FctLisTestResultPK implements Serializable, CompoundedPKInterface {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="INSTITUTION_SID")
	private Integer institutionSid;

	@Column(name="REQUEST_ID")
	private Integer requestId;

	@Column(name="REQUEST_TESTID")
	private Integer requestTestid;

	public static HashMap<String,Integer> mappingInfo = new HashMap<String,Integer>(){
		{
	put("institutionSid",0);
	put("requestId",1);
	put("requestTestid",2);
		}
	};
	public FctLisTestResultPK() {
	}
	public int getInstitutionSid() {
		return this.institutionSid;
	}
	public void setInstitutionSid(int institutionSid) {
		this.institutionSid = institutionSid;
	}
	public int getRequestId() {
		return this.requestId;
	}
	public void setRequestId(int requestId) {
		this.requestId = requestId;
	}
	public int getRequestTestid() {
		return this.requestTestid;
	}
	public void setRequestTestid(int requestTestid) {
		this.requestTestid = requestTestid;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof FctLisTestResultPK)) {
			return false;
		}
		FctLisTestResultPK castOther = (FctLisTestResultPK)other;
		return 
			(this.institutionSid == castOther.institutionSid)
			&& (this.requestId == castOther.requestId)
			&& (this.requestTestid == castOther.requestTestid);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.institutionSid;
		hash = hash * prime + this.requestId;
		hash = hash * prime + this.requestTestid;
		
		return hash;
	}
}