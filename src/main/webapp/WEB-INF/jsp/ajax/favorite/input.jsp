<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">

  <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>

</head>
<body>
	<div class="container">
		<h3>즐겨 찾기 추가하기</h3>
		<label class="mt-3">제목</label>
		<input type="text" class="form-control" id="titleInput">
		<label class="mt-3">주소</label>
		<div class="d-flex">
			<input type="text" class="form-control" id="addressInput">
			<button type="button" class="btn btn-info" id="overlapBtn">중복확인</button>		
		</div>
		<button type="button" class="btn btn-success btn-block mt-3"id="addBtn">추가</button>
	</div>
	<script>
		$(document).ready(funciton(){
			
			$("#overlapBtn").on("click", function(){
				let address = $("#addressInput").val();
				
				if(address ==""){
					alert("주소를 입력하세요");
					return;
				}
				
				$.ajax({
					type:"post"
					,url:"/ajax/favorite/overlapAddress"
					,data:{"address":adddress}
					,success:function(data){
						if(data.overlapAddress){
							alert("중복된 url 입니다");
						}else{
							alert("저장 가능한 url 입니다");
						}
					}
					,error:function(){
						alert("중복확인 에러");
					}
			});
			$("#addBtn").on("click", function() {
				let title = $("#titleInput").val();
				let address = $("#addressInput").val();
				
				if(title ==""){
					alert("제목을 입력하세요");
					return;
				}
				if(address ==""){
					alert("주소를 입력하세요");
					return;
				}
				
				//https:// , http://
				//https로 시작하지 않고 http로 시작하지 않으면
				//if(!address.startsWith("https://") && !address.startsWith("http://")){
				if(!(address.startsWith("https://") || address.startsWith("http://"))){
					alert("주소 형식이 잘못 되었습니다");
					return;
				}
				
				$.ajax({
					type:"post"
					, url:"/ajax/favorite/add"
					, data:{"title":title,"address":address}
					,success:function(data){
						if(data.result == "success"){
							location.href = "/ajax/favorite/list"
						}else{
							alert("추가 실패")
						}
					}
					,error:function(){
						alert("추가 에러");
					}
				});
			}
		});
	
	
	</script>
	
	
</body>
</html>