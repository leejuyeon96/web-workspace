<%@page import="servlet.model.vo.MemberDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<% 
		MemberDTO dto = (MemberDTO) session.getAttribute("dto"); 
		if(dto!=null) {
	%>
		<h1>로그인 정보</h1>
		<ul>
			<c:set var="id" value="" scope="request"/>
			<c:set var="NAME" value="이름" scope="request"/>
			<c:set var="ADDRESS" value="주소" scope="request"/>
		</ul>
		<jsp:forward page="cSet2_view.jsp"/>
	<% } else { %>
		<h3>로그인 실패..! 로그인부터 하고 오세요</h3>
		<a href="login.html">login.html</a>
	<% } %>
</body>
</html>