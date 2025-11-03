<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>

<h2>시작 페이지</h2>
<sec:authorize access="isAuthenticated()">
	<div>아이디 : <sec:authentication property="principal.udto.id"/></div>
	<div>이름 : <sec:authentication property="principal.udto.name"/></div>
</sec:authorize>