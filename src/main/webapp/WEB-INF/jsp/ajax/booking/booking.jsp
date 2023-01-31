<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">

  <script src="https://code.jquery.com/jquery-3.6.0.min.js" integrity="sha256-/xUj+3OJU5yExlq6GSYGSHk7tPXikynS7ogEvDej/m4=" crossorigin="anonymous"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
<link rel="stylesheet" href="/ajax/booking/styles.css" Type="text/css">
</head>
<body> 
	<div id="wrap" class="bg-dark">
		<header class="bg-success">
			<h2>통나무 팬션</h2>
		</header>
		<nav class="main-menu bg-primary">
			<ul  class="nav">
				<li class="nav-item"><a class="nav-link" href="#">펜션소개</a></li>
				<li class="nav-item"><a class="nav-link" href="#">객실보기</a></li>
				<li class="nav-item"><a class="nav-link" href="#">예약하기</a></li>
				<li class="nav-item"><a class="nav-link" href="#">예약목록</a></li>
			</ul>
		</nav>
		<div>예약 목록 보기</div>
		<table class="table text-center">
			<thead>
				<tr>
					<th>이름</th>
					<th>예약날짜</th>
					<th>숙박일수</th>
					<th>숙박인원</th>
					<th>전화번호</th>
					<th>예약상태</th>
				</tr>
			</thead>
			<tbody>
			<c:forEach var="booking" items="${bookingList }" varStatus="status">
				<tr>
					<td>ㅇㅇㅇ</td>
					<td>2222년 12월 33일</td>
					<td>2</td>
					<td>3</td>
					<td>010-123-456</td>
					<td>확인중</td>
				</tr>
			</c:forEach>
			</tbody>
		</table>
		<footer class="small text-secondary">
			<div>[07855]제주특별자치도 제주시 애월읍</div>
			<div>Copyright © cholo 2023</div>
		</footer>
	</div>
</body>
</html>