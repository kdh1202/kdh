<!-- html주석  -->
<%-- jsp주석 --%>

<!-- 디렉티브 테그  -->
<%-- 
"<%@" 로 시작하는 태그
	1.page
	2.include
 --%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.util.ArrayList"%>
<%@ page import="java.util.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script>
<!-- 이건 사용할떄 조심 -->
	window.onload = function() {
		console.log('jsp')
	}
</script>
</head>
<body>
	<%@ include file="header.jsp"%>

	<h1>jsp.jsp</h1>

	<!--  스크립틀릿 Scriptlet -->
	<%
	//  여기는 java땅 입니다
	System.out.println("test");
	out.println("<strong> 강한 글씨</strong>");

	%>

	<table border=1>
		<%
		for (int i = 0; i < 5; i++) {
		%>
		<tr>
			<td>제목</td>
			<td>내용</td>
		</tr>
		<%
		}
		%>
	</table>

	<%
	int a = 10;
	
	String name = request.getParameter("name");
	

	%>
여기서 a :<%	out.println(a);	%><br>
여기서 name : <% out.println(name); %><br>

<%-- 표현식 --%>
<%= a %><br>
<%= name %><br>
<!-- 선언문 -->
<%!
	String title="F1";
	String getTitle(){
		return this.title;
				
	}

%>
9단<br>
<%
	int b = 9;
	for(int i = 1; i <= 9;i++){	
			
%> 
	<%= b+"x"+i+ "="+(b*i) %><br>
<%
		}
%>


</body>
</html>