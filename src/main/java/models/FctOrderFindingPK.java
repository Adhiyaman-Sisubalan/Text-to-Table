package models;

import java.io.Serializable;
import java.util.HashMap;

import javax.persistence.*;

/**
 * The primary key class for the FCT_ORDER_FINDINGS database table.
 * 
 */
@Embeddable
public class FctOrderFindingPK implements Serializable, CompoundedPKInterface  {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="ENC_KEY")
	private int encKey;

	@Column(name="ORDER_KEY")
	private int orderKey;

	public static HashMap<String,Integer> mappingInfo = new HashMap<String,Integer>(){
		{
			put("encKey",0);
			put("orderKey",1);
			
		}};
	public FctOrderFindingPK() {
	}
	public int getEncKey() {
		return this.encKey;
	}
	public void setEncKey(int encKey) {
		this.encKey = encKey;
	}
	public int getOrderKey() {
		return this.orderKey;
	}
	public void setOrderKey(int orderKey) {
		this.orderKey = orderKey;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof FctOrderFindingPK)) {
			return false;
		}
		FctOrderFindingPK castOther = (FctOrderFindingPK)other;
		return 
			(this.encKey == castOther.encKey)
			&& (this.orderKey == castOther.orderKey);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.encKey;
		hash = hash * prime + this.orderKey;
		
		return hash;
	}
}