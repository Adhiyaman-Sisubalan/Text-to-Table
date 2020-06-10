package models;

import java.io.Serializable;
import java.util.HashMap;

import javax.persistence.*;


/**
 * The persistent class for the DIM_CCOE_ORDER_STATUS database table.
 * 
 */
@Entity
@Table(name="DIM_CCOE_ORDER_STATUS")
@NamedQuery(name="DimCcoeOrderStatus.findAll", query="SELECT d FROM DimCcoeOrderStatus d")
public class DimCcoeOrderStatus implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ORDER_STATUS_SID")
	private Integer orderStatusSid;

	@Column(name="ORDER_STATUS_CODE")
	private String orderStatusCode;

	@Column(name="ORDER_STATUS_DESC")
	private String orderStatusDesc;

	public static HashMap<String,Integer> mappingInfo = new HashMap<String,Integer>(){
		{
			put("orderStatusSid",0);
			put("orderStatusCode",1);
			put("orderStatusDesc",2);
		}};
		public static Integer columnCount = 3;
	public DimCcoeOrderStatus() {
	}

	public int getOrderStatusSid() {
		return this.orderStatusSid;
	}

	public void setOrderStatusSid(int orderStatusSid) {
		this.orderStatusSid = orderStatusSid;
	}

	public String getOrderStatusCode() {
		return this.orderStatusCode;
	}

	public void setOrderStatusCode(String orderStatusCode) {
		this.orderStatusCode = orderStatusCode;
	}

	public String getOrderStatusDesc() {
		return this.orderStatusDesc;
	}

	public void setOrderStatusDesc(String orderStatusDesc) {
		this.orderStatusDesc = orderStatusDesc;
	}

}