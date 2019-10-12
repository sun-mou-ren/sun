<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
  <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<table>
	<tr>
		<td>电脑编号</td>
		<td>电脑名字</td>
		<td>电脑价格</td>
		<td>电脑类型</td>
	</tr>
	<c:forEach items="${ComputerList}" var="computer">
	<tr>
		<td>${computer.id}</td>
		<td>${computer.name}</td>
		<td>${computer.price}</td>
		<td>${computer.type}</td>
	</tr>
	</c:forEach>
</table>
</body>
</html>