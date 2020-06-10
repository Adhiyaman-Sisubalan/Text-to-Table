package models;

import java.io.Serializable;
import java.util.HashMap;

import javax.persistence.*;


/**
 * The persistent class for the FCT_EIMR_ORD_INSTRUCT database table.
 * 
 */
@Entity
@Table(name="FCT_EIMR_ORD_INSTRUCT")
@NamedQuery(name="FctEimrOrdInstruct.findAll", query="SELECT f FROM FctEimrOrdInstruct f")
public class FctEimrOrdInstruct implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private FctEimrOrdInstructPK id;

	@Column(name="EIMR_ICCODE_SID")
	private Integer eimrIccodeSid;

	@Column(name="INSTRUCTIONTEXT")
	private String instructiontext;

	@Column(name="INSTRUCTIONTYPECODE")
	private String instructiontypecode;

	@Column(name="ISDELETED")
	private Integer isdeleted;

	@Column(name="ORDEROID")
	private Integer orderoid;

	public static HashMap<String,Integer> mappingInfo = new HashMap<String,Integer>(){
		{
			put("id",-1);
			put("eimrIccodeSid",2);
			put("instructiontext",3);
			put("instructiontypecode",4);
			put("isdeleted",5);
			put("orderoid",6);
			
			
			
		}};
	public static Integer columnCount = 7;
	public FctEimrOrdInstruct() {
	}

	public FctEimrOrdInstructPK getId() {
		return this.id;
	}

	public void setId(FctEimrOrdInstructPK id) {
		this.id = id;
	}

	public int getEimrIccodeSid() {
		return this.eimrIccodeSid;
	}

	public void setEimrIccodeSid(int eimrIccodeSid) {
		this.eimrIccodeSid = eimrIccodeSid;
	}

	public String getInstructiontext() {
		return this.instructiontext;
	}

	public void setInstructiontext(String instructiontext) {
		this.instructiontext = instructiontext;
	}

	public String getInstructiontypecode() {
		return this.instructiontypecode;
	}

	public void setInstructiontypecode(String instructiontypecode) {
		this.instructiontypecode = instructiontypecode;
	}

	public int getIsdeleted() {
		return this.isdeleted;
	}

	public void setIsdeleted(int isdeleted) {
		this.isdeleted = isdeleted;
	}

	public int getOrderoid() {
		return this.orderoid;
	}

	public void setOrderoid(int orderoid) {
		this.orderoid = orderoid;
	}

}