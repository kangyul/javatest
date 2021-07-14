<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>회원가입</title>
	</head>
	<body>
		<h3>회원가입</h3>
		<form action="./JoinOk" method="post" name="form">
			<label>아이디</label>
			<input type="text" id="id" name="id"> <br>
			<label>비밀번호</label>
			<input type="password" id="pw" name="pw"> <br>
			<label>이름</label>
			<input type="text" id="name" name="name"> <br>
			<label>닉네임</label>
			<input type="text" id="nickName" name="nickName"> <br>
			<label>성별</label>
			<input type="radio" name="gender" id="male" value="male"> <label for="male">남자</label>
			<input type="radio" name="gender" id="female" value="female"> <label for="female">남자</label> <br>
			<label>전화번호</label>
			<input type="text" id="tel" name="tel"> <br>
			<label>주소1</label>
			<input type="text" id="addr1" name="addr1"> <br>
			<label>주소2</label>
			<input type="text" id="addr2" name="addr2"> <br>
			<label>취미</label> <br>
			<input type="checkbox" name="hobby" id="swim" value="swim"> <label for="swim">수영</label>
			<input type="checkbox" name="hobby" id="golf" value="golf"> <label for="golf">골프</label>
			<input type="checkbox" name="hobby" id="run" value="run"> <label for="run">조깅</label>
			<input type="checkbox" name="hobby" id="read" value="read"> <label for="read">독서</label> <br>
			<input type="submit" value="회원가입완료">
			<a href="./index.jsp"><input type="button" value="돌아가기"></a> 
			
		</form>
	</body>
</html>