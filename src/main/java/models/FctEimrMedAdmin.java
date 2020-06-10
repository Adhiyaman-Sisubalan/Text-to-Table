package models;

import java.io.Serializable;
import java.util.Date;
import java.util.HashMap;

import javax.persistence.*;


/**
 * The persistent class for the FCT_EIMR_MED_ADMIN database table.
 * 
 */
@Entity
@Table(name="FCT_EIMR_MED_ADMIN")
@NamedQuery(name="FctEimrMedAdmin.findAll", query="SELECT f FROM FctEimrMedAdmin f")
public class FctEimrMedAdmin implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private FctEimrMedAdminPK id;

	@Column(name="CREATIONTIME")
	private Date creationtime;

	@Column(name="CREATIONUSER")
	private String creationuser;

	@Column(name="CREATIONUSER_NAME")
	private String creationuserName;

	@Column(name="DOSAGE_GIVEN")
	private String dosageGiven;

	@Column(name="DOSAGE_GIVEN_UOM")
	private String dosageGivenUom;

	@Column(name="DRUGITEMCODE")
	private String drugitemcode;

	@Column(name="EIMR_DMDRGMSTR_SID")
	private Integer eimrDmdrgmstrSid;

	@Column(name="INSTITUTION_SID")
	private Integer institutionSid;

	@Column(name="ISDELETED")
	private Integer isdeleted;

	@Column(name="ORDEROID")
	private Integer orderoid;

	@Column(name="STATUSACTIVEIND")
	private Integer statusactiveind;

	@Column(name="TRANSACTIONSTATUSCODE")
	private String transactionstatuscode;

	public static HashMap<String,Integer> mappingInfo = new HashMap<String,Integer>(){
		{
		
			put("id",-1);
			put("creationtime",2);
			put("creationuser",3);
			put("creationuserName",4);
			put("dosageGiven",5);
			put("dosageGivenUom",6);
			put("drugitemcode",7);
			put("eimrDmdrgmstrSid",8);
			put("institutionSid",9);
			put("isdeleted",10);
			put("orderoid",11);
			put("statusactiveind",12);
			put("transactionstatuscode",13);
			
		}};
		public static Integer columnCount = 14;
	public FctEimrMedAdmin() {
	}

	public FctEimrMedAdminPK getId() {
		return this.id;
	}

	public void setId(FctEimrMedAdminPK id) {
		this.id = id;
	}

	public Date getCreationtime() {
		return this.creationtime;
	}

	public void setCreationtime(Date creationtime) {
		this.creationtime = creationtime;
	}

	public String getCreationuser() {
		return this.creationuser;
	}

	public void setCreationuser(String creationuser) {
		this.creationuser = creationuser;
	}

	public String getCreationuserName() {
		return this.creationuserName;
	}

	public void setCreationuserName(String creationuserName) {
		this.creationuserName = creationuserName;
	}

	public String getDosageGiven() {
		return this.dosageGiven;
	}

	public void setDosageGiven(String dosageGiven) {
		this.dosageGiven = dosageGiven;
	}

	public String getDosageGivenUom() {
		return this.dosageGivenUom;
	}

	public void setDosageGivenUom(String dosageGivenUom) {
		this.dosageGivenUom = dosageGivenUom;
	}

	public String getDrugitemcode() {
		return this.drugitemcode;
	}

	public void setDrugitemcode(String drugitemcode) {
		this.drugitemcode = drugitemcode;
	}

	public int getEimrDmdrgmstrSid() {
		return this.eimrDmdrgmstrSid;
	}

	public void setEimrDmdrgmstrSid(int eimrDmdrgmstrSid) {
		this.eimrDmdrgmstrSid = eimrDmdrgmstrSid;
	}

	public int getInstitutionSid() {
		return this.institutionSid;
	}

	public void setInstitutionSid(int institutionSid) {
		this.institutionSid = institutionSid;
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

	public int getStatusactiveind() {
		return this.statusactiveind;
	}

	public void setStatusactiveind(int statusactiveind) {
		this.statusactiveind = statusactiveind;
	}

	public String getTransactionstatuscode() {
		return this.transactionstatuscode;
	}

	public void setTransactionstatuscode(String transactionstatuscode) {
		this.transactionstatuscode = transactionstatuscode;
	}

}