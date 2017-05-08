package com.finalProject.mappin.community.model.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository("scrapinDao")
public class ScrapinDao {

	@Autowired
	private SqlSession sqlSession;
	
}
