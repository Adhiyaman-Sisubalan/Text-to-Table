package models;

import java.io.Serializable;
import java.util.HashMap;

import javax.persistence.*;


/**
 * The persistent class for the DIM_EIMR_STDSCHEDULE database table.
 * 
 */
@Entity
@Table(name="DIM_EIMR_STDSCHEDULE")
@NamedQuery(name="DimEimrStdschedule.findAll", query="SELECT d FROM DimEimrStdschedule d")
public class DimEimrStdschedule implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="EIMR_STDSCHEDULE_SID")
	private Integer eimrStdscheduleSid;

	@Column(name="STD_SCHEDULE_CODE")
	private String stdScheduleCode;

	@Column(name="STD_SCHEDULE_DESC")
	private String stdScheduleDesc;

	public static HashMap<String,Integer> mappingInfo = new HashMap<String,Integer>(){
		{
			put("eimrStdscheduleSid",0);
			put("stdScheduleCode",1);
			put("stdScheduleDesc",2);
		}};
		public static Integer columnCount = 3;
	public DimEimrStdschedule() {
	}

	public int getEimrStdscheduleSid() {
		return this.eimrStdscheduleSid;
	}

	public void setEimrStdscheduleSid(int eimrStdscheduleSid) {
		this.eimrStdscheduleSid = eimrStdscheduleSid;
	}

	public String getStdScheduleCode() {
		return this.stdScheduleCode;
	}

	public void setStdScheduleCode(String stdScheduleCode) {
		this.stdScheduleCode = stdScheduleCode;
	}

	public String getStdScheduleDesc() {
		return this.stdScheduleDesc;
	}

	public void setStdScheduleDesc(String stdScheduleDesc) {
		this.stdScheduleDesc = stdScheduleDesc;
	}

}