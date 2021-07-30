<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>doLogin</title>
		<script type="text/javascript">
			if('${session_flag}' == 'fail') {
				alert("아이디와 패스워드가 일치하지 않습니다. 다시 로그인하세요.");
				location.href="login.do";
			} else {
				alert("로그인 성공!");
				location.href="../index.jsp";
			}
		</script>
	</head>
	<body>
	
	</body>
</html>