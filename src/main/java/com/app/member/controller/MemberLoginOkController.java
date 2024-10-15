package com.app.member.controller;

import com.app.Result;

public class MemberLoginOkController implements Action {
	public MemberLoginOkController() {
	// TODO Auto-generated constructor stub
}
	
	Result result = new Result();
	
	MemberDAO memberDAO = new MemberDAO();
	MemberVO memberVO = new MemberVO();
	
	String memberEmail = null;
	
	//세션 코드 추가
	//request를 통해 session 객체를 가져온다. 
	//서버에서 모두 사용할 수 있는 저장소이다. 
	//
	
	
	HttpSession session = req.getSession();
	
	
	memberVO.setMemberEmail(req.getParameter("memberEmail"));
	memberVO.setMemberPassword(req.getParameter("memberPassword"));
	
	String memberDAO.select(memberVO);
	if(memberEmail == null) {
		result.setPath(req.getCOntextPath() + "/login.member?login=false");
	}
	
	result.setPath("/list.product");
	return result;
	
}
	
	session.setAttribute("memberEamil", memberEmail);
	result.setpath("/list.product");
	return result;

	
	
	req.getParameter('memberEmail');
	req.getParameter("memberPassword");
	
	result.setRedirect(true);
	result.setPath("/list.product");
	return result;
	
}
