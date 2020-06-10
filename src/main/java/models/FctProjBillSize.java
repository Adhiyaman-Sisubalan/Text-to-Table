package models;

import java.io.Serializable;
import java.util.HashMap;

import javax.persistence.*;


/**
 * The persistent class for the FCT_PROJ_BILL_SIZE database table.
 * 
 */
@Entity
@Table(name="FCT_PROJ_BILL_SIZE")
@NamedQuery(name="FctProjBillSize.findAll", query="SELECT f FROM FctProjBillSize f")
public class FctProjBillSize implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="PROJECT_BILL_SIZE_KEY")
	private Integer projectBillSizeKey;

	@Column(name="CUR_LOS")
	private Integer curLos;

	@Column(name="ENC_KEY")
	private Integer encKey;

	@Column(name="EST_LOS")
	private Integer estLos;

	@Column(name="INS_P1_CD")
	private String insP1Cd;

	@Column(name="INS_P1_CUR_AMT")
	private Integer insP1CurAmt;

	@Column(name="INS_P1_NAME")
	private String insP1Name;

	@Column(name="INS_P1_PROJECT_AMT")
	private Integer insP1ProjectAmt;

	@Column(name="INS_P2_CD")
	private String insP2Cd;

	@Column(name="INS_P2_CUR_AMT")
	private Integer insP2CurAmt;

	@Column(name="INS_P2_NAME")
	private String insP2Name;

	@Column(name="INS_P2_PROJECT_AMT")
	private Integer insP2ProjectAmt;

	@Column(name="INS_P3_CD")
	private String insP3Cd;

	@Column(name="INS_P3_CUR_AMT")
	private Integer insP3CurAmt;

	@Column(name="INS_P3_NAME")
	private String insP3Name;

	@Column(name="INS_P3_PROJECT_AMT")
	private Integer insP3ProjectAmt;

	@Column(name="INS_P4_CD")
	private String insP4Cd;

	@Column(name="INS_P4_CUR_AMT")
	private Integer insP4CurAmt;

	@Column(name="INS_P4_NAME")
	private String insP4Name;

	@Column(name="INS_P4_PROJECT_AMT")
	private Integer insP4ProjectAmt;

	@Column(name="INS_P5_CD")
	private String insP5Cd;

	@Column(name="INS_P5_CUR_AMT")
	private Integer insP5CurAmt;

	@Column(name="INS_P5_NAME")
	private String insP5Name;

	@Column(name="INS_P5_PROJECT_AMT")
	private Integer insP5ProjectAmt;

	@Column(name="INS_P6_CD")
	private String insP6Cd;

	@Column(name="INS_P6_CUR_AMT")
	private int insP6CurAmt;

	@Column(name="INS_P6_NAME")
	private String insP6Name;

	@Column(name="INS_P6_PROJECT_AMT")
	private int insP6ProjectAmt;

	@Column(name="INS_P7_CD")
	private String insP7Cd;

	@Column(name="INS_P7_CUR_AMT")
	private Integer insP7CurAmt;

	@Column(name="INS_P7_NAME")
	private String insP7Name;

	@Column(name="INS_P7_PROJECT_AMT")
	private Integer insP7ProjectAmt;

	@Column(name="INS_P8_CD")
	private String insP8Cd;

	@Column(name="INS_P8_CUR_AMT")
	private Integer insP8CurAmt;

	@Column(name="INS_P8_NAME")
	private String insP8Name;

	@Column(name="INS_P8_PROJECT_AMT")
	private Integer insP8ProjectAmt;

	public static HashMap<String,Integer> mappingInfo = new HashMap<String,Integer>(){
		{
			put("projectBillSizeKey",0);
			put("curLos",1);
			put("encKey",2);
			put("estLos",3);
			put("insP1Cd",4);
			put("insP1CurAmt",5);
			put("insP1Name",6);
			put("insP1ProjectAmt",7);
			put("insP2Cd",8);
			put("insP2CurAmt",9);
			put("insP2Name",10);
			put("insP2ProjectAmt",11);
			put("insP3Cd",12);
			put("insP3CurAmt",13);
			put("insP3Name",14);
			put("insP3ProjectAmt",15);
			put("insP4Cd",16);
			put("insP4CurAmt",17);
			put("insP4Name",18);
			put("insP4ProjectAmt",19);
			put("insP5Cd",20);
			put("insP5CurAmt",21);
			put("insP5Name",22);
			put("insP5ProjectAmt",23);
			put("insP6Cd",24);
			put("insP6CurAmt",25);
			put("insP6Name",26);
			put("insP6ProjectAmt",27);
			put("insP7Cd",28);
			put("insP7CurAmt",29);
			put("insP7Name",30);
			put("insP7ProjectAmt",31);
			put("insP8Cd",32);
			put("insP8CurAmt",33);
			put("insP8Name",34);
			put("insP8ProjectAmt",35);
		}};
		public static Integer columnCount = 36;
	public FctProjBillSize() {
	}

	public int getProjectBillSizeKey() {
		return this.projectBillSizeKey;
	}

	public void setProjectBillSizeKey(int projectBillSizeKey) {
		this.projectBillSizeKey = projectBillSizeKey;
	}

	public int getCurLos() {
		return this.curLos;
	}

	public void setCurLos(int curLos) {
		this.curLos = curLos;
	}

	public int getEncKey() {
		return this.encKey;
	}

	public void setEncKey(int encKey) {
		this.encKey = encKey;
	}

	public int getEstLos() {
		return this.estLos;
	}

	public void setEstLos(int estLos) {
		this.estLos = estLos;
	}

	public String getInsP1Cd() {
		return this.insP1Cd;
	}

	public void setInsP1Cd(String insP1Cd) {
		this.insP1Cd = insP1Cd;
	}

	public int getInsP1CurAmt() {
		return this.insP1CurAmt;
	}

	public void setInsP1CurAmt(int insP1CurAmt) {
		this.insP1CurAmt = insP1CurAmt;
	}

	public String getInsP1Name() {
		return this.insP1Name;
	}

	public void setInsP1Name(String insP1Name) {
		this.insP1Name = insP1Name;
	}

	public int getInsP1ProjectAmt() {
		return this.insP1ProjectAmt;
	}

	public void setInsP1ProjectAmt(int insP1ProjectAmt) {
		this.insP1ProjectAmt = insP1ProjectAmt;
	}

	public String getInsP2Cd() {
		return this.insP2Cd;
	}

	public void setInsP2Cd(String insP2Cd) {
		this.insP2Cd = insP2Cd;
	}

	public int getInsP2CurAmt() {
		return this.insP2CurAmt;
	}

	public void setInsP2CurAmt(int insP2CurAmt) {
		this.insP2CurAmt = insP2CurAmt;
	}

	public String getInsP2Name() {
		return this.insP2Name;
	}

	public void setInsP2Name(String insP2Name) {
		this.insP2Name = insP2Name;
	}

	public int getInsP2ProjectAmt() {
		return this.insP2ProjectAmt;
	}

	public void setInsP2ProjectAmt(int insP2ProjectAmt) {
		this.insP2ProjectAmt = insP2ProjectAmt;
	}

	public String getInsP3Cd() {
		return this.insP3Cd;
	}

	public void setInsP3Cd(String insP3Cd) {
		this.insP3Cd = insP3Cd;
	}

	public int getInsP3CurAmt() {
		return this.insP3CurAmt;
	}

	public void setInsP3CurAmt(int insP3CurAmt) {
		this.insP3CurAmt = insP3CurAmt;
	}

	public String getInsP3Name() {
		return this.insP3Name;
	}

	public void setInsP3Name(String insP3Name) {
		this.insP3Name = insP3Name;
	}

	public int getInsP3ProjectAmt() {
		return this.insP3ProjectAmt;
	}

	public void setInsP3ProjectAmt(int insP3ProjectAmt) {
		this.insP3ProjectAmt = insP3ProjectAmt;
	}

	public String getInsP4Cd() {
		return this.insP4Cd;
	}

	public void setInsP4Cd(String insP4Cd) {
		this.insP4Cd = insP4Cd;
	}

	public int getInsP4CurAmt() {
		return this.insP4CurAmt;
	}

	public void setInsP4CurAmt(int insP4CurAmt) {
		this.insP4CurAmt = insP4CurAmt;
	}

	public String getInsP4Name() {
		return this.insP4Name;
	}

	public void setInsP4Name(String insP4Name) {
		this.insP4Name = insP4Name;
	}

	public int getInsP4ProjectAmt() {
		return this.insP4ProjectAmt;
	}

	public void setInsP4ProjectAmt(int insP4ProjectAmt) {
		this.insP4ProjectAmt = insP4ProjectAmt;
	}

	public String getInsP5Cd() {
		return this.insP5Cd;
	}

	public void setInsP5Cd(String insP5Cd) {
		this.insP5Cd = insP5Cd;
	}

	public int getInsP5CurAmt() {
		return this.insP5CurAmt;
	}

	public void setInsP5CurAmt(int insP5CurAmt) {
		this.insP5CurAmt = insP5CurAmt;
	}

	public String getInsP5Name() {
		return this.insP5Name;
	}

	public void setInsP5Name(String insP5Name) {
		this.insP5Name = insP5Name;
	}

	public int getInsP5ProjectAmt() {
		return this.insP5ProjectAmt;
	}

	public void setInsP5ProjectAmt(int insP5ProjectAmt) {
		this.insP5ProjectAmt = insP5ProjectAmt;
	}

	public String getInsP6Cd() {
		return this.insP6Cd;
	}

	public void setInsP6Cd(String insP6Cd) {
		this.insP6Cd = insP6Cd;
	}

	public int getInsP6CurAmt() {
		return this.insP6CurAmt;
	}

	public void setInsP6CurAmt(int insP6CurAmt) {
		this.insP6CurAmt = insP6CurAmt;
	}

	public String getInsP6Name() {
		return this.insP6Name;
	}

	public void setInsP6Name(String insP6Name) {
		this.insP6Name = insP6Name;
	}

	public int getInsP6ProjectAmt() {
		return this.insP6ProjectAmt;
	}

	public void setInsP6ProjectAmt(int insP6ProjectAmt) {
		this.insP6ProjectAmt = insP6ProjectAmt;
	}

	public String getInsP7Cd() {
		return this.insP7Cd;
	}

	public void setInsP7Cd(String insP7Cd) {
		this.insP7Cd = insP7Cd;
	}

	public int getInsP7CurAmt() {
		return this.insP7CurAmt;
	}

	public void setInsP7CurAmt(int insP7CurAmt) {
		this.insP7CurAmt = insP7CurAmt;
	}

	public String getInsP7Name() {
		return this.insP7Name;
	}

	public void setInsP7Name(String insP7Name) {
		this.insP7Name = insP7Name;
	}

	public int getInsP7ProjectAmt() {
		return this.insP7ProjectAmt;
	}

	public void setInsP7ProjectAmt(int insP7ProjectAmt) {
		this.insP7ProjectAmt = insP7ProjectAmt;
	}

	public String getInsP8Cd() {
		return this.insP8Cd;
	}

	public void setInsP8Cd(String insP8Cd) {
		this.insP8Cd = insP8Cd;
	}

	public int getInsP8CurAmt() {
		return this.insP8CurAmt;
	}

	public void setInsP8CurAmt(int insP8CurAmt) {
		this.insP8CurAmt = insP8CurAmt;
	}

	public String getInsP8Name() {
		return this.insP8Name;
	}

	public void setInsP8Name(String insP8Name) {
		this.insP8Name = insP8Name;
	}

	public int getInsP8ProjectAmt() {
		return this.insP8ProjectAmt;
	}

	public void setInsP8ProjectAmt(int insP8ProjectAmt) {
		this.insP8ProjectAmt = insP8ProjectAmt;
	}

}