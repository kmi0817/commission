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
	<link rel="stylesheet" href="${path}/resources/css/style.css" />
	<title>Spring Desserts</title>
</head>
<body>
	<main>
		<%@include file = "header.jsp" %>

		<section class="one">
			<h1>Sweets</h1>
			<img id="straw" src="${path}/resources/assets/straw.png" />
			<img id="icecream3" src="${path}/resources/assets/icecream3.png" />
			<img id="cupcake2" src="${path}/resources/assets/cupcake2.png" />
			<img id="candy1" src="${path}/resources/assets/candy1.png" />
			<img id="americano" src="${path}/resources/assets/americano.png" />
		</section>
	
		<section class="two">
			<div class="left">
				<svg viewBox="0 0 200 200" xmlns="http://www.w3.org/2000/svg">
					<path
						fill="#FFD6A5"
						d="M37,-44.7C51.7,-40.2,70.1,-34.5,77.7,-22.5C85.3,-10.6,82.2,7.6,75.4,23.3C68.6,39.1,58.2,52.4,45,57C31.9,61.6,15.9,57.5,-0.9,58.8C-17.8,60,-35.6,66.8,-47.7,61.8C-59.9,56.9,-66.4,40.3,-72.9,23.1C-79.3,5.8,-85.7,-12,-79.9,-24.8C-74.2,-37.6,-56.3,-45.2,-40.9,-49.4C-25.6,-53.7,-12.8,-54.5,-0.8,-53.3C11.1,-52.2,22.3,-49.1,37,-44.7Z"
						transform="translate(100 100)"
					/>
				</svg>
			</div>
			<div class="right">
				<h1>Dessert of the Month</h1>
				<p>
					Lorem ipsum dolor sit amet consectetur adipisicing elit. Vero aliquid culpa quasi
					placeat inventore, vel quaerat totam nihil blanditiis dolorum voluptate ea in eveniet
					cupiditate quam officia? Doloribus illum laudantium vitae, magni obcaecati dolor earum
					tenetur iste ab laboriosam fuga corporis veniam cumque quisquam voluptates cupiditate
					quod sint dolorum ex vero, cum aliquid ipsum, magnam quos? Eum error facere iusto
					adipisci blanditiis dolores qui sequi, a odio, illum laboriosam. Obcaecati nulla vero
					assumenda eligendi quisquam tempora eius corrupti dolor quo a? Vitae molestias harum
					laborum est, quo ipsum temporibus libero iusto alias sit blanditiis expedita et quidem.
					Distinctio, non adipisci!
				</p>
			</div>
		</section>
	
		<section id="menu" class="three">
			<div class="card first">
				<img id="strawberry" src="${path}/resources/assets/strawberry.png" />
				<img id="cake1" src="${path}/resources/assets/cake1.png" />
				<h1>${desserts.get(0).name}</h1>
				<a href="/example/readmore?id=${desserts.get(0).id }"><button>Read More</button></a>
			</div>
			<div class="card second">
				<h1>${desserts.get(1).name}</h1>
				<a href="/example/readmore?id=${desserts.get(1).id}"><button>Read More</button></a>
			</div>
			<div class="card thrid">
				<img id="lime" src="${path}/resources/assets/mint.png" />
				<img id="cupcake3" src="${path}/resources/assets/cupcake3.png" />
				<h1>${desserts.get(2).name}</h1>
				<a href="/example/readmore?id=${desserts.get(2).id}"><button>Read More</button></a>
			</div>
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
	<script src="${path}/resources/script/script.js"></script>
</body>
</html>
