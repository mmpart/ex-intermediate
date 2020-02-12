package com.example9.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Repository;

import com.example9.domain.Baseballdetail;

/**
 * 野球チーム一覧のリポジトリ―クラスです.
 * 
 * @author mizuki.tanimori
 *
 */
@Repository
public class baseballRepository {

	@Autowired
	private NamedParameterJdbcTemplate template;
	
	/**
	 * Baseballdetailオブジェクトを生成するローマッパー
	 */
	public static final RowMapper<Baseballdetail>BASEBALLDETAIL_ROW_MAPPER = (rs,i)  -> {
		Baseballdetail baseballdetail = new Baseballdetail();
		baseballdetail.setId(rs.getInt("id"));
		baseballdetail.setLeagueName(rs.getString("langue_name"));
		baseballdetail.setTeamName(rs.getString("team_name"));
		baseballdetail.setHeadquarters(rs.getString("headquarters"));
		baseballdetail.setInauguration(rs.getString("inauguration"));
		baseballdetail.setHistory(rs.getString("history"));
		return baseballdetail;
	};
	
	/**
	 * 野球チーム一覧情報を発足日の昇順で取得します.
	 * 
	 * @return 野球チーム一覧
	 */
	public List<Baseballdetail>findAll(){
		String sql = "SELECT id,league_name,team_name,headquarters,inauguration,history From teams ORDER BY inauguration";
		
		List<Baseballdetail>BaseballdetailList = template.query(sql, BASEBALLDETAIL_ROW_MAPPER);
	
		return BaseballdetailList;
	}
	
	
	/**
	 * 主キーから野球チーム詳細情報を取得します.
	 * 
	 * @param id 検索したいID
	 * @return 検索された野球チームの詳細情報
	 */
	public Baseballdetail load(Integer id) {
		String sql = "SELECT id,league_name,team_name,headquarters,inauguration,history From teams WHERE id=:id";
		
		SqlParameterSource param = new MapSqlParameterSource().addValue("id", id);
		
		Baseballdetail baseballdetail = template.queryForObject(sql, param, BASEBALLDETAIL_ROW_MAPPER);
		
		return baseballdetail;
	}
	
}
