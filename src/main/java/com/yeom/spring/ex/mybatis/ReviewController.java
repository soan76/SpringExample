package com.yeom.spring.ex.mybatis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.yeom.spring.ex.mybatis.domain.Review;
import com.yeom.spring.ex.mybatis.service.ReviewService;

@Controller
@RequestMapping("/mybatis/review")
public class ReviewController {

	@Autowired
	private ReviewService reviewService;
	
	// Parameter로 전달받은 id와 일치하는 리뷰 정보를 json으로 Response 담는다
	@RequestMapping("/")
	@ResponseBody
	public Review review(@RequestParam("id")int id) {
		// request Parameter
		// request.getParameter("id");
		Review review = reviewService.getReview(id);
		
		return review;
	}
	
	// 리뷰 정보를 저장하는 페이지
	@RequestMapping("/create")
	@ResponseBody
	public String createReview() {
		
		// 4. 치즈피자, 염재현, 4.5, 치즈피자 존맛~
		int count = reviewService.addReview(4, "치즈피자", "염재현", 4.5, "치즈피자 존맛!");
		
		// 입력 개수 : 1 
		return "입력 개수 : " + count;
		
	}
	
	
}
