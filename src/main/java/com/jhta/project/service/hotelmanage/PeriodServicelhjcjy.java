package com.jhta.project.service.hotelmanage;

import java.util.Date;
import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jhta.mybatis.mapper.hotelmanage.PeriodMapperlhjcjy;


@Service
public class PeriodServicelhjcjy {
	@Autowired private PeriodMapperlhjcjy mapper;
	public String list(HashMap<String, Object> map) {
		return mapper.list(map);
	}
}
