<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입</title>
</head>
<body>

<form action="join-ok.member" method="post">
	<div>
		<input type= "text" name="memberEmail" placeholder="아이디" />
	</div>
	<div>
		<input type= "password" name="memberPassword" placeholder="비밀번호" />
	</div>
	<div>
		<input type= "text" name="memberName" placeholder="이름 입력" />
	</div>
	
	<button>회원가입 완료</button>
</form>

 
	

</body>

<script>
	const inputs = document.querySelectorAll("input");
	for(let input of inputs){
		if(input.value){
			
		}
	}
</script>
</html>