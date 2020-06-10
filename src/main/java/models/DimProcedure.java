package models;

import java.io.Serializable;
import java.util.HashMap;

import javax.persistence.*;


/**
 * The persistent class for the DIM_PROCEDURE database table.
 * 
 */
@Entity
@Table(name="DIM_PROCEDURE")
@NamedQuery(name="DimProcedure.findAll", query="SELECT d FROM DimProcedure d")
public class DimProcedure implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="PROCEDURE_KEY")
	private Integer procedureKey;

	@Column(name="PROCEDURE_CAT")
	private String procedureCat;

	@Column(name="PROCEDURE_CD")
	private String procedureCd;

	@Column(name="PROCEDURE_DESC")
	private String procedureDesc;

	public static HashMap<String,Integer> mappingInfo = new HashMap<String,Integer>(){
		{
			put("procedureKey",0);
			put("procedureCat",1);
			put("procedureCd",2);
			put("procedureDesc",3);
			
		}};
		public static Integer columnCount = 4;
	public DimProcedure() {
	}

	public int getProcedureKey() {
		return this.procedureKey;
	}

	public void setProcedureKey(int procedureKey) {
		this.procedureKey = procedureKey;
	}

	public String getProcedureCat() {
		return this.procedureCat;
	}

	public void setProcedureCat(String procedureCat) {
		this.procedureCat = procedureCat;
	}

	public String getProcedureCd() {
		return this.procedureCd;
	}

	public void setProcedureCd(String procedureCd) {
		this.procedureCd = procedureCd;
	}

	public String getProcedureDesc() {
		return this.procedureDesc;
	}

	public void setProcedureDesc(String procedureDesc) {
		this.procedureDesc = procedureDesc;
	}

}