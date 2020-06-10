package models;

import java.io.Serializable;
import java.util.HashMap;

import javax.persistence.*;


/**
 * The persistent class for the FCT_CDOC_SCOLIOSIS database table.
 * 
 */
@Entity
@Table(name="FCT_CDOC_SCOLIOSIS")
@NamedQuery(name="FctCdocScoliosis.findAll", query="SELECT f FROM FctCdocScoliosis f")
public class FctCdocScoliosis implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="SCOLIOSIS_KEY")
	private Integer scoliosisKey;

	@Column(name="C7_PLUMB_LINE_LEFT")
	private String c7PlumbLineLeft;

	@Column(name="C7_PLUMB_LINE_LEFT_REMARKS")
	private String c7PlumbLineLeftRemarks;

	@Column(name="C7_PLUMB_LINE_RIGHT")
	private String c7PlumbLineRight;

	@Column(name="C7_PLUMB_LINE_RIGHT_REMARKS")
	private String c7PlumbLineRightRemarks;

	@Column(name="CREATION_DATE_KEY")
	private Integer creationDateKey;

	@Column(name="CREATION_TIME")
	private String creationTime;

	@Column(name="ENC_KEY")
	private Integer encKey;

	@Column(name="FREE_TEXT_NOTE")
	private String freeTextNote;

	@Column(name="HEIGHT")
	private String height;

	@Column(name="HIGH_ASIS_LEFT")
	private String highAsisLeft;

	@Column(name="HIGH_ASIS_LEFT_REMARKS")
	private String highAsisLeftRemarks;

	@Column(name="HIGH_ASIS_RIGHT")
	private String highAsisRight;

	@Column(name="HIGH_ASIS_RIGHT_REMARKS")
	private String highAsisRightRemarks;

	@Column(name="HIGH_SHOULDER_LEFT")
	private String highShoulderLeft;

	@Column(name="HIGH_SHOULDER_LEFT_REMARKS")
	private String highShoulderLeftRemarks;

	@Column(name="HIGH_SHOULDER_RIGHT")
	private String highShoulderRight;

	@Column(name="HIGH_SHOULDER_RIGHT_REMARKS")
	private String highShoulderRightRemarks;

	@Column(name="INSTITUTION_KEY")
	private Integer institutionKey;

	@Column(name="JOINT_LAXITY")
	private String jointLaxity;

	@Column(name="LEG_LEN_DISC_LEFT")
	private String legLenDiscLeft;

	@Column(name="LEG_LEN_DISC_LEFT_REMARKS")
	private String legLenDiscLeftRemarks;

	@Column(name="LEG_LEN_DISC_RIGHT")
	private String legLenDiscRight;

	@Column(name="LEG_LEN_DISC_RIGHT_REMARKS")
	private String legLenDiscRightRemarks;

	@Column(name="LUMBAR_HUMP_LEFT")
	private String lumbarHumpLeft;

	@Column(name="LUMBAR_HUMP_LEFT_REMARKS")
	private String lumbarHumpLeftRemarks;

	@Column(name="LUMBAR_HUMP_RIGHT")
	private String lumbarHumpRight;

	@Column(name="LUMBAR_HUMP_RIGHT_REMARKS")
	private String lumbarHumpRightRemarks;

	@Column(name="MENARCHE")
	private String menarche;

	@Column(name="MODIFICATION_DATE_KEY")
	private Integer modificationDateKey;

	@Column(name="MODIFICATION_TIME")
	private String modificationTime;

	@Column(name="PROMINENT_HIP_LEFT")
	private String prominentHipLeft;

	@Column(name="PROMINENT_HIP_LEFT_REMARKS")
	private String prominentHipLeftRemarks;

	@Column(name="PROMINENT_HIP_RIGHT")
	private String prominentHipRight;

	@Column(name="PROMINENT_HIP_RIGHT_REMARKS")
	private String prominentHipRightRemarks;

	@Column(name="REMARKS")
	private String remarks;

	@Column(name="RIB_HUMP_LEFT")
	private String ribHumpLeft;

	@Column(name="RIB_HUMP_LEFT_REMARKS")
	private String ribHumpLeftRemarks;

	@Column(name="RIB_HUMP_RIGHT")
	private String ribHumpRight;

	@Column(name="RIB_HUMP_RIGHT_REMARKS")
	private String ribHumpRightRemarks;

	@Column(name="RISSER")
	private String risser;

	@Column(name="ROTATION")
	private String rotation;

	@Column(name="SITTING_HEIGHT")
	private String sittingHeight;

	@Column(name="WEIGHT")
	private String weight;

	public static HashMap<String,Integer> mappingInfo = new HashMap<String,Integer>(){
		{
			put("scoliosisKey",0);
			put("c7PlumbLineLeft",1);
			put("c7PlumbLineLeftRemarks",2);
			put("c7PlumbLineRight",3);
			put("c7PlumbLineRightRemarks",4);
			put("creationDateKey",5);
			put("creationTime",6);
			put("encKey",7);
			put("freeTextNote",8);
			put("height",9);
			put("highAsisLeft",10);
			put("highAsisLeftRemarks",11);
			put("highAsisRight",12);
			put("highAsisRightRemarks",13);
			put("highShoulderLeft",14);
			put("highShoulderLeftRemarks",15);
			put("highShoulderRight",16);
			put("highShoulderRightRemarks",17);
			put("institutionKey",18);
			put("jointLaxity",19);
			put("legLenDiscLeft",20);
			put("legLenDiscLeftRemarks",21);
			put("legLenDiscRight",22);
			put("legLenDiscRightRemarks",23);
			put("lumbarHumpLeft",24);
			put("lumbarHumpLeftRemarks",25);
			put("lumbarHumpRight",26);
			put("lumbarHumpRightRemarks",27);
			put("menarche",28);
			put("modificationDateKey",29);
			put("modificationTime",30);
			put("prominentHipLeft",31);
			put("prominentHipLeftRemarks",32);
			put("prominentHipRight",33);
			put("prominentHipRightRemarks",34);
			put("remarks",35);
			put("ribHumpLeft",36);
			put("ribHumpLeftRemarks",37);
			put("ribHumpRight",38);
			put("ribHumpRightRemarks",39);
			put("risser",40);
			put("rotation",41);
			put("sittingHeight",42);
			put("weight",43);
		}};
		public static Integer columnCount = 44;
	public FctCdocScoliosis() {
	}

	public Integer getScoliosisKey() {
		return this.scoliosisKey;
	}

	public void setScoliosisKey(int scoliosisKey) {
		this.scoliosisKey = scoliosisKey;
	}

	public String getC7PlumbLineLeft() {
		return this.c7PlumbLineLeft;
	}

	public void setC7PlumbLineLeft(String c7PlumbLineLeft) {
		this.c7PlumbLineLeft = c7PlumbLineLeft;
	}

	public String getC7PlumbLineLeftRemarks() {
		return this.c7PlumbLineLeftRemarks;
	}

	public void setC7PlumbLineLeftRemarks(String c7PlumbLineLeftRemarks) {
		this.c7PlumbLineLeftRemarks = c7PlumbLineLeftRemarks;
	}

	public String getC7PlumbLineRight() {
		return this.c7PlumbLineRight;
	}

	public void setC7PlumbLineRight(String c7PlumbLineRight) {
		this.c7PlumbLineRight = c7PlumbLineRight;
	}

	public String getC7PlumbLineRightRemarks() {
		return this.c7PlumbLineRightRemarks;
	}

	public void setC7PlumbLineRightRemarks(String c7PlumbLineRightRemarks) {
		this.c7PlumbLineRightRemarks = c7PlumbLineRightRemarks;
	}

	public int getCreationDateKey() {
		return this.creationDateKey;
	}

	public void setCreationDateKey(int creationDateKey) {
		this.creationDateKey = creationDateKey;
	}

	public String getCreationTime() {
		return this.creationTime;
	}

	public void setCreationTime(String creationTime) {
		this.creationTime = creationTime;
	}

	public int getEncKey() {
		return this.encKey;
	}

	public void setEncKey(int encKey) {
		this.encKey = encKey;
	}

	public String getFreeTextNote() {
		return this.freeTextNote;
	}

	public void setFreeTextNote(String freeTextNote) {
		this.freeTextNote = freeTextNote;
	}

	public String getHeight() {
		return this.height;
	}

	public void setHeight(String height) {
		this.height = height;
	}

	public String getHighAsisLeft() {
		return this.highAsisLeft;
	}

	public void setHighAsisLeft(String highAsisLeft) {
		this.highAsisLeft = highAsisLeft;
	}

	public String getHighAsisLeftRemarks() {
		return this.highAsisLeftRemarks;
	}

	public void setHighAsisLeftRemarks(String highAsisLeftRemarks) {
		this.highAsisLeftRemarks = highAsisLeftRemarks;
	}

	public String getHighAsisRight() {
		return this.highAsisRight;
	}

	public void setHighAsisRight(String highAsisRight) {
		this.highAsisRight = highAsisRight;
	}

	public String getHighAsisRightRemarks() {
		return this.highAsisRightRemarks;
	}

	public void setHighAsisRightRemarks(String highAsisRightRemarks) {
		this.highAsisRightRemarks = highAsisRightRemarks;
	}

	public String getHighShoulderLeft() {
		return this.highShoulderLeft;
	}

	public void setHighShoulderLeft(String highShoulderLeft) {
		this.highShoulderLeft = highShoulderLeft;
	}

	public String getHighShoulderLeftRemarks() {
		return this.highShoulderLeftRemarks;
	}

	public void setHighShoulderLeftRemarks(String highShoulderLeftRemarks) {
		this.highShoulderLeftRemarks = highShoulderLeftRemarks;
	}

	public String getHighShoulderRight() {
		return this.highShoulderRight;
	}

	public void setHighShoulderRight(String highShoulderRight) {
		this.highShoulderRight = highShoulderRight;
	}

	public String getHighShoulderRightRemarks() {
		return this.highShoulderRightRemarks;
	}

	public void setHighShoulderRightRemarks(String highShoulderRightRemarks) {
		this.highShoulderRightRemarks = highShoulderRightRemarks;
	}

	public int getInstitutionKey() {
		return this.institutionKey;
	}

	public void setInstitutionKey(int institutionKey) {
		this.institutionKey = institutionKey;
	}

	public String getJointLaxity() {
		return this.jointLaxity;
	}

	public void setJointLaxity(String jointLaxity) {
		this.jointLaxity = jointLaxity;
	}

	public String getLegLenDiscLeft() {
		return this.legLenDiscLeft;
	}

	public void setLegLenDiscLeft(String legLenDiscLeft) {
		this.legLenDiscLeft = legLenDiscLeft;
	}

	public String getLegLenDiscLeftRemarks() {
		return this.legLenDiscLeftRemarks;
	}

	public void setLegLenDiscLeftRemarks(String legLenDiscLeftRemarks) {
		this.legLenDiscLeftRemarks = legLenDiscLeftRemarks;
	}

	public String getLegLenDiscRight() {
		return this.legLenDiscRight;
	}

	public void setLegLenDiscRight(String legLenDiscRight) {
		this.legLenDiscRight = legLenDiscRight;
	}

	public String getLegLenDiscRightRemarks() {
		return this.legLenDiscRightRemarks;
	}

	public void setLegLenDiscRightRemarks(String legLenDiscRightRemarks) {
		this.legLenDiscRightRemarks = legLenDiscRightRemarks;
	}

	public String getLumbarHumpLeft() {
		return this.lumbarHumpLeft;
	}

	public void setLumbarHumpLeft(String lumbarHumpLeft) {
		this.lumbarHumpLeft = lumbarHumpLeft;
	}

	public String getLumbarHumpLeftRemarks() {
		return this.lumbarHumpLeftRemarks;
	}

	public void setLumbarHumpLeftRemarks(String lumbarHumpLeftRemarks) {
		this.lumbarHumpLeftRemarks = lumbarHumpLeftRemarks;
	}

	public String getLumbarHumpRight() {
		return this.lumbarHumpRight;
	}

	public void setLumbarHumpRight(String lumbarHumpRight) {
		this.lumbarHumpRight = lumbarHumpRight;
	}

	public String getLumbarHumpRightRemarks() {
		return this.lumbarHumpRightRemarks;
	}

	public void setLumbarHumpRightRemarks(String lumbarHumpRightRemarks) {
		this.lumbarHumpRightRemarks = lumbarHumpRightRemarks;
	}

	public String getMenarche() {
		return this.menarche;
	}

	public void setMenarche(String menarche) {
		this.menarche = menarche;
	}

	public int getModificationDateKey() {
		return this.modificationDateKey;
	}

	public void setModificationDateKey(int modificationDateKey) {
		this.modificationDateKey = modificationDateKey;
	}

	public String getModificationTime() {
		return this.modificationTime;
	}

	public void setModificationTime(String modificationTime) {
		this.modificationTime = modificationTime;
	}

	public String getProminentHipLeft() {
		return this.prominentHipLeft;
	}

	public void setProminentHipLeft(String prominentHipLeft) {
		this.prominentHipLeft = prominentHipLeft;
	}

	public String getProminentHipLeftRemarks() {
		return this.prominentHipLeftRemarks;
	}

	public void setProminentHipLeftRemarks(String prominentHipLeftRemarks) {
		this.prominentHipLeftRemarks = prominentHipLeftRemarks;
	}

	public String getProminentHipRight() {
		return this.prominentHipRight;
	}

	public void setProminentHipRight(String prominentHipRight) {
		this.prominentHipRight = prominentHipRight;
	}

	public String getProminentHipRightRemarks() {
		return this.prominentHipRightRemarks;
	}

	public void setProminentHipRightRemarks(String prominentHipRightRemarks) {
		this.prominentHipRightRemarks = prominentHipRightRemarks;
	}

	public String getRemarks() {
		return this.remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public String getRibHumpLeft() {
		return this.ribHumpLeft;
	}

	public void setRibHumpLeft(String ribHumpLeft) {
		this.ribHumpLeft = ribHumpLeft;
	}

	public String getRibHumpLeftRemarks() {
		return this.ribHumpLeftRemarks;
	}

	public void setRibHumpLeftRemarks(String ribHumpLeftRemarks) {
		this.ribHumpLeftRemarks = ribHumpLeftRemarks;
	}

	public String getRibHumpRight() {
		return this.ribHumpRight;
	}

	public void setRibHumpRight(String ribHumpRight) {
		this.ribHumpRight = ribHumpRight;
	}

	public String getRibHumpRightRemarks() {
		return this.ribHumpRightRemarks;
	}

	public void setRibHumpRightRemarks(String ribHumpRightRemarks) {
		this.ribHumpRightRemarks = ribHumpRightRemarks;
	}

	public String getRisser() {
		return this.risser;
	}

	public void setRisser(String risser) {
		this.risser = risser;
	}

	public String getRotation() {
		return this.rotation;
	}

	public void setRotation(String rotation) {
		this.rotation = rotation;
	}

	public String getSittingHeight() {
		return this.sittingHeight;
	}

	public void setSittingHeight(String sittingHeight) {
		this.sittingHeight = sittingHeight;
	}

	public String getWeight() {
		return this.weight;
	}

	public void setWeight(String weight) {
		this.weight = weight;
	}

}