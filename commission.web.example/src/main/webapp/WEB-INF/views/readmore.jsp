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
	<link rel="stylesheet" href="${path}/resources/css/readmore.css" />
	<title>Spring Desserts</title>
</head>
<body>
	<main>
		<%@include file = "header.jsp" %>
		
		<section>
			<h1>${id}. ${name}</h1>
			<img id="dessert" src="${path}/resources/assets/${name}.png" />
			<p>${description}</p>
		</section>
	</main>
</body>
</html>