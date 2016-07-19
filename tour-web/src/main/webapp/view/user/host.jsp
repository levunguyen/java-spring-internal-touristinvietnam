<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	isELIgnored="false" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="resource/css/service_host.css"
	type="text/css">
</head>
<body>
	<div class="list">
		<h1>List Host</h1>
	</div>
	<div class="container">
		<div class="row">
			<div class="col-sm-3">
				<a href="profile"><img class="image"
					src="resource/images/saigon.jpg"></a> <a href="profile"><h1>Sài Gòn</h1></a>
			</div>
			<div class="col-sm-3">
				<a href="profile"><img class="image"
					src="resource/images/hanoi.jpg"></a> <a href="profile"><h1>Hà Nội</h1></a>
			</div>
			<div class="col-sm-3">
				<a href="profile"><img class="image"
					src="resource/images/quangnam.jpg"></a> <a href="profile"><h1>Quảng Nam</h1></a>
			</div>
			<div class="col-sm-3">
				<a href="profile"><img class="image"
					src="resource/images/danang.jpg"></a> <a href="profile"><h1>Đà Nẵng</h1></a>
			</div>
		</div>
		 <c:forEach items="${lists}" var="host">    
      <tr>
        <td>${host.name}</td>
       <td>${host.phone}</td>
      </tr>
    </c:forEach>
	</div>
</body>
</html>