package models;

import java.io.Serializable;
import java.util.HashMap;

import javax.persistence.*;


/**
 * The persistent class for the DIM_LIS_DOCTOR database table.
 * 
 */
@Entity
@Table(name="DIM_LIS_DOCTOR")
@NamedQuery(name="DimLisDoctor.findAll", query="SELECT d FROM DimLisDoctor d")
public class DimLisDoctor implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="LIS_DOCTOR_SID")
	private Integer lisDoctorSid;

	@Column(name="DEFAULTLOCCODE")
	private String defaultloccode;

	@Column(name="DOCCODE")
	private String doccode;

	@Column(name="DOCNAME")
	private String docname;

	@Column(name="LISDOCCODE")
	private String lisdoccode;

	public static HashMap<String,Integer> mappingInfo = new HashMap<String,Integer>(){
		{
			put("lisDoctorSid",0);
			put("defaultloccode",1);
			put("doccode",2);
			put("docname",3);
			put("lisdoccode",4);
		}};
		public static Integer columnCount = 5;
	public DimLisDoctor() {
	}

	public int getLisDoctorSid() {
		return this.lisDoctorSid;
	}

	public void setLisDoctorSid(int lisDoctorSid) {
		this.lisDoctorSid = lisDoctorSid;
	}

	public String getDefaultloccode() {
		return this.defaultloccode;
	}

	public void setDefaultloccode(String defaultloccode) {
		this.defaultloccode = defaultloccode;
	}

	public String getDoccode() {
		return this.doccode;
	}

	public void setDoccode(String doccode) {
		this.doccode = doccode;
	}

	public String getDocname() {
		return this.docname;
	}

	public void setDocname(String docname) {
		this.docname = docname;
	}

	public String getLisdoccode() {
		return this.lisdoccode;
	}

	public void setLisdoccode(String lisdoccode) {
		this.lisdoccode = lisdoccode;
	}

}