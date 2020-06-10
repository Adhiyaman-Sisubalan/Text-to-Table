package models;

import java.io.Serializable;
import java.util.HashMap;

import javax.persistence.*;

/**
 * The primary key class for the FCT_MV_ENC_PROCEDURE database table.
 * 
 */
@Embeddable
public class FctMvEncProcedurePK implements Serializable, CompoundedPKInterface {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="ENC_KEY")
	private Integer encKey;

	@Column(name="PROC_KEY")
	private Integer procKey;

	public static HashMap<String,Integer> mappingInfo = new HashMap<String,Integer>(){
		{
			put("encKey",0);
			put("procKey",1);
			
		}
	};
	public FctMvEncProcedurePK() {
	}
	public int getEncKey() {
		return this.encKey;
	}
	public void setEncKey(int encKey) {
		this.encKey = encKey;
	}
	public int getProcKey() {
		return this.procKey;
	}
	public void setProcKey(int procKey) {
		this.procKey = procKey;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof FctMvEncProcedurePK)) {
			return false;
		}
		FctMvEncProcedurePK castOther = (FctMvEncProcedurePK)other;
		return 
			(this.encKey == castOther.encKey)
			&& (this.procKey == castOther.procKey);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.encKey;
		hash = hash * prime + this.procKey;
		
		return hash;
	}
}