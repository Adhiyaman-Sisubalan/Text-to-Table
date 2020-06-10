package models;

import java.io.Serializable;
import java.util.HashMap;

import javax.persistence.*;


/**
 * The persistent class for the DIM_CUSTOMER database table.
 * 
 */
@Entity
@Table(name="DIM_CUSTOMER")
@NamedQuery(name="DimCustomer.findAll", query="SELECT d FROM DimCustomer d")
public class DimCustomer implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="CUSTOMER_KEY")
	private Integer customerKey;

	@Column(name="CUSTOMER_NAME1")
	private String customerName1;

	@Column(name="CUSTOMER_NAME2")
	private String customerName2;

	@Column(name="CUSTOMER_NO")
	private String customerNo;

	public static HashMap<String,Integer> mappingInfo = new HashMap<String,Integer>(){
		{
			put("customerKey",0);
			put("customerName1",1);
			put("customerName2",2);
			put("customerNo",3);
		}};
		public static Integer columnCount = 4;
	public DimCustomer() {
	}

	public int getCustomerKey() {
		return this.customerKey;
	}

	public void setCustomerKey(int customerKey) {
		this.customerKey = customerKey;
	}

	public String getCustomerName1() {
		return this.customerName1;
	}

	public void setCustomerName1(String customerName1) {
		this.customerName1 = customerName1;
	}

	public String getCustomerName2() {
		return this.customerName2;
	}

	public void setCustomerName2(String customerName2) {
		this.customerName2 = customerName2;
	}

	public String getCustomerNo() {
		return this.customerNo;
	}

	public void setCustomerNo(String customerNo) {
		this.customerNo = customerNo;
	}

}