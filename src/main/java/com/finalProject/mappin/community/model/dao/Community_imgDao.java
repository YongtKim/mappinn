package com.finalProject.mappin.community.model.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.finalProject.mappin.community.model.vo.Community_img;

@Repository("community_imgDao")
public class Community_imgDao {
	
	@Autowired
	private SqlSession sqlSession;

	public Community_img detail(int community_id) {
		return (Community_img) sqlSession.selectOne("community_imgmapper.detail", community_id);
	}

	public int insert(Community_img community_img) {
		return sqlSession.insert("community_imgmapper.insert", community_img);
	}

	public int update(Community_img community_img) {
		return sqlSession.update("community_imgmapper.update", community_img);
	}
	
}
