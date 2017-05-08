package com.finalProject.mappin.member.model.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.finalProject.mappin.member.model.vo.Member;

@Repository("messageDao")
public class MessageDao {
	
	@Autowired
	private SqlSession sqlSession;
	
	public MessageDao(){}
	
	public Member selectList(Member loginVo){
		return null;
	}
	
	public Member insert(Member loginVo){
		return null;
	}
	
	public Member detail(Member loginVo){
		return null;
	}
	
	public Member delete(Member loginVo){
		return null;
	}
}
