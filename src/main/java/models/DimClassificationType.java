package models;

import java.io.Serializable;
import java.util.HashMap;

import javax.persistence.*;


/**
 * The persistent class for the DIM_CLASSIFICATION_TYPE database table.
 * 
 */
@Entity
@Table(name="DIM_CLASSIFICATION_TYPE")
@NamedQuery(name="DimClassificationType.findAll", query="SELECT d FROM DimClassificationType d")
public class DimClassificationType implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="CLASSIFICATION_TYPE_KEY")
	private Integer classificationTypeKey;

	@Column(name="CLASSIFICATION_TYPE")
	private String classificationType;

	@Column(name="CLASSIFICATION_TYPE_DESC")
	private String classificationTypeDesc;

	public static HashMap<String,Integer> mappingInfo = new HashMap<String,Integer>(){
		{
			put("classificationTypeKey",0);
			put("classificationType",1);
			put("classificationTypeDesc",2);
		}};
		public static Integer columnCount = 3;
	public DimClassificationType() {
	}

	public int getClassificationTypeKey() {
		return this.classificationTypeKey;
	}

	public void setClassificationTypeKey(int classificationTypeKey) {
		this.classificationTypeKey = classificationTypeKey;
	}

	public String getClassificationType() {
		return this.classificationType;
	}

	public void setClassificationType(String classificationType) {
		this.classificationType = classificationType;
	}

	public String getClassificationTypeDesc() {
		return this.classificationTypeDesc;
	}

	public void setClassificationTypeDesc(String classificationTypeDesc) {
		this.classificationTypeDesc = classificationTypeDesc;
	}

}