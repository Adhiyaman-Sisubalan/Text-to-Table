package models;

import java.io.Serializable;
import java.util.HashMap;

import javax.persistence.*;

/**
 * The primary key class for the FCT_ORDER_MEDICATIONS database table.
 * 
 */
@Embeddable
public class FctOrderMedicationPK implements Serializable, CompoundedPKInterface  {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="ORDER_KEY")
	private Integer orderKey;

	@Column(name="SOURCE_REF_ID")
	private String sourceRefId;

	public static HashMap<String,Integer> mappingInfo = new HashMap<String,Integer>(){
		{
			put("orderKey",0);
			put("sourceRefId",1);
			
		}};
	public FctOrderMedicationPK() {
	}
	public int getOrderKey() {
		return this.orderKey;
	}
	public void setOrderKey(int orderKey) {
		this.orderKey = orderKey;
	}
	public String getSourceRefId() {
		return this.sourceRefId;
	}
	public void setSourceRefId(String sourceRefId) {
		this.sourceRefId = sourceRefId;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof FctOrderMedicationPK)) {
			return false;
		}
		FctOrderMedicationPK castOther = (FctOrderMedicationPK)other;
		return 
			(this.orderKey == castOther.orderKey)
			&& this.sourceRefId.equals(castOther.sourceRefId);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.orderKey;
		hash = hash * prime + this.sourceRefId.hashCode();
		
		return hash;
	}
}