<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>index</title>
	</head>
	<body>
		<h3>index</h3>
		<h3>메인페이지</h3>
		<%
			String session_id = (String) session.getAttribute("id");
			String session_nickName = (String) session.getAttribute("nickName");
		%>
		<%
			if(session_id==null) {
		%>
		
			<!-- html -->
			<ul>
				<li><a href="./login.jsp">로그인</a></li>
				<li><a href="./join.jsp">회원가입</a></li>
			</ul>
		
		<%
			} else {
		%>
			<h3><%= session_nickName %>님 환영합니다.</h3>
			<ul>
				<li><a href="logout.jsp">로그아웃</a></li>
				<li>회원정보수정</li>
			</ul>
			
		<%		
			}
		%>
	</body>
</html>