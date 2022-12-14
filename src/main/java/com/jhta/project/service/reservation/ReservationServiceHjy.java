package com.jhta.project.service.reservation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jhta.mybatis.mapper.admin.ReservationMapperHjy;
import com.jhta.project.vo.ReservationRateVo;
import com.jhta.project.vo.ReservationVo;
@Service
public class ReservationServiceHjy {
	@Autowired ReservationMapperHjy mapper;
	public List<ReservationRateVo> hotelReserRate(String time){
		return mapper.hotelReserRate(time);
	};
	public List<ReservationRateVo> RoomReserRate(String time){
		return mapper.roomReserRate(time);
	};

}
