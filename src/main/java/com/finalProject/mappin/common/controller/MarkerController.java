package com.finalProject.mappin.common.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.finalProject.mappin.common.model.service.MarkerService;
import com.finalProject.mappin.common.model.vo.Marker;

@Controller
@RequestMapping("marker")
public class MarkerController {

	@Autowired
	private MarkerService markerService;
	
	@RequestMapping(value="/selectList.go")
	public List<Marker> selectList(){
		return markerService.selectList();
	}
	
	@RequestMapping(value="/detail.go")
	public Marker detail(int content_id, int content_type){
		return markerService.detail(content_id, content_type);
	}
	
	@RequestMapping(value="/insert.go")
	public void insert(Marker marker){
		int result = markerService.insert(marker);
	}
	
	@RequestMapping(value="/delete.go")
	public void delete(Marker marker){
		int result = markerService.delete(marker);
	}
	
	@RequestMapping(value="/update.go")
	public void update(Marker marker){
		int result = markerService.insert(marker);
	}

}
