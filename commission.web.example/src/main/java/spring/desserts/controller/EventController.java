package spring.desserts.controller;

import java.util.List;
import java.util.Locale;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import spring.desserts.domain.Event;
import spring.desserts.service.EventService;

@Controller
public class EventController {
	
	private final EventService eventService;
	
	public EventController(EventService eventService) {
		this.eventService = eventService;
	}
	
	@GetMapping("/event")
	public String event(Locale locale, Model model) throws Exception {
		List<Event> events = eventService.findEvents();
		model.addAttribute("events", events);
		return "event";
	}
	
	@GetMapping("/event/admin")
	public String eventAdmin(Locale locale, Model model) throws Exception {
		List<Event> events = eventService.findEvents();
		model.addAttribute("events", events);
		return "admin";
	}
	
}
