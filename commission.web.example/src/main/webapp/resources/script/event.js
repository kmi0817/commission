import { animate, hide } from './reveal-animation.js';

document.addEventListener('DOMContentLoaded', () => {
	gsap.registerPlugin(ScrollTrigger);

	const reveals = gsap.utils.toArray('.reveal');
	reveals.forEach((e) => {
		hide(e);

		ScrollTrigger.create({
			trigger: e,
			// markers: true,
			onEnter: () => animate(e),
			onEnterBack: () => animate(e, -1),
			onLeave: () => hide(e),
		});
	});

	const pops = gsap.utils.toArray('.pop');
	pops.forEach((e) => {
		gsap.from(e, {
			opacity: 0,
			scale: 0.5,
			scrollTrigger: {
				trigger: e,
				toggleActions: 'restart none none reverse',
			},
		});
	});
});