package models;

import java.io.Serializable;
import java.util.Date;
import java.util.HashMap;

import javax.persistence.*;


/**
 * The persistent class for the FCT_CCOE_SPECIMENS database table.
 * 
 */
@Entity
@Table(name="FCT_CCOE_SPECIMENS")
@NamedQuery(name="FctCcoeSpecimens.findAll", query="SELECT f FROM FctCcoeSpecimens f")
public class FctCcoeSpecimens implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="SPECIMEN_SID")
	private Integer specimenSid;

	@Column(name="ACCESSION_NO")
	private String accessionNo;

	@Column(name="ACKNOWLEDGED_LOCATION")
	private String acknowledgedLocation;

	@Column(name="ACKNOWLEDGED_TIME")
	private Date acknowledgedTime;

	@Column(name="ACKNOWLEDGED_USER_NAME")
	private String acknowledgedUserName;

	@Column(name="BODY_SITE_TEXT")
	private String bodySiteText;

	@Column(name="COLLECTED_USER_SID")
	private Integer collectedUserSid;

	@Column(name="COLLECTION_DATE_SID")
	private Integer collectionDateSid;

	@Column(name="COLLECTION_DATETIME")
	private Date collectionDatetime;

	@Column(name="COLLECTION_LOCATION_NAME")
	private String collectionLocationName;

	@Column(name="CREATION_TIME")
	private Date creationTime;

	@Column(name="CREATION_USER_SID")
	private Integer creationUserSid;

	@Column(name="DELETE_IND")
	private String deleteInd;

	@Column(name="ENCOUNTER_SID")
	private Integer encounterSid;

	@Column(name="INSTITUTION_SID")
	private Integer institutionSid;

	@Column(name="ISUNCOLLECTED")
	private Integer isuncollected;

	@Column(name="LAB_ORDER_SID")
	private Integer labOrderSid;

	@Column(name="LABEL_INSTRUCTION")
	private String labelInstruction;

	@Column(name="LIS_FIELD_VALUE")
	private String lisFieldValue;

	@Column(name="MODIFICATION_TIME")
	private Date modificationTime;

	@Column(name="MODIFICATION_USER_SID")
	private Integer modificationUserSid;

	@Column(name="NATURE_OF_SPECIMEN_TEXT")
	private String natureOfSpecimenText;

	@Column(name="PAT_ENCOUNTER_LOCATION_NAME")
	private String patEncounterLocationName;

	@Column(name="RECEIVED_LOCATION_NAME")
	private String receivedLocationName;

	@Column(name="RECEIVED_TIME")
	private Date receivedTime;

	@Column(name="RECEIVED_USER_SID")
	private Integer receivedUserSid;

	@Column(name="REPRINT_DATE_TIME")
	private Date reprintDateTime;

	@Column(name="REPRINT_USER_SID")
	private Integer reprintUserSid;

	@Column(name="SPECIMEN_STATUS_CODE")
	private String specimenStatusCode;

	@Column(name="SPECIMEN_TEXT")
	private String specimenText;

	@Column(name="TUBE_STATUS_CODE")
	private String tubeStatusCode;

	@Column(name="UNCOLLECTION_DATE_TIME")
	private Date uncollectionDateTime;

	@Column(name="UNCOLLECTION_USER_SID")
	private Integer uncollectionUserSid;

	public static HashMap<String,Integer> mappingInfo = new HashMap<String,Integer>(){
		{
			put("specimenSid",0);
			put("accessionNo",1);
			put("acknowledgedLocation",2);
			put("acknowledgedTime",3);
			put("acknowledgedUserName",4);
			put("bodySiteText",5);
			put("collectedUserSid",6);
			put("collectionDateSid",7);
			put("collectionDatetime",8);
			put("collectionLocationName",9);
			put("creationTime",10);
			put("creationUserSid",11);
			put("deleteInd",12);
			put("encounterSid",13);
			put("institutionSid",14);
			put("isuncollected",15);
			put("labOrderSid",16);
			put("labelInstruction",17);
			put("lisFieldValue",18);
			put("modificationTime",19);
			put("modificationUserSid",20);
			put("natureOfSpecimenText",21);
			put("patEncounterLocationName",22);
			put("receivedLocationName",23);
			put("receivedTime",24);
			put("receivedUserSid",25);
			put("reprintDateTime",26);
			put("reprintUserSid",27);
			put("specimenStatusCode",28);
			put("specimenText",29);
			put("tubeStatusCode",30);
			put("uncollectionDateTime",31);
			put("uncollectionUserSid",32);
			
			
		}};
		public static Integer columnCount = 33;
	public FctCcoeSpecimens() {
	}

	public Integer getSpecimenSid() {
		return this.specimenSid;
	}

	public void setSpecimenSid(int specimenSid) {
		this.specimenSid = specimenSid;
	}

	public String getAccessionNo() {
		return this.accessionNo;
	}

	public void setAccessionNo(String accessionNo) {
		this.accessionNo = accessionNo;
	}

	public String getAcknowledgedLocation() {
		return this.acknowledgedLocation;
	}

	public void setAcknowledgedLocation(String acknowledgedLocation) {
		this.acknowledgedLocation = acknowledgedLocation;
	}

	public Object getAcknowledgedTime() {
		return this.acknowledgedTime;
	}

	public void setAcknowledgedTime(Date acknowledgedTime) {
		this.acknowledgedTime = acknowledgedTime;
	}

	public String getAcknowledgedUserName() {
		return this.acknowledgedUserName;
	}

	public void setAcknowledgedUserName(String acknowledgedUserName) {
		this.acknowledgedUserName = acknowledgedUserName;
	}

	public String getBodySiteText() {
		return this.bodySiteText;
	}

	public void setBodySiteText(String bodySiteText) {
		this.bodySiteText = bodySiteText;
	}

	public int getCollectedUserSid() {
		return this.collectedUserSid;
	}

	public void setCollectedUserSid(int collectedUserSid) {
		this.collectedUserSid = collectedUserSid;
	}

	public int getCollectionDateSid() {
		return this.collectionDateSid;
	}

	public void setCollectionDateSid(int collectionDateSid) {
		this.collectionDateSid = collectionDateSid;
	}

	public Object getCollectionDatetime() {
		return this.collectionDatetime;
	}

	public void setCollectionDatetime(Date collectionDatetime) {
		this.collectionDatetime = collectionDatetime;
	}

	public String getCollectionLocationName() {
		return this.collectionLocationName;
	}

	public void setCollectionLocationName(String collectionLocationName) {
		this.collectionLocationName = collectionLocationName;
	}

	public Object getCreationTime() {
		return this.creationTime;
	}

	public void setCreationTime(Date creationTime) {
		this.creationTime = creationTime;
	}

	public int getCreationUserSid() {
		return this.creationUserSid;
	}

	public void setCreationUserSid(int creationUserSid) {
		this.creationUserSid = creationUserSid;
	}

	public String getDeleteInd() {
		return this.deleteInd;
	}

	public void setDeleteInd(String deleteInd) {
		this.deleteInd = deleteInd;
	}

	public int getEncounterSid() {
		return this.encounterSid;
	}

	public void setEncounterSid(int encounterSid) {
		this.encounterSid = encounterSid;
	}

	public int getInstitutionSid() {
		return this.institutionSid;
	}

	public void setInstitutionSid(int institutionSid) {
		this.institutionSid = institutionSid;
	}

	public int getIsuncollected() {
		return this.isuncollected;
	}

	public void setIsuncollected(int isuncollected) {
		this.isuncollected = isuncollected;
	}

	public int getLabOrderSid() {
		return this.labOrderSid;
	}

	public void setLabOrderSid(int labOrderSid) {
		this.labOrderSid = labOrderSid;
	}

	public String getLabelInstruction() {
		return this.labelInstruction;
	}

	public void setLabelInstruction(String labelInstruction) {
		this.labelInstruction = labelInstruction;
	}

	public String getLisFieldValue() {
		return this.lisFieldValue;
	}

	public void setLisFieldValue(String lisFieldValue) {
		this.lisFieldValue = lisFieldValue;
	}

	public Object getModificationTime() {
		return this.modificationTime;
	}

	public void setModificationTime(Date modificationTime) {
		this.modificationTime = modificationTime;
	}

	public int getModificationUserSid() {
		return this.modificationUserSid;
	}

	public void setModificationUserSid(int modificationUserSid) {
		this.modificationUserSid = modificationUserSid;
	}

	public String getNatureOfSpecimenText() {
		return this.natureOfSpecimenText;
	}

	public void setNatureOfSpecimenText(String natureOfSpecimenText) {
		this.natureOfSpecimenText = natureOfSpecimenText;
	}

	public String getPatEncounterLocationName() {
		return this.patEncounterLocationName;
	}

	public void setPatEncounterLocationName(String patEncounterLocationName) {
		this.patEncounterLocationName = patEncounterLocationName;
	}

	public String getReceivedLocationName() {
		return this.receivedLocationName;
	}

	public void setReceivedLocationName(String receivedLocationName) {
		this.receivedLocationName = receivedLocationName;
	}

	public Object getReceivedTime() {
		return this.receivedTime;
	}

	public void setReceivedTime(Date receivedTime) {
		this.receivedTime = receivedTime;
	}

	public int getReceivedUserSid() {
		return this.receivedUserSid;
	}

	public void setReceivedUserSid(int receivedUserSid) {
		this.receivedUserSid = receivedUserSid;
	}

	public Object getReprintDateTime() {
		return this.reprintDateTime;
	}

	public void setReprintDateTime(Date reprintDateTime) {
		this.reprintDateTime = reprintDateTime;
	}

	public int getReprintUserSid() {
		return this.reprintUserSid;
	}

	public void setReprintUserSid(int reprintUserSid) {
		this.reprintUserSid = reprintUserSid;
	}

	public String getSpecimenStatusCode() {
		return this.specimenStatusCode;
	}

	public void setSpecimenStatusCode(String specimenStatusCode) {
		this.specimenStatusCode = specimenStatusCode;
	}

	public String getSpecimenText() {
		return this.specimenText;
	}

	public void setSpecimenText(String specimenText) {
		this.specimenText = specimenText;
	}

	public String getTubeStatusCode() {
		return this.tubeStatusCode;
	}

	public void setTubeStatusCode(String tubeStatusCode) {
		this.tubeStatusCode = tubeStatusCode;
	}

	public Object getUncollectionDateTime() {
		return this.uncollectionDateTime;
	}

	public void setUncollectionDateTime(Date uncollectionDateTime) {
		this.uncollectionDateTime = uncollectionDateTime;
	}

	public int getUncollectionUserSid() {
		return this.uncollectionUserSid;
	}

	public void setUncollectionUserSid(int uncollectionUserSid) {
		this.uncollectionUserSid = uncollectionUserSid;
	}

}