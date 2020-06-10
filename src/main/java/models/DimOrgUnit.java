package models;

import java.io.Serializable;
import java.util.HashMap;

import javax.persistence.*;


/**
 * The persistent class for the DIM_ORG_UNIT database table.
 * 
 */
@Entity
@Table(name="DIM_ORG_UNIT")
@NamedQuery(name="DimOrgUnit.findAll", query="SELECT d FROM DimOrgUnit d")
public class DimOrgUnit implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="OU_KEY")
	private Integer ouKey;

	@Column(name="BUSINESS_GROUP")
	private String businessGroup;

	@Column(name="COMPANY")
	private String company;

	@Column(name="COST_CENTER")
	private String costCenter;

	@Column(name="MAIN_GROUP")
	private String mainGroup;

	@Column(name="OU_CD")
	private String ouCd;

	@Column(name="OU_NAME")
	private String ouName;

	@Column(name="SUB_GROUP")
	private String subGroup;

	public static HashMap<String,Integer> mappingInfo = new HashMap<String,Integer>(){
		{
			put("ouKey",0);
			put("businessGroup",1);
			put("company",2);
			put("costCenter",3);
			put("mainGroup",4);
			put("ouCd",5);
			put("ouName",6);
			put("subGroup",7);
			
		}};
		public static Integer columnCount = 8;
	public DimOrgUnit() {
	}

	public int getOuKey() {
		return this.ouKey;
	}

	public void setOuKey(int ouKey) {
		this.ouKey = ouKey;
	}

	public String getBusinessGroup() {
		return this.businessGroup;
	}

	public void setBusinessGroup(String businessGroup) {
		this.businessGroup = businessGroup;
	}

	public String getCompany() {
		return this.company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getCostCenter() {
		return this.costCenter;
	}

	public void setCostCenter(String costCenter) {
		this.costCenter = costCenter;
	}

	public String getMainGroup() {
		return this.mainGroup;
	}

	public void setMainGroup(String mainGroup) {
		this.mainGroup = mainGroup;
	}

	public String getOuCd() {
		return this.ouCd;
	}

	public void setOuCd(String ouCd) {
		this.ouCd = ouCd;
	}

	public String getOuName() {
		return this.ouName;
	}

	public void setOuName(String ouName) {
		this.ouName = ouName;
	}

	public String getSubGroup() {
		return this.subGroup;
	}

	public void setSubGroup(String subGroup) {
		this.subGroup = subGroup;
	}

}