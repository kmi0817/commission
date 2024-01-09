package spring.desserts;

import java.util.Locale;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class EventController {

	@RequestMapping(value = "/event", method = RequestMethod.GET)
	public static String home(Locale locale, Model model) throws Exception {
		return "event";
	}
}
