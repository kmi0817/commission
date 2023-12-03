gsap.timeline({
	scrollTrigger: {
		trigger: '.one',
		pin: true,
		pinSpacing: false,
		start: () => (self.offsetHeight < window.innerHeight ? 'top top' : 'bottom bottom'),
		snap: 1,
		duration: 0.5,
		markers: true,
		id: 'one',
	},
});

gsap
	.timeline({
		scrollTrigger: {
			trigger: '.two',
			scrub: true,
			pin: true,
			start: 'top top',
			end: '+=100%',
		},
		markers: true,
		id: 'two',
	})
	.from('.line', {
		scaleX: 0,
		transformOrigin: 'left center',
		ease: 'none',
	});

const animate = (e, direction = 1) => {
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

const hide = (e) => {
	gsap.set(e, { autoAlpha: 0 });
};

document.addEventListener('DOMContentLoaded', () => {
	gsap.registerPlugin(ScrollTrigger);

	const reveals = gsap.utils.toArray('.reveal');
	reveals.forEach((e) => {
		hide(e);

		ScrollTrigger.create({
			trigger: e,
			markers: true,
			onEnter: () => animate(e),
			onEnterBack: () => animate(e, -1),
			onLeave: () => hide(e),
		});
	});
});
