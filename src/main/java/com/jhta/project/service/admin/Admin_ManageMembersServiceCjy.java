package com.jhta.project.service.admin;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jhta.mybatis.mapper.admin.Admin_ManageMembersMapperCjy;
import com.jhta.project.vo.Admin_ManageMemVo;

@Service
public class Admin_ManageMembersServiceCjy {
	@Autowired Admin_ManageMembersMapperCjy mapper;
	public List<Admin_ManageMemVo> list(){
		System.out.println("서비스 실행@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		return mapper.list();
	}
}
