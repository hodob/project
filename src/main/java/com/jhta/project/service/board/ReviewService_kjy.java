package com.jhta.project.service.board;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jhta.mybatis.mapper.board.ReviewMapperkjy;
import com.jhta.project.vo.ReviewVo_kjy;

@Service
public class ReviewService_kjy {
	@Autowired private ReviewMapperkjy mapper;
	public List<ReviewVo_kjy> list(HashMap<String, Object> map){
		return mapper.list(map);
	}
	public HashMap<String, Object> sumstar(int aid) {
		return mapper.sumstar(aid);
	}
	public int count(int aid) {
		return mapper.count(aid);
	}
	public HashMap<String, Object> reviewin(int rid){
		return mapper.reviewin(rid);
	}
	public int reviewinsert(ReviewVo_kjy vo) {
		return mapper.reviewinsert(vo);
	}
}
