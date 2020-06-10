package models;

import java.io.Serializable;
import java.util.HashMap;

import javax.persistence.*;


/**
 * The persistent class for the DIM_CCOE_ORDER_CANCEL_REASON database table.
 * 
 */
@Entity
@Table(name="DIM_CCOE_ORDER_CANCEL_REASON")
@NamedQuery(name="DimCcoeOrderCancelReason.findAll", query="SELECT d FROM DimCcoeOrderCancelReason d")
public class DimCcoeOrderCancelReason implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ORDER_CANCEL_REASON_SID")
	private Integer orderCancelReasonSid;

	@Column(name="ORDER_CANCEL_REASON_CODE")
	private String orderCancelReasonCode;

	@Column(name="ORDER_CANCEL_REASON_DESC")
	private String orderCancelReasonDesc;
	
	public static HashMap<String,Integer> mappingInfo = new HashMap<String,Integer>(){
		{
			put("orderCancelReasonSid",0);
			put("orderCancelReasonCode",1);
			put("orderCancelReasonDesc",2);
		}};
		public static Integer columnCount = 3;
	public DimCcoeOrderCancelReason() {
	}

	public int getOrderCancelReasonSid() {
		return this.orderCancelReasonSid;
	}

	public void setOrderCancelReasonSid(int orderCancelReasonSid) {
		this.orderCancelReasonSid = orderCancelReasonSid;
	}

	public String getOrderCancelReasonCode() {
		return this.orderCancelReasonCode;
	}

	public void setOrderCancelReasonCode(String orderCancelReasonCode) {
		this.orderCancelReasonCode = orderCancelReasonCode;
	}

	public String getOrderCancelReasonDesc() {
		return this.orderCancelReasonDesc;
	}

	public void setOrderCancelReasonDesc(String orderCancelReasonDesc) {
		this.orderCancelReasonDesc = orderCancelReasonDesc;
	}

}