package com.jhta.project.controller.member_user;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.jhta.project.service.member_user.MembersService;
import com.jhta.project.vo.MembersVo;

@Controller
public class FindIdControllerjhr {
	@Autowired private MembersService service;
	@GetMapping("/jhr/findid")
	public String loginForm() {
		return "user/member_user/findid";
	}
	@PostMapping("/jhr/findid")
	public String findid(String mid, String mname, String memail, Model model) {
		HashMap<String, String> map=new HashMap<String, String>();
		map.put("mname",mname);
		map.put("memail",memail);
		MembersVo vo=service.findId(map);
		if(vo!=null) { 
			
			model.addAttribute("findName", vo.getMname()); // 사용자이름추가
			model.addAttribute("findidResult", vo.getMid());
			return "user/member_user/findidresult";
		} else {
			model.addAttribute("errMsg", "입력하신 정보와 일치하는 아이디가 없습니다.");
			return "user/member_user/findid";
		}
	}
}
