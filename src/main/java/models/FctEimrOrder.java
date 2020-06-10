package models;

import java.io.Serializable;
import java.util.Date;
import java.util.HashMap;

import javax.persistence.*;


/**
 * The persistent class for the FCT_EIMR_ORDER database table.
 * 
 */
@Entity
@Table(name="FCT_EIMR_ORDER")
@NamedQuery(name="FctEimrOrder.findAll", query="SELECT f FROM FctEimrOrder f")
public class FctEimrOrder implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private FctEimrOrderPK id;

	@Column(name="CREATE_DATE")
	private Date createDate;

	@Column(name="CREATE_DATE_SID")
	private Integer createDateSid;

	@Column(name="CREATE_USER")
	private String createUser;

	@Column(name="DOSAGEREGIMEN")
	private String dosageregimen;

	@Column(name="DOSEINT")
	private Integer doseint;

	@Column(name="DURATIONTEXT")
	private String durationtext;

	@Column(name="DURATIONUNIT")
	private String durationunit;

	@Column(name="EIMR_DMORDERSET_SID")
	private Integer eimrDmordersetSid;

	@Column(name="ENDTIME")
	private Date endtime;

	@Column(name="ENDTIME_DATE_SID")
	private Integer endtimeDateSid;

	@Column(name="FREQ1_EIMR_STDSCHEDULE_SID")
	private Integer freq1EimrStdscheduleSid;

	@Column(name="FREQ2_EIMR_STDSCHEDULE_SID")
	private Integer freq2EimrStdscheduleSid;

	@Column(name="FREQUENCY1CODE")
	private String frequency1code;

	@Column(name="FREQUENCY2CODE")
	private String frequency2code;

	@Column(name="INPATIENT_ENC_KEY")
	private Integer inpatientEncKey;

	@Column(name="INTERVENTIONSTATUS")
	private Integer interventionstatus;

	@Column(name="MEDICATION")
	private String medication;

	@Column(name="NONSTOCKCODE")
	private String nonstockcode;

	@Column(name="NSC_EIMR_ICCODE_SID")
	private Integer nscEimrIccodeSid;

	@Column(name="ORDERTEXT")
	private String ordertext;

	@Column(name="ORDERTYPECODE")
	private String ordertypecode;

	@Column(name="OT_EIMR_ICCODE_SID")
	private Integer otEimrIccodeSid;

	@Column(name="PATIENT_KEY")
	private Integer patientKey;

	@Column(name="PATIENTMRN")
	private String patientmrn;

	@Column(name="PATIENTWEIGHT")
	private String patientweight;

	@Column(name="REVIEWTIME")
	private Date reviewtime;

	@Column(name="REVIEWUSER")
	private String reviewuser;

	@Column(name="ROUTECODE")
	private String routecode;

	@Column(name="SC_EIMR_ICCODE_SID")
	private Integer scEimrIccodeSid;

	@Column(name="STARTTIME")
	private Date starttime;

	@Column(name="STARTTIME_DATE_SID")
	private Integer starttimeDateSid;

	@Column(name="STATUSCODE")
	private String statuscode;

	@Column(name="UPDATE_DATE")
	private Date updateDate;

	@Column(name="UPDATE_USER")
	private String updateUser;

	public static HashMap<String,Integer> mappingInfo = new HashMap<String,Integer>(){
		{
			
			put("id",-1);
			put("createDate",2);
			put("createDateSid",3);
			put("createUser",4);
			put("dosageregimen",5);
			put("dosenumber",6);
			put("durationtext",7);
			put("durationunit",8);
			put("eimrDmordersetSid",9);
			put("endtime",10);
			put("endtimeDateSid",11);
			put("freq1EimrStdscheduleSid",12);
			put("freq2EimrStdscheduleSid",13);
			put("frequency1code",14);
			put("frequency2code",15);
			put("inpatientEncKey",16);
			put("interventionstatus",17);
			put("medication",18);
			put("nonstockcode",19);
			put("nscEimrIccodeSid",20);
			put("ordertext",21);
			put("ordertypecode",22);
			put("otEimrIccodeSid",23);
			put("patientKey",24);
			put("patientmrn",25);
			put("patientweight",26);
			put("reviewtime",27);
			put("reviewuser",28);
			put("routecode",29);
			put("scEimrIccodeSid",30);
			put("starttime",31);
			put("starttimeDateSid",32);
			put("statuscode",33);
			put("updateDate",34);
			put("updateUser",35);
			
			
		}};
	public static Integer columnCount = 35;
	public FctEimrOrder() {
	}

	public FctEimrOrderPK getId() {
		return this.id;
	}

	public void setId(FctEimrOrderPK id) {
		this.id = id;
	}

	public Date getCreateDate() {
		return this.createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public int getCreateDateSid() {
		return this.createDateSid;
	}

	public void setCreateDateSid(int createDateSid) {
		this.createDateSid = createDateSid;
	}

	public String getCreateUser() {
		return this.createUser;
	}

	public void setCreateUser(String createUser) {
		this.createUser = createUser;
	}

	public String getDosageregimen() {
		return this.dosageregimen;
	}

	public void setDosageregimen(String dosageregimen) {
		this.dosageregimen = dosageregimen;
	}

	public int getDoseint() {
		return this.doseint;
	}

	public void setDoseint(int doseint) {
		this.doseint = doseint;
	}

	public String getDurationtext() {
		return this.durationtext;
	}

	public void setDurationtext(String durationtext) {
		this.durationtext = durationtext;
	}

	public String getDurationunit() {
		return this.durationunit;
	}

	public void setDurationunit(String durationunit) {
		this.durationunit = durationunit;
	}

	public int getEimrDmordersetSid() {
		return this.eimrDmordersetSid;
	}

	public void setEimrDmordersetSid(int eimrDmordersetSid) {
		this.eimrDmordersetSid = eimrDmordersetSid;
	}

	public Date getEndtime() {
		return this.endtime;
	}

	public void setEndtime(Date endtime) {
		this.endtime = endtime;
	}

	public int getEndtimeDateSid() {
		return this.endtimeDateSid;
	}

	public void setEndtimeDateSid(int endtimeDateSid) {
		this.endtimeDateSid = endtimeDateSid;
	}

	public int getFreq1EimrStdscheduleSid() {
		return this.freq1EimrStdscheduleSid;
	}

	public void setFreq1EimrStdscheduleSid(int freq1EimrStdscheduleSid) {
		this.freq1EimrStdscheduleSid = freq1EimrStdscheduleSid;
	}

	public int getFreq2EimrStdscheduleSid() {
		return this.freq2EimrStdscheduleSid;
	}

	public void setFreq2EimrStdscheduleSid(int freq2EimrStdscheduleSid) {
		this.freq2EimrStdscheduleSid = freq2EimrStdscheduleSid;
	}

	public String getFrequency1code() {
		return this.frequency1code;
	}

	public void setFrequency1code(String frequency1code) {
		this.frequency1code = frequency1code;
	}

	public String getFrequency2code() {
		return this.frequency2code;
	}

	public void setFrequency2code(String frequency2code) {
		this.frequency2code = frequency2code;
	}

	public int getInpatientEncKey() {
		return this.inpatientEncKey;
	}

	public void setInpatientEncKey(int inpatientEncKey) {
		this.inpatientEncKey = inpatientEncKey;
	}

	public int getInterventionstatus() {
		return this.interventionstatus;
	}

	public void setInterventionstatus(int interventionstatus) {
		this.interventionstatus = interventionstatus;
	}

	public String getMedication() {
		return this.medication;
	}

	public void setMedication(String medication) {
		this.medication = medication;
	}

	public String getNonstockcode() {
		return this.nonstockcode;
	}

	public void setNonstockcode(String nonstockcode) {
		this.nonstockcode = nonstockcode;
	}

	public int getNscEimrIccodeSid() {
		return this.nscEimrIccodeSid;
	}

	public void setNscEimrIccodeSid(int nscEimrIccodeSid) {
		this.nscEimrIccodeSid = nscEimrIccodeSid;
	}

	public String getOrdertext() {
		return this.ordertext;
	}

	public void setOrdertext(String ordertext) {
		this.ordertext = ordertext;
	}

	public String getOrdertypecode() {
		return this.ordertypecode;
	}

	public void setOrdertypecode(String ordertypecode) {
		this.ordertypecode = ordertypecode;
	}

	public int getOtEimrIccodeSid() {
		return this.otEimrIccodeSid;
	}

	public void setOtEimrIccodeSid(int otEimrIccodeSid) {
		this.otEimrIccodeSid = otEimrIccodeSid;
	}

	public int getPatientKey() {
		return this.patientKey;
	}

	public void setPatientKey(int patientKey) {
		this.patientKey = patientKey;
	}

	public String getPatientmrn() {
		return this.patientmrn;
	}

	public void setPatientmrn(String patientmrn) {
		this.patientmrn = patientmrn;
	}

	public String getPatientweight() {
		return this.patientweight;
	}

	public void setPatientweight(String patientweight) {
		this.patientweight = patientweight;
	}

	public Date getReviewtime() {
		return this.reviewtime;
	}

	public void setReviewtime(Date reviewtime) {
		this.reviewtime = reviewtime;
	}

	public String getReviewuser() {
		return this.reviewuser;
	}

	public void setReviewuser(String reviewuser) {
		this.reviewuser = reviewuser;
	}

	public String getRoutecode() {
		return this.routecode;
	}

	public void setRoutecode(String routecode) {
		this.routecode = routecode;
	}

	public int getScEimrIccodeSid() {
		return this.scEimrIccodeSid;
	}

	public void setScEimrIccodeSid(int scEimrIccodeSid) {
		this.scEimrIccodeSid = scEimrIccodeSid;
	}

	public Date getStarttime() {
		return this.starttime;
	}

	public void setStarttime(Date starttime) {
		this.starttime = starttime;
	}

	public int getStarttimeDateSid() {
		return this.starttimeDateSid;
	}

	public void setStarttimeDateSid(int starttimeDateSid) {
		this.starttimeDateSid = starttimeDateSid;
	}

	public String getStatuscode() {
		return this.statuscode;
	}

	public void setStatuscode(String statuscode) {
		this.statuscode = statuscode;
	}

	public Date getUpdateDate() {
		return this.updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

	public String getUpdateUser() {
		return this.updateUser;
	}

	public void setUpdateUser(String updateUser) {
		this.updateUser = updateUser;
	}

}