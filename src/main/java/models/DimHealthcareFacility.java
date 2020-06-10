package models;

import java.io.Serializable;
import java.util.HashMap;

import javax.persistence.*;


/**
 * The persistent class for the DIM_HEALTHCARE_FACILITY database table.
 * 
 */
@Entity
@Table(name="DIM_HEALTHCARE_FACILITY")
@NamedQuery(name="DimHealthcareFacility.findAll", query="SELECT d FROM DimHealthcareFacility d")
public class DimHealthcareFacility implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="HEALTHCARE_FAC_KEY")
	private Integer healthcareFacKey;

	@Column(name="HEALTHCARE_FAC_CD")
	private String healthcareFacCd;

	@Column(name="HEALTHCARE_FAC_NAME")
	private String healthcareFacName;

	public static HashMap<String,Integer> mappingInfo = new HashMap<String,Integer>(){
		{
			put("healthcareFacKey",0);
			put("healthcareFacCd",1);
			put("healthcareFacName",2);
		}};
		public static Integer columnCount = 3;
	public DimHealthcareFacility() {
	}

	public int getHealthcareFacKey() {
		return this.healthcareFacKey;
	}

	public void setHealthcareFacKey(int healthcareFacKey) {
		this.healthcareFacKey = healthcareFacKey;
	}

	public String getHealthcareFacCd() {
		return this.healthcareFacCd;
	}

	public void setHealthcareFacCd(String healthcareFacCd) {
		this.healthcareFacCd = healthcareFacCd;
	}

	public String getHealthcareFacName() {
		return this.healthcareFacName;
	}

	public void setHealthcareFacName(String healthcareFacName) {
		this.healthcareFacName = healthcareFacName;
	}

}