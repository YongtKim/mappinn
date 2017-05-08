package com.finalProject.mappin.member.model.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.finalProject.mappin.member.model.dao.MemberDao;
import com.finalProject.mappin.member.model.vo.Member;

@Service
public class MemberServiceImpl implements MemberService{
	
	@Autowired
	MemberDao memberDao;

	@Override
	public Member loginCheck(Member vo) {
		return memberDao.loginCheck(vo);
	}

	@Override
	public Member logOut(Member vo){
		return memberDao.logOut(vo);
	}
	
	@Override
	public Member selectList(Member vo){
		return memberDao.selectList(vo);
	}
	
	@Override
	public Member insert(Member vo){
		return memberDao.insert(vo);
	}
	
	@Override
	public Member detail(Member vo){
		return memberDao.detail(vo);
	}
	
	@Override
	public Member delete(Member vo){
		return memberDao.delete(vo);
	}
	
	@Override
	public Member update(Member vo){
		return memberDao.update(vo);
	}
}
