package models;

import java.io.Serializable;
import java.util.Date;
import java.util.HashMap;

import javax.persistence.*;


/**
 * The persistent class for the DIM_LIS_SERVICE_MAPPING database table.
 * 
 */
@Entity
@Table(name="DIM_LIS_SERVICE_MAPPING")
@NamedQuery(name="DimLisServiceMapping.findAll", query="SELECT d FROM DimLisServiceMapping d")
public class DimLisServiceMapping implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="LIS_SERVICE_MAPPING_SID")
	private Integer lisServiceMappingSid;

	@Column(name="EFFECTIVE_END_DATE")
	private Date effectiveEndDate;

	@Column(name="EFFECTIVE_START_DATE")
	private Date effectiveStartDate;

	@Column(name="ICR_CODE")
	private String icrCode;

	@Column(name="LIS_TEST_CODE")
	private String lisTestCode;

	@Column(name="NBBILLU")
	private Integer nbbillu;

	@Column(name="SERVICE_CD")
	private String serviceCd;

	@Column(name="TEST_CODE")
	private String testCode;

	@Column(name="TEST_TYPE")
	private Integer testType;

	public static HashMap<String,Integer> mappingInfo = new HashMap<String,Integer>(){
		{
			put("lisServiceMappingSid",0);
			put("effectiveEndDate",1);
			put("effectiveStartDate",2);
			put("icrCode",3);
			put("lisTestCode",4);
			put("nbbillu",5);
			put("serviceCd",6);
			put("testCode",7);
			put("testType",8);
		}};
		public static Integer columnCount = 9;
	public DimLisServiceMapping() {
	}

	public int getLisServiceMappingSid() {
		return this.lisServiceMappingSid;
	}

	public void setLisServiceMappingSid(int lisServiceMappingSid) {
		this.lisServiceMappingSid = lisServiceMappingSid;
	}

	public Object getEffectiveEndDate() {
		return this.effectiveEndDate;
	}

	public void setEffectiveEndDate(Date effectiveEndDate) {
		this.effectiveEndDate = effectiveEndDate;
	}

	public Object getEffectiveStartDate() {
		return this.effectiveStartDate;
	}

	public void setEffectiveStartDate(Date effectiveStartDate) {
		this.effectiveStartDate = effectiveStartDate;
	}

	public String getIcrCode() {
		return this.icrCode;
	}

	public void setIcrCode(String icrCode) {
		this.icrCode = icrCode;
	}

	public String getLisTestCode() {
		return this.lisTestCode;
	}

	public void setLisTestCode(String lisTestCode) {
		this.lisTestCode = lisTestCode;
	}

	public int getNbbillu() {
		return this.nbbillu;
	}

	public void setNbbillu(int nbbillu) {
		this.nbbillu = nbbillu;
	}

	public String getServiceCd() {
		return this.serviceCd;
	}

	public void setServiceCd(String serviceCd) {
		this.serviceCd = serviceCd;
	}

	public String getTestCode() {
		return this.testCode;
	}

	public void setTestCode(String testCode) {
		this.testCode = testCode;
	}

	public int getTestType() {
		return this.testType;
	}

	public void setTestType(int testType) {
		this.testType = testType;
	}

}