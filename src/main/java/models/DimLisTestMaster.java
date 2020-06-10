package models;

import java.io.Serializable;
import java.util.Date;
import java.util.HashMap;

import javax.persistence.*;


/**
 * The persistent class for the DIM_LIS_TEST_MASTER database table.
 * 
 */
@Entity
@Table(name="DIM_LIS_TEST_MASTER")
@NamedQuery(name="DimLisTestMaster.findAll", query="SELECT d FROM DimLisTestMaster d")
public class DimLisTestMaster implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="TEST_MASTER_SID")
	private Integer testMasterSid;

	@Column(name="CHAPTER_CD")
	private String chapterCd;

	@Column(name="CHAPTER_DESC")
	private String chapterDesc;

	@Column(name="CODEDTEXTCLASS")
	private String codedtextclass;

	@Column(name="COMBPRINT")
	private Integer combprint;

	@Column(name="COMPOSITIONCLASS")
	private String compositionclass;

	@Column(name="CONSUMABLE")
	private String consumable;

	@Column(name="CUMVOLUME")
	private Integer cumvolume;

	@Column(name="DAYMETHODISPERF")
	private Integer daymethodisperf;

	@Column(name="[DISPLAY]")
	private Integer display;

	@Column(name="DUPLICATERESULT")
	private Integer duplicateresult;

	@Column(name="ENDVALIDDATE")
	private Date endvaliddate;

	@Column(name="FAMILY")
	private String family;

	@Column(name="FULLTEXT")
	private String fulltext;

	@Column(name="HOSTCODE")
	private String hostcode;

	@Column(name="ICRCODE")
	private String icrcode;

	@Column(name="INTERNATIONALCODE")
	private String internationalcode;

	@Column(name="KEYLETTERCODE")
	private String keylettercode;

	@Column(name="LAB_DISCIPLINE_CD")
	private String labDisciplineCd;

	@Column(name="LAB_DISCIPLINE_DESC")
	private String labDisciplineDesc;

	@Column(name="LISTESTCODE")
	private String listestcode;

	@Column(name="MICROBIOTESTTYPE")
	private Integer microbiotesttype;

	@Column(name="MULTIPLERANGES")
	private Integer multipleranges;

	@Column(name="NBKEYLETTER")
	private String nbkeyletter;

	@Column(name="OPERAND")
	private Integer operand;

	@Column(name="PERFORMANCEDURATION")
	private Integer performanceduration;

	@Column(name="PERFORMANCEUNIT")
	private Integer performanceunit;

	@Column(name="PRECISION2RELATED")
	private Integer precision2related;

	@Column(name="PRECISIONRELATED")
	private Integer precisionrelated;

	@Column(name="RESDEFAULT")
	private String resdefault;

	@Column(name="RESPRECISION")
	private Integer resprecision;

	@Column(name="RESPRECISION2")
	private Integer resprecision2;

	@Column(name="RESTYPE")
	private Integer restype;

	@Column(name="RESTYPEDEFAULT")
	private Integer restypedefault;

	@Column(name="SECRETTEST")
	private Integer secrettest;

	@Column(name="SEX")
	private Integer sex;

	@Column(name="SHORTTEXT")
	private Integer shorttext;

	@Column(name="SOFTCONVERSION")
	private Integer softconversion;

	@Column(name="STARTVALIDDATE")
	private Date startvaliddate;

	@Column(name="STATVALUE")
	private String statvalue;

	@Column(name="TEST_ID")
	private Integer testId;

	@Column(name="TESTCLASS")
	private String testclass;

	@Column(name="TESTCODE")
	private String testcode;

	@Column(name="TESTCREDATE")
	private Integer testcredate;

	@Column(name="TESTRANK")
	private Integer testrank;

	@Column(name="TESTTYPE")
	private Integer testtype;

	@Column(name="UNITS")
	private String units;

	@Column(name="UNITS2")
	private String units2;

	@Column(name="VALIDATIONMANDATORY")
	private Integer validationmandatory;

	@Column(name="VALLOWLIMIT")
	private String vallowlimit;

	@Column(name="VALUPPLIMIT")
	private String valupplimit;

	@Column(name="VOLUME")
	private Integer volume;

	public static HashMap<String,Integer> mappingInfo = new HashMap<String,Integer>(){
		{
			put("testMasterSid",0);
			put("chapterCd",1);
			put("chapterDesc",2);
			put("codedtextclass",3);
			put("combprint",4);
			put("compositionclass",5);
			put("consumable",6);
			put("cumvolume",7);
			put("daymethodisperf",8);
			put("display",9);
			put("duplicateresult",10);
			put("endvaliddate",11);
			put("family",12);
			put("fulltext",13);
			put("hostcode",14);
			put("icrcode",15);
			put("internationalcode",16);
			put("keylettercode",17);
			put("labDisciplineCd",18);
			put("labDisciplineDesc",19);
			put("listestcode",20);
			put("microbiotesttype",21);
			put("multipleranges",22);
			put("nbkeyletter",23);
			put("operand",24);
			put("performanceduration",25);
			put("performanceunit",26);
			put("precision2related",27);
			put("precisionrelated",28);
			put("resdefault",29);
			put("resprecision",30);
			put("resprecision2",31);
			put("restype",32);
			put("restypedefault",33);
			put("secrettest",34);
			put("sex",35);
			put("shorttext",36);
			put("softconversion",37);
			put("startvaliddate",38);
			put("statvalue",39);
			put("testId",40);
			put("testclass",41);
			put("testcode",42);
			put("testcredate",43);
			put("testrank",44);
			put("testtype",45);
			put("units",46);
			put("units2",47);
			put("validationmandatory",48);
			put("vallowlimit",49);
			put("valupplimit",50);
			put("volume",51);
		}};
		public static Integer columnCount = 52;
	public DimLisTestMaster() {
	}

	public Integer getTestMasterSid() {
		return this.testMasterSid;
	}

	public void setTestMasterSid(Integer testMasterSid) {
		this.testMasterSid = testMasterSid;
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

	public String getCodedtextclass() {
		return this.codedtextclass;
	}

	public void setCodedtextclass(String codedtextclass) {
		this.codedtextclass = codedtextclass;
	}

	public Integer getCombprint() {
		return this.combprint;
	}

	public void setCombprint(Integer combprint) {
		this.combprint = combprint;
	}

	public String getCompositionclass() {
		return this.compositionclass;
	}

	public void setCompositionclass(String compositionclass) {
		this.compositionclass = compositionclass;
	}

	public String getConsumable() {
		return this.consumable;
	}

	public void setConsumable(String consumable) {
		this.consumable = consumable;
	}

	public Integer getCumvolume() {
		return this.cumvolume;
	}

	public void setCumvolume(Integer cumvolume) {
		this.cumvolume = cumvolume;
	}

	public Integer getDaymethodisperf() {
		return this.daymethodisperf;
	}

	public void setDaymethodisperf(Integer daymethodisperf) {
		this.daymethodisperf = daymethodisperf;
	}

	public Integer getDisplay() {
		return this.display;
	}

	public void setDisplay(Integer display) {
		this.display = display;
	}

	public Integer getDuplicateresult() {
		return this.duplicateresult;
	}

	public void setDuplicateresult(Integer duplicateresult) {
		this.duplicateresult = duplicateresult;
	}

	public Object getEndvaliddate() {
		return this.endvaliddate;
	}

	public void setEndvaliddate(Date endvaliddate) {
		this.endvaliddate = endvaliddate;
	}

	public String getFamily() {
		return this.family;
	}

	public void setFamily(String family) {
		this.family = family;
	}

	public String getFulltext() {
		return this.fulltext;
	}

	public void setFulltext(String fulltext) {
		this.fulltext = fulltext;
	}

	public String getHostcode() {
		return this.hostcode;
	}

	public void setHostcode(String hostcode) {
		this.hostcode = hostcode;
	}

	public String getIcrcode() {
		return this.icrcode;
	}

	public void setIcrcode(String icrcode) {
		this.icrcode = icrcode;
	}

	public String getInternationalcode() {
		return this.internationalcode;
	}

	public void setInternationalcode(String internationalcode) {
		this.internationalcode = internationalcode;
	}

	public String getKeylettercode() {
		return this.keylettercode;
	}

	public void setKeylettercode(String keylettercode) {
		this.keylettercode = keylettercode;
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

	public String getListestcode() {
		return this.listestcode;
	}

	public void setListestcode(String listestcode) {
		this.listestcode = listestcode;
	}

	public Integer getMicrobiotesttype() {
		return this.microbiotesttype;
	}

	public void setMicrobiotesttype(Integer microbiotesttype) {
		this.microbiotesttype = microbiotesttype;
	}

	public Integer getMultipleranges() {
		return this.multipleranges;
	}

	public void setMultipleranges(Integer multipleranges) {
		this.multipleranges = multipleranges;
	}

	public String getNbkeyletter() {
		return this.nbkeyletter;
	}

	public void setNbkeyletter(String nbkeyletter) {
		this.nbkeyletter = nbkeyletter;
	}

	public Integer getOperand() {
		return this.operand;
	}

	public void setOperand(Integer operand) {
		this.operand = operand;
	}

	public Integer getPerformanceduration() {
		return this.performanceduration;
	}

	public void setPerformanceduration(Integer performanceduration) {
		this.performanceduration = performanceduration;
	}

	public Integer getPerformanceunit() {
		return this.performanceunit;
	}

	public void setPerformanceunit(Integer performanceunit) {
		this.performanceunit = performanceunit;
	}

	public Integer getPrecision2related() {
		return this.precision2related;
	}

	public void setPrecision2related(Integer precision2related) {
		this.precision2related = precision2related;
	}

	public Integer getPrecisionrelated() {
		return this.precisionrelated;
	}

	public void setPrecisionrelated(Integer precisionrelated) {
		this.precisionrelated = precisionrelated;
	}

	public String getResdefault() {
		return this.resdefault;
	}

	public void setResdefault(String resdefault) {
		this.resdefault = resdefault;
	}

	public Integer getResprecision() {
		return this.resprecision;
	}

	public void setResprecision(Integer resprecision) {
		this.resprecision = resprecision;
	}

	public Integer getResprecision2() {
		return this.resprecision2;
	}

	public void setResprecision2(Integer resprecision2) {
		this.resprecision2 = resprecision2;
	}

	public Integer getRestype() {
		return this.restype;
	}

	public void setRestype(Integer restype) {
		this.restype = restype;
	}

	public Integer getRestypedefault() {
		return this.restypedefault;
	}

	public void setRestypedefault(Integer restypedefault) {
		this.restypedefault = restypedefault;
	}

	public Integer getSecrettest() {
		return this.secrettest;
	}

	public void setSecrettest(Integer secrettest) {
		this.secrettest = secrettest;
	}

	public Integer getSex() {
		return this.sex;
	}

	public void setSex(Integer sex) {
		this.sex = sex;
	}

	public Integer getShorttext() {
		return this.shorttext;
	}

	public void setShorttext(Integer shorttext) {
		this.shorttext = shorttext;
	}

	public Integer getSoftconversion() {
		return this.softconversion;
	}

	public void setSoftconversion(Integer softconversion) {
		this.softconversion = softconversion;
	}

	public Object getStartvaliddate() {
		return this.startvaliddate;
	}

	public void setStartvaliddate(Date startvaliddate) {
		this.startvaliddate = startvaliddate;
	}

	public String getStatvalue() {
		return this.statvalue;
	}

	public void setStatvalue(String statvalue) {
		this.statvalue = statvalue;
	}

	public Integer getTestId() {
		return this.testId;
	}

	public void setTestId(Integer testId) {
		this.testId = testId;
	}

	public String getTestclass() {
		return this.testclass;
	}

	public void setTestclass(String testclass) {
		this.testclass = testclass;
	}

	public String getTestcode() {
		return this.testcode;
	}

	public void setTestcode(String testcode) {
		this.testcode = testcode;
	}

	public Integer getTestcredate() {
		return this.testcredate;
	}

	public void setTestcredate(Integer testcredate) {
		this.testcredate = testcredate;
	}

	public Integer getTestrank() {
		return this.testrank;
	}

	public void setTestrank(Integer testrank) {
		this.testrank = testrank;
	}

	public Integer getTesttype() {
		return this.testtype;
	}

	public void setTesttype(Integer testtype) {
		this.testtype = testtype;
	}

	public String getUnits() {
		return this.units;
	}

	public void setUnits(String units) {
		this.units = units;
	}

	public String getUnits2() {
		return this.units2;
	}

	public void setUnits2(String units2) {
		this.units2 = units2;
	}

	public Integer getValidationmandatory() {
		return this.validationmandatory;
	}

	public void setValidationmandatory(Integer validationmandatory) {
		this.validationmandatory = validationmandatory;
	}

	public String getVallowlimit() {
		return this.vallowlimit;
	}

	public void setVallowlimit(String vallowlimit) {
		this.vallowlimit = vallowlimit;
	}

	public String getValupplimit() {
		return this.valupplimit;
	}

	public void setValupplimit(String valupplimit) {
		this.valupplimit = valupplimit;
	}

	public Integer getVolume() {
		return this.volume;
	}

	public void setVolume(Integer volume) {
		this.volume = volume;
	}

}