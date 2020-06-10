package models;

import java.io.Serializable;
import java.util.HashMap;

import javax.persistence.*;


/**
 * The persistent class for the DIM_DRG database table.
 * 
 */
@Entity
@Table(name="DIM_DRG")
@NamedQuery(name="DimDrg.findAll", query="SELECT d FROM DimDrg d")
public class DimDrg implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="DRG_DESC")
	private String drgDesc;
    @Id
	@Column(name="DRG_KEY")
	private Integer drgKey;

	@Column(name="RPT_DRG_CD")
	private String rptDrgCd;
	
	public static HashMap<String,Integer> mappingInfo = new HashMap<String,Integer>(){
		{
			put("drgKey",0);
			put("drgDesc",1);
			put("rptDrgCd",2);
		}};
		public static Integer columnCount = 3;
	public DimDrg() {
	}

	public String getDrgDesc() {
		return this.drgDesc;
	}

	public void setDrgDesc(String drgDesc) {
		this.drgDesc = drgDesc;
	}

	public int getDrgKey() {
		return this.drgKey;
	}

	public void setDrgKey(int drgKey) {
		this.drgKey = drgKey;
	}

	public String getRptDrgCd() {
		return this.rptDrgCd;
	}

	public void setRptDrgCd(String rptDrgCd) {
		this.rptDrgCd = rptDrgCd;
	}

}