package models;

import java.io.Serializable;
import java.util.HashMap;

import javax.persistence.*;


/**
 * The persistent class for the FCT_SURGICAL database table.
 * 
 */
@Entity
@Table(name="FCT_SURGICAL")
@NamedQuery(name="FctSurgical.findAll", query="SELECT f FROM FctSurgical f")
public class FctSurgical implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="SURG_KEY")
	private Integer surgKey;

	@Column(name="CANCEL_IND")
	private String cancelInd;

	@Column(name="ENC_KEY")
	private Integer encKey;

	@Column(name="INSTITUTION_KEY")
	private Integer institutionKey;

	@Column(name="SURG_TYPE")
	private String surgType;

	@Column(name="SURGICAL_KEY")
	private Integer surgicalKey;

	public static HashMap<String,Integer> mappingInfo = new HashMap<String,Integer>(){
		{
			put("surgKey",0);
			put("cancelInd",1);
			put("encKey",2);
			put("institutionKey",3);
			put("surgType",4);
			put("surgicalKey",5);
			
			
		}};
		public static Integer columnCount = 6;
	public FctSurgical() {
	}

	public int getSurgKey() {
		return this.surgKey;
	}

	public void setSurgKey(int surgKey) {
		this.surgKey = surgKey;
	}

	public String getCancelInd() {
		return this.cancelInd;
	}

	public void setCancelInd(String cancelInd) {
		this.cancelInd = cancelInd;
	}

	public int getEncKey() {
		return this.encKey;
	}

	public void setEncKey(int encKey) {
		this.encKey = encKey;
	}

	public int getInstitutionKey() {
		return this.institutionKey;
	}

	public void setInstitutionKey(int institutionKey) {
		this.institutionKey = institutionKey;
	}

	public String getSurgType() {
		return this.surgType;
	}

	public void setSurgType(String surgType) {
		this.surgType = surgType;
	}

	public int getSurgicalKey() {
		return this.surgicalKey;
	}

	public void setSurgicalKey(int surgicalKey) {
		this.surgicalKey = surgicalKey;
	}

}