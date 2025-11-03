<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!-- login.jsp -->


<h2>로그인</h2>
<form action="/project/login" method="post">
<table class="vertical content">
	<tr>
		<th>아이디</th>
		<td><input type="text" class="short" name="username" required="required" /></td>
	</tr>
	<tr>
		<th>비밀번호</th>
		<td><input type="password" class="short" name="password" required="required" /></td>
	</tr>
</table>

<div>
	<button>로그인</button>
</div>
<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>

</form>