package com.jhta.project.service.hotelmanage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jhta.mybatis.mapper.hotelmanage.Additional_feeMapper_phj;
import com.jhta.project.vo.Additional_FeeVo_phj;

@Service
public class Additional_feeService_phj {
	@Autowired private Additional_feeMapper_phj mapper;
	public Additional_FeeVo_phj selectFee(int riid) {
		return mapper.selectFee(riid);
	}
	
}
