package com.yeom.spring.ex.database.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.yeom.spring.ex.database.domain.UsedGoods;

// 데이터베이스 관련 처리
// 쿼리 수행
// repository를 쓰면 Mapper를 써야 함
@Mapper 
public interface UsedGoodsRepository {
	
	// usedgoods 모든 행 조회
	// 여러행 을 조회할 때는 list객체로 조회가 됨
	public List<UsedGoods> selectUsedGoodsList();
	
	
	
}
