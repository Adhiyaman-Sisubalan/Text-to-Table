package models;

import java.io.Serializable;
import java.util.HashMap;

import javax.persistence.*;

@Embeddable
public class FctMvEncDiagMorphologyPK implements Serializable,CompoundedPKInterface {

	private static final long serialVersionUID = 1L;
	
	@Column(name="ENC_DIAGNOSIS_KEY")
	private int encDiagnosisKey;
	
	@Column(name="ENC_KEY")
	private int encKey;
	
	public static HashMap<String,Integer> mappingInfo = new HashMap<String,Integer>(){
		{
			put("encDiagnosisKey",0);
			put("encKey",1);
			
		}
	};
	public FctMvEncDiagMorphologyPK() {
	}
	public int getEncDiagnosisKey() {
		return encDiagnosisKey;
	}
	public void setEncDiagnosisKey(int encDiagnosisKey) {
		this.encDiagnosisKey = encDiagnosisKey;
	}
	public int getEncKey() {
		return encKey;
	}
	public void setEncKey(int encKey) {
		this.encKey = encKey;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + encDiagnosisKey;
		result = prime * result + encKey;
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
		FctMvEncDiagMorphologyPK other = (FctMvEncDiagMorphologyPK) obj;
		if (encDiagnosisKey != other.encDiagnosisKey)
			return false;
		if (encKey != other.encKey)
			return false;
		return true;
	}
	
	
}
