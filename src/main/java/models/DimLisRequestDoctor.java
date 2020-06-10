package models;

import java.io.Serializable;
import java.util.Date;
import java.util.HashMap;

import javax.persistence.*;


/**
 * The persistent class for the DIM_LIS_REQUEST_DOCTOR database table.
 * 
 */
@Entity
@Table(name="DIM_LIS_REQUEST_DOCTOR")
@NamedQuery(name="DimLisRequestDoctor.findAll", query="SELECT d FROM DimLisRequestDoctor d")
public class DimLisRequestDoctor implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="LIS_REQUEST_DOCTOR_SID")
	private Integer lisRequestDoctorSid;

	@Column(name="DISCIPLINE")
	private Integer discipline;

	@Column(name="DOCID")
	private Integer docid;

	@Column(name="DOCREPORTDATE")
	private Date docreportdate;

	@Column(name="INSTITUTION_CD")
	private String institutionCd;

	@Column(name="LIS_DOCTOR_SID")
	private Integer lisDoctorSid;

	@Column(name="LIS_REQUEST_SID")
	private Integer lisRequestSid;

	@Column(name="LOGUSERID")
	private String loguserid;

	@Column(name="PATIENTREPORT")
	private Integer patientreport;

	@Column(name="PRESCRIBER")
	private Integer prescriber;

	@Column(name="PRINTOUTNUMBER")
	private Integer printoutnumber;

	@Column(name="REQDOCID")
	private Integer reqdocid;

	@Column(name="SENDREPORT")
	private Integer sendreport;

	public static HashMap<String,Integer> mappingInfo = new HashMap<String,Integer>(){
		{
			put("lisRequestDoctorSid",0);
			put("discipline",3);
			put("docid",4);
			put("docreportdate",5);
			put("institutionCd",1);
			put("lisDoctorSid",6);
			put("lisRequestSid",7);
			put("loguserid",8);
			put("patientreport",9);
			put("prescriber",10);
			put("printoutnumber",11);
			put("reqdocid",2);
			put("sendreport",12);
		}};
		public static Integer columnCount = 13;
	public DimLisRequestDoctor() {
	}

	public int getLisRequestDoctorSid() {
		return this.lisRequestDoctorSid;
	}

	public void setLisRequestDoctorSid(int lisRequestDoctorSid) {
		this.lisRequestDoctorSid = lisRequestDoctorSid;
	}

	public int getDiscipline() {
		return this.discipline;
	}

	public void setDiscipline(int discipline) {
		this.discipline = discipline;
	}

	public int getDocid() {
		return this.docid;
	}

	public void setDocid(int docid) {
		this.docid = docid;
	}

	public Object getDocreportdate() {
		return this.docreportdate;
	}

	public void setDocreportdate(Date docreportdate) {
		this.docreportdate = docreportdate;
	}

	public String getInstitutionCd() {
		return this.institutionCd;
	}

	public void setInstitutionCd(String institutionCd) {
		this.institutionCd = institutionCd;
	}

	public int getLisDoctorSid() {
		return this.lisDoctorSid;
	}

	public void setLisDoctorSid(int lisDoctorSid) {
		this.lisDoctorSid = lisDoctorSid;
	}

	public int getLisRequestSid() {
		return this.lisRequestSid;
	}

	public void setLisRequestSid(int lisRequestSid) {
		this.lisRequestSid = lisRequestSid;
	}

	public String getLoguserid() {
		return this.loguserid;
	}

	public void setLoguserid(String loguserid) {
		this.loguserid = loguserid;
	}

	public int getPatientreport() {
		return this.patientreport;
	}

	public void setPatientreport(int patientreport) {
		this.patientreport = patientreport;
	}

	public int getPrescriber() {
		return this.prescriber;
	}

	public void setPrescriber(int prescriber) {
		this.prescriber = prescriber;
	}

	public int getPrintoutnumber() {
		return this.printoutnumber;
	}

	public void setPrintoutnumber(int printoutnumber) {
		this.printoutnumber = printoutnumber;
	}

	public int getReqdocid() {
		return this.reqdocid;
	}

	public void setReqdocid(int reqdocid) {
		this.reqdocid = reqdocid;
	}

	public int getSendreport() {
		return this.sendreport;
	}

	public void setSendreport(int sendreport) {
		this.sendreport = sendreport;
	}

}