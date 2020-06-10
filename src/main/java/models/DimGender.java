package models;

import java.io.Serializable;
import java.util.HashMap;

import javax.persistence.*;


/**
 * The persistent class for the DIM_GENDER database table.
 * 
 */
@Entity
@Table(name="DIM_GENDER")
@NamedQuery(name="DimGender.findAll", query="SELECT d FROM DimGender d")
public class DimGender implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="GENDER_KEY")
	private Integer genderKey;

	@Column(name="GENDER_CD")
	private String genderCd;

	@Column(name="GENDER_DESC")
	private String genderDesc;

	public static HashMap<String,Integer> mappingInfo = new HashMap<String,Integer>(){
		{
			put("genderKey",0);
			put("genderCd",1);
			put("genderDesc",2);
		}};
		public static Integer columnCount = 3;
	public DimGender() {
	}

	public int getGenderKey() {
		return this.genderKey;
	}

	public void setGenderKey(int genderKey) {
		this.genderKey = genderKey;
	}

	public String getGenderCd() {
		return this.genderCd;
	}

	public void setGenderCd(String genderCd) {
		this.genderCd = genderCd;
	}

	public String getGenderDesc() {
		return this.genderDesc;
	}

	public void setGenderDesc(String genderDesc) {
		this.genderDesc = genderDesc;
	}

}