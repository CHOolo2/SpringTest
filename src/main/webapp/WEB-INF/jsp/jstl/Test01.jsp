<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSTL Core 라이브러리 1</title>
</head>
<body>

	<h2>JSTL core 변수</h2>
	<c:set var="number1" value="36"/>
	<c:set var="number2" value="3"/>
	
	<h2>JSTL core 연산</h2>
	<c:out value="${number1 + number2 }"/>
	<c:out value="${number1 - number2 }"/>
	<c:out value="${number1 * number2 }"/>
	<c:out value="${number1 / number2 }"/>
	
</body>
</html>