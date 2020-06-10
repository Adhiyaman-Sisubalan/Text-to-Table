package models;

import java.io.Serializable;
import java.util.HashMap;

import javax.persistence.*;

@Embeddable
public class FctCustomerSummaryPK implements Serializable,CompoundedPKInterface  {

	private static final long serialVersionUID = 1L;
	
	@Column(name="COMPANY_KEY")
	private Integer companyKey;

	@Column(name="CUSTOMER_KEY")
	private Integer customerKey;
	
	public static HashMap<String,Integer> mappingInfo = new HashMap<String,Integer>(){
		{
			put("companyKey",0);
			put("customerKey",1);
			
		}
	};
	public FctCustomerSummaryPK() {
	}
	public Integer getCompanyKey() {
		return companyKey;
	}
	public void setCompanyKey(Integer companyKey) {
		this.companyKey = companyKey;
	}
	public Integer getCustomerKey() {
		return customerKey;
	}
	public void setCustomerKey(Integer customerKey) {
		this.customerKey = customerKey;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((companyKey == null) ? 0 : companyKey.hashCode());
		result = prime * result + ((customerKey == null) ? 0 : customerKey.hashCode());
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
		FctCustomerSummaryPK other = (FctCustomerSummaryPK) obj;
		if (companyKey == null) {
			if (other.companyKey != null)
				return false;
		} else if (!companyKey.equals(other.companyKey))
			return false;
		if (customerKey == null) {
			if (other.customerKey != null)
				return false;
		} else if (!customerKey.equals(other.customerKey))
			return false;
		return true;
	}
	
	
}
