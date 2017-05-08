package com.finalProject.mappin.community.model.service;

import com.finalProject.mappin.community.model.vo.Community_img;

public interface Community_imgService {

	Community_img detail(int community_id);

	int insert(Community_img community_img);

	int update(Community_img community_img);

}
