package models;

import java.io.Serializable;
import java.util.HashMap;

import javax.persistence.*;


/**
 * The persistent class for the FCT_ENCOUNTER_AMT database table.
 * 
 */
@Entity
@Table(name="FCT_ENCOUNTER_AMT")
@NamedQuery(name="FctEncounterAmt.findAll", query="SELECT f FROM FctEncounterAmt f")
public class FctEncounterAmt implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ENC_KEY")
	private Integer encKey;

	@Column(name="ACUTE_GROSS_AMT")
	private Integer acuteGrossAmt;

	@Column(name="ACUTE_GROSS_TAX_AMT")
	private Integer acuteGrossTaxAmt;

	@Column(name="ACUTE_PAYABLE_AMT")
	private Integer acutePayableAmt;

	@Column(name="ACUTE_SUBSIDY_AMT")
	private Integer acuteSubsidyAmt;

	@Column(name="ACUTE_SURCHARGE_AMT")
	private Integer acuteSurchargeAmt;

	@Column(name="ACUTE_TAX_AMT")
	private Integer acuteTaxAmt;

	@Column(name="ACUTE_WAIVER_AMT")
	private Integer acuteWaiverAmt;

	@Column(name="AETXF_GROSS_AMT")
	private Integer aetxfGrossAmt;

	@Column(name="AETXF_GROSS_TAX_AMT")
	private Integer aetxfGrossTaxAmt;

	@Column(name="AETXF_PAYABLE_AMT")
	private Integer aetxfPayableAmt;

	@Column(name="AETXF_SUBSIDY_AMT")
	private Integer aetxfSubsidyAmt;

	@Column(name="AETXF_SURCHARGE_AMT")
	private Integer aetxfSurchargeAmt;

	@Column(name="AETXF_TAX_AMT")
	private Integer aetxfTaxAmt;

	@Column(name="AETXF_WAIVER_AMT")
	private Integer aetxfWaiverAmt;

	@Column(name="CANCEL_IND")
	private String cancelInd;

	@Column(name="HD_GROSS_AMT")
	private Integer hdGrossAmt;

	@Column(name="HD_GROSS_TAX_AMT")
	private Integer hdGrossTaxAmt;

	@Column(name="HD_PAYABLE_AMT")
	private Integer hdPayableAmt;

	@Column(name="HD_SUBSIDY_AMT")
	private Integer hdSubsidyAmt;

	@Column(name="HD_SURCHARGE_AMT")
	private Integer hdSurchargeAmt;

	@Column(name="HD_TAX_AMT")
	private Integer hdTaxAmt;

	@Column(name="HD_WAIVER_AMT")
	private Integer hdWaiverAmt;

	@Column(name="ICU_GROSS_AMT")
	private Integer icuGrossAmt;

	@Column(name="ICU_GROSS_TAX_AMT")
	private Integer icuGrossTaxAmt;

	@Column(name="ICU_PAYABLE_AMT")
	private Integer icuPayableAmt;

	@Column(name="ICU_SUBSIDY_AMT")
	private Integer icuSubsidyAmt;

	@Column(name="ICU_SURCHARGE_AMT")
	private Integer icuSurchargeAmt;

	@Column(name="ICU_TAX_AMT")
	private Integer icuTaxAmt;

	@Column(name="ICU_WAIVER_AMT")
	private Integer icuWaiverAmt;

	@Column(name="INSTITUTION_KEY")
	private Integer institutionKey;

	@Column(name="ISO_GROSS_AMT")
	private Integer isoGrossAmt;

	@Column(name="ISO_GROSS_TAX_AMT")
	private Integer isoGrossTaxAmt;

	@Column(name="ISO_PAYABLE_AMT")
	private Integer isoPayableAmt;

	@Column(name="ISO_SUBSIDY_AMT")
	private Integer isoSubsidyAmt;

	@Column(name="ISO_SURCHARGE_AMT")
	private Integer isoSurchargeAmt;

	@Column(name="ISO_TAX_AMT")
	private Integer isoTaxAmt;

	@Column(name="ISO_WAIVER_AMT")
	private Integer isoWaiverAmt;

	@Column(name="LOS_ACUTE_DAYS")
	private Integer losAcuteDays;

	@Column(name="LOS_DAYS")
	private Integer losDays;

	@Column(name="LOS_HD_DAYS")
	private Integer losHdDays;

	@Column(name="LOS_HOURS")
	private Integer losHours;

	@Column(name="LOS_ICU_DAYS")
	private Integer losIcuDays;

	@Column(name="LOS_LASTDAY_HOURS")
	private Integer losLastdayHours;

	@Column(name="LOS_REHAB_DAYS")
	private Integer losRehabDays;

	@Column(name="OPTXF_GROSS_AMT")
	private Integer optxfGrossAmt;

	@Column(name="OPTXF_GROSS_TAX_AMT")
	private Integer optxfGrossTaxAmt;

	@Column(name="OPTXF_PAYABLE_AMT")
	private Integer optxfPayableAmt;

	@Column(name="OPTXF_SUBSIDY_AMT")
	private Integer optxfSubsidyAmt;

	@Column(name="OPTXF_SURCHARGE_AMT")
	private Integer optxfSurchargeAmt;

	@Column(name="OPTXF_TAX_AMT")
	private Integer optxfTaxAmt;

	@Column(name="OPTXF_WAIVER_AMT")
	private Integer optxfWaiverAmt;

	@Column(name="REHAB_GROSS_AMT")
	private Integer rehabGrossAmt;

	@Column(name="REHAB_GROSS_TAX_AMT")
	private Integer rehabGrossTaxAmt;

	@Column(name="REHAB_PAYABLE_AMT")
	private Integer rehabPayableAmt;

	@Column(name="REHAB_SUBSIDY_AMT")
	private Integer rehabSubsidyAmt;

	@Column(name="REHAB_SURCHARGE_AMT")
	private Integer rehabSurchargeAmt;

	@Column(name="REHAB_TAX_AMT")
	private Integer rehabTaxAmt;

	@Column(name="REHAB_WAIVER_AMT")
	private Integer rehabWaiverAmt;

	@Column(name="SURGICAL_GROSS_AMT")
	private Integer surgicalGrossAmt;

	@Column(name="SURGICAL_GROSS_TAX_AMT")
	private Integer surgicalGrossTaxAmt;

	@Column(name="SURGICAL_PAYABLE_AMT")
	private Integer surgicalPayableAmt;

	@Column(name="SURGICAL_SUBSIDY_AMT")
	private Integer surgicalSubsidyAmt;

	@Column(name="SURGICAL_SURCHARGE_AMT")
	private Integer surgicalSurchargeAmt;

	@Column(name="SURGICAL_TAX_AMT")
	private Integer surgicalTaxAmt;

	@Column(name="SURGICAL_WAIVER_AMT")
	private Integer surgicalWaiverAmt;

	public static HashMap<String,Integer> mappingInfo = new HashMap<String,Integer>(){
		{
			put("encKey",0);
			put("acuteGrossAmt",1);
			put("acuteGrossTaxAmt",2);
			put("acutePayableAmt",3);
			put("acuteSubsidyAmt",4);
			put("acuteSurchargeAmt",5);
			put("acuteTaxAmt",6);
			put("acuteWaiverAmt",7);
			put("aetxfGrossAmt",8);
			put("aetxfGrossTaxAmt",9);
			put("aetxfPayableAmt",10);
			put("aetxfSubsidyAmt",11);
			put("aetxfSurchargeAmt",12);
			put("aetxfTaxAmt",13);
			put("aetxfWaiverAmt",14);
			put("cancelInd",15);
			put("hdGrossAmt",16);
			put("hdGrossTaxAmt",17);
			put("hdPayableAmt",18);
			put("hdSubsidyAmt",19);
			put("hdSurchargeAmt",20);
			put("hdTaxAmt",21);
			put("hdWaiverAmt",22);
			put("icuGrossAmt",23);
			put("icuGrossTaxAmt",24);
			put("icuPayableAmt",25);
			put("icuSubsidyAmt",26);
			put("icuSurchargeAmt",27);
			put("icuTaxAmt",28);
			put("icuWaiverAmt",29);
			put("institutionKey",30);
			put("isoGrossAmt",31);
			put("isoGrossTaxAmt",32);
			put("isoPayableAmt",33);
			put("isoSubsidyAmt",34);
			put("isoSurchargeAmt",35);
			put("isoTaxAmt",36);
			put("isoWaiverAmt",37);
			put("losAcuteDays",38);
			put("losDays",39);
			put("losHdDays",40);
			put("losHours",41);
			put("losIcuDays",42);
			put("losLastdayHours",43);
			put("losRehabDays",44);
			put("optxfGrossAmt",45);
			put("optxfGrossTaxAmt",46);
			put("optxfPayableAmt",47);
			put("optxfSubsidyAmt",48);
			put("optxfSurchargeAmt",49);
			put("optxfTaxAmt",50);
			put("optxfWaiverAmt",51);
			put("rehabGrossAmt",52);
			put("rehabGrossTaxAmt",53);
			put("rehabPayableAmt",54);
			put("rehabSubsidyAmt",55);
			put("rehabSurchargeAmt",56);
			put("rehabTaxAmt",57);
			put("rehabWaiverAmt",58);
			put("surgicalGrossAmt",59);
			put("surgicalGrossTaxAmt",60);
			put("surgicalPayableAmt",61);
			put("surgicalSubsidyAmt",62);
			put("surgicalSurchargeAmt",63);
			put("surgicalTaxAmt",64);
			put("surgicalWaiverAmt",65);
			
		}};
	public static Integer columnCount = 66;
	public FctEncounterAmt() {
	}

	public Integer getEncKey() {
		return this.encKey;
	}

	public void setEncKey(int encKey) {
		this.encKey = encKey;
	}

	public int getAcuteGrossAmt() {
		return this.acuteGrossAmt;
	}

	public void setAcuteGrossAmt(int acuteGrossAmt) {
		this.acuteGrossAmt = acuteGrossAmt;
	}

	public int getAcuteGrossTaxAmt() {
		return this.acuteGrossTaxAmt;
	}

	public void setAcuteGrossTaxAmt(int acuteGrossTaxAmt) {
		this.acuteGrossTaxAmt = acuteGrossTaxAmt;
	}

	public int getAcutePayableAmt() {
		return this.acutePayableAmt;
	}

	public void setAcutePayableAmt(int acutePayableAmt) {
		this.acutePayableAmt = acutePayableAmt;
	}

	public int getAcuteSubsidyAmt() {
		return this.acuteSubsidyAmt;
	}

	public void setAcuteSubsidyAmt(int acuteSubsidyAmt) {
		this.acuteSubsidyAmt = acuteSubsidyAmt;
	}

	public int getAcuteSurchargeAmt() {
		return this.acuteSurchargeAmt;
	}

	public void setAcuteSurchargeAmt(int acuteSurchargeAmt) {
		this.acuteSurchargeAmt = acuteSurchargeAmt;
	}

	public int getAcuteTaxAmt() {
		return this.acuteTaxAmt;
	}

	public void setAcuteTaxAmt(int acuteTaxAmt) {
		this.acuteTaxAmt = acuteTaxAmt;
	}

	public int getAcuteWaiverAmt() {
		return this.acuteWaiverAmt;
	}

	public void setAcuteWaiverAmt(int acuteWaiverAmt) {
		this.acuteWaiverAmt = acuteWaiverAmt;
	}

	public int getAetxfGrossAmt() {
		return this.aetxfGrossAmt;
	}

	public void setAetxfGrossAmt(int aetxfGrossAmt) {
		this.aetxfGrossAmt = aetxfGrossAmt;
	}

	public int getAetxfGrossTaxAmt() {
		return this.aetxfGrossTaxAmt;
	}

	public void setAetxfGrossTaxAmt(int aetxfGrossTaxAmt) {
		this.aetxfGrossTaxAmt = aetxfGrossTaxAmt;
	}

	public int getAetxfPayableAmt() {
		return this.aetxfPayableAmt;
	}

	public void setAetxfPayableAmt(int aetxfPayableAmt) {
		this.aetxfPayableAmt = aetxfPayableAmt;
	}

	public int getAetxfSubsidyAmt() {
		return this.aetxfSubsidyAmt;
	}

	public void setAetxfSubsidyAmt(int aetxfSubsidyAmt) {
		this.aetxfSubsidyAmt = aetxfSubsidyAmt;
	}

	public int getAetxfSurchargeAmt() {
		return this.aetxfSurchargeAmt;
	}

	public void setAetxfSurchargeAmt(int aetxfSurchargeAmt) {
		this.aetxfSurchargeAmt = aetxfSurchargeAmt;
	}

	public int getAetxfTaxAmt() {
		return this.aetxfTaxAmt;
	}

	public void setAetxfTaxAmt(int aetxfTaxAmt) {
		this.aetxfTaxAmt = aetxfTaxAmt;
	}

	public int getAetxfWaiverAmt() {
		return this.aetxfWaiverAmt;
	}

	public void setAetxfWaiverAmt(int aetxfWaiverAmt) {
		this.aetxfWaiverAmt = aetxfWaiverAmt;
	}

	public String getCancelInd() {
		return this.cancelInd;
	}

	public void setCancelInd(String cancelInd) {
		this.cancelInd = cancelInd;
	}

	public int getHdGrossAmt() {
		return this.hdGrossAmt;
	}

	public void setHdGrossAmt(int hdGrossAmt) {
		this.hdGrossAmt = hdGrossAmt;
	}

	public int getHdGrossTaxAmt() {
		return this.hdGrossTaxAmt;
	}

	public void setHdGrossTaxAmt(int hdGrossTaxAmt) {
		this.hdGrossTaxAmt = hdGrossTaxAmt;
	}

	public int getHdPayableAmt() {
		return this.hdPayableAmt;
	}

	public void setHdPayableAmt(int hdPayableAmt) {
		this.hdPayableAmt = hdPayableAmt;
	}

	public int getHdSubsidyAmt() {
		return this.hdSubsidyAmt;
	}

	public void setHdSubsidyAmt(int hdSubsidyAmt) {
		this.hdSubsidyAmt = hdSubsidyAmt;
	}

	public int getHdSurchargeAmt() {
		return this.hdSurchargeAmt;
	}

	public void setHdSurchargeAmt(int hdSurchargeAmt) {
		this.hdSurchargeAmt = hdSurchargeAmt;
	}

	public int getHdTaxAmt() {
		return this.hdTaxAmt;
	}

	public void setHdTaxAmt(int hdTaxAmt) {
		this.hdTaxAmt = hdTaxAmt;
	}

	public int getHdWaiverAmt() {
		return this.hdWaiverAmt;
	}

	public void setHdWaiverAmt(int hdWaiverAmt) {
		this.hdWaiverAmt = hdWaiverAmt;
	}

	public int getIcuGrossAmt() {
		return this.icuGrossAmt;
	}

	public void setIcuGrossAmt(int icuGrossAmt) {
		this.icuGrossAmt = icuGrossAmt;
	}

	public int getIcuGrossTaxAmt() {
		return this.icuGrossTaxAmt;
	}

	public void setIcuGrossTaxAmt(int icuGrossTaxAmt) {
		this.icuGrossTaxAmt = icuGrossTaxAmt;
	}

	public int getIcuPayableAmt() {
		return this.icuPayableAmt;
	}

	public void setIcuPayableAmt(int icuPayableAmt) {
		this.icuPayableAmt = icuPayableAmt;
	}

	public int getIcuSubsidyAmt() {
		return this.icuSubsidyAmt;
	}

	public void setIcuSubsidyAmt(int icuSubsidyAmt) {
		this.icuSubsidyAmt = icuSubsidyAmt;
	}

	public int getIcuSurchargeAmt() {
		return this.icuSurchargeAmt;
	}

	public void setIcuSurchargeAmt(int icuSurchargeAmt) {
		this.icuSurchargeAmt = icuSurchargeAmt;
	}

	public int getIcuTaxAmt() {
		return this.icuTaxAmt;
	}

	public void setIcuTaxAmt(int icuTaxAmt) {
		this.icuTaxAmt = icuTaxAmt;
	}

	public int getIcuWaiverAmt() {
		return this.icuWaiverAmt;
	}

	public void setIcuWaiverAmt(int icuWaiverAmt) {
		this.icuWaiverAmt = icuWaiverAmt;
	}

	public int getInstitutionKey() {
		return this.institutionKey;
	}

	public void setInstitutionKey(int institutionKey) {
		this.institutionKey = institutionKey;
	}

	public int getIsoGrossAmt() {
		return this.isoGrossAmt;
	}

	public void setIsoGrossAmt(int isoGrossAmt) {
		this.isoGrossAmt = isoGrossAmt;
	}

	public int getIsoGrossTaxAmt() {
		return this.isoGrossTaxAmt;
	}

	public void setIsoGrossTaxAmt(int isoGrossTaxAmt) {
		this.isoGrossTaxAmt = isoGrossTaxAmt;
	}

	public int getIsoPayableAmt() {
		return this.isoPayableAmt;
	}

	public void setIsoPayableAmt(int isoPayableAmt) {
		this.isoPayableAmt = isoPayableAmt;
	}

	public int getIsoSubsidyAmt() {
		return this.isoSubsidyAmt;
	}

	public void setIsoSubsidyAmt(int isoSubsidyAmt) {
		this.isoSubsidyAmt = isoSubsidyAmt;
	}

	public int getIsoSurchargeAmt() {
		return this.isoSurchargeAmt;
	}

	public void setIsoSurchargeAmt(int isoSurchargeAmt) {
		this.isoSurchargeAmt = isoSurchargeAmt;
	}

	public int getIsoTaxAmt() {
		return this.isoTaxAmt;
	}

	public void setIsoTaxAmt(int isoTaxAmt) {
		this.isoTaxAmt = isoTaxAmt;
	}

	public int getIsoWaiverAmt() {
		return this.isoWaiverAmt;
	}

	public void setIsoWaiverAmt(int isoWaiverAmt) {
		this.isoWaiverAmt = isoWaiverAmt;
	}

	public int getLosAcuteDays() {
		return this.losAcuteDays;
	}

	public void setLosAcuteDays(int losAcuteDays) {
		this.losAcuteDays = losAcuteDays;
	}

	public int getLosDays() {
		return this.losDays;
	}

	public void setLosDays(int losDays) {
		this.losDays = losDays;
	}

	public int getLosHdDays() {
		return this.losHdDays;
	}

	public void setLosHdDays(int losHdDays) {
		this.losHdDays = losHdDays;
	}

	public int getLosHours() {
		return this.losHours;
	}

	public void setLosHours(int losHours) {
		this.losHours = losHours;
	}

	public int getLosIcuDays() {
		return this.losIcuDays;
	}

	public void setLosIcuDays(int losIcuDays) {
		this.losIcuDays = losIcuDays;
	}

	public int getLosLastdayHours() {
		return this.losLastdayHours;
	}

	public void setLosLastdayHours(int losLastdayHours) {
		this.losLastdayHours = losLastdayHours;
	}

	public int getLosRehabDays() {
		return this.losRehabDays;
	}

	public void setLosRehabDays(int losRehabDays) {
		this.losRehabDays = losRehabDays;
	}

	public int getOptxfGrossAmt() {
		return this.optxfGrossAmt;
	}

	public void setOptxfGrossAmt(int optxfGrossAmt) {
		this.optxfGrossAmt = optxfGrossAmt;
	}

	public int getOptxfGrossTaxAmt() {
		return this.optxfGrossTaxAmt;
	}

	public void setOptxfGrossTaxAmt(int optxfGrossTaxAmt) {
		this.optxfGrossTaxAmt = optxfGrossTaxAmt;
	}

	public int getOptxfPayableAmt() {
		return this.optxfPayableAmt;
	}

	public void setOptxfPayableAmt(int optxfPayableAmt) {
		this.optxfPayableAmt = optxfPayableAmt;
	}

	public int getOptxfSubsidyAmt() {
		return this.optxfSubsidyAmt;
	}

	public void setOptxfSubsidyAmt(int optxfSubsidyAmt) {
		this.optxfSubsidyAmt = optxfSubsidyAmt;
	}

	public int getOptxfSurchargeAmt() {
		return this.optxfSurchargeAmt;
	}

	public void setOptxfSurchargeAmt(int optxfSurchargeAmt) {
		this.optxfSurchargeAmt = optxfSurchargeAmt;
	}

	public int getOptxfTaxAmt() {
		return this.optxfTaxAmt;
	}

	public void setOptxfTaxAmt(int optxfTaxAmt) {
		this.optxfTaxAmt = optxfTaxAmt;
	}

	public int getOptxfWaiverAmt() {
		return this.optxfWaiverAmt;
	}

	public void setOptxfWaiverAmt(int optxfWaiverAmt) {
		this.optxfWaiverAmt = optxfWaiverAmt;
	}

	public int getRehabGrossAmt() {
		return this.rehabGrossAmt;
	}

	public void setRehabGrossAmt(int rehabGrossAmt) {
		this.rehabGrossAmt = rehabGrossAmt;
	}

	public int getRehabGrossTaxAmt() {
		return this.rehabGrossTaxAmt;
	}

	public void setRehabGrossTaxAmt(int rehabGrossTaxAmt) {
		this.rehabGrossTaxAmt = rehabGrossTaxAmt;
	}

	public int getRehabPayableAmt() {
		return this.rehabPayableAmt;
	}

	public void setRehabPayableAmt(int rehabPayableAmt) {
		this.rehabPayableAmt = rehabPayableAmt;
	}

	public int getRehabSubsidyAmt() {
		return this.rehabSubsidyAmt;
	}

	public void setRehabSubsidyAmt(int rehabSubsidyAmt) {
		this.rehabSubsidyAmt = rehabSubsidyAmt;
	}

	public int getRehabSurchargeAmt() {
		return this.rehabSurchargeAmt;
	}

	public void setRehabSurchargeAmt(int rehabSurchargeAmt) {
		this.rehabSurchargeAmt = rehabSurchargeAmt;
	}

	public int getRehabTaxAmt() {
		return this.rehabTaxAmt;
	}

	public void setRehabTaxAmt(int rehabTaxAmt) {
		this.rehabTaxAmt = rehabTaxAmt;
	}

	public int getRehabWaiverAmt() {
		return this.rehabWaiverAmt;
	}

	public void setRehabWaiverAmt(int rehabWaiverAmt) {
		this.rehabWaiverAmt = rehabWaiverAmt;
	}

	public int getSurgicalGrossAmt() {
		return this.surgicalGrossAmt;
	}

	public void setSurgicalGrossAmt(int surgicalGrossAmt) {
		this.surgicalGrossAmt = surgicalGrossAmt;
	}

	public int getSurgicalGrossTaxAmt() {
		return this.surgicalGrossTaxAmt;
	}

	public void setSurgicalGrossTaxAmt(int surgicalGrossTaxAmt) {
		this.surgicalGrossTaxAmt = surgicalGrossTaxAmt;
	}

	public int getSurgicalPayableAmt() {
		return this.surgicalPayableAmt;
	}

	public void setSurgicalPayableAmt(int surgicalPayableAmt) {
		this.surgicalPayableAmt = surgicalPayableAmt;
	}

	public int getSurgicalSubsidyAmt() {
		return this.surgicalSubsidyAmt;
	}

	public void setSurgicalSubsidyAmt(int surgicalSubsidyAmt) {
		this.surgicalSubsidyAmt = surgicalSubsidyAmt;
	}

	public int getSurgicalSurchargeAmt() {
		return this.surgicalSurchargeAmt;
	}

	public void setSurgicalSurchargeAmt(int surgicalSurchargeAmt) {
		this.surgicalSurchargeAmt = surgicalSurchargeAmt;
	}

	public int getSurgicalTaxAmt() {
		return this.surgicalTaxAmt;
	}

	public void setSurgicalTaxAmt(int surgicalTaxAmt) {
		this.surgicalTaxAmt = surgicalTaxAmt;
	}

	public int getSurgicalWaiverAmt() {
		return this.surgicalWaiverAmt;
	}

	public void setSurgicalWaiverAmt(int surgicalWaiverAmt) {
		this.surgicalWaiverAmt = surgicalWaiverAmt;
	}

}