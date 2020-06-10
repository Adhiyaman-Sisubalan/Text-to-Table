package models;

import java.io.Serializable;
import java.util.HashMap;

import javax.persistence.*;


/**
 * The persistent class for the DIM_INSTITUTION database table.
 * 
 */
@Entity
@Table(name="DIM_INSTITUTION")
@NamedQuery(name="DimInstitution.findAll", query="SELECT d FROM DimInstitution d")
public class DimInstitution implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="INSTITUTION_KEY")
	private Integer institutionKey;

	@Column(name="INSTITUTION_CD")
	private String institutionCd;

	@Column(name="INSTITUTION_LONG_DESC")
	private String institutionLongDesc;

	@Column(name="INSTITUTION_SHORT_DESC")
	private String institutionShortDesc;

	public static HashMap<String,Integer> mappingInfo = new HashMap<String,Integer>(){
		{
			put("institutionKey",0);
			put("institutionCd",1);
			put("institutionLongDesc",2);
			put("institutionShortDesc",3);
		}};
		public static Integer columnCount = 4;
	public DimInstitution() {
	}

	public int getInstitutionKey() {
		return this.institutionKey;
	}

	public void setInstitutionKey(int institutionKey) {
		this.institutionKey = institutionKey;
	}

	public String getInstitutionCd() {
		return this.institutionCd;
	}

	public void setInstitutionCd(String institutionCd) {
		this.institutionCd = institutionCd;
	}

	public String getInstitutionLongDesc() {
		return this.institutionLongDesc;
	}

	public void setInstitutionLongDesc(String institutionLongDesc) {
		this.institutionLongDesc = institutionLongDesc;
	}

	public String getInstitutionShortDesc() {
		return this.institutionShortDesc;
	}

	public void setInstitutionShortDesc(String institutionShortDesc) {
		this.institutionShortDesc = institutionShortDesc;
	}

}