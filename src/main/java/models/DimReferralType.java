package models;

import java.io.Serializable;
import java.util.HashMap;

import javax.persistence.*;


/**
 * The persistent class for the DIM_REFERRAL_TYPE database table.
 * 
 */
@Entity
@Table(name="DIM_REFERRAL_TYPE")
@NamedQuery(name="DimReferralType.findAll", query="SELECT d FROM DimReferralType d")
public class DimReferralType implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="REF_TYPE_KEY")
	private Integer refTypeKey;

	@Column(name="REF_TYPE")
	private String refType;

	@Column(name="REF_TYPE_CD")
	private String refTypeCd;

	public static HashMap<String,Integer> mappingInfo = new HashMap<String,Integer>(){
		{
			put("refTypeKey",0);
			put("refType",1);
			put("refTypeCd",2);
			
		}};
		public static Integer columnCount = 3;
	public DimReferralType() {
	}

	public int getRefTypeKey() {
		return this.refTypeKey;
	}

	public void setRefTypeKey(int refTypeKey) {
		this.refTypeKey = refTypeKey;
	}

	public String getRefType() {
		return this.refType;
	}

	public void setRefType(String refType) {
		this.refType = refType;
	}

	public String getRefTypeCd() {
		return this.refTypeCd;
	}

	public void setRefTypeCd(String refTypeCd) {
		this.refTypeCd = refTypeCd;
	}

}