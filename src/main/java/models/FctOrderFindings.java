package models;

import java.io.Serializable;
import java.util.HashMap;

import javax.persistence.*;


/**
 * The persistent class for the FCT_ORDER_FINDINGS database table.
 * 
 */
@Entity
@Table(name="FCT_ORDER_FINDINGS")
@NamedQuery(name="FctOrderFindings.findAll", query="SELECT f FROM FctOrderFindings f")
public class FctOrderFindings implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private FctOrderFindingPK id;

	@Column(name="FINDING_AMT")
	private Integer findingAmt;

	@Column(name="FINDING_AMT_UNIT_CD")
	private String findingAmtUnitCd;

	@Column(name="FINDING_CD")
	private String findingCd;

	@Column(name="INST_KEY")
	private Integer instKey;

	public static HashMap<String,Integer> mappingInfo = new HashMap<String,Integer>(){
		{
			put("id",-1);
		
			put("findingAmt",2);
			put("findingAmtUnitCd",3);
			put("findingCd",4);
			put("instKey",5);
			
			
			
		}};
	public static Integer columnCount = 6;
	public FctOrderFindings() {
	}

	public FctOrderFindingPK getId() {
		return this.id;
	}

	public void setId(FctOrderFindingPK id) {
		this.id = id;
	}

	public int getFindingAmt() {
		return this.findingAmt;
	}

	public void setFindingAmt(int findingAmt) {
		this.findingAmt = findingAmt;
	}

	public String getFindingAmtUnitCd() {
		return this.findingAmtUnitCd;
	}

	public void setFindingAmtUnitCd(String findingAmtUnitCd) {
		this.findingAmtUnitCd = findingAmtUnitCd;
	}

	public String getFindingCd() {
		return this.findingCd;
	}

	public void setFindingCd(String findingCd) {
		this.findingCd = findingCd;
	}

	public int getInstKey() {
		return this.instKey;
	}

	public void setInstKey(int instKey) {
		this.instKey = instKey;
	}

}