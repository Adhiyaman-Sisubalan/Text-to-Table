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
@Table(name="FCT_EIMR_MED_EIA")
@NamedQuery(name="FctEimrMedEia.findAll", query="SELECT f FROM FctEimrMedEia f")
public class FctEimrMedEia implements Serializable  {

	private static final long serialVersionUID = 1L;
	
	@EmbeddedId
	private FctEimrMedEiaPK id;
	
	@Column(name="CLOSEDBYUSER")
	private String closedbyuser;
	
	@Column(name="CLOSETIME")
	private Date closetime;
	
	@Column(name="DIRECTCOSTSAVINGS")
	private Integer directcostsavings;
	
	@Column(name="DOCTORAUTOPOPUP")
	private Integer doctorautopopup;
	
	@Column(name="EPISODEENCOUNTER")
	private String episodeencounter;
	
	@Column(name="INTERVENTIONSTATUS")
	private String interventionstatus;
	
	@Column(name="ISDELETED")
	private Integer isdeleted;
	
	@Column(name="ISDELETED_IND")
	private String isdeletedInd;
	
	@Column(name="ISEXCLUSIVE")
	private Integer isexclusive;
	
	@Column(name="ORDEROID")
	private Integer orderoid;
	
	@Column(name="TARGETRECIPIENT")
	private String targetrecipient;
	
	@Column(name="TIMEINMINUTES")
	private Integer timeinminutes;
	
	public static HashMap<String,Integer> mappingInfo = new HashMap<String,Integer>(){
		{
		
			put("id",-1);
			
			put("closedbyuser",2);
			put("closetime",3);
			put("directcostsavings",4);
			put("doctorautopopup",5);
			put("episodeencounter",6);
			put("interventionstatus",7);
			put("isdeleted",8);
			put("isdeletedInd",9);
			put("isexclusive",10);
			put("orderoid",11);
			put("targetrecipient",12);
			put("timeinminutes",13);
			
		}};
		public static Integer columnCount = 14;
	public FctEimrMedEia() {
	}
	public String getClosedbyuser() {
		return closedbyuser;
	}
	public void setClosedbyuser(String closedbyuser) {
		this.closedbyuser = closedbyuser;
	}
	public Date getClosetime() {
		return closetime;
	}
	public void setClosetime(Date closetime) {
		this.closetime = closetime;
	}
	public Integer getDirectcostsavings() {
		return directcostsavings;
	}
	public void setDirectcostsavings(Integer directcostsavings) {
		this.directcostsavings = directcostsavings;
	}
	public Integer getDoctorautopopup() {
		return doctorautopopup;
	}
	public void setDoctorautopopup(Integer doctorautopopup) {
		this.doctorautopopup = doctorautopopup;
	}
	public String getEpisodeencounter() {
		return episodeencounter;
	}
	public void setEpisodeencounter(String episodeencounter) {
		this.episodeencounter = episodeencounter;
	}
	public String getInterventionstatus() {
		return interventionstatus;
	}
	public void setInterventionstatus(String interventionstatus) {
		this.interventionstatus = interventionstatus;
	}
	public Integer getIsdeleted() {
		return isdeleted;
	}
	public void setIsdeleted(Integer isdeleted) {
		this.isdeleted = isdeleted;
	}
	public String getIsdeletedInd() {
		return isdeletedInd;
	}
	public void setIsdeletedInd(String isdeletedInd) {
		this.isdeletedInd = isdeletedInd;
	}
	public Integer getIsexclusive() {
		return isexclusive;
	}
	public void setIsexclusive(Integer isexclusive) {
		this.isexclusive = isexclusive;
	}
	public Integer getOrderoid() {
		return orderoid;
	}
	public void setOrderoid(Integer orderoid) {
		this.orderoid = orderoid;
	}
	public String getTargetrecipient() {
		return targetrecipient;
	}
	public void setTargetrecipient(String targetrecipient) {
		this.targetrecipient = targetrecipient;
	}
	public Integer getTimeinminutes() {
		return timeinminutes;
	}
	public void setTimeinminutes(Integer timeinminutes) {
		this.timeinminutes = timeinminutes;
	}

	
}
