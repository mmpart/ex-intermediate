package com.example9.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example9.domain.Baseballdetail;
import com.example9.repository.baseballRepository;

/**
 * 野球チームのサービスクラスです.
 * 
 * @author mizuki.tanimori
 *
 */
@Service
@Transactional
public class baseballService {
	
	@Autowired
	private baseballRepository baseballrepository;
	

	/**
	 * 野球チーム一覧情報を発足日の昇順で取得する.
	 * 
	 * @return　野球チーム情報
	 */
	public List<Baseballdetail> showList(){
		return baseballrepository.findAll();
	}
	
	/**
	 * 野球チーム情報を取得する.
	 * 
	 * @param id　ID
	 * @return　野球チーム詳細情報
	 */
	public Baseballdetail showDetail(Integer id) {
		return baseballrepository.load(id);
	}
	
}
