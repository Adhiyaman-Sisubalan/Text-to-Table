package models;

import java.io.Serializable;
import java.util.HashMap;

import javax.persistence.*;


/**
 * The persistent class for the DIM_RELATIONSHIP database table.
 * 
 */
@Entity
@Table(name="DIM_RELATIONSHIP")
@NamedQuery(name="DimRelationship.findAll", query="SELECT d FROM DimRelationship d")
public class DimRelationship implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="RELATIONSHIP_KEY")
	private Integer relationshipKey;

	@Column(name="RELATIONSHIP_CD")
	private String relationshipCd;

	@Column(name="RELATIONSHIP_DESC")
	private String relationshipDesc;

	public static HashMap<String,Integer> mappingInfo = new HashMap<String,Integer>(){
		{
			put("relationshipKey",0);
			put("relationshipCd",1);
			put("relationshipDesc",2);
			
		}};
		public static Integer columnCount = 3;
	public DimRelationship() {
	}

	public int getRelationshipKey() {
		return this.relationshipKey;
	}

	public void setRelationshipKey(int relationshipKey) {
		this.relationshipKey = relationshipKey;
	}

	public String getRelationshipCd() {
		return this.relationshipCd;
	}

	public void setRelationshipCd(String relationshipCd) {
		this.relationshipCd = relationshipCd;
	}

	public String getRelationshipDesc() {
		return this.relationshipDesc;
	}

	public void setRelationshipDesc(String relationshipDesc) {
		this.relationshipDesc = relationshipDesc;
	}

}