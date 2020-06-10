package models;

import java.io.Serializable;
import java.util.HashMap;

import javax.persistence.*;


/**
 * The persistent class for the DIM_RELIGION database table.
 * 
 */
@Entity
@Table(name="DIM_RELIGION")
@NamedQuery(name="DimReligion.findAll", query="SELECT d FROM DimReligion d")
public class DimReligion implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="RELIGION_KEY")
	private Integer religionKey;

	@Column(name="RELIGION_CD")
	private String religionCd;

	@Column(name="RELIGION_LONG_DESC")
	private String religionLongDesc;

	public static HashMap<String,Integer> mappingInfo = new HashMap<String,Integer>(){
		{
			put("religionKey",0);
			put("religionCd",1);
			put("religionLongDesc",2);
			
		}};
		public static Integer columnCount = 3;
	public DimReligion() {
	}

	public int getReligionKey() {
		return this.religionKey;
	}

	public void setReligionKey(int religionKey) {
		this.religionKey = religionKey;
	}

	public String getReligionCd() {
		return this.religionCd;
	}

	public void setReligionCd(String religionCd) {
		this.religionCd = religionCd;
	}

	public String getReligionLongDesc() {
		return this.religionLongDesc;
	}

	public void setReligionLongDesc(String religionLongDesc) {
		this.religionLongDesc = religionLongDesc;
	}

}