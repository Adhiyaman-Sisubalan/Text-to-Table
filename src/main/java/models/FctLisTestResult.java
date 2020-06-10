package models;

import java.io.Serializable;
import java.util.Date;
import java.util.HashMap;

import javax.persistence.*;


/**
 * The persistent class for the FCT_LIS_TEST_RESULT database table.
 * 
 */
@Entity
@Table(name="FCT_LIS_TEST_RESULT")
@NamedQuery(name="FctLisTestResult.findAll", query="SELECT f FROM FctLisTestResult f")
public class FctLisTestResult implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private FctLisTestResultPK id;

	@Column(name="CANCEL_IND")
	private String cancelInd;

	@Column(name="CHAPTER_CD")
	private String chapterCd;

	@Column(name="CHAPTER_DESC")
	private String chapterDesc;

	@Column(name="[DEPTH]")
	private String depth;

	@Column(name="FULLTEXT")
	private String fulltext;

	@Column(name="HH_RANGE")
	private String hhRange;

	@Column(name="HOSPITINT")
	private String hospitint;

	@Column(name="LAB_DISCIPLINE_CD")
	private String labDisciplineCd;

	@Column(name="LAB_DISCIPLINE_DESC")
	private String labDisciplineDesc;

	@Column(name="LASTUPDTESTDATE")
	private Date lastupdtestdate;

	@Column(name="LL_RANGE")
	private String llRange;

	@Column(name="MAXIMUM_RANGE")
	private String maximumRange;

	@Column(name="MINIMUM_RANGE")
	private String minimumRange;

	@Column(name="NOTPRINTABLE")
	private Integer notprintable;

	@Column(name="PANEL_TEST_CODE")
	private String panelTestCode;

	@Column(name="RECEIVED_DT_SID")
	private Integer receivedDtSid;

	@Column(name="REQUESTABLE")
	private Integer requestable;

	@Column(name="RESULT_STATUS")
	private String resultStatus;

	@Column(name="RESULT_TEST_DATE")
	private Date resultTestDate;

	@Column(name="RESULT_TYPE")
	private String resultType;

	@Column(name="SHORTTEXT")
	private String shorttext;

	@Column(name="STATION_NAME")
	private String stationName;

	@Column(name="TEST_MASTER_SID")
	private Integer testMasterSid;

	@Column(name="TEST_RESULT")
	private String testResult;

	@Column(name="TESTCODE")
	private String testcode;

	@Column(name="TESTORDER")
	private Integer testorder;

	@Column(name="URGENCY_STATUS")
	private Integer urgencyStatus;

	public static HashMap<String,Integer> mappingInfo = new HashMap<String,Integer>(){
		{
			put("id",-1);
			
			
			put("cancelInd",3);
			put("chapterCd",4);
			put("chapterDesc",5);
			put("depth",6);
			put("fulltext",7);
			put("hhRange",8);
			put("hospitnumber",9);
			put("labDisciplineCd",10);
			put("labDisciplineDesc",11);
			put("lastupdtestdate",12);
			put("llRange",13);
			put("maximumRange",14);
			put("minimumRange",15);
			put("notprintable",16);
			put("panelTestCode",17);
			put("receivedDtSid",18);
			put("requestable",19);
			put("resultStatus",20);
			put("resultTestDate",21);
			put("resultType",22);
			put("shorttext",23);
			put("stationName",24);
			put("testMasterSid",25);
			put("testResult",26);
			put("testcode",27);
			put("testorder",28);
			put("urgencyStatus",29);
			
		}};
	public static Integer columnCount = 30;
	public FctLisTestResult() {
	}

	public FctLisTestResultPK getId() {
		return this.id;
	}

	public void setId(FctLisTestResultPK id) {
		this.id = id;
	}

	public String getCancelInd() {
		return this.cancelInd;
	}

	public void setCancelInd(String cancelInd) {
		this.cancelInd = cancelInd;
	}

	public String getChapterCd() {
		return this.chapterCd;
	}

	public void setChapterCd(String chapterCd) {
		this.chapterCd = chapterCd;
	}

	public String getChapterDesc() {
		return this.chapterDesc;
	}

	public void setChapterDesc(String chapterDesc) {
		this.chapterDesc = chapterDesc;
	}

	public String getDepth() {
		return this.depth;
	}

	public void setDepth(String depth) {
		this.depth = depth;
	}

	public String getFulltext() {
		return this.fulltext;
	}

	public void setFulltext(String fulltext) {
		this.fulltext = fulltext;
	}

	public String getHhRange() {
		return this.hhRange;
	}

	public void setHhRange(String hhRange) {
		this.hhRange = hhRange;
	}

	public String getHospitint() {
		return this.hospitint;
	}

	public void setHospitint(String hospitint) {
		this.hospitint = hospitint;
	}

	public String getLabDisciplineCd() {
		return this.labDisciplineCd;
	}

	public void setLabDisciplineCd(String labDisciplineCd) {
		this.labDisciplineCd = labDisciplineCd;
	}

	public String getLabDisciplineDesc() {
		return this.labDisciplineDesc;
	}

	public void setLabDisciplineDesc(String labDisciplineDesc) {
		this.labDisciplineDesc = labDisciplineDesc;
	}

	public Date getLastupdtestdate() {
		return this.lastupdtestdate;
	}

	public void setLastupdtestdate(Date lastupdtestdate) {
		this.lastupdtestdate = lastupdtestdate;
	}

	public String getLlRange() {
		return this.llRange;
	}

	public void setLlRange(String llRange) {
		this.llRange = llRange;
	}

	public String getMaximumRange() {
		return this.maximumRange;
	}

	public void setMaximumRange(String maximumRange) {
		this.maximumRange = maximumRange;
	}

	public String getMinimumRange() {
		return this.minimumRange;
	}

	public void setMinimumRange(String minimumRange) {
		this.minimumRange = minimumRange;
	}

	public int getNotprintable() {
		return this.notprintable;
	}

	public void setNotprintable(int notprintable) {
		this.notprintable = notprintable;
	}

	public String getPanelTestCode() {
		return this.panelTestCode;
	}

	public void setPanelTestCode(String panelTestCode) {
		this.panelTestCode = panelTestCode;
	}

	public int getReceivedDtSid() {
		return this.receivedDtSid;
	}

	public void setReceivedDtSid(int receivedDtSid) {
		this.receivedDtSid = receivedDtSid;
	}

	public int getRequestable() {
		return this.requestable;
	}

	public void setRequestable(int requestable) {
		this.requestable = requestable;
	}

	public String getResultStatus() {
		return this.resultStatus;
	}

	public void setResultStatus(String resultStatus) {
		this.resultStatus = resultStatus;
	}

	public Date getResultTestDate() {
		return this.resultTestDate;
	}

	public void setResultTestDate(Date resultTestDate) {
		this.resultTestDate = resultTestDate;
	}

	public String getResultType() {
		return this.resultType;
	}

	public void setResultType(String resultType) {
		this.resultType = resultType;
	}

	public String getShorttext() {
		return this.shorttext;
	}

	public void setShorttext(String shorttext) {
		this.shorttext = shorttext;
	}

	public String getStationName() {
		return this.stationName;
	}

	public void setStationName(String stationName) {
		this.stationName = stationName;
	}

	public int getTestMasterSid() {
		return this.testMasterSid;
	}

	public void setTestMasterSid(int testMasterSid) {
		this.testMasterSid = testMasterSid;
	}

	public String getTestResult() {
		return this.testResult;
	}

	public void setTestResult(String testResult) {
		this.testResult = testResult;
	}

	public String getTestcode() {
		return this.testcode;
	}

	public void setTestcode(String testcode) {
		this.testcode = testcode;
	}

	public int getTestorder() {
		return this.testorder;
	}

	public void setTestorder(int testorder) {
		this.testorder = testorder;
	}

	public int getUrgencyStatus() {
		return this.urgencyStatus;
	}

	public void setUrgencyStatus(int urgencyStatus) {
		this.urgencyStatus = urgencyStatus;
	}

}