package models;

import java.io.Serializable;
import java.util.HashMap;

import javax.persistence.*;


/**
 * The persistent class for the DIM_COUNTRY database table.
 * 
 */
@Entity
@Table(name="DIM_COUNTRY")
@NamedQuery(name="DimCountry.findAll", query="SELECT d FROM DimCountry d")
public class DimCountry implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="COUNTRY_KEY")
	private Integer countryKey;

	@Column(name="COUNTRY_CD")
	private String countryCd;

	@Column(name="NATIONALITY")
	private String nationality;

	public static HashMap<String,Integer> mappingInfo = new HashMap<String,Integer>(){
		{
			put("countryKey",0);
			put("countryCd",1);
			put("nationality",2);
		}};
		public static Integer columnCount = 3;
	public DimCountry() {
	}

	public int getCountryKey() {
		return this.countryKey;
	}

	public void setCountryKey(int countryKey) {
		this.countryKey = countryKey;
	}

	public String getCountryCd() {
		return this.countryCd;
	}

	public void setCountryCd(String countryCd) {
		this.countryCd = countryCd;
	}

	public String getNationality() {
		return this.nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

}