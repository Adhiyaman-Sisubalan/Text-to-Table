package models;

import java.io.Serializable;
import java.util.HashMap;

import javax.persistence.*;


/**
 * The persistent class for the DIM_EIMR_ICCODE database table.
 * 
 */
@Entity
@Table(name="DIM_EIMR_ICCODE")
@NamedQuery(name="DimEimrIccode.findAll", query="SELECT d FROM DimEimrIccode d")
public class DimEimrIccode implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="EIMR_ICCODE_SID")
	private Integer eimrIccodeSid;

	@Column(name="CODE")
	private String code;

	@Column(name="CODE_DESC")
	private String codeDesc;

	public static HashMap<String,Integer> mappingInfo = new HashMap<String,Integer>(){
		{
			put("eimrIccodeSid",0);
			put("code",1);
			put("codeDesc",2);
		}};
		public static Integer columnCount = 3;
	public DimEimrIccode() {
	}

	public int getEimrIccodeSid() {
		return this.eimrIccodeSid;
	}

	public void setEimrIccodeSid(int eimrIccodeSid) {
		this.eimrIccodeSid = eimrIccodeSid;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getCodeDesc() {
		return this.codeDesc;
	}

	public void setCodeDesc(String codeDesc) {
		this.codeDesc = codeDesc;
	}

}