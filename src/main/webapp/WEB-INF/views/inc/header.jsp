<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>


	<!-- header.jsp -->
	<header>
		<h1>Spring Project</h1>
		<ul>
			<sec:authorize access="isAnonymous()">
			<li><a href="/project/member/add">회원가입</a></li>
			<li><a href="/project/member/login">로그인</a></li>
			</sec:authorize>
			<sec:authorize access="isAuthenticated()">
			<li><a href="#!" id="btnLogOut">로그아웃</a></li>
			</sec:authorize>
			<li class="divider"/>
			<li><a href="/project/board/list">게시판</a></li>
		</ul>
	</header>

	<form action="/project/member/logout" method="post" id="formLogOut">
		<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
	</form>
	
	<script>
		document.getElementById('btnLogOut').onclick = () => {
			document.getElementById('formLogOut').submit();
		};
	
	</script>