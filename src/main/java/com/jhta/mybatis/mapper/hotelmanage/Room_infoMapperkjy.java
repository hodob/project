package com.jhta.mybatis.mapper.hotelmanage;

import java.util.HashMap;
import java.util.List;

import com.jhta.project.vo.Room_infoVo_kjy;

public interface Room_infoMapperkjy {
	List<Room_infoVo_kjy> list(HashMap<String, Object> map);
	String daylist(HashMap<String, Object> map);
	int personnel(int riid);
}
