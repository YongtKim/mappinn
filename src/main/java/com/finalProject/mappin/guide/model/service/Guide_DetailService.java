package com.finalProject.mappin.guide.model.service;

import java.util.List;

import com.finalProject.mappin.guide.model.vo.Guide;
import com.finalProject.mappin.guide.model.vo.Guide_Detail;
import com.finalProject.mappin.guide.model.vo.Guide_review;
import com.finalProject.mappin.guide.model.vo.Marker;

public interface Guide_DetailService {

	int insert(Guide_Detail guidedetail);

	List<Guide_Detail> detail(int package_id);

	int update(Guide_Detail guidedetail);


}
