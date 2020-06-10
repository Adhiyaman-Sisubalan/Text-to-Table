package models;

import java.io.Serializable;
import java.util.HashMap;

import javax.persistence.*;


/**
 * The persistent class for the DIM_DOCUMENT_TYPE database table.
 * 
 */
@Entity
@Table(name="DIM_DOCUMENT_TYPE")
@NamedQuery(name="DimDocumentType.findAll", query="SELECT d FROM DimDocumentType d")
public class DimDocumentType implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="DOCUMENT_TYPE_KEY")
	private Integer documentTypeKey;

	@Column(name="DOCUMENT_TYPE_CD")
	private String documentTypeCd;

	@Column(name="DOCUMENT_TYPE_DESC")
	private String documentTypeDesc;

	public static HashMap<String,Integer> mappingInfo = new HashMap<String,Integer>(){
		{
			put("documentTypeKey",0);
			put("documentTypeCd",1);
			put("documentTypeDesc",2);
		}};
		public static Integer columnCount = 3;
	public DimDocumentType() {
	}

	public int getDocumentTypeKey() {
		return this.documentTypeKey;
	}

	public void setDocumentTypeKey(int documentTypeKey) {
		this.documentTypeKey = documentTypeKey;
	}

	public String getDocumentTypeCd() {
		return this.documentTypeCd;
	}

	public void setDocumentTypeCd(String documentTypeCd) {
		this.documentTypeCd = documentTypeCd;
	}

	public String getDocumentTypeDesc() {
		return this.documentTypeDesc;
	}

	public void setDocumentTypeDesc(String documentTypeDesc) {
		this.documentTypeDesc = documentTypeDesc;
	}

}