package models;

import java.io.Serializable;
import java.util.HashMap;

import javax.persistence.*;


/**
 * The persistent class for the DIM_ARRIVAL_MODE database table.
 * 
 */
@Entity
@Table(name="DIM_ARRIVAL_MODE")
@NamedQuery(name="DimArrivalMode.findAll", query="SELECT d FROM DimArrivalMode d")
public class DimArrivalMode implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ARRIVAL_MODE_KEY")
	private Integer arrivalModeKey;

	@Column(name="ARRIVAL_CD")
	private String arrivalCd;

	@Column(name="ARRIVAL_CD_DESC")
	private String arrivalCdDesc;

	public static HashMap<String,Integer> mappingInfo = new HashMap<String,Integer>(){
		{
			put("arrivalModeKey",0);
			put("arrivalCd",1);
			put("arrivalCdDesc",2);
		}
	};
	public static Integer columnCount = 3;
	public DimArrivalMode() {
	}

	public int getArrivalModeKey() {
		return this.arrivalModeKey;
	}

	public void setArrivalModeKey(int arrivalModeKey) {
		this.arrivalModeKey = arrivalModeKey;
	}

	public String getArrivalCd() {
		return this.arrivalCd;
	}

	public void setArrivalCd(String arrivalCd) {
		this.arrivalCd = arrivalCd;
	}

	public String getArrivalCdDesc() {
		return this.arrivalCdDesc;
	}

	public void setArrivalCdDesc(String arrivalCdDesc) {
		this.arrivalCdDesc = arrivalCdDesc;
	}

}