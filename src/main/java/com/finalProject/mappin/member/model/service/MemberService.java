package com.finalProject.mappin.member.model.service;

import com.finalProject.mappin.member.model.vo.Member;

public interface MemberService {
	Member loginCheck(Member vo);
	Member logOut(Member vo);
	Member selectList(Member vo);
	Member insert(Member vo);
	Member detail(Member vo);
	Member delete(Member vo);
	Member update(Member vo);
}
