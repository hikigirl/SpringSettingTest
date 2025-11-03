<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<h2>회원가입</h2>
<form action="/project/member/addok" method="POST">
<table class="vertical">
	<tr>
		<th>아이디</th>
		<td><input type="text" required="required" name="id" /></td>
	</tr>
	<tr>
		<th>이름</th>
		<td><input type="text" required="required" name="name"/></td>
	</tr>
	<tr>
		<th>암호</th>
		<td><input type="text" required="required" name="pw"/></td>
	</tr>
	<tr>
		<th>이메일</th>
		<td><input type="text" required="required" name="email"/></td>
	</tr>
	
	<tr>
		<th>나이</th>
		<td><input type="number" required="required" name="age" min="1" max="120"/></td>
	</tr>	
</table>
<div>
	<button>가입하기</button>
</div>

<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>

</form>