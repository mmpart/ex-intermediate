package com.example9.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example9.form.BaseballdetailForm;
import com.example9.service.baseballService;

/**
 * 野球チーム情報を検索する.
 * 
 * @author mizuki.tanimori
 *
 */
@Controller
@RequestMapping("/baseball")
public class baseballController {
	
	@Autowired
	private baseballService baseballservice;
	
	@ModelAttribute
	public BaseballdetailForm setUpBaseballdetailForm() {
		return new BaseballdetailForm();
	}

	/**
	 * 野球チームの全件取得をする.
	 * 
	 * @param model リクエストスコープ
	 * @return 野球チーム情報
	 */
	@RequestMapping("/showList")
	public String showList(Model model) {
		model.addAttribute("baseballList",	baseballservice.showList());
		return "baseballteamList";
	}
	
	/**
	 * IDをもとに野球チーム情報を取得する.
	 * 
	 * @param id ID
	 * @param model　リクエストスコープ
	 * @return　野球チーム情報
	 */
	@RequestMapping("/showDetail")
	public String showDetail(String id,Model model) {
		model.addAttribute("baseball", baseballservice.showDetail(Integer.parseInt(id)));
		return "baseballDetail";
	}
}
