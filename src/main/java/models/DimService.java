package models;

import java.io.Serializable;
import java.util.HashMap;

import javax.persistence.*;


/**
 * The persistent class for the DIM_SERVICE database table.
 * 
 */
@Entity
@Table(name="DIM_SERVICE")
@NamedQuery(name="DimService.findAll", query="SELECT d FROM DimService d")
public class DimService implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="SERVICE_KEY")
	private Integer serviceKey;

	@Column(name="CO_RELEVANT_IND")
	private String coRelevantInd;

	@Column(name="EXT_CHARGE_TYPE")
	private String extChargeType;

	@Column(name="EXTENDED_SERVICE_IND")
	private String extendedServiceInd;

	@Column(name="NST_DRUG_IND")
	private String nstDrugInd;

	@Column(name="OPERATION_TABLE_CD")
	private String operationTableCd;

	@Column(name="PRICE_TYPE")
	private String priceType;

	@Column(name="SERVICE_CAT_2_CD")
	private String serviceCat2Cd;

	@Column(name="SERVICE_CAT_CD")
	private String serviceCatCd;

	@Column(name="SERVICE_CAT_DESC")
	private String serviceCatDesc;

	@Column(name="SERVICE_CD")
	private String serviceCd;

	@Column(name="SERVICE_DESC")
	private String serviceDesc;

	@Column(name="SERVICE_GRP_CD")
	private String serviceGrpCd;

	@Column(name="SERVICE_GRP_DESC")
	private String serviceGrpDesc;

	@Column(name="SERVICE_SUMMARY_CD")
	private String serviceSummaryCd;

	public static HashMap<String,Integer> mappingInfo = new HashMap<String,Integer>(){
		{
			put("serviceKey",0);
			put("coRelevantInd",1);
			put("extChargeType",2);
			put("nstDrugInd",3);
			put("operationTableCd",4);
			put("priceType",5);
			put("serviceCat2Cd",6);
			put("serviceCatDesc",7);
			put("serviceCd",8);
			put("serviceDesc",9);
			put("serviceGrpCd",10);
			put("serviceGrpDesc",11);
			put("serviceSummaryCd",12);
			
			
		}};
		public static Integer columnCount = 13;
	public DimService() {
	}

	public int getServiceKey() {
		return this.serviceKey;
	}

	public void setServiceKey(int serviceKey) {
		this.serviceKey = serviceKey;
	}

	public String getCoRelevantInd() {
		return this.coRelevantInd;
	}

	public void setCoRelevantInd(String coRelevantInd) {
		this.coRelevantInd = coRelevantInd;
	}

	public String getExtChargeType() {
		return this.extChargeType;
	}

	public void setExtChargeType(String extChargeType) {
		this.extChargeType = extChargeType;
	}

	public String getExtendedServiceInd() {
		return this.extendedServiceInd;
	}

	public void setExtendedServiceInd(String extendedServiceInd) {
		this.extendedServiceInd = extendedServiceInd;
	}

	public String getNstDrugInd() {
		return this.nstDrugInd;
	}

	public void setNstDrugInd(String nstDrugInd) {
		this.nstDrugInd = nstDrugInd;
	}

	public String getOperationTableCd() {
		return this.operationTableCd;
	}

	public void setOperationTableCd(String operationTableCd) {
		this.operationTableCd = operationTableCd;
	}

	public String getPriceType() {
		return this.priceType;
	}

	public void setPriceType(String priceType) {
		this.priceType = priceType;
	}

	public String getServiceCat2Cd() {
		return this.serviceCat2Cd;
	}

	public void setServiceCat2Cd(String serviceCat2Cd) {
		this.serviceCat2Cd = serviceCat2Cd;
	}

	public String getServiceCatCd() {
		return this.serviceCatCd;
	}

	public void setServiceCatCd(String serviceCatCd) {
		this.serviceCatCd = serviceCatCd;
	}

	public String getServiceCatDesc() {
		return this.serviceCatDesc;
	}

	public void setServiceCatDesc(String serviceCatDesc) {
		this.serviceCatDesc = serviceCatDesc;
	}

	public String getServiceCd() {
		return this.serviceCd;
	}

	public void setServiceCd(String serviceCd) {
		this.serviceCd = serviceCd;
	}

	public String getServiceDesc() {
		return this.serviceDesc;
	}

	public void setServiceDesc(String serviceDesc) {
		this.serviceDesc = serviceDesc;
	}

	public String getServiceGrpCd() {
		return this.serviceGrpCd;
	}

	public void setServiceGrpCd(String serviceGrpCd) {
		this.serviceGrpCd = serviceGrpCd;
	}

	public String getServiceGrpDesc() {
		return this.serviceGrpDesc;
	}

	public void setServiceGrpDesc(String serviceGrpDesc) {
		this.serviceGrpDesc = serviceGrpDesc;
	}

	public String getServiceSummaryCd() {
		return this.serviceSummaryCd;
	}

	public void setServiceSummaryCd(String serviceSummaryCd) {
		this.serviceSummaryCd = serviceSummaryCd;
	}

}