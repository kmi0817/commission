const mainText = document.getElementById('main-text');
const left = document.getElementById('left');
const santa = document.getElementById('santa');

window.addEventListener('scroll', () => {
	const value = window.scrollY;

	mainText.style.marginTop = `${value * -2.5}px`;
	left.style.left = `${value * -1}px`;
	left.style.top = `${60 + value * -0.5}px`;
	santa.style.left = `${value * 1.5}px`;
	santa.style.top = `${60 + value * 0.5}px`;
});
