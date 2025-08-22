<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script>
const count =3
const sum = 30
console.log(`합은${sum} 개수는${count}`)
</script>

</head>
<body>
<!-- EL은 계산할떄 문자를 숫자로도 바꿔준다  --> 

\${ 10} : ${10 }<br>
<!-- null 은안나옴  -->
\${ null } *${null }*<br>
\${ 10+5 } *${ 10+5 }*<br>
\${ 10% 4 } *${ 10%4 }*<br>
<!--  문자를 숫자로 바꿈 -->
\${ "15" + 4 } *${ "15"+4 }*<br>

<!--  NUMBERformat Exception 나옴  -->

<%-- \${ "a" + "b" } *${ "a" + "b" }*<br> --%>

${ 10 } : #${ 10 }# <br>
${ null } : #${ null }# <br>
${ 10+5 } : #${ 10+5 }# <br>
${"15" + 1 } : ${"15"+1} : el 테그는 계산할 때 문자를 숫자로 바꿔준다. <br>
<%-- ${"a" + "b"} : ${"a" + 1} <br> --%>
<%-- ${"a"+1} : ${"a" + 1} <br> --%>
${"a"+=1} : ${"a"+= 1} <br>
<%
    String a = "a";
    a = a + 1;
%>
\${ 10 % 4 } *${ 10 % 4 }*<br>
\${ 10 mod 4 } *${ 10 mod 4 }*<br>


\${ 10 / 4 } *${ 10 / 4 }*<br>
\${ 10 div 4 } *${ 10 div 4 }*<br>

\${ 10 == 4 } *${ 10 == 4 }*<br>
\${ "a"=="b" } *${ "a"=="b" }*<br>
\${ "a" eq "b" } *${ "a" eq "b" }*<br>
\${ "a" eq "null" } *${ "a" eq "null" }*<br>

\${ "a" != "b" } *${ "a" != "b" }*<br>
\${ "a" ne "b" } *${ "a" ne "b" } : not equal<br>

\${ !("a" != "b") } *${ !("a" != "b") }*<br>
\${ not("a" eq "b") } *${ not("a" eq "b") }*<br>

\${ 100 > 10 } *${ 100 > 10 }*<br>
\${ 100 gt 10 } *${ 100 gt 10 } : greater then <br>
\${ 100 < 10 } *${ 100 < 10 }*<br>
\${ 100 lt 10 } *${ 100 lt 10 } : less then 또는 little then<br>

\${ "abc" < "abd" } *${ "abc" < "abd" }*<br>

a&nbsp;&nbsp;&nbsp;&nbsp;a<br>
&lt;/body&gt;

\${ 100 >= 10 } *${ 100 >= 10 }*<br>
\${ 100 ge 10 } *${ 100 ge 10 } : greater equal <br>

\${ 100 <= 10 } *${ 100 <= 10 }*<br>
\${ 100 le 10 } *${ 100 le 10 } : less equal 또는 little equal<br>

\${ (100 <= 10) eq"fales" } *${  (100 <= 10) eq"fales" }*<br>

\${ (100 > 10) && (7 != 3)} :${ (100 > 10) && (7 != 3)}<br>
\${ (100 > 10) and (7 != 3)} :${ (100 > 10) and (7 != 3)}<br>

\${ (100 gt 10) || (7 ne 3)} :${ (100 gt 10) || (7 ne 3)}<br>
\${ (100 gt 10) or (7 ne 3)} :${ (100 gt 10) or (7 ne 3)}<br>

<hr>
\${ empty "글씨" } :${ empty "글씨" }<br>
\${ empty null } :${ empty null }<br>
\${ empty "" } :${ empty "" }<br>
출력할<strong>꺼리가 있으면 </strong>empty 는 false<br>
출력할<strong>꺼리가 없으면 </strong>empty 는 true<br>
<hr>
request.getParameter("a") : <%= request.getParameter("a") %><br>
\${ param.a } : ${ param.a }#<br>
\${ param.b } : ${ param.b }#<br>


\${ paramValues.a } : ${ paramValues.a }#<br>
\${ paramValues.a[0] } : ${ paramValues.a[0] }#<br>
\${ paramValues.a[1] } : ${ paramValues.a[1] }#<br>
\${ paramValues.a[100] } : ${ paramValues.a[100] }#<br>

<hr>
request.getAttribute("a") :<%= request.getAttribute("a") %> <br>
\${ a } : ${a }<br>
\${ b } : *${b }*<br>
\${ list } : ${list }<br>
\${ list[0] } : ${list[0] }<br>

\${ arr } : *${arr }*<br>
\${ arr[0] } : *${arr[0] }*<br>

\${ map } : *${map }*<br>
\${ map["k1"] } : *${map["k1"] }*<br>
\${ map.k1 } : *${map.k1 }*<br>

\${ dto } : *${  dto }*<br>
\${ dto.ename } : *${  dto.ename }*<br>



</body>
</html>