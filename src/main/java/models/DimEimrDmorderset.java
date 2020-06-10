package models;

import java.io.Serializable;
import java.util.HashMap;

import javax.persistence.*;


/**
 * The persistent class for the DIM_EIMR_DMORDERSET database table.
 * 
 */
@Entity
@Table(name="DIM_EIMR_DMORDERSET")
@NamedQuery(name="DimEimrDmorderset.findAll", query="SELECT d FROM DimEimrDmorderset d")
public class DimEimrDmorderset implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="EIMR_DMORDERSET_SID")
	private Integer eimrDmordersetSid;

	@Column(name="ORDER_SET_CODE")
	private String orderSetCode;

	@Column(name="ORDER_SET_DESC")
	private String orderSetDesc;

	@Column(name="ORDER_SET_ROUTE_CODE")
	private String orderSetRouteCode;

	@Column(name="ORDER_SET_TYPE_CODE")
	private String orderSetTypeCode;

	public static HashMap<String,Integer> mappingInfo = new HashMap<String,Integer>(){
		{
			put("eimrDmordersetSid",0);
			put("orderSetCode",1);
			put("orderSetDesc",2);
			put("orderSetRouteCode",3);
			put("orderSetTypeCode",4);
			
		}};
		public static Integer columnCount = 5;
	public DimEimrDmorderset() {
	}

	public int getEimrDmordersetSid() {
		return this.eimrDmordersetSid;
	}

	public void setEimrDmordersetSid(int eimrDmordersetSid) {
		this.eimrDmordersetSid = eimrDmordersetSid;
	}

	public String getOrderSetCode() {
		return this.orderSetCode;
	}

	public void setOrderSetCode(String orderSetCode) {
		this.orderSetCode = orderSetCode;
	}

	public String getOrderSetDesc() {
		return this.orderSetDesc;
	}

	public void setOrderSetDesc(String orderSetDesc) {
		this.orderSetDesc = orderSetDesc;
	}

	public String getOrderSetRouteCode() {
		return this.orderSetRouteCode;
	}

	public void setOrderSetRouteCode(String orderSetRouteCode) {
		this.orderSetRouteCode = orderSetRouteCode;
	}

	public String getOrderSetTypeCode() {
		return this.orderSetTypeCode;
	}

	public void setOrderSetTypeCode(String orderSetTypeCode) {
		this.orderSetTypeCode = orderSetTypeCode;
	}

}