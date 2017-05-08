package com.finalProject.mappin.member.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.finalProject.mappin.member.model.service.MessageService;
import com.finalProject.mappin.member.model.vo.Member;

@Controller
public class MessageController {

	@Autowired
	private MessageService messageService;
	
	@RequestMapping("selectList.do")
	public ModelAndView selectList(Member member, ModelAndView mv, HttpSession session){
		return mv;
	}
	
	@RequestMapping("insert.do")
	public ModelAndView insert(Member member, ModelAndView mv, HttpSession session){
		return mv;
	}
	
	@RequestMapping("detail.do")
	public ModelAndView detail(Member member, ModelAndView mv, HttpSession session){
		return mv;
	}
	
	@RequestMapping("delete.do")
	public ModelAndView delete(Member member, ModelAndView mv, HttpSession session){
		return mv;
	}
}
