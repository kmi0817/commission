const merryChristmasHeader = document.querySelector('#business h2');
const paragraphs = document.querySelectorAll('#business p');

window.addEventListener('scroll', () => {
	const scrollValue = window.scrollY;

	// Merry Christmas header animation
	const merryChristmasOffset = merryChristmasHeader.offsetTop;
	const merryChristmasAnimation = (scrollValue - merryChristmasOffset) / 2;
	merryChristmasHeader.style.transform = `translateY(${merryChristmasAnimation}px)`;

	// Paragraphs animation
	paragraphs.forEach((paragraph) => {
		const paragraphOffset = paragraph.offsetTop;
		const paragraphAnimation = (scrollValue - paragraphOffset) / 5;
		paragraph.style.transform = `translateX(${paragraphAnimation}px)`;
	});
});
