<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.util.*"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>JSTL</h1>
	<c:set var="a" value="10" />
	\${ a } : ${ a }
	<br>
	<%
	String name = "휴먼";
	%>
	<c:set var="name2" value="<%=name%>" />
	\${name2 } : ${name2 }
	<br>
	<c:set var="name3" value="${a }" />
	\${name3 } : ${name3 }
	<br>
	<hr>
	scope : page > rquest > session > application
	<br>
	<c:set var="a1" value="1" scope="page" />
	scope 생략하면 page
	<br>

	<c:set var="game" value="LOL" scope="page" />
	<c:set var="game" value="던파" scope="request" />
	<c:set var="game" value="메이플" scope="session" />
	<c:set var="game" value="세븐나이츠" scope="application" />
	\${game } : ${game } pageScope : ${pageScope.game }
	<br> requestScope : ${requestScope.game }
	<br> sessionScope : ${sessionScope.game }
	<br> applicationScope : ${applicationScope.game }
	<br>

	<c:if test="true">
	항상 참 <br>

	</c:if>
	<c:if test="${a eq 10}">
	a는 10 이 맞습니다 
</c:if>
	<%-- <c:if test="${a ne 10}"> --%>
	<c:if test="${not(a eq 10)}">
	a는 10 이 아닙니다 
</c:if>
	<br>

	<c:choose>
		<c:when test=" a eq 8">
 a는 8입니다
 </c:when>
		<c:when test=" a eq 9">
 a는 9입니다
 </c:when>
		<c:otherwise>
 a는 뭔지 모르겠어요
 </c:otherwise>
	</c:choose>
<br>
	<%
	List list = new ArrayList();
	for(int i=0; i<4 ; i++){
		Map map = new HashMap();
		map.put("title","노래"+i);
		map.put("singer","가수"+i);
		
		list.add(map);
	}
	%>
	<c:set var="list2" value="<%= list %>" scope="page"/> 
	그냥 첫번째 제목은 :${list2[0].title }<br>
	items<br>
	<c:forEach var="song" items="${list2 }">
	title : ${song.title }<br>
	singer : ${song.singer }<br>
	</c:forEach>
	<hr>
	begin,end<br>
	<c:forEach var="i" begin="0" end="5">
	${i}, ${list2[i].title }<br>
	</c:forEach>
	<hr>
	step<br>	
	<c:forEach var="i" begin="0" end="5" step="2">
	${i}, ${list2[i].title }<br>
	</c:forEach>
	<hr>
	varStatus<br>
	<c:forEach var="i" begin="0" end="8" step="2" varStatus="loop">
	${i}
	<c:if test="${ not(loop.last) }">
	,
	</c:if>
	<br>
	loop.index : ${ loop.index }<br>
	loop.count : ${ loop.count }<br>
	loop.first : ${ loop.first }<br>
	loop.last : ${ loop.last }<br>
	<br>
	</c:forEach>
	
	
	<hr>
	items, begin 같이사용<br>
	<c:forEach var="song" items="${list2 }" begin="1" end="2">
	${song.title }	<br>
	</c:forEach>
	<hr>
	<hr>
	
	<c:forEach var="f" begin="2" end="9">
	<c:forEach var="g" begin="1" end="9">
	 	${ f} x ${ g} = ${ f * g }<br>
	</c:forEach>
	</c:forEach>
	<hr>
	c:url<br>
	사용이유 :<br>
	1. 영어나 숫자 외한글이나 특수문자를 encoding 해줌 <br>
	2. context path 자동추가 (/proj_jsp)<br>
	3. 쿠키 금지 일때 ";jsesstionid=" <br>
	<c:url var="url1" value="/jsp1.jsp">
	<c:param name="name" value="vvvv"/>
	</c:url>
	<a href= "${url1 }" target="_blank">jsp1.jsp</a>
	<hr>
param.age : ${param.addr }<br>
c:out::::: <c:out value="${param.addr }"/><br>
특수 문자를 치환해서 문자 그 자체로 출력
<!-- 
	<: &lt;
	>: &gt;
 " " : &nbsp; (공백)
	&: &amp;
 -->


	
</body>
</html>