package spring.desserts.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import spring.desserts.domain.Event;
import spring.desserts.service.EventService;

@Controller
public class EventController {
	
	private final EventService eventService;
	
	public EventController(EventService eventService) {
		this.eventService = eventService;
	}
	
	@GetMapping("/event")
	public String event(Model model) {
		List<Event> events = eventService.findEvents();
		model.addAttribute("events", events);
		return "event";
	}
	
	@PostMapping("/event")
	public String create(EventForm form) {
		Event event = new Event();
		event.setTitle(form.getTitle());
		event.setType(form.getType());
		event.setPeriod(form.getPeriod());
		
		eventService.create(event);
		
		return "redirect:/event/admin";
	}
	
	@GetMapping("/event/admin")
	public String eventAdmin(Model model) {
		List<Event> events = eventService.findEvents();
		model.addAttribute("events", events);
		return "admin";
	}
	
}
