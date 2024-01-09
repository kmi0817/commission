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
	<title>Spring Desserts</title>
</head>
<body>
	<main>
		<%@include file = "header.jsp" %>
	</main>
</body>
</html>