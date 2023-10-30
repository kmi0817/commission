const nav = document.querySelector('nav');
const menus = nav.querySelectorAll('.menu');
const labels = nav.querySelectorAll('label');

menus.forEach((menu, index) => {
	menu.addEventListener('change', () => {
		menus.forEach((m, i) => {
			if (m !== menu && m.checked) {
				labels[i].classList.remove('checked-menu');
				m.checked = false;
			}
		});
		labels[index].classList.toggle('checked-menu');
	});
});
