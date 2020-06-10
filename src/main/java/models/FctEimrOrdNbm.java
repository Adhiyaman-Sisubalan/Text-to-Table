package models;

import java.io.Serializable;
import java.util.HashMap;

import javax.persistence.*;


/**
 * The persistent class for the FCT_EIMR_ORD_NBM database table.
 * 
 */
@Entity
@Table(name="FCT_EIMR_ORD_NBM")
@NamedQuery(name="FctEimrOrdNbm.findAll", query="SELECT f FROM FctEimrOrdNbm f")
public class FctEimrOrdNbm implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private FctEimrOrdNbmPK id;

	@Column(name="EIMR_ICCODE_SID")
	private Integer eimrIccodeSid;

	@Column(name="NBMCODE")
	private String nbmcode;

	@Column(name="PATIENT_KEY")
	private Integer patientKey;

	public static HashMap<String,Integer> mappingInfo = new HashMap<String,Integer>(){
		{
			put("id",-1);
			put("nbmcode",2);
			put("patientKey",3);
			
			
			
			
		}};
	public static Integer columnCount = 3;
	public FctEimrOrdNbm() {
	}

	public FctEimrOrdNbmPK getId() {
		return this.id;
	}

	public void setId(FctEimrOrdNbmPK id) {
		this.id = id;
	}

	public int getEimrIccodeSid() {
		return this.eimrIccodeSid;
	}

	public void setEimrIccodeSid(int eimrIccodeSid) {
		this.eimrIccodeSid = eimrIccodeSid;
	}

	public String getNbmcode() {
		return this.nbmcode;
	}

	public void setNbmcode(String nbmcode) {
		this.nbmcode = nbmcode;
	}

	public int getPatientKey() {
		return this.patientKey;
	}

	public void setPatientKey(int patientKey) {
		this.patientKey = patientKey;
	}

}