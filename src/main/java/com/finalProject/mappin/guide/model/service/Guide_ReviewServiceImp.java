package com.finalProject.mappin.guide.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.finalProject.mappin.guide.model.dao.GuideDao;
import com.finalProject.mappin.guide.model.vo.Guide;
import com.finalProject.mappin.guide.model.vo.Guide_Detail;
import com.finalProject.mappin.guide.model.vo.Guide_review;
import com.finalProject.mappin.guide.model.vo.Marker;

@Service("guide_ReviewService")
public class Guide_ReviewServiceImp implements Guide_ReviewService{
	
	@Autowired
	Guide_ReviewDao guide_ReviewDao;

	

	
} 
