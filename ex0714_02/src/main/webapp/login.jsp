<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
		<script type="text/javascript">
			function formCheck() {
				if($("#id").val="") {
					alert("아이디를 입력하세요.")
					$("#id").focus();
					return false;
				}
				return document.form.submit();
			}
		</script>
	</head>
	<body>
		<h3>로그인</h3>
		<form action="./LoginOk" method="post" name="form">
			<label>아이디</label>
			<input type="text" id="id" name="id"> <br>
			<label>비밀번호</label>
			<input type="password" id="pw" name="pw"> <br>
			<input type="button" onclick="formCheck()" value="로그인">
			<a href="./index.jsp"><input type="button" value="돌아기기"></a> 
			
		</form>
	</body>
</html>