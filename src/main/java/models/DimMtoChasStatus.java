package models;

import java.io.Serializable;
import java.util.HashMap;

import javax.persistence.*;


/**
 * The persistent class for the DIM_MTO_CHAS_STATUS database table.
 * 
 */
@Entity
@Table(name="DIM_MTO_CHAS_STATUS")
@NamedQuery(name="DimMtoChasStatus.findAll", query="SELECT d FROM DimMtoChasStatus d")
public class DimMtoChasStatus implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="MTO_CHAS_STATUS_KEY")
	private Integer mtoChasStatusKey;

	@Column(name="MTO_CHAS_DESC")
	private String mtoChasDesc;

	@Column(name="MTO_CHAS_STATUS_CD")
	private String mtoChasStatusCd;

	public static HashMap<String,Integer> mappingInfo = new HashMap<String,Integer>(){
		{
			put("mtoChasStatusKey",0);
			put("mtoChasDesc",1);
			put("mtoChasStatusCd",2);
			
		}};
		public static Integer columnCount = 3;
	public DimMtoChasStatus() {
	}

	public int getMtoChasStatusKey() {
		return this.mtoChasStatusKey;
	}

	public void setMtoChasStatusKey(int mtoChasStatusKey) {
		this.mtoChasStatusKey = mtoChasStatusKey;
	}

	public String getMtoChasDesc() {
		return this.mtoChasDesc;
	}

	public void setMtoChasDesc(String mtoChasDesc) {
		this.mtoChasDesc = mtoChasDesc;
	}

	public String getMtoChasStatusCd() {
		return this.mtoChasStatusCd;
	}

	public void setMtoChasStatusCd(String mtoChasStatusCd) {
		this.mtoChasStatusCd = mtoChasStatusCd;
	}

}