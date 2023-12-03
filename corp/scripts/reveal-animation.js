export const animate = (e, direction = 1) => {
	const coord = { x: 0, y: direction * 100 };

	if (e.classList.contains('reveal-from-left')) {
		coord.x = 100;
		coord.y = 0;
	} else if (e.classList.contains('reveal-from-right')) {
		coord.x = -100;
		coord.y = 0;
	}

	e.style.transform = `translate(${coord.x}px, ${coord.y}px)`;
	e.style.opacity = '0';
	gsap.fromTo(
		e,
		{ ...coord, autoAlpha: 0 },
		{
			duration: 1.25,
			x: 0,
			y: 0,
			autoAlpha: 1,
			ease: 'expo',
			overwrite: 'auto',
		}
	);
};

export const hide = (e) => {
	gsap.set(e, { autoAlpha: 0 });
};
