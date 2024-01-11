package spring.desserts;

import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import spring.desserts.model.EventsModel;

@Controller
public class EventController {
	
	@Autowired
	EventsModel eventsModel;

	@RequestMapping(value = "/event", method = RequestMethod.GET)
	public String event(Locale locale, Model model) throws Exception {
		List<Map<String, Object>> events = eventsModel.findAll();
		model.addAttribute("events", events);
		return "event";
	}
	
	@RequestMapping(value = "/event/admin", method = RequestMethod.GET)
	public String eventAdmin(Locale locale, Model model) throws Exception {
		List<Map<String, Object>> events = eventsModel.findAll();
		model.addAttribute("events", events);
		return "admin";
	}
}
