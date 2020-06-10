package models;

import java.io.Serializable;
import java.util.HashMap;

import javax.persistence.*;


/**
 * The persistent class for the DIM_LIS_TEST_COMPOSITION database table.
 * 
 */
@Entity
@Table(name="DIM_LIS_TEST_COMPOSITION")
@NamedQuery(name="DimLisTestComposition.findAll", query="SELECT d FROM DimLisTestComposition d")
public class DimLisTestComposition implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="TEST_COMPOSITION_SID")
	private Integer testCompositionSid;

	@Column(name="CHILD_TESTCODE")
	private String childTestcode;

	@Column(name="COMBTESTID")
	private Integer combtestid;

	@Column(name="COMBTESTORDER")
	private Integer combtestorder;

	@Column(name="PARENT_TESTCODE")
	private String parentTestcode;

	@Column(name="TEST_ID")
	private Integer testId;

	public static HashMap<String,Integer> mappingInfo = new HashMap<String,Integer>(){
		{
			put("testCompositionSid",0);
			put("childTestcode",1);
			put("combtestid",2);
			put("combtestorder",3);
			put("parentTestcode",4);
			put("testId",5);
		}};
		public static Integer columnCount = 6;
	public DimLisTestComposition() {
	}

	public int getTestCompositionSid() {
		return this.testCompositionSid;
	}

	public void setTestCompositionSid(int testCompositionSid) {
		this.testCompositionSid = testCompositionSid;
	}

	public String getChildTestcode() {
		return this.childTestcode;
	}

	public void setChildTestcode(String childTestcode) {
		this.childTestcode = childTestcode;
	}

	public int getCombtestid() {
		return this.combtestid;
	}

	public void setCombtestid(int combtestid) {
		this.combtestid = combtestid;
	}

	public int getCombtestorder() {
		return this.combtestorder;
	}

	public void setCombtestorder(int combtestorder) {
		this.combtestorder = combtestorder;
	}

	public String getParentTestcode() {
		return this.parentTestcode;
	}

	public void setParentTestcode(String parentTestcode) {
		this.parentTestcode = parentTestcode;
	}

	public int getTestId() {
		return this.testId;
	}

	public void setTestId(int testId) {
		this.testId = testId;
	}

}