package models;

import java.io.Serializable;
import java.util.HashMap;

import javax.persistence.*;


/**
 * The persistent class for the DIM_MTO_PG_INDICATOR database table.
 * 
 */
@Entity
@Table(name="DIM_MTO_PG_INDICATOR")
@NamedQuery(name="DimMtoPgIndicator.findAll", query="SELECT d FROM DimMtoPgIndicator d")
public class DimMtoPgIndicator implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="MTO_GP_IND_KEY")
	private Integer mtoGpIndKey;

	@Column(name="MTO_PG_IND_CD")
	private String mtoPgIndCd;

	@Column(name="MTO_PG_IND_DESC")
	private String mtoPgIndDesc;

	public static HashMap<String,Integer> mappingInfo = new HashMap<String,Integer>(){
		{
			put("mtoGpIndKey",0);
			put("mtoPgIndCd",1);
			put("mtoPgIndDesc",2);
			
		}};
		public static Integer columnCount = 3;
	public DimMtoPgIndicator() {
	}

	public int getMtoGpIndKey() {
		return this.mtoGpIndKey;
	}

	public void setMtoGpIndKey(int mtoGpIndKey) {
		this.mtoGpIndKey = mtoGpIndKey;
	}

	public String getMtoPgIndCd() {
		return this.mtoPgIndCd;
	}

	public void setMtoPgIndCd(String mtoPgIndCd) {
		this.mtoPgIndCd = mtoPgIndCd;
	}

	public String getMtoPgIndDesc() {
		return this.mtoPgIndDesc;
	}

	public void setMtoPgIndDesc(String mtoPgIndDesc) {
		this.mtoPgIndDesc = mtoPgIndDesc;
	}

}