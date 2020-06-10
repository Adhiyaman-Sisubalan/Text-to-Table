package models;

import java.io.Serializable;
import java.util.HashMap;

import javax.persistence.*;


/**
 * The persistent class for the DIM_PATIENT_CLASS database table.
 * 
 */
@Entity
@Table(name="DIM_PATIENT_CLASS")
@NamedQuery(name="DimPatientClass.findAll", query="SELECT d FROM DimPatientClass d")
public class DimPatientClass implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="CLASS_KEY")
	private Integer classKey;

	@Column(name="CATEGORY_CD")
	private String categoryCd;

	@Column(name="CLASS_CD")
	private String classCd;

	@Column(name="CLASS_LONG_DESC")
	private String classLongDesc;

	@Column(name="GROUP_CD")
	private String groupCd;

	@Column(name="GROUP_FPR_CD")
	private String groupFprCd;

	public static HashMap<String,Integer> mappingInfo = new HashMap<String,Integer>(){
		{
			put("classKey",0);
			put("categoryCd",1);
			put("classCd",2);
			put("classLongDesc",3);
			put("groupCd",4);
			put("groupFprCd",5);
			
			
		}};
		public static Integer columnCount = 6;
	public DimPatientClass() {
	}

	public int getClassKey() {
		return this.classKey;
	}

	public void setClassKey(int classKey) {
		this.classKey = classKey;
	}

	public String getCategoryCd() {
		return this.categoryCd;
	}

	public void setCategoryCd(String categoryCd) {
		this.categoryCd = categoryCd;
	}

	public String getClassCd() {
		return this.classCd;
	}

	public void setClassCd(String classCd) {
		this.classCd = classCd;
	}

	public String getClassLongDesc() {
		return this.classLongDesc;
	}

	public void setClassLongDesc(String classLongDesc) {
		this.classLongDesc = classLongDesc;
	}

	public String getGroupCd() {
		return this.groupCd;
	}

	public void setGroupCd(String groupCd) {
		this.groupCd = groupCd;
	}

	public String getGroupFprCd() {
		return this.groupFprCd;
	}

	public void setGroupFprCd(String groupFprCd) {
		this.groupFprCd = groupFprCd;
	}

}