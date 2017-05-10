package com.finalProject.mappin.guide.model.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.finalProject.mappin.guide.model.vo.Guide_review;
import com.finalProject.mappin.guide.model.vo.Guide;
import com.finalProject.mappin.guide.model.vo.Guide_Detail;
import com.finalProject.mappin.guide.model.vo.Guide_review;
import com.finalProject.mappin.guide.model.vo.Marker;

@Repository("guideDao")
public class GuideDao {

	@Autowired
	private SqlSession sqlSession;

	public GuideDao() {
	}

	public List<Guide> SelectList(List<Guide> guideList) {
		return ;
	}

	public int insert(Guide guide) {
		return sqlSession.insert("mapper.dsfi");
	}

	public Guide_Detail detail(Guide_Detail guide_detail) {
		return guide_detail;
	}

	public int delete(Guide guide) {
		return guide;
	}

	public int update(Guide guide) {
		return guide;
	}

	public Guide search_location(Guide guide) {
		return guide;
	}

	public Guide search_date(Guide guide) {
		return guide;
	}

	public Marker marker_selectList(Marker marker) {
		return marker;
	}

	public Marker marker_sInsert(Marker marker) {
		return marker;
	}

	public Marker marker_sDelete(Marker marker) {
		return marker;
	}

	public Marker marker_sUpdate(Marker marker) {
		return marker;
	}

	public List<Guide_review> guide_reviewList(List<Guide_review> guideList){
		return guideList;
	}

	public Guide_review guide_reiviewInsert(Guide_review guideReview) {
		return guideReview;
	}

	public Guide_review guide_reviewUpdate(Guide_review guideReview) {
		return guideReview;
	}

	public void guide_reviewDelete(Guide_review guideReview) {
		
	}

	public Guide_review guide_reviewSelect(Guide_review guideReview) {
		return guideReview;
	}
}
