<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Spring Desserts</title>
</head>
<body>
<div>
	<%@include file = "header.jsp" %>
</div>
<div>
	<p> The time on the server is ${serverTime}. </p>
	<p> test Text: ${testText}. </p>
	<br>
	
	<table>
		<tr>
			<c:forEach items="${desserts}" var="dessert" varStatus="vs">
				<td>
					<h2> ${dessert.id}. ${dessert.name}. </h2>
					<a href="/example/readmore?id=${dessert.id}">Read More</a>
					<p> ${dessert.description}. </p>
				</td>
			</c:forEach>
		</tr>
	</table>
	
	<!--
	<form action="readmore?id={$id}" method="GET">
		<input name="id" type="text" />
		<input type="submit" />
	</form>
	-->
</div>
<div>
	<%@include file = "footer.jsp" %>
</div>
</body>
</html>
