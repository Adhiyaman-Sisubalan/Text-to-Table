package models;

import java.io.Serializable;
import java.util.Date;
import java.util.HashMap;

import javax.persistence.*;


/**
 * The persistent class for the FCT_ENCOUNTER database table.
 * 
 */
@Entity
@Table(name="FCT_ENCOUNTER")
@NamedQuery(name="FctEncounter.findAll", query="SELECT f FROM FctEncounter f")
public class FctEncounter implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ENC_KEY")
	private Integer encKey;

	@Column(name="ADM_BED")
	private String admBed;

	@Column(name="ADM_DATE")
	private Date admDate;

	@Column(name="ADM_DOCTOR_KEY")
	private Integer admDoctorKey;

	@Column(name="ADM_NURSING_OU_KEY")
	private Integer admNursingOuKey;

	@Column(name="ADM_OU_KEY")
	private Integer admOuKey;

	@Column(name="ADM_PAT_CLS_KEY")
	private Integer admPatClsKey;

	@Column(name="ADM_PAT_PHY_CLS_KEY")
	private Integer admPatPhyClsKey;

	@Column(name="ADM_REASON_1_DESC")
	private String admReason1Desc;

	@Column(name="ADM_REASON_2_DESC")
	private String admReason2Desc;

	@Column(name="ADM_ROOM")
	private String admRoom;

	@Column(name="ADM_SUB_SPECIALTY_KEY")
	private Integer admSubSpecialtyKey;

	@Column(name="ADM_TRTMT_CAT_KEY")
	private Integer admTrtmtCatKey;

	@Column(name="ADM_TYPE_KEY")
	private Integer admTypeKey;

	@Column(name="AE_CASE_NO")
	private String aeCaseNo;

	@Column(name="AGE_GROUP_KEY")
	private Integer ageGroupKey;

	@Column(name="ARRIVAL_MODE_KEY")
	private Integer arrivalModeKey;

	@Column(name="ATTENDING_DOCTOR_KEY")
	private Integer attendingDoctorKey;

	@Column(name="BILL_STATUS")
	private String billStatus;

	@Column(name="CANCEL_IND")
	private String cancelInd;

	@Column(name="CASE_END_TYPE_KEY")
	private Integer caseEndTypeKey;

	@Column(name="CASE_SPECIALTY_KEY")
	private Integer caseSpecialtyKey;

	@Column(name="CASEVISIT_WORKLOAD")
	private Integer casevisitWorkload;

	@Column(name="CCI_SCORE")
	private Integer cciScore;

	@Column(name="CHILD_NORM_EM_IND")
	private String childNormEmInd;

	@Column(name="CIP_NUH_IND")
	private String cipNuhInd;

	@Column(name="CLASS_CHOICE_DESC")
	private String classChoiceDesc;

	@Column(name="COSMETIC_OP_IND")
	private String cosmeticOpInd;

	@Column(name="DRG_KEY")
	private Integer drgKey;

	@Column(name="DS_CASE_NO")
	private String dsCaseNo;

	@Column(name="DS_TO_IP_IND")
	private String dsToIpInd;

	@Column(name="DSC_BED")
	private String dscBed;

	@Column(name="DSC_DATE")
	private Date dscDate;

	@Column(name="DSC_DOCTOR_KEY")
	private Integer dscDoctorKey;

	@Column(name="DSC_IPNOU_OPTOU_KEY")
	private Integer dscIpnouOptouKey;

	@Column(name="DSC_OU_KEY")
	private Integer dscOuKey;

	@Column(name="DSC_PAT_PHY_CLS_KEY")
	private Integer dscPatPhyClsKey;

	@Column(name="DSC_REASON_DESC")
	private String dscReasonDesc;

	@Column(name="DSC_ROOM")
	private String dscRoom;

	@Column(name="DSC_SUB_SPECIALTY_KEY")
	private Integer dscSubSpecialtyKey;

	@Column(name="DSC_TRTMT_CAT_KEY")
	private Integer dscTrtmtCatKey;

	@Column(name="EM_PAC_STATUS_KEY")
	private Integer emPacStatusKey;

	@Column(name="EM_SURGERY_IND")
	private String emSurgeryInd;

	@Column(name="EM_TRAUMA_KEY")
	private Integer emTraumaKey;

	@Column(name="ICD_MEDICLAIM_SEC_DIAG")
	private String icdMediclaimSecDiag;

	@Column(name="ICD_SUBVENTION_SEC_DIAG")
	private String icdSubventionSecDiag;

	@Column(name="ICD9_PRI_DIAG")
	private String icd9PriDiag;

	@Column(name="ICD9_SEC_DIAG_NO")
	private Integer icd9SecDiagNo;

	@Column(name="ICD9CM_PRI_DIAG")
	private String icd9cmPriDiag;

	@Column(name="ICD9CM_SEC_DIAG_NO")
	private Integer icd9cmSecDiagNo;

	@Column(name="INDUSTRIAL_ACCIDENT_IND")
	private String industrialAccidentInd;

	@Column(name="INSTITUTION_CD")
	private String institutionCd;

	@Column(name="LODGER_IND")
	private String lodgerInd;

	@Column(name="MDC_KEY")
	private Integer mdcKey;

	@Column(name="MEDICLAIM_DIAGNOSIS_CAT")
	private String mediclaimDiagnosisCat;

	@Column(name="MEDICLAIM_PRI_DIAG_DESC")
	private String mediclaimPriDiagDesc;

	@Column(name="MT_IND")
	private String mtInd;

	@Column(name="NATIONALITY_KEY")
	private Integer nationalityKey;

	@Column(name="ONE_BILL_INT")
	private Integer oneBillInt;

	@Column(name="OP_CASE_NO")
	private String opCaseNo;

	@Column(name="OP_TO_DS_IND")
	private String opToDsInd;

	@Column(name="PLAN_ADM_IND")
	private String planAdmInd;

	@Column(name="PLAN_DSC_DATE")
	private Date planDscDate;

	@Column(name="PLAN_VISIT_CREATE_DATE")
	private Date planVisitCreateDate;

	@Column(name="PLAN_VISIT_DATE")
	private Date planVisitDate;

	@Column(name="RE_ADM_IND")
	private String reAdmInd;

	@Column(name="REF_COMMENTS")
	private String refComments;

	@Column(name="REF_HCI_CD")
	private String refHciCd;

	@Column(name="REF_HCI_NAME")
	private String refHciName;

	@Column(name="REF_HEALTHCARE_FAC_KEY")
	private Integer refHealthcareFacKey;

	@Column(name="REF_SRC")
	private String refSrc;

	@Column(name="REF_TYPE_KEY")
	private Integer refTypeKey;

	@Column(name="REFTO_HEALTHCARE_FAC_KEY")
	private Integer reftoHealthcareFacKey;

	@Column(name="SAP_PHARM_BILL_STATUS")
	private String sapPharmBillStatus;

	@Column(name="SEPARATION_TYPE_KEY")
	private Integer separationTypeKey;

	@Column(name="SOCIAL_STAYER_IND")
	private String socialStayerInd;

	@Column(name="SUB_SPECIALTY_NO")
	private Integer subSpecialtyNo;

	@Column(name="SUBV_DOC_NO")
	private String subvDocNo;

	@Column(name="SUBV_DOC_TYPE_KEY")
	private Integer subvDocTypeKey;

	@Column(name="SUBV_PRI_DIAG_DESC")
	private String subvPriDiagDesc;

	@Column(name="SUBVENTION_DIAGNOSIS_CAT")
	private String subventionDiagnosisCat;

	@Column(name="SURGICAL_QTY")
	private Integer surgicalQty;

	@Column(name="UNPLAN_SURGERY_IND")
	private String unplanSurgeryInd;

	@Column(name="UPGDNG_IND")
	private String upgdngInd;

	@Column(name="VISIT_DATE")
	private Date visitDate;

	@Column(name="VISIT_MOV_TYPE_KEY")
	private Integer visitMovTypeKey;

	@Column(name="WELL_BABY_IND")
	private String wellBabyInd;

	public static HashMap<String,Integer> mappingInfo = new HashMap<String,Integer>(){
		{
			put("encKey",0);
			put("admBed",1);
			put("admDate",2);
			put("admDoctorKey",3);
			put("admNursingOuKey",4);
			put("admOuKey",5);
			put("admPatClsKey",6);
			put("admPatPhyClsKey",7);
			put("admReason1Desc",8);
			put("admReason2Desc",9);
			put("admRoom",10);
			put("admSubSpecialtyKey",11);
			put("admTrtmtCatKey",12);
			put("admTypeKey",13);
			put("aeCaseNo",14);
			put("ageGroupKey",15);
			put("arrivalModeKey",16);
			put("attendingDoctorKey",17);
			put("billStatus",18);
			put("cancelInd",19);
			put("caseEndTypeKey",20);
			put("caseSpecialtyKey",21);
			put("casevisitWorkload",22);
			put("cciScore",23);
			put("childNormEmInd",24);
			put("cipNuhInd",25);
			put("classChoiceDesc",26);
			put("cosmeticOpInd",27);
			put("drgKey",28);
			put("dsCaseNo",29);
			put("dsToIpInd",30);
			put("dscBed",31);
			put("dscDate",32);
			put("dscDoctorKey",33);
			put("dscIpnouOptouKey",34);
			put("dscOuKey",35);
			put("dscPatPhyClsKey",36);
			put("dscReasonDesc",37);
			put("dscRoom",38);
			put("dscSubSpecialtyKey",39);
			put("dscTrtmtCatKey",40);
			put("emPacStatusKey",41);
			put("emSurgeryInd",42);
			put("emTraumaKey",43);
			put("icdMediclaimSecDiag",44);
			put("icdSubventionSecDiag",45);
			put("icd9PriDiag",46);
			put("icd9SecDiagNo",47);
			put("icd9cmPriDiag",48);
			put("icd9cmSecDiagNo",49);
			put("industrialAccidentInd",50);
			put("institutionCd",51);
			put("lodgerInd",52);
			put("mdcKey",53);
			put("mediclaimDiagnosisCat",54);
			put("mediclaimPriDiagDesc",55);
			put("mtInd",56);
			put("nationalityKey",57);
			put("oneBillNumber",58);
			put("opCaseNo",59);
			put("opToDsInd",60);
			put("planAdmInd",61);
			put("planDscDate",62);
			put("planVisitCreateDate",63);
			put("planVisitDate",64);
			put("reAdmInd",65);
			put("refComments",66);
			put("refHciCd",67);
			put("refHciName",68);
			put("refHealthcareFacKey",69);
			put("refSrc",70);
			put("refTypeKey",71);
			put("reftoHealthcareFacKey",72);
			put("sapPharmBillStatus",73);
			put("separationTypeKey",74);
			put("socialStayerInd",75);
			put("subSpecialtyNo",76);
			put("subvDocNo",77);
			put("subvDocTypeKey",78);
			put("subvPriDiagDesc",79);
			put("subventionDiagnosisCat",80);
			put("surgicalQty",81);
			put("unplanSurgeryInd",82);
			put("upgdngInd",83);
			put("visitDate",84);
			put("visitMovTypeKey",85);
			put("wellBabyInd",86);
			
			
			
		}};
	public static Integer columnCount = 87;
	public FctEncounter() {
	}

	public int getEncKey() {
		return this.encKey;
	}

	public void setEncKey(int encKey) {
		this.encKey = encKey;
	}

	public String getAdmBed() {
		return this.admBed;
	}

	public void setAdmBed(String admBed) {
		this.admBed = admBed;
	}

	public Date getAdmDate() {
		return this.admDate;
	}

	public void setAdmDate(Date admDate) {
		this.admDate = admDate;
	}

	public int getAdmDoctorKey() {
		return this.admDoctorKey;
	}

	public void setAdmDoctorKey(int admDoctorKey) {
		this.admDoctorKey = admDoctorKey;
	}

	public int getAdmNursingOuKey() {
		return this.admNursingOuKey;
	}

	public void setAdmNursingOuKey(int admNursingOuKey) {
		this.admNursingOuKey = admNursingOuKey;
	}

	public int getAdmOuKey() {
		return this.admOuKey;
	}

	public void setAdmOuKey(int admOuKey) {
		this.admOuKey = admOuKey;
	}

	public int getAdmPatClsKey() {
		return this.admPatClsKey;
	}

	public void setAdmPatClsKey(int admPatClsKey) {
		this.admPatClsKey = admPatClsKey;
	}

	public int getAdmPatPhyClsKey() {
		return this.admPatPhyClsKey;
	}

	public void setAdmPatPhyClsKey(int admPatPhyClsKey) {
		this.admPatPhyClsKey = admPatPhyClsKey;
	}

	public String getAdmReason1Desc() {
		return this.admReason1Desc;
	}

	public void setAdmReason1Desc(String admReason1Desc) {
		this.admReason1Desc = admReason1Desc;
	}

	public String getAdmReason2Desc() {
		return this.admReason2Desc;
	}

	public void setAdmReason2Desc(String admReason2Desc) {
		this.admReason2Desc = admReason2Desc;
	}

	public String getAdmRoom() {
		return this.admRoom;
	}

	public void setAdmRoom(String admRoom) {
		this.admRoom = admRoom;
	}

	public int getAdmSubSpecialtyKey() {
		return this.admSubSpecialtyKey;
	}

	public void setAdmSubSpecialtyKey(int admSubSpecialtyKey) {
		this.admSubSpecialtyKey = admSubSpecialtyKey;
	}

	public int getAdmTrtmtCatKey() {
		return this.admTrtmtCatKey;
	}

	public void setAdmTrtmtCatKey(int admTrtmtCatKey) {
		this.admTrtmtCatKey = admTrtmtCatKey;
	}

	public int getAdmTypeKey() {
		return this.admTypeKey;
	}

	public void setAdmTypeKey(int admTypeKey) {
		this.admTypeKey = admTypeKey;
	}

	public String getAeCaseNo() {
		return this.aeCaseNo;
	}

	public void setAeCaseNo(String aeCaseNo) {
		this.aeCaseNo = aeCaseNo;
	}

	public int getAgeGroupKey() {
		return this.ageGroupKey;
	}

	public void setAgeGroupKey(int ageGroupKey) {
		this.ageGroupKey = ageGroupKey;
	}

	public int getArrivalModeKey() {
		return this.arrivalModeKey;
	}

	public void setArrivalModeKey(int arrivalModeKey) {
		this.arrivalModeKey = arrivalModeKey;
	}

	public int getAttendingDoctorKey() {
		return this.attendingDoctorKey;
	}

	public void setAttendingDoctorKey(int attendingDoctorKey) {
		this.attendingDoctorKey = attendingDoctorKey;
	}

	public String getBillStatus() {
		return this.billStatus;
	}

	public void setBillStatus(String billStatus) {
		this.billStatus = billStatus;
	}

	public String getCancelInd() {
		return this.cancelInd;
	}

	public void setCancelInd(String cancelInd) {
		this.cancelInd = cancelInd;
	}

	public int getCaseEndTypeKey() {
		return this.caseEndTypeKey;
	}

	public void setCaseEndTypeKey(int caseEndTypeKey) {
		this.caseEndTypeKey = caseEndTypeKey;
	}

	public int getCaseSpecialtyKey() {
		return this.caseSpecialtyKey;
	}

	public void setCaseSpecialtyKey(int caseSpecialtyKey) {
		this.caseSpecialtyKey = caseSpecialtyKey;
	}

	public int getCasevisitWorkload() {
		return this.casevisitWorkload;
	}

	public void setCasevisitWorkload(int casevisitWorkload) {
		this.casevisitWorkload = casevisitWorkload;
	}

	public int getCciScore() {
		return this.cciScore;
	}

	public void setCciScore(int cciScore) {
		this.cciScore = cciScore;
	}

	public String getChildNormEmInd() {
		return this.childNormEmInd;
	}

	public void setChildNormEmInd(String childNormEmInd) {
		this.childNormEmInd = childNormEmInd;
	}

	public String getCipNuhInd() {
		return this.cipNuhInd;
	}

	public void setCipNuhInd(String cipNuhInd) {
		this.cipNuhInd = cipNuhInd;
	}

	public String getClassChoiceDesc() {
		return this.classChoiceDesc;
	}

	public void setClassChoiceDesc(String classChoiceDesc) {
		this.classChoiceDesc = classChoiceDesc;
	}

	public String getCosmeticOpInd() {
		return this.cosmeticOpInd;
	}

	public void setCosmeticOpInd(String cosmeticOpInd) {
		this.cosmeticOpInd = cosmeticOpInd;
	}

	public int getDrgKey() {
		return this.drgKey;
	}

	public void setDrgKey(int drgKey) {
		this.drgKey = drgKey;
	}

	public String getDsCaseNo() {
		return this.dsCaseNo;
	}

	public void setDsCaseNo(String dsCaseNo) {
		this.dsCaseNo = dsCaseNo;
	}

	public String getDsToIpInd() {
		return this.dsToIpInd;
	}

	public void setDsToIpInd(String dsToIpInd) {
		this.dsToIpInd = dsToIpInd;
	}

	public String getDscBed() {
		return this.dscBed;
	}

	public void setDscBed(String dscBed) {
		this.dscBed = dscBed;
	}

	public Date getDscDate() {
		return this.dscDate;
	}

	public void setDscDate(Date dscDate) {
		this.dscDate = dscDate;
	}

	public int getDscDoctorKey() {
		return this.dscDoctorKey;
	}

	public void setDscDoctorKey(int dscDoctorKey) {
		this.dscDoctorKey = dscDoctorKey;
	}

	public int getDscIpnouOptouKey() {
		return this.dscIpnouOptouKey;
	}

	public void setDscIpnouOptouKey(int dscIpnouOptouKey) {
		this.dscIpnouOptouKey = dscIpnouOptouKey;
	}

	public int getDscOuKey() {
		return this.dscOuKey;
	}

	public void setDscOuKey(int dscOuKey) {
		this.dscOuKey = dscOuKey;
	}

	public int getDscPatPhyClsKey() {
		return this.dscPatPhyClsKey;
	}

	public void setDscPatPhyClsKey(int dscPatPhyClsKey) {
		this.dscPatPhyClsKey = dscPatPhyClsKey;
	}

	public String getDscReasonDesc() {
		return this.dscReasonDesc;
	}

	public void setDscReasonDesc(String dscReasonDesc) {
		this.dscReasonDesc = dscReasonDesc;
	}

	public String getDscRoom() {
		return this.dscRoom;
	}

	public void setDscRoom(String dscRoom) {
		this.dscRoom = dscRoom;
	}

	public int getDscSubSpecialtyKey() {
		return this.dscSubSpecialtyKey;
	}

	public void setDscSubSpecialtyKey(int dscSubSpecialtyKey) {
		this.dscSubSpecialtyKey = dscSubSpecialtyKey;
	}

	public int getDscTrtmtCatKey() {
		return this.dscTrtmtCatKey;
	}

	public void setDscTrtmtCatKey(int dscTrtmtCatKey) {
		this.dscTrtmtCatKey = dscTrtmtCatKey;
	}

	public int getEmPacStatusKey() {
		return this.emPacStatusKey;
	}

	public void setEmPacStatusKey(int emPacStatusKey) {
		this.emPacStatusKey = emPacStatusKey;
	}

	public String getEmSurgeryInd() {
		return this.emSurgeryInd;
	}

	public void setEmSurgeryInd(String emSurgeryInd) {
		this.emSurgeryInd = emSurgeryInd;
	}

	public int getEmTraumaKey() {
		return this.emTraumaKey;
	}

	public void setEmTraumaKey(int emTraumaKey) {
		this.emTraumaKey = emTraumaKey;
	}

	public String getIcdMediclaimSecDiag() {
		return this.icdMediclaimSecDiag;
	}

	public void setIcdMediclaimSecDiag(String icdMediclaimSecDiag) {
		this.icdMediclaimSecDiag = icdMediclaimSecDiag;
	}

	public String getIcdSubventionSecDiag() {
		return this.icdSubventionSecDiag;
	}

	public void setIcdSubventionSecDiag(String icdSubventionSecDiag) {
		this.icdSubventionSecDiag = icdSubventionSecDiag;
	}

	public String getIcd9PriDiag() {
		return this.icd9PriDiag;
	}

	public void setIcd9PriDiag(String icd9PriDiag) {
		this.icd9PriDiag = icd9PriDiag;
	}

	public int getIcd9SecDiagNo() {
		return this.icd9SecDiagNo;
	}

	public void setIcd9SecDiagNo(int icd9SecDiagNo) {
		this.icd9SecDiagNo = icd9SecDiagNo;
	}

	public String getIcd9cmPriDiag() {
		return this.icd9cmPriDiag;
	}

	public void setIcd9cmPriDiag(String icd9cmPriDiag) {
		this.icd9cmPriDiag = icd9cmPriDiag;
	}

	public int getIcd9cmSecDiagNo() {
		return this.icd9cmSecDiagNo;
	}

	public void setIcd9cmSecDiagNo(int icd9cmSecDiagNo) {
		this.icd9cmSecDiagNo = icd9cmSecDiagNo;
	}

	public String getIndustrialAccidentInd() {
		return this.industrialAccidentInd;
	}

	public void setIndustrialAccidentInd(String industrialAccidentInd) {
		this.industrialAccidentInd = industrialAccidentInd;
	}

	public String getInstitutionCd() {
		return this.institutionCd;
	}

	public void setInstitutionCd(String institutionCd) {
		this.institutionCd = institutionCd;
	}

	public String getLodgerInd() {
		return this.lodgerInd;
	}

	public void setLodgerInd(String lodgerInd) {
		this.lodgerInd = lodgerInd;
	}

	public int getMdcKey() {
		return this.mdcKey;
	}

	public void setMdcKey(int mdcKey) {
		this.mdcKey = mdcKey;
	}

	public String getMediclaimDiagnosisCat() {
		return this.mediclaimDiagnosisCat;
	}

	public void setMediclaimDiagnosisCat(String mediclaimDiagnosisCat) {
		this.mediclaimDiagnosisCat = mediclaimDiagnosisCat;
	}

	public String getMediclaimPriDiagDesc() {
		return this.mediclaimPriDiagDesc;
	}

	public void setMediclaimPriDiagDesc(String mediclaimPriDiagDesc) {
		this.mediclaimPriDiagDesc = mediclaimPriDiagDesc;
	}

	public String getMtInd() {
		return this.mtInd;
	}

	public void setMtInd(String mtInd) {
		this.mtInd = mtInd;
	}

	public int getNationalityKey() {
		return this.nationalityKey;
	}

	public void setNationalityKey(int nationalityKey) {
		this.nationalityKey = nationalityKey;
	}

	public int getOneBillInt() {
		return this.oneBillInt;
	}

	public void setOneBillInt(int oneBillInt) {
		this.oneBillInt = oneBillInt;
	}

	public String getOpCaseNo() {
		return this.opCaseNo;
	}

	public void setOpCaseNo(String opCaseNo) {
		this.opCaseNo = opCaseNo;
	}

	public String getOpToDsInd() {
		return this.opToDsInd;
	}

	public void setOpToDsInd(String opToDsInd) {
		this.opToDsInd = opToDsInd;
	}

	public String getPlanAdmInd() {
		return this.planAdmInd;
	}

	public void setPlanAdmInd(String planAdmInd) {
		this.planAdmInd = planAdmInd;
	}

	public Date getPlanDscDate() {
		return this.planDscDate;
	}

	public void setPlanDscDate(Date planDscDate) {
		this.planDscDate = planDscDate;
	}

	public Date getPlanVisitCreateDate() {
		return this.planVisitCreateDate;
	}

	public void setPlanVisitCreateDate(Date planVisitCreateDate) {
		this.planVisitCreateDate = planVisitCreateDate;
	}

	public Date getPlanVisitDate() {
		return this.planVisitDate;
	}

	public void setPlanVisitDate(Date planVisitDate) {
		this.planVisitDate = planVisitDate;
	}

	public String getReAdmInd() {
		return this.reAdmInd;
	}

	public void setReAdmInd(String reAdmInd) {
		this.reAdmInd = reAdmInd;
	}

	public String getRefComments() {
		return this.refComments;
	}

	public void setRefComments(String refComments) {
		this.refComments = refComments;
	}

	public String getRefHciCd() {
		return this.refHciCd;
	}

	public void setRefHciCd(String refHciCd) {
		this.refHciCd = refHciCd;
	}

	public String getRefHciName() {
		return this.refHciName;
	}

	public void setRefHciName(String refHciName) {
		this.refHciName = refHciName;
	}

	public int getRefHealthcareFacKey() {
		return this.refHealthcareFacKey;
	}

	public void setRefHealthcareFacKey(int refHealthcareFacKey) {
		this.refHealthcareFacKey = refHealthcareFacKey;
	}

	public String getRefSrc() {
		return this.refSrc;
	}

	public void setRefSrc(String refSrc) {
		this.refSrc = refSrc;
	}

	public int getRefTypeKey() {
		return this.refTypeKey;
	}

	public void setRefTypeKey(int refTypeKey) {
		this.refTypeKey = refTypeKey;
	}

	public int getReftoHealthcareFacKey() {
		return this.reftoHealthcareFacKey;
	}

	public void setReftoHealthcareFacKey(int reftoHealthcareFacKey) {
		this.reftoHealthcareFacKey = reftoHealthcareFacKey;
	}

	public String getSapPharmBillStatus() {
		return this.sapPharmBillStatus;
	}

	public void setSapPharmBillStatus(String sapPharmBillStatus) {
		this.sapPharmBillStatus = sapPharmBillStatus;
	}

	public int getSeparationTypeKey() {
		return this.separationTypeKey;
	}

	public void setSeparationTypeKey(int separationTypeKey) {
		this.separationTypeKey = separationTypeKey;
	}

	public String getSocialStayerInd() {
		return this.socialStayerInd;
	}

	public void setSocialStayerInd(String socialStayerInd) {
		this.socialStayerInd = socialStayerInd;
	}

	public int getSubSpecialtyNo() {
		return this.subSpecialtyNo;
	}

	public void setSubSpecialtyNo(int subSpecialtyNo) {
		this.subSpecialtyNo = subSpecialtyNo;
	}

	public String getSubvDocNo() {
		return this.subvDocNo;
	}

	public void setSubvDocNo(String subvDocNo) {
		this.subvDocNo = subvDocNo;
	}

	public int getSubvDocTypeKey() {
		return this.subvDocTypeKey;
	}

	public void setSubvDocTypeKey(int subvDocTypeKey) {
		this.subvDocTypeKey = subvDocTypeKey;
	}

	public String getSubvPriDiagDesc() {
		return this.subvPriDiagDesc;
	}

	public void setSubvPriDiagDesc(String subvPriDiagDesc) {
		this.subvPriDiagDesc = subvPriDiagDesc;
	}

	public String getSubventionDiagnosisCat() {
		return this.subventionDiagnosisCat;
	}

	public void setSubventionDiagnosisCat(String subventionDiagnosisCat) {
		this.subventionDiagnosisCat = subventionDiagnosisCat;
	}

	public int getSurgicalQty() {
		return this.surgicalQty;
	}

	public void setSurgicalQty(int surgicalQty) {
		this.surgicalQty = surgicalQty;
	}

	public String getUnplanSurgeryInd() {
		return this.unplanSurgeryInd;
	}

	public void setUnplanSurgeryInd(String unplanSurgeryInd) {
		this.unplanSurgeryInd = unplanSurgeryInd;
	}

	public String getUpgdngInd() {
		return this.upgdngInd;
	}

	public void setUpgdngInd(String upgdngInd) {
		this.upgdngInd = upgdngInd;
	}

	public Date getVisitDate() {
		return this.visitDate;
	}

	public void setVisitDate(Date visitDate) {
		this.visitDate = visitDate;
	}

	public int getVisitMovTypeKey() {
		return this.visitMovTypeKey;
	}

	public void setVisitMovTypeKey(int visitMovTypeKey) {
		this.visitMovTypeKey = visitMovTypeKey;
	}

	public String getWellBabyInd() {
		return this.wellBabyInd;
	}

	public void setWellBabyInd(String wellBabyInd) {
		this.wellBabyInd = wellBabyInd;
	}

}