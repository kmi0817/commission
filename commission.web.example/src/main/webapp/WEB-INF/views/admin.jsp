<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<c:set var="path" value="${pageContext.request.contextPath}" />
<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8" />
	<meta name="viewport" content="width=device-width, initial-scale=1.0" />
	<link
		href="https://cdn.jsdelivr.net/npm/remixicon@3.6.0/fonts/remixicon.css"
		rel="stylesheet"
	/>
	<link rel="stylesheet" href="${path}/resources/css/root.css" />
	<link rel="stylesheet" href="${path}/resources/css/header.css" />
	<link rel="stylesheet" href="${path}/resources/css/admin.css" />
	<title>Spring Desserts</title>
</head>
<body>
	<main>
		<%@include file = "header.jsp" %>
		
		<section class="one">
			<h1>Admin</h1>
		</section>
		
		<section class="two">
			<div id="list">
			<ol>
				<c:forEach items="${events}" var="event" varStatus="vs">
				<li>
					<p>
						${event.title}(${event.type}, ${event.period})
					</p>
					<button class="event-delete" type="button">
						<i id="${event.id}" class="ri-delete-bin-6-fill"></i>
					</button>
				</li>
				</c:forEach>
			</ol>
			</div>
			
			<div id="add">
				<form id="event-form" action="/event" method="POST">
					<h2>이벤트 추가</h2>
					<input id="title" class="event-item" type="text" name="title" placeholder="제목">
					<input id="type" class="event-item" type="text" name="type" placeholder="유형">
					<input id="period" class="event-item" type="text" name="period" placeholder="기간">
					<button id="form-submit" type="submit">완료</button>
				</form>
			</div>
		</section>
	</main>
	<script src="${path}/resources/script/admin.js"></script>
</body>
</html>