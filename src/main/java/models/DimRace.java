package models;

import java.io.Serializable;
import java.util.HashMap;

import javax.persistence.*;


/**
 * The persistent class for the DIM_RACE database table.
 * 
 */
@Entity
@Table(name="DIM_RACE")
@NamedQuery(name="DimRace.findAll", query="SELECT d FROM DimRace d")
public class DimRace implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="RACE_KEY")
	private Integer raceKey;

	@Column(name="RACE_CD")
	private String raceCd;

	@Column(name="RACE_DESC")
	private String raceDesc;

	public static HashMap<String,Integer> mappingInfo = new HashMap<String,Integer>(){
		{
			put("raceKey",0);
			put("raceCd",1);
			put("raceDesc",2);
			
		}};
		public static Integer columnCount = 3;
	public DimRace() {
	}

	public int getRaceKey() {
		return this.raceKey;
	}

	public void setRaceKey(int raceKey) {
		this.raceKey = raceKey;
	}

	public String getRaceCd() {
		return this.raceCd;
	}

	public void setRaceCd(String raceCd) {
		this.raceCd = raceCd;
	}

	public String getRaceDesc() {
		return this.raceDesc;
	}

	public void setRaceDesc(String raceDesc) {
		this.raceDesc = raceDesc;
	}

}