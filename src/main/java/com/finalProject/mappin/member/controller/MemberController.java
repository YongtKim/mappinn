package com.finalProject.mappin.member.controller;

import java.lang.reflect.Member;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.finalProject.mappin.member.model.service.MemberService;

@Controller
public class MemberController {

	@Autowired
	private MemberService memberService;
	
	@RequestMapping("logincheck.do")
	public ModelAndView loginCheck(Member member, ModelAndView mv, HttpSession session){
		return mv;
	}
	
	@RequestMapping("logout.do")
	public ModelAndView logout(ModelAndView mv, HttpSession session){
		return mv;
	}
	
	@RequestMapping("selectList.do")
	public ModelAndView selectList(Member member, ModelAndView mv){
		return mv;
	}
	
	@RequestMapping("insert.do")
	public ModelAndView insert(Member member, ModelAndView mv){
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
	
	@RequestMapping("update.do")
	public ModelAndView update(Member member, ModelAndView mv, HttpSession session){
		return mv;
	}
}
