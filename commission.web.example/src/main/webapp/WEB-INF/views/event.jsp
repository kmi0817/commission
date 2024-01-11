<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
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
	<link rel="stylesheet" href="${path}/resources/css/event.css" />
	<title>Spring Desserts</title>
</head>
<body>
	<main>
		<%@include file = "header.jsp" %>
		
		<section class="one">
			<h1>Sweets' Event!</h1>
		</section>
		
		<section class="two">
			<c:forEach items="${events}" var="event" varStatus="vs">
			<div class="reveal event">
				<p class="reveal type">${event.type}</p>
				<h2 class="reveal">${event.title}</h2>
				<p class="reveal period">${event.period}</p>
			</div>
			</c:forEach>
		</section>
	</main>
	
	<script
		src="https://cdnjs.cloudflare.com/ajax/libs/gsap/3.12.3/gsap.min.js"
		integrity="sha512-7Au1ULjlT8PP1Ygs6mDZh9NuQD0A5prSrAUiPHMXpU6g3UMd8qesVnhug5X4RoDr35x5upNpx0A6Sisz1LSTXA=="
		crossorigin="anonymous"
		referrerpolicy="no-referrer"
	></script>
	<script
		src="https://cdnjs.cloudflare.com/ajax/libs/gsap/3.12.3/ScrollTrigger.min.js"
		integrity="sha512-LQQDtPAueBcmGXKdOBcMkrhrtqM7xR2bVrnMtYZ8ImAZhFlIb5xrMqQ6uZviyeSB+4mYj89ta8niiCIQM1Gj0w=="
		crossorigin="anonymous"
		referrerpolicy="no-referrer"
	></script>
	<script type="module" src="${path}/resources/script/event.js"></script>
</body>
</html>