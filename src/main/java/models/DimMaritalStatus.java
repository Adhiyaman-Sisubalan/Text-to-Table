package models;

import java.io.Serializable;
import java.util.HashMap;

import javax.persistence.*;


/**
 * The persistent class for the DIM_MARITAL_STATUS database table.
 * 
 */
@Entity
@Table(name="DIM_MARITAL_STATUS")
@NamedQuery(name="DimMaritalStatus.findAll", query="SELECT d FROM DimMaritalStatus d")
public class DimMaritalStatus implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="MARITAL_STAT_KEY")
	private Integer maritalStatKey;

	@Column(name="MARITAL_STAT_CD")
	private String maritalStatCd;

	@Column(name="MARITAL_STAT_DESC")
	private String maritalStatDesc;

	public static HashMap<String,Integer> mappingInfo = new HashMap<String,Integer>(){
		{
			put("maritalStatKey",0);
			put("maritalStatCd",1);
			put("maritalStatDesc",2);
		}};
		public static Integer columnCount = 3;
	public DimMaritalStatus() {
	}

	public int getMaritalStatKey() {
		return this.maritalStatKey;
	}

	public void setMaritalStatKey(int maritalStatKey) {
		this.maritalStatKey = maritalStatKey;
	}

	public String getMaritalStatCd() {
		return this.maritalStatCd;
	}

	public void setMaritalStatCd(String maritalStatCd) {
		this.maritalStatCd = maritalStatCd;
	}

	public String getMaritalStatDesc() {
		return this.maritalStatDesc;
	}

	public void setMaritalStatDesc(String maritalStatDesc) {
		this.maritalStatDesc = maritalStatDesc;
	}

}