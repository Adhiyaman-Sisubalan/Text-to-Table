package models;

import java.io.Serializable;
import java.util.HashMap;

import javax.persistence.*;


/**
 * The persistent class for the DIM_TREATMENT_CATEGORY database table.
 * 
 */
@Entity
@Table(name="DIM_TREATMENT_CATEGORY")
@NamedQuery(name="DimTreatmentCategory.findAll", query="SELECT d FROM DimTreatmentCategory d")
public class DimTreatmentCategory implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="TREATMENT_CAT_KEY")
	private Integer treatmentCatKey;

	@Column(name="TREATMENT_CAT_CD")
	private String treatmentCatCd;

	@Column(name="TREATMENT_CAT_LONG_DESC")
	private String treatmentCatLongDesc;

	@Column(name="TREATMENT_CAT_SHORT_DESC")
	private String treatmentCatShortDesc;

	public static HashMap<String,Integer> mappingInfo = new HashMap<String,Integer>(){
		{
			put("treatmentCatKey",0);
			put("treatmentCatCd",1);
			put("treatmentCatLongDesc",2);
			put("treatmentCatShortDesc",3);
			
		}};
		public static Integer columnCount = 4;
	public DimTreatmentCategory() {
	}

	public int getTreatmentCatKey() {
		return this.treatmentCatKey;
	}

	public void setTreatmentCatKey(int treatmentCatKey) {
		this.treatmentCatKey = treatmentCatKey;
	}

	public String getTreatmentCatCd() {
		return this.treatmentCatCd;
	}

	public void setTreatmentCatCd(String treatmentCatCd) {
		this.treatmentCatCd = treatmentCatCd;
	}

	public String getTreatmentCatLongDesc() {
		return this.treatmentCatLongDesc;
	}

	public void setTreatmentCatLongDesc(String treatmentCatLongDesc) {
		this.treatmentCatLongDesc = treatmentCatLongDesc;
	}

	public String getTreatmentCatShortDesc() {
		return this.treatmentCatShortDesc;
	}

	public void setTreatmentCatShortDesc(String treatmentCatShortDesc) {
		this.treatmentCatShortDesc = treatmentCatShortDesc;
	}

}