package com.finalProject.mappin.community.model.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.finalProject.mappin.community.model.vo.Scrapin;

@Service("scrapinService")
@Transactional
public class ScrapinServiceImp implements ScrapinService{

	@Override
	public List<Scrapin> selectList(String member_id) {
		return null;
	}

}
