package com.app.dao;

import org.apache.ibatis.session.SqlSession;

public class MemberDAO {
	public SqlSession sqlSession;
	
	public MemberDAO() {
		sqlSession = MyBatisConfig.getSqLSessionFactory().openSession(true);
	}

	
	//회원가입
	public void insert(MemberVO memberVO) {
		sqlSession.insert("member.insert", memberVO);
		
	}
	
	//로그인
	public void select(MemberVO memberVO) {
		return sqlSession.selectOne("member.select", memberVO);
	}
	
	//회원정보
	public MemberVO selectByEmail(String email) {
		return sqlSession.selectOne("member.selectByEmail", email);
	}
	
	//Order Insert일 때 들어가야 하는 값
	memberDAO.selectByEmail(memberEmail);
	req.getParameter("productId");
	req.getParameter("")
	
	
	
}
	
	
