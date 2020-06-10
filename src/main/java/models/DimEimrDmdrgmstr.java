package models;

import java.io.Serializable;
import java.util.HashMap;

import javax.persistence.*;


/**
 * The persistent class for the DIM_EIMR_DMDRGMSTR database table.
 * 
 */
@Entity
@Table(name="DIM_EIMR_DMDRGMSTR")
@NamedQuery(name="DimEimrDmdrgmstr.findAll", query="SELECT d FROM DimEimrDmdrgmstr d")
public class DimEimrDmdrgmstr implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="EIMR_DMDRGMSTR_SID")
	private Integer eimrDmdrgmstrSid;

	@Column(name="ITEM_CODE")
	private String itemCode;

	@Column(name="ITEM_DESCRIPTION")
	private String itemDescription;

	public static HashMap<String,Integer> mappingInfo = new HashMap<String,Integer>(){
		{
			put("eimrDmdrgmstrSid",0);
			put("itemCode",1);
			put("itemDescription",2);
			
		}};
		public static Integer columnCount = 3;
	public DimEimrDmdrgmstr() {
	}

	public int getEimrDmdrgmstrSid() {
		return this.eimrDmdrgmstrSid;
	}

	public void setEimrDmdrgmstrSid(int eimrDmdrgmstrSid) {
		this.eimrDmdrgmstrSid = eimrDmdrgmstrSid;
	}

	public String getItemCode() {
		return this.itemCode;
	}

	public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
	}

	public String getItemDescription() {
		return this.itemDescription;
	}

	public void setItemDescription(String itemDescription) {
		this.itemDescription = itemDescription;
	}

}