package models;

import java.io.Serializable;
import java.util.Date;
import java.util.HashMap;

import javax.persistence.*;


/**
 * The persistent class for the DIM_DATE database table.
 * 
 */
@Entity
@Table(name="DIM_DATE")
@NamedQuery(name="DimDate.findAll", query="SELECT d FROM DimDate d")
public class DimDate implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="DATE_KEY")
	private Integer dateKey;

	@Column(name="CALENDAR_DATE")
	private Date calendarDate;

	@Column(name="CALENDAR_MON_YR")
	private String calendarMonYr;

	@Column(name="CALENDAR_MTH_NAME")
	private String calendarMthName;

	@Column(name="CALENDAR_MTH_NUM_IN_YR")
	private Integer calendarMthNumInYr;

	@Column(name="CALENDAR_WK_NUM_IN_YR")
	private Integer calendarWkNumInYr;

	@Column(name="CALENDAR_YR")
	private Integer calendarYr;

	@Column(name="CALENDAR_YR_MTH")
	private String calendarYrMth;

	@Column(name="CALENDAR_YR_QTR")
	private String calendarYrQtr;

	@Column(name="DAY_NUM_IN_WK")
	private Integer dayNumInWk;

	@Column(name="DAY_OF_WK")
	private String dayOfWk;

	@Column(name="FISCAL_YR")
	private String fiscalYr;

	@Column(name="FISCAL_YR_QTR")
	private String fiscalYrQtr;

	@Column(name="LAST_DAY_IN_MTH_IND")
	private String lastDayInMthInd;

	public static HashMap<String,Integer> mappingInfo = new HashMap<String,Integer>(){
		{
			put("dateKey",0);
			put("calendarDate",1);
			put("calendarMonYr",2);
			put("calendarMthName",3);
			put("calendarMthNumInYr",4);
			put("calendarWkNumInYr",5);
			put("calendarYr",6);
			put("calendarYrMth",7);
			put("calendarYrQtr",8);
			put("dayNumInWk",9);
			put("dayOfWk",10);
			put("fiscalYr",11);
			put("fiscalYrQtr",12);
			put("lastDayInMthInd",13);
		}};
		public static Integer columnCount = 14;
	public DimDate() {
	}

	public int getDateKey() {
		return this.dateKey;
	}

	public void setDateKey(int dateKey) {
		this.dateKey = dateKey;
	}

	public Date getCalendarDate() {
		return this.calendarDate;
	}

	public void setCalendarDate(Date calendarDate) {
		this.calendarDate = calendarDate;
	}

	public String getCalendarMonYr() {
		return this.calendarMonYr;
	}

	public void setCalendarMonYr(String calendarMonYr) {
		this.calendarMonYr = calendarMonYr;
	}

	public String getCalendarMthName() {
		return this.calendarMthName;
	}

	public void setCalendarMthName(String calendarMthName) {
		this.calendarMthName = calendarMthName;
	}

	public int getCalendarMthNumInYr() {
		return this.calendarMthNumInYr;
	}

	public void setCalendarMthNumInYr(int calendarMthNumInYr) {
		this.calendarMthNumInYr = calendarMthNumInYr;
	}

	public int getCalendarWkNumInYr() {
		return this.calendarWkNumInYr;
	}

	public void setCalendarWkNumInYr(int calendarWkNumInYr) {
		this.calendarWkNumInYr = calendarWkNumInYr;
	}

	public int getCalendarYr() {
		return this.calendarYr;
	}

	public void setCalendarYr(Integer calendarYr) {
		this.calendarYr = calendarYr;
	}

	public String getCalendarYrMth() {
		return this.calendarYrMth;
	}

	public void setCalendarYrMth(String calendarYrMth) {
		this.calendarYrMth = calendarYrMth;
	}

	public String getCalendarYrQtr() {
		return this.calendarYrQtr;
	}

	public void setCalendarYrQtr(String calendarYrQtr) {
		this.calendarYrQtr = calendarYrQtr;
	}

	public int getDayNumInWk() {
		return this.dayNumInWk;
	}

	public void setDayNumInWk(Integer dayNumInWk) {
		this.dayNumInWk = dayNumInWk;
	}

	public String getDayOfWk() {
		return this.dayOfWk;
	}

	public void setDayOfWk(String dayOfWk) {
		this.dayOfWk = dayOfWk;
	}

	public String getFiscalYr() {
		return this.fiscalYr;
	}

	public void setFiscalYr(String fiscalYr) {
		this.fiscalYr = fiscalYr;
	}

	public String getFiscalYrQtr() {
		return this.fiscalYrQtr;
	}

	public void setFiscalYrQtr(String fiscalYrQtr) {
		this.fiscalYrQtr = fiscalYrQtr;
	}

	public String getLastDayInMthInd() {
		return this.lastDayInMthInd;
	}

	public void setLastDayInMthInd(String lastDayInMthInd) {
		this.lastDayInMthInd = lastDayInMthInd;
	}

}