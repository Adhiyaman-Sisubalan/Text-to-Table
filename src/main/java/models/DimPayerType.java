package models;

import java.io.Serializable;
import java.util.HashMap;

import javax.persistence.*;


/**
 * The persistent class for the DIM_PAYER_TYPE database table.
 * 
 */
@Entity
@Table(name="DIM_PAYER_TYPE")
@NamedQuery(name="DimPayerType.findAll", query="SELECT d FROM DimPayerType d")
public class DimPayerType implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="PAYER_TYPE_KEY")
	private Integer payerTypeKey;

	@Column(name="INDUSTRY_DESC")
	private String industryDesc;

	@Column(name="INDUSTRY_KEY")
	private String industryKey;

	@Column(name="PAYER_TYPE")
	private String payerType;

	public static HashMap<String,Integer> mappingInfo = new HashMap<String,Integer>(){
		{
			put("payerTypeKey",0);
			put("industryDesc",1);
			put("industryKey",2);
			put("payerType",3);
			
		}};
		public static Integer columnCount = 4;
	public DimPayerType() {
	}

	public int getPayerTypeKey() {
		return this.payerTypeKey;
	}

	public void setPayerTypeKey(int payerTypeKey) {
		this.payerTypeKey = payerTypeKey;
	}

	public String getIndustryDesc() {
		return this.industryDesc;
	}

	public void setIndustryDesc(String industryDesc) {
		this.industryDesc = industryDesc;
	}

	public String getIndustryKey() {
		return this.industryKey;
	}

	public void setIndustryKey(String industryKey) {
		this.industryKey = industryKey;
	}

	public String getPayerType() {
		return this.payerType;
	}

	public void setPayerType(String payerType) {
		this.payerType = payerType;
	}

}