<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>${title }</h1>

	<table border="1">
		<tr>
			<th>상호명</th>
			<td>${realtor.offfice}</td>
		</tr>
		<tr>
			<th>전화번호</th>
			<td>${realtor.phoneNumber}</td>
		</tr>
		<tr>
			<th>주소</th>
			<td>${realtor.address}</td>
		</tr>
		<tr>
			<th>등급</th>
			<td>${realtor.grade}</td>
		</tr>

</body>
</html>