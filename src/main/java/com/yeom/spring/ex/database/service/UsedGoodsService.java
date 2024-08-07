package com.yeom.spring.ex.database.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yeom.spring.ex.database.domain.UsedGoods;
import com.yeom.spring.ex.database.repository.UsedGoodsRepository;

// 로직 담당 business라고 불림
// 데이터를 수정 가공
// 그 외 복잡한 기능 수행
@Service
public class UsedGoodsService {
	
	// Repository 객체 관리를 스프링에게 위임
	@Autowired
	// 멤버 변수
	private UsedGoodsRepository usedGoodsRepository;
	
	// controller가 할 일이 아닌 메소드를 수행
	// 중고물품 게시글 리스트 리턴 가능
	public List<UsedGoods> getUsedGoodsList() {
		// usedgoods 테이블 모든행 조회
		List<UsedGoods> usedGoodsList = usedGoodsRepository.selectUsedGoodsList();
		
		return usedGoodsList;
		
	}
	
	
}
