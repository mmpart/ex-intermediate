package com.example9.domain;

/**
 * 野球チームのドメインクラスです.
 * 
 * @author mizuki.tanimori
 *
 */
public class Baseballdetail {

	/** ID */
	private Integer id;
	/** リーグ名 */
	private String leagueName;
	/** チーム名 */
	private String teamName;
	/** 本拠地 */
	private String headquarters;
	/** 発足 */
	private String inauguration;
	/** 歴史 */
	private String history;

	public Baseballdetail() {
	}

	public Baseballdetail(Integer id, String leagueName, String teamName, String headquarters, String inauguration,
			String history) {
		super();
		this.id = id;
		this.leagueName = leagueName;
		this.teamName = teamName;
		this.headquarters = headquarters;
		this.inauguration = inauguration;
		this.history = history;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getLeagueName() {
		return leagueName;
	}

	public void setLeagueName(String leagueName) {
		this.leagueName = leagueName;
	}

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	public String getHeadquarters() {
		return headquarters;
	}

	public void setHeadquarters(String headquarters) {
		this.headquarters = headquarters;
	}

	public String getInauguration() {
		return inauguration;
	}

	public void setInauguration(String inauguration) {
		this.inauguration = inauguration;
	}

	public String getHistory() {
		return history;
	}

	public void setHistory(String history) {
		this.history = history;
	}

	@Override
	public String toString() {
		return "baseballDomain [id=" + id + ", leagueName=" + leagueName + ", teamName=" + teamName + ", headquarters="
				+ headquarters + ", inauguration=" + inauguration + ", history=" + history + "]";
	}

}
