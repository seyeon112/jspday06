<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인</title>
</head>
<body>

<c:if test = "${not empty param.login}">
	<script>
		alert("아이디 또는 비밀번호를 확인해주세요!") 
	</script>
</c:if>


<form action="login-ok.member" method="post">
	<div>
		<input type= "text" name="memberEmail" placeholder="아이디" />
	</div>
	<div>
		<input type= "password" name="memberPassword" placeholder="비밀번호" />
	</div>
	
	
	
	<button>회원가입 완료</button>
</form>


</body>
</html>