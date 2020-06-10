package models;

import java.io.Serializable;
import java.util.HashMap;

import javax.persistence.*;


/**
 * The persistent class for the DIM_MOVEMENT_TYPE database table.
 * 
 */
@Entity
@Table(name="DIM_MOVEMENT_TYPE")
@NamedQuery(name="DimMovementType.findAll", query="SELECT d FROM DimMovementType d")
public class DimMovementType implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="MOV_TYPE_KEY")
	private Integer movTypeKey;

	@Column(name="MOV_CAT_CD")
	private String movCatCd;

	@Column(name="MOV_TYPE_CD")
	private String movTypeCd;

	@Column(name="MOV_TYPE_DESC")
	private String movTypeDesc;

	public static HashMap<String,Integer> mappingInfo = new HashMap<String,Integer>(){
		{
			put("movTypeKey",0);
			put("movCatCd",1);
			put("movTypeCd",2);
			put("movTypeDesc",3);
		}};
		public static Integer columnCount = 4;
	public DimMovementType() {
	}

	public int getMovTypeKey() {
		return this.movTypeKey;
	}

	public void setMovTypeKey(int movTypeKey) {
		this.movTypeKey = movTypeKey;
	}

	public String getMovCatCd() {
		return this.movCatCd;
	}

	public void setMovCatCd(String movCatCd) {
		this.movCatCd = movCatCd;
	}

	public String getMovTypeCd() {
		return this.movTypeCd;
	}

	public void setMovTypeCd(String movTypeCd) {
		this.movTypeCd = movTypeCd;
	}

	public String getMovTypeDesc() {
		return this.movTypeDesc;
	}

	public void setMovTypeDesc(String movTypeDesc) {
		this.movTypeDesc = movTypeDesc;
	}

}