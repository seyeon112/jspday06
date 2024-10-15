package com.app.member.controller;

import com.app.Action;

public class MemberJoinOkController implements Action {
	Result result = new Result(); 
	MemberDAO memberDAO = new MemberDAO();
	MemberVO memberVO = new MemberVO();
	
	memberVO.setMemberEmail(req.getParameter("memberEmail"));
	memberVO.setMemberName(req.getParameter("memberName"));
	memberVO.setMemberPassword(req.getParameter("memberPassword"));
	
	memberDAO.insert(memberVO);
	
	result.setRedirect(true);
	result.setPath(req.getContextPath() + "/login.member");

	
	return null;
	
}
