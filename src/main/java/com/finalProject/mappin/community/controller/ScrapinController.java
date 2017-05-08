package com.finalProject.mappin.community.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.finalProject.mappin.community.model.service.ScrapinService;
import com.finalProject.mappin.community.model.vo.Scrapin;
import com.finalProject.mappin.member.model.vo.Member;

@Controller("scrapin")
public class ScrapinController {

	@Autowired
	private ScrapinService scrapinService;
	
	@RequestMapping("/selectList")
	public ModelAndView selectList(ModelAndView mv, Member member){
		List<Scrapin> list= scrapinService.selectList(member.getMember_id());
		System.out.println("d");
		return mv;	
	}
	
}
