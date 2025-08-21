<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>


</head>
<body>
	<form method="get" action="../quiz2">
		id:<input type="text" name="id">
		<button type="button" name="btn1" onclick="id1()">중복확인</button>
		<br> pw:<input type="password" name="pw">
		<button name="btn2">중복확인</button>
		<br>
		<span id="id1">
		<button type="submit" name="btn">회원가입</button>

	</form>
<script>
var bannedId = "dong"; // 사용 불가 아이디

function id1() {
    var idname = document.getElementById("id").value.trim();
    var msg = document.getElementById("id1");

    if(idname === bannedId){
        msg.innerText = "이 아이디는 사용할 수 없습니다.";
    } else {
        msg.innerText = "사용 가능한 아이디입니다.";
    }
}

</script>
</body>
</html>