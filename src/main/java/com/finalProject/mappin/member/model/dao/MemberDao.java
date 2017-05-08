package com.finalProject.mappin.member.model.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.finalProject.mappin.member.model.vo.Member;

@Repository("memberDao")
public class MemberDao {
	
	@Autowired
	private SqlSession sqlSession;
	
	public MemberDao(){	}
	
	public Member loginCheck(Member loginVo){
		return null;
	}
	
	public Member logOut(Member loginVo){
		return null;
	}
	
	public Member selectList(Member loginVo){
		return null;
	}

	public Member detail(Member loginVo) {
		return (Member) sqlSession.selectOne("membermapper.detail", loginVo);
	}
	
	public Member insert(Member loginVo){
		return null;
	}
	
	public Member delete(Member loginVo){
		return null;
	}
	
	public Member update(Member loginVo){
		return null;
	}
}
