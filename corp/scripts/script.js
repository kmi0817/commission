import { animate, hide } from './reveal-animation.js';

// one
gsap.timeline({
	scrollTrigger: {
		trigger: '.one',
		pin: true,
		pinSpacing: false,
		start: () => (self.offsetHeight < window.innerHeight ? 'top top' : 'bottom bottom'),
		snap: 1,
		duration: 1,
		// markers: true,
		// id: 'one',
	},
});

// two
gsap
	.timeline({
		scrollTrigger: {
			trigger: '.two',
			scrub: true,
			pin: true,
			start: 'top top',
			end: '+=100%',
		},
		// markers: true,
		// id: 'two',
	})
	.from('.line', {
		scaleX: 0,
		transformOrigin: 'left center',
		ease: 'none',
	});

// three
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

// four
gsap.timeline({
	scrollTrigger: {
		trigger: '.four',
		scrub: true,
		pin: true,
		start: 'top top',
		end: '+=100%',
		// markers: true,
		// id: 'four',
	},
});

gsap
	.timeline({
		scrollTrigger: {
			trigger: '.four',
			start: 'center center',
			scrub: true,
			// markers: true,
		},
	})
	.from('.p1', { opacity: 0, y: 50, duration: 5 })
	.to('.p1', { opacity: 0, y: -50, duration: 5 })
	.from('.p2', { opacity: 0, y: 50, duration: 5 })
	.to('.p2', { opacity: 0, y: -50, duration: 5 })
	.from('.p3', { opacity: 0, y: 50, duration: 5 })
	.to('.p3', { opacity: 0, y: -50, duration: 5 })
	.from('.p4', { opacity: 0, y: 50, duration: 5 })
	.to('.p4', { opacity: 0, y: -50, duration: 5 })
	.from('.p5', { opacity: 0, y: 50, duration: 5 })
	.to('.p5', { opacity: 0, y: -50, duration: 5 })
	.from('.p6', { opacity: 0, y: 50, duration: 5 })
	.to('.p6', { opacity: 0, y: -50, duration: 5 });

// five
