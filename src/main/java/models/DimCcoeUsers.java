package models;

import java.io.Serializable;
import java.util.HashMap;

import javax.persistence.*;


/**
 * The persistent class for the DIM_CCOE_USERS database table.
 * 
 */
@Entity
@Table(name="DIM_CCOE_USERS")
@NamedQuery(name="DimCcoeUsers.findAll", query="SELECT d FROM DimCcoeUsers d")
public class DimCcoeUsers implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="USER_SID")
	private Integer userSid;

	@Column(name="MCR")
	private String mcr;

	@Column(name="USER_NAME")
	private String userName;

	
	public static HashMap<String,Integer> mappingInfo = new HashMap<String,Integer>(){
		{
			put("userSid",0);
			put("mcr",1);
			put("userName",2);
			
		}};
		public static Integer columnCount = 3;
	public DimCcoeUsers() {
	}

	public int getUserSid() {
		return this.userSid;
	}

	public void setUserSid(int userSid) {
		this.userSid = userSid;
	}

	public String getMcr() {
		return this.mcr;
	}

	public void setMcr(String mcr) {
		this.mcr = mcr;
	}

	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

}