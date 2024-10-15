package com.app.order.controller;

import com.app.dao.MemberDAO;

public class OrderWriteOkController implements Action{
	public OrderWriteOkController() {
		// TODO Auto-generated constructor stub
		
		return null;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		Result result = new Result();
		MemberDAO memberDAO = new MemberDAO();
		HttpSession session = req.getSession();
		
		String memberEmail = (String)session.getAttribute("memberId");
		
		
		memberDAO.select(null);
		return super.clone();
	}
	
	
}
