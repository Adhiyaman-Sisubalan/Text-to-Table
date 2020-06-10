package models;

import java.io.Serializable;
import java.util.HashMap;

import javax.persistence.*;


/**
 * The persistent class for the FCT_EIMR_ORD_COMP database table.
 * 
 */
@Entity
@Table(name="FCT_EIMR_ORD_COMP")
@NamedQuery(name="FctEimrOrdComp.findAll", query="SELECT f FROM FctEimrOrdComp f")
public class FctEimrOrdComp implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private FctEimrOrdCompPK id;
	
	@Column(name="CLUSTERPREFERREDNAMECODE")
	private String clusterpreferrednamecode;

	@Column(name="CLUSTERPREFERREDNAMEDESC")
	private String clusterpreferrednamedesc;

	@Column(name="COMP_EIMR_ICCODE_SID")
	private Integer compEimrIccodeSid;

	@Column(name="COMPONENTTYPECODE")
	private String componenttypecode;

	@Column(name="DOSAGEFORM")
	private String dosageform;

	@Column(name="DOSEORDERED")
	private String doseordered;

	@Column(name="DOSEORDEREDUNIT")
	private String doseorderedunit;

	@Column(name="ISDELETED")
	private Integer isdeleted;

	@Column(name="ORDEROID")
	private Integer orderoid;

	@Column(name="ORDERTEXT")
	private String ordertext;

	@Column(name="STRENGTHUNIT")
	private String strengthunit;

	public static HashMap<String,Integer> mappingInfo = new HashMap<String,Integer>(){
		{
			put("id",-1);
			put("clusterpreferrednamecode",2);
			put("clusterpreferrednamedesc",3);
			put("compEimrIccodeSid",4);
			put("componenttypecode",5);
			put("dosageform",6);
			put("doseordered",7);
			put("doseorderedunit",8);
			put("isdeleted",9);
			put("orderoid",10);
			put("ordertext",11);
			put("strengthunit",12);
			
			
		}};
	public static Integer columnCount = 13;
	public FctEimrOrdComp() {
	}

	public FctEimrOrdCompPK getId() {
		return this.id;
	}

	public void setId(FctEimrOrdCompPK id) {
		this.id = id;
	}

	public String getClusterpreferrednamecode() {
		return this.clusterpreferrednamecode;
	}

	public void setClusterpreferrednamecode(String clusterpreferrednamecode) {
		this.clusterpreferrednamecode = clusterpreferrednamecode;
	}

	public String getClusterpreferrednamedesc() {
		return this.clusterpreferrednamedesc;
	}

	public void setClusterpreferrednamedesc(String clusterpreferrednamedesc) {
		this.clusterpreferrednamedesc = clusterpreferrednamedesc;
	}

	public int getCompEimrIccodeSid() {
		return this.compEimrIccodeSid;
	}

	public void setCompEimrIccodeSid(int compEimrIccodeSid) {
		this.compEimrIccodeSid = compEimrIccodeSid;
	}

	public String getComponenttypecode() {
		return this.componenttypecode;
	}

	public void setComponenttypecode(String componenttypecode) {
		this.componenttypecode = componenttypecode;
	}

	public String getDosageform() {
		return this.dosageform;
	}

	public void setDosageform(String dosageform) {
		this.dosageform = dosageform;
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

	public String getOrdertext() {
		return this.ordertext;
	}

	public void setOrdertext(String ordertext) {
		this.ordertext = ordertext;
	}

	public String getStrengthunit() {
		return this.strengthunit;
	}

	public void setStrengthunit(String strengthunit) {
		this.strengthunit = strengthunit;
	}

}