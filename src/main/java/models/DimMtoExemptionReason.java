package models;

import java.io.Serializable;
import java.util.HashMap;

import javax.persistence.*;


/**
 * The persistent class for the DIM_MTO_EXEMPTION_REASON database table.
 * 
 */
@Entity
@Table(name="DIM_MTO_EXEMPTION_REASON")
@NamedQuery(name="DimMtoExemptionReason.findAll", query="SELECT d FROM DimMtoExemptionReason d")
public class DimMtoExemptionReason implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="MTO_EXEMP_REASON_KEY")
	private Integer mtoExempReasonKey;

	@Column(name="MTO_EXEMPTION_CD")
	private String mtoExemptionCd;

	@Column(name="MTO_EXEMPTION_DESC")
	private String mtoExemptionDesc;

	public static HashMap<String,Integer> mappingInfo = new HashMap<String,Integer>(){
		{
			put("mtoExempReasonKey",0);
			put("mtoExemptionCd",1);
			put("mtoExemptionDesc",2);
			
		}};
		public static Integer columnCount = 3;
	public DimMtoExemptionReason() {
	}

	public int getMtoExempReasonKey() {
		return this.mtoExempReasonKey;
	}

	public void setMtoExempReasonKey(int mtoExempReasonKey) {
		this.mtoExempReasonKey = mtoExempReasonKey;
	}

	public String getMtoExemptionCd() {
		return this.mtoExemptionCd;
	}

	public void setMtoExemptionCd(String mtoExemptionCd) {
		this.mtoExemptionCd = mtoExemptionCd;
	}

	public String getMtoExemptionDesc() {
		return this.mtoExemptionDesc;
	}

	public void setMtoExemptionDesc(String mtoExemptionDesc) {
		this.mtoExemptionDesc = mtoExemptionDesc;
	}

}