package models;

import java.io.Serializable;
import java.util.Date;
import java.util.HashMap;

import javax.persistence.*;


/**
 * The persistent class for the FCT_EIMR_ORD_TRANS database table.
 * 
 */
@Entity
@Table(name="FCT_EIMR_ORD_TRANS")
@NamedQuery(name="FctEimrOrdTrans.findAll", query="SELECT f FROM FctEimrOrdTrans f")
public class FctEimrOrdTrans implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private FctEimrOrdTranPK id;

	@Column(name="DISPENSINGUOM")
	private String dispensinguom;

	@Column(name="DISPENSINGUOMUNIT")
	private String dispensinguomunit;

	@Column(name="DOSEORDERED")
	private String doseordered;

	@Column(name="DOSEORDEREDUNIT")
	private String doseorderedunit;

	@Column(name="DRUGITEMCODE")
	private String drugitemcode;

	@Column(name="EFFECTIVEENDDATE")
	private Date effectiveenddate;

	@Column(name="EFFECTIVESTARTDATE")
	private Date effectivestartdate;

	@Column(name="EIMR_DMDRGMSTR_SID")
	private Integer eimrDmdrgmstrSid;

	@Column(name="EIMR_ICCODE_SID")
	private Integer eimrIccodeSid;

	@Column(name="ISDELETED")
	private Integer isdeleted;

	@Column(name="ORDERCOMPONENTOID")
	private Integer ordercomponentoid;

	@Column(name="ORDERQUANTITYTEXT")
	private String orderquantitytext;

	@Column(name="PRESCRIBEDOSE")
	private String prescribedose;

	@Column(name="PRESCRIBEUOM")
	private String prescribeuom;

	@Column(name="QTYPERSERVING")
	private Integer qtyperserving;

	@Column(name="TRANSLATEDCOMPONENTCOUNTER")
	private Integer translatedcomponentcounter;

	@Column(name="TRANSLATEDCOMPONENTTYPECODE")
	private String translatedcomponenttypecode;

	@Column(name="TRANSLATEDGROUP")
	private Integer translatedgroup;

	@Column(name="TRANSLATIONTERMINATIONDATE")
	private Date translationterminationdate;

	public static HashMap<String,Integer> mappingInfo = new HashMap<String,Integer>(){
		{
			put("id",-1);
			
			put("dispensinguom",2);
			put("dispensinguomunit",3);
			put("doseordered",4);
			put("doseorderedunit",5);
			put("drugitemcode",6);
			put("effectiveenddate",7);
			put("effectivestartdate",8);
			put("eimrDmdrgmstrSid",9);
			put("eimrIccodeSid",10);
			put("isdeleted",11);
			put("ordercomponentoid",12);
			put("orderquantitytext",13);
			put("prescribedose",14);
			put("prescribeuom",15);
			put("qtyperserving",16);
			put("translatedcomponentcounter",17);
			put("translatedcomponenttypecode",18);
			put("translatedgroup",19);
			put("translationterminationdate",20);
			
			
		}};
	public static Integer columnCount = 21;
	public FctEimrOrdTrans() {
	}

	public FctEimrOrdTranPK getId() {
		return this.id;
	}

	public void setId(FctEimrOrdTranPK id) {
		this.id = id;
	}

	public String getDispensinguom() {
		return this.dispensinguom;
	}

	public void setDispensinguom(String dispensinguom) {
		this.dispensinguom = dispensinguom;
	}

	public String getDispensinguomunit() {
		return this.dispensinguomunit;
	}

	public void setDispensinguomunit(String dispensinguomunit) {
		this.dispensinguomunit = dispensinguomunit;
	}

	public String getDoseordered() {
		return this.doseordered;
	}

	public void setDoseordered(String doseordered) {
		this.doseordered = doseordered;
	}

	public String getDoseorderedunit() {
		return this.doseorderedunit;
	}

	public void setDoseorderedunit(String doseorderedunit) {
		this.doseorderedunit = doseorderedunit;
	}

	public String getDrugitemcode() {
		return this.drugitemcode;
	}

	public void setDrugitemcode(String drugitemcode) {
		this.drugitemcode = drugitemcode;
	}

	public Date getEffectiveenddate() {
		return this.effectiveenddate;
	}

	public void setEffectiveenddate(Date effectiveenddate) {
		this.effectiveenddate = effectiveenddate;
	}

	public Date getEffectivestartdate() {
		return this.effectivestartdate;
	}

	public void setEffectivestartdate(Date effectivestartdate) {
		this.effectivestartdate = effectivestartdate;
	}

	public int getEimrDmdrgmstrSid() {
		return this.eimrDmdrgmstrSid;
	}

	public void setEimrDmdrgmstrSid(int eimrDmdrgmstrSid) {
		this.eimrDmdrgmstrSid = eimrDmdrgmstrSid;
	}

	public int getEimrIccodeSid() {
		return this.eimrIccodeSid;
	}

	public void setEimrIccodeSid(int eimrIccodeSid) {
		this.eimrIccodeSid = eimrIccodeSid;
	}

	public int getIsdeleted() {
		return this.isdeleted;
	}

	public void setIsdeleted(int isdeleted) {
		this.isdeleted = isdeleted;
	}

	public int getOrdercomponentoid() {
		return this.ordercomponentoid;
	}

	public void setOrdercomponentoid(int ordercomponentoid) {
		this.ordercomponentoid = ordercomponentoid;
	}

	public String getOrderquantitytext() {
		return this.orderquantitytext;
	}

	public void setOrderquantitytext(String orderquantitytext) {
		this.orderquantitytext = orderquantitytext;
	}

	public String getPrescribedose() {
		return this.prescribedose;
	}

	public void setPrescribedose(String prescribedose) {
		this.prescribedose = prescribedose;
	}

	public String getPrescribeuom() {
		return this.prescribeuom;
	}

	public void setPrescribeuom(String prescribeuom) {
		this.prescribeuom = prescribeuom;
	}

	public int getQtyperserving() {
		return this.qtyperserving;
	}

	public void setQtyperserving(int qtyperserving) {
		this.qtyperserving = qtyperserving;
	}

	public int getTranslatedcomponentcounter() {
		return this.translatedcomponentcounter;
	}

	public void setTranslatedcomponentcounter(int translatedcomponentcounter) {
		this.translatedcomponentcounter = translatedcomponentcounter;
	}

	public String getTranslatedcomponenttypecode() {
		return this.translatedcomponenttypecode;
	}

	public void setTranslatedcomponenttypecode(String translatedcomponenttypecode) {
		this.translatedcomponenttypecode = translatedcomponenttypecode;
	}

	public int getTranslatedgroup() {
		return this.translatedgroup;
	}

	public void setTranslatedgroup(int translatedgroup) {
		this.translatedgroup = translatedgroup;
	}

	public Date getTranslationterminationdate() {
		return this.translationterminationdate;
	}

	public void setTranslationterminationdate(Date translationterminationdate) {
		this.translationterminationdate = translationterminationdate;
	}

}