package models;

import java.io.Serializable;
import java.util.HashMap;

import javax.persistence.*;


/**
 * The persistent class for the DIM_SURGICAL database table.
 * 
 */
@Entity
@Table(name="DIM_SURGICAL")
@NamedQuery(name="DimSurgical.findAll", query="SELECT d FROM DimSurgical d")
public class DimSurgical implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="SURGICAL_KEY")
	private Integer surgicalKey;

	@Column(name="OPERATION_TABLE_CD")
	private String operationTableCd;

	@Column(name="SURGICAL_CD")
	private String surgicalCd;

	@Column(name="SURGICAL_DESC")
	private String surgicalDesc;

	public static HashMap<String,Integer> mappingInfo = new HashMap<String,Integer>(){
		{
			put("surgicalKey",0);
			put("operationTableCd",1);
			put("surgicalCd",2);
			put("surgicalDesc",3);
			
		}};
		public static Integer columnCount = 4;
	public DimSurgical() {
	}

	public int getSurgicalKey() {
		return this.surgicalKey;
	}

	public void setSurgicalKey(int surgicalKey) {
		this.surgicalKey = surgicalKey;
	}

	public String getOperationTableCd() {
		return this.operationTableCd;
	}

	public void setOperationTableCd(String operationTableCd) {
		this.operationTableCd = operationTableCd;
	}

	public String getSurgicalCd() {
		return this.surgicalCd;
	}

	public void setSurgicalCd(String surgicalCd) {
		this.surgicalCd = surgicalCd;
	}

	public String getSurgicalDesc() {
		return this.surgicalDesc;
	}

	public void setSurgicalDesc(String surgicalDesc) {
		this.surgicalDesc = surgicalDesc;
	}

}