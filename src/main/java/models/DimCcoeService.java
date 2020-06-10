package models;

import java.io.Serializable;
import java.util.HashMap;

import javax.persistence.*;


/**
 * The persistent class for the DIM_CCOE_SERVICE database table.
 * 
 */
@Entity
@Table(name="DIM_CCOE_SERVICE")
@NamedQuery(name="DimCcoeService.findAll", query="SELECT d FROM DimCcoeService d")
public class DimCcoeService implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="SERVICE_SID")
	private Integer serviceSid;

	@Column(name="[SERVICE]")
	private String service;

	@Column(name="SERVICE_CATEGORY_CODE")
	private String serviceCategoryCode;

	@Column(name="SERVICE_CATEGORY_DESC")
	private String serviceCategoryDesc;

	@Column(name="SERVICE_CODE")
	private String serviceCode;
	
	public static HashMap<String,Integer> mappingInfo = new HashMap<String,Integer>(){
		{
			put("serviceSid",0);
			put("service",1);
			put("serviceCategoryCode",2);
			put("serviceCategoryDesc",3);
			put("serviceCode",4);
		}};
		public static Integer columnCount = 5;
	public DimCcoeService() {
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

	public String getServiceCategoryCode() {
		return this.serviceCategoryCode;
	}

	public void setServiceCategoryCode(String serviceCategoryCode) {
		this.serviceCategoryCode = serviceCategoryCode;
	}

	public String getServiceCategoryDesc() {
		return this.serviceCategoryDesc;
	}

	public void setServiceCategoryDesc(String serviceCategoryDesc) {
		this.serviceCategoryDesc = serviceCategoryDesc;
	}

	public String getServiceCode() {
		return this.serviceCode;
	}

	public void setServiceCode(String serviceCode) {
		this.serviceCode = serviceCode;
	}

}