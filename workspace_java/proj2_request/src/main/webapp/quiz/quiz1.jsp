<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>로그인</h1>

<form method="get" action="../quizServlet">

<input type="text" name="id"> <br>
<input type="password" name="password"> <br>

<button type="submit" name="btn1">로그인</button>
<button type="submit" name="btn2">회원가입</button>

</form>

</body>
</html>