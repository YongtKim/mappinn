package com.finalProject.mappin;

import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Handles requests for the application home page.
 */
@Controller
@RequestMapping("menu")
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping("start.do")
	public String home(Locale locale, Model model) {
		return "home";
	}
	@RequestMapping("start2.do")
	public String about(Locale locale, Model model) {
		return "about";
	}
	@RequestMapping("/contact.do")
	public String contact(Locale locale, Model model) {
		return "contact";
	}
	
}
