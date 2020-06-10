package models;

import java.io.Serializable;
import java.util.HashMap;

import javax.persistence.*;

/**
 * The primary key class for the FCT_EIMR_MED_EIA database table.
 * 
 */
@Embeddable
public class FctEimrMedEiaPK implements Serializable,CompoundedPKInterface {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="INSTITUTION_CD")
	private String institutionCd;

	@Column(name="OID")
	private Integer oid;

	public static HashMap<String,Integer> mappingInfo = new HashMap<String,Integer>(){
		{
			put("institutionCd",0);
			put("oid",1);
		
			
		}};
	public FctEimrMedEiaPK() {
	}
	public String getInstitutionCd() {
		return this.institutionCd;
	}
	public void setInstitutionCd(String institutionCd) {
		this.institutionCd = institutionCd;
	}
	public int getOid() {
		return this.oid;
	}
	public void setOid(int oid) {
		this.oid = oid;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof FctEimrMedEiaPK)) {
			return false;
		}
		FctEimrMedEiaPK castOther = (FctEimrMedEiaPK)other;
		return 
			this.institutionCd.equals(castOther.institutionCd)
			&& (this.oid == castOther.oid);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.institutionCd.hashCode();
		hash = hash * prime + this.oid;
		
		return hash;
	}
}