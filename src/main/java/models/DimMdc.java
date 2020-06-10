package models;

import java.io.Serializable;
import java.util.HashMap;

import javax.persistence.*;


/**
 * The persistent class for the DIM_MDC database table.
 * 
 */
@Entity
@Table(name="DIM_MDC")
@NamedQuery(name="DimMdc.findAll", query="SELECT d FROM DimMdc d")
public class DimMdc implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="MDC_KEY")
	private Integer mdcKey;

	@Column(name="MDC_CD")
	private String mdcCd;

	@Column(name="MDC_DESC")
	private String mdcDesc;

	public static HashMap<String,Integer> mappingInfo = new HashMap<String,Integer>(){
		{
			put("mdcKey",0);
			put("mdcCd",1);
			put("mdcDesc",2);
		}};
		public static Integer columnCount = 3;
	public DimMdc() {
	}

	public int getMdcKey() {
		return this.mdcKey;
	}

	public void setMdcKey(int mdcKey) {
		this.mdcKey = mdcKey;
	}

	public String getMdcCd() {
		return this.mdcCd;
	}

	public void setMdcCd(String mdcCd) {
		this.mdcCd = mdcCd;
	}

	public String getMdcDesc() {
		return this.mdcDesc;
	}

	public void setMdcDesc(String mdcDesc) {
		this.mdcDesc = mdcDesc;
	}

}