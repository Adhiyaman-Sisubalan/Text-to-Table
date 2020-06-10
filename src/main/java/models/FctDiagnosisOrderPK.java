package models;

import java.io.Serializable;
import java.util.HashMap;

import javax.persistence.*;

@Embeddable
public class FctDiagnosisOrderPK implements Serializable,CompoundedPKInterface   {

	private static final long serialVersionUID = 1L;
	
	@Column(name="DIAGNOSIS_ORDER_SID")
	private Integer diagnosisOrderSid;
	
	@Column(name="SERVICE_SID")
	private Integer serviceSid;
	
	public static HashMap<String,Integer> mappingInfo = new HashMap<String,Integer>(){
		{
			put("diagnosisOrderSid",0);
			put("serviceSid",1);
			
		}
	};
	public FctDiagnosisOrderPK() {
	}
	public Integer getDiagnosisOrderSid() {
		return diagnosisOrderSid;
	}
	public void setDiagnosisOrderSid(Integer diagnosisOrderSid) {
		this.diagnosisOrderSid = diagnosisOrderSid;
	}
	public Integer getServiceSid() {
		return serviceSid;
	}
	public void setServiceSid(Integer serviceSid) {
		this.serviceSid = serviceSid;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((diagnosisOrderSid == null) ? 0 : diagnosisOrderSid.hashCode());
		result = prime * result + ((serviceSid == null) ? 0 : serviceSid.hashCode());
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
		FctDiagnosisOrderPK other = (FctDiagnosisOrderPK) obj;
		if (diagnosisOrderSid == null) {
			if (other.diagnosisOrderSid != null)
				return false;
		} else if (!diagnosisOrderSid.equals(other.diagnosisOrderSid))
			return false;
		if (serviceSid == null) {
			if (other.serviceSid != null)
				return false;
		} else if (!serviceSid.equals(other.serviceSid))
			return false;
		return true;
	}
	
	
}
