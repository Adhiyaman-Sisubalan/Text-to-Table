package models;

import java.io.Serializable;
import java.util.HashMap;

import javax.persistence.*;


/**
 * The persistent class for the DIM_PATIENT_PHYSICAL_CLASS database table.
 * 
 */
@Entity
@Table(name="DIM_PATIENT_PHYSICAL_CLASS")
@NamedQuery(name="DimPatientPhysicalClass.findAll", query="SELECT d FROM DimPatientPhysicalClass d")
public class DimPatientPhysicalClass implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="PATIENT_PHY_CLS_KEY")
	private Integer patientPhyClsKey;

	@Column(name="PATIENT_PHY_CLS_CD")
	private String patientPhyClsCd;

	@Column(name="PATIENT_PHY_CLS_LDESC")
	private String patientPhyClsLdesc;

	public static HashMap<String,Integer> mappingInfo = new HashMap<String,Integer>(){
		{
			put("patientPhyClsKey",0);
			put("patientPhyClsCd",1);
			put("patientPhyClsLdesc",2);
			
		}};
		public static Integer columnCount = 3;
	public DimPatientPhysicalClass() {
	}

	public int getPatientPhyClsKey() {
		return this.patientPhyClsKey;
	}

	public void setPatientPhyClsKey(int patientPhyClsKey) {
		this.patientPhyClsKey = patientPhyClsKey;
	}

	public String getPatientPhyClsCd() {
		return this.patientPhyClsCd;
	}

	public void setPatientPhyClsCd(String patientPhyClsCd) {
		this.patientPhyClsCd = patientPhyClsCd;
	}

	public String getPatientPhyClsLdesc() {
		return this.patientPhyClsLdesc;
	}

	public void setPatientPhyClsLdesc(String patientPhyClsLdesc) {
		this.patientPhyClsLdesc = patientPhyClsLdesc;
	}

}