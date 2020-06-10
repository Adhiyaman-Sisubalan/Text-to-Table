package models;

import java.io.Serializable;
import java.util.HashMap;

import javax.persistence.*;


/**
 * The persistent class for the DIM_CCOE_ORDER_PRIORITY database table.
 * 
 */
@Entity
@Table(name="DIM_CCOE_ORDER_PRIORITY")
@NamedQuery(name="DimCcoeOrderPriority.findAll", query="SELECT d FROM DimCcoeOrderPriority d")
public class DimCcoeOrderPriority implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ORDER_PRIORITY_SID")
	private Integer orderPrioritySid;

	@Column(name="ORDER_PRIORITY_CODE")
	private String orderPriorityCode;

	@Column(name="ORDER_PRIORITY_DESC")
	private String orderPriorityDesc;

	
	public static HashMap<String,Integer> mappingInfo = new HashMap<String,Integer>(){
		{
			put("orderPrioritySid",0);
			put("orderPriorityCode",1);
			put("orderPriorityDesc",2);
		}};
		public static Integer columnCount = 3;
	public DimCcoeOrderPriority() {
	}

	public int getOrderPrioritySid() {
		return this.orderPrioritySid;
	}

	public void setOrderPrioritySid(int orderPrioritySid) {
		this.orderPrioritySid = orderPrioritySid;
	}

	public String getOrderPriorityCode() {
		return this.orderPriorityCode;
	}

	public void setOrderPriorityCode(String orderPriorityCode) {
		this.orderPriorityCode = orderPriorityCode;
	}

	public String getOrderPriorityDesc() {
		return this.orderPriorityDesc;
	}

	public void setOrderPriorityDesc(String orderPriorityDesc) {
		this.orderPriorityDesc = orderPriorityDesc;
	}

}