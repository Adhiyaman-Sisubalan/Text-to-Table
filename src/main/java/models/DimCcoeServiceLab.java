package models;

import java.io.Serializable;
import java.util.HashMap;

import javax.persistence.*;


/**
 * The persistent class for the DIM_CCOE_SERVICE_LAB database table.
 * 
 */
@Entity
@Table(name="DIM_CCOE_SERVICE_LAB")
@NamedQuery(name="DimCcoeServiceLab.findAll", query="SELECT d FROM DimCcoeServiceLab d")
public class DimCcoeServiceLab implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="SERVICE_SID")
	private Integer serviceSid;

	@Column(name="[SERVICE]")
	private String service;

	@Column(name="SERVICE_CODE")
	private String serviceCode;

	public static HashMap<String,Integer> mappingInfo = new HashMap<String,Integer>(){
		{
			put("serviceSid",0);
			put("service",1);
			put("serviceCode",2);
		}};
		public static Integer columnCount = 3;
	public DimCcoeServiceLab() {
	}

	public int getServiceSid() {
		return this.serviceSid;
	}

	public void setServiceSid(int serviceSid) {
		this.serviceSid = serviceSid;
	}

	public String getService() {
		return this.service;
	}

	public void setService(String service) {
		this.service = service;
	}

	public String getServiceCode() {
		return this.serviceCode;
	}

	public void setServiceCode(String serviceCode) {
		this.serviceCode = serviceCode;
	}

}