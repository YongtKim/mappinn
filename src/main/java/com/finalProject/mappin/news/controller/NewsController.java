package com.finalProject.mappin.news.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.finalProject.mappin.news.model.service.NewsService;
import com.finalProject.mappin.news.model.vo.News;

@Controller
@RequestMapping("news")
public class NewsController {

	@Autowired
	private NewsService newsService;
	
	@RequestMapping("/selectList.do")
	public ModelAndView selectList(ModelAndView mv){
		int currentPage=0;
		int limit=0;
		List<News> list = newsService.selectList(currentPage, limit);
		mv.addObject("list",list);
		mv.setViewName("news/news");
		return mv;
	}
	
	@RequestMapping("/detail.do")
	public ModelAndView detail(ModelAndView mv, HttpRequest request){
		News news = newsService.detail(request);
		mv.addObject("news",news);
		mv.setViewName("news/newsDetail");
		return mv;
	}
	
	@RequestMapping("/insert.do")
	public ModelAndView insert(ModelAndView mv, News news){
		int result = newsService.insert(news);
		if(result>0)
			mv.setViewName("news/news");
		return mv;
	}
	
	@RequestMapping("/delete.do")
	public ModelAndView delete(ModelAndView mv, HttpRequest request){
		int result = newsService.delete(request);
		if(result>0)
			mv.setViewName("news/news");	
		return mv;
	}
	
	@RequestMapping("/insert.do")
	public ModelAndView update(ModelAndView mv, News news){
		int result = newsService.update(news);
		if(result>0)
			mv.setViewName("news/newsDetail");
		return mv;
	}
}