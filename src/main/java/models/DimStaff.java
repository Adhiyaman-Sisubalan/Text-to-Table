package models;

import java.io.Serializable;
import java.util.HashMap;

import javax.persistence.*;


/**
 * The persistent class for the DIM_STAFF database table.
 * 
 */
@Entity
@Table(name="DIM_STAFF")
@NamedQuery(name="DimStaff.findAll", query="SELECT d FROM DimStaff d")
public class DimStaff implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="STAFF_KEY")
	private Integer staffKey;

	@Column(name="FIRST_NAME")
	private String firstName;

	@Column(name="LAST_NAME")
	private String lastName;

	@Column(name="STAFF_CD")
	private String staffCd;

	@Column(name="STAFF_MCR_NO")
	private String staffMcrNo;

	@Column(name="STAFF_NAME")
	private String staffName;

	@Column(name="STAFF_RANK_CD")
	private String staffRankCd;

	public static HashMap<String,Integer> mappingInfo = new HashMap<String,Integer>(){
		{
			put("staffKey",0);
			put("firstName",1);
			put("lastName",2);
			put("staffCd",3);
			put("staffMcrNo",4);
			put("staffName",5);
			put("staffRankCd",6);
			
		}};
		public static Integer columnCount = 7;
	public DimStaff() {
	}

	public int getStaffKey() {
		return this.staffKey;
	}

	public void setStaffKey(int staffKey) {
		this.staffKey = staffKey;
	}

	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getStaffCd() {
		return this.staffCd;
	}

	public void setStaffCd(String staffCd) {
		this.staffCd = staffCd;
	}

	public String getStaffMcrNo() {
		return this.staffMcrNo;
	}

	public void setStaffMcrNo(String staffMcrNo) {
		this.staffMcrNo = staffMcrNo;
	}

	public String getStaffName() {
		return this.staffName;
	}

	public void setStaffName(String staffName) {
		this.staffName = staffName;
	}

	public String getStaffRankCd() {
		return this.staffRankCd;
	}

	public void setStaffRankCd(String staffRankCd) {
		this.staffRankCd = staffRankCd;
	}

}