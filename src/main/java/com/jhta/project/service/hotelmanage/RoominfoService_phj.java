package com.jhta.project.service.hotelmanage;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jhta.mybatis.mapper.hotelmanage.RoominfoMapper_phj;
import com.jhta.project.vo.RoominfoVo_phj;
@Service
public class RoominfoService_phj {
@Autowired private RoominfoMapper_phj mapper;
	
	public void setMapper(RoominfoMapper_phj mapper) {
		this.mapper=mapper;
	}
	public RoominfoVo_phj select(int riid) {
		return mapper.selectRoom(riid);
	}
}
