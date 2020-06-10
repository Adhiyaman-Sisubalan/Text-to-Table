package models;

import java.io.Serializable;
import java.util.HashMap;

import javax.persistence.*;

@Embeddable
public class FctClinicalDiagnosisPK implements Serializable,CompoundedPKInterface {

	private static final long serialVersionUID = 1L;
	
	
	@Column(name="CLINICAL_DIAGNOSIS_KEY")
	private Integer clinicalDiagnosisKey;
	
	@Column(name="ENC_KEY")
	private Integer encKey;
	
	@Column(name="ORDER_KEY")
	private Integer orderKey;
	
	@Column(name="SOURCE_REF_ID")
	private String sourceRefId;
	
	public static HashMap<String,Integer> mappingInfo = new HashMap<String,Integer>(){
		{
			put("clinicalDiagnosisKey",0);
			put("encKey",1);
			put("orderKey",2);
			put("sourceRefId",3);
		}
	};
	public FctClinicalDiagnosisPK() {
	}
	public Integer getClinicalDiagnosisKey() {
		return clinicalDiagnosisKey;
	}
	public void setClinicalDiagnosisKey(Integer clinicalDiagnosisKey) {
		this.clinicalDiagnosisKey = clinicalDiagnosisKey;
	}
	public Integer getEncKey() {
		return encKey;
	}
	public void setEncKey(Integer encKey) {
		this.encKey = encKey;
	}
	public Integer getOrderKey() {
		return orderKey;
	}
	public void setOrderKey(Integer orderKey) {
		this.orderKey = orderKey;
	}
	public String getSourceRefId() {
		return sourceRefId;
	}
	public void setSourceRefId(String sourceRefId) {
		this.sourceRefId = sourceRefId;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((clinicalDiagnosisKey == null) ? 0 : clinicalDiagnosisKey.hashCode());
		result = prime * result + ((encKey == null) ? 0 : encKey.hashCode());
		result = prime * result + ((orderKey == null) ? 0 : orderKey.hashCode());
		result = prime * result + ((sourceRefId == null) ? 0 : sourceRefId.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		FctClinicalDiagnosisPK other = (FctClinicalDiagnosisPK) obj;
		if (clinicalDiagnosisKey == null) {
			if (other.clinicalDiagnosisKey != null)
				return false;
		} else if (!clinicalDiagnosisKey.equals(other.clinicalDiagnosisKey))
			return false;
		if (encKey == null) {
			if (other.encKey != null)
				return false;
		} else if (!encKey.equals(other.encKey))
			return false;
		if (orderKey == null) {
			if (other.orderKey != null)
				return false;
		} else if (!orderKey.equals(other.orderKey))
			return false;
		if (sourceRefId == null) {
			if (other.sourceRefId != null)
				return false;
		} else if (!sourceRefId.equals(other.sourceRefId))
			return false;
		return true;
	}

	
}
