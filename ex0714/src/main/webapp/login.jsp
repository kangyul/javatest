<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>login</title>
		<script src="http://code.jquery.com/jquery-latest.min.js"></script>
		<script type="text/javascript">
			$(function() {
				
				var msg1="<%= request.getParameter("msg")%>";
				
				if(msg1!="null") {
					alert(msg1);
				} 
				
			});
		
			function formCheck() {
				if($("#id").val()=="") {
					alert("id를 입력해주세요.");
					$("#id").focus();
					return false;
				}
				return document.Login_form.submit();
			}
		</script>
	</head>
	<body>
		<h3>로그인</h3>
		<form action="./LoginOk" name="Login_form" method="post">
			<label>아이디</label>
			<input type="text" id="id" name="id"> <br>
			<label>패스워드</label>
			<input type="password" id="pw" name="pw"> <br>
			<input type="button" onclick="formCheck()" value="로그인">
			<a href="./index.jsp"><input type="button" value="취소"></a> <br>
		</form>
	</body>
</html>