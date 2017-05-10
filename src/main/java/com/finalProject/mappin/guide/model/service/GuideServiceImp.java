package com.finalProject.mappin.guide.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.finalProject.mappin.guide.model.dao.GuideDao;
import com.finalProject.mappin.guide.model.vo.Guide;
import com.finalProject.mappin.guide.model.vo.Guide_Detail;
import com.finalProject.mappin.guide.model.vo.Guide_review;
import com.finalProject.mappin.guide.model.vo.Marker;

@Service("guideService")
public class GuideServiceImp implements GuideService{
	
	@Autowired
	GuideDao guideDao;

	@Override
	public List<Guide> SelectList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Guide insert(Guide guide) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Guide_Detail detail(Guide_Detail guide_detail) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Guide delete(Guide guide) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Guide update(Guide guide) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Guide search_location(Guide guide) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Guide search_date(Guide guide) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Marker marker_selectList(Marker marker) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Marker marker_sInsert(Marker marker) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Marker marker_sDelete(Marker marker) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Marker marker_sUpdate(Marker marker) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Guide_review> guide_reviewList(List<Guide_review> guideList) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Guide_review guide_reiviewInsert(Guide_review guideReview) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Guide_review guide_reviewUpdate(Guide_review guideReview) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void guide_reviewDelete(Guide_review guideReview) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Guide_review guide_reviewSelect(Guide_review guideReview) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Guide_Detail detail(String package_id) {
		// TODO Auto-generated method stub
		return null;
	}

	
} 
