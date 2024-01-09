package spring.desserts;

import java.text.DateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import spring.desserts.model.DessertsModel;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	@Autowired
	DessertsModel dessertsModel;
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@Inject
	SpringIoCTest springIoCTestObj;
	
	/**
	 * Simply selects the home view to render by returning its name.
	 * @throws Exception 
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) throws Exception {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		springIoCTestObj.set("Hello IoC and DI");
		model.addAttribute("testText", springIoCTestObj.getMessage());

		List<Map<String, Object>> desserts = dessertsModel.findAll();
		
		for (Map<String, Object> dessert: desserts) {
			System.out.println(dessert);
		}
		
		model.addAttribute("desserts", desserts);

		return "home";
	}

	@RequestMapping(value="/readmore", params= {"id"}, method = RequestMethod.GET)
	public String readmore(Locale locale, Model model, @RequestParam HashMap<String, Object> params) throws Exception {
		int index = Integer.parseInt(params.get("id").toString()) - 1;
		List<Map<String, Object>> desserts = dessertsModel.findAll();
		Map<String, Object> dessert = desserts.get(index);

		model.addAttribute("id", dessert.get("id"));
		model.addAttribute("name", dessert.get("name"));
		model.addAttribute("description", dessert.get("description"));
//		System.out.println("Model Value: " + model);
		
		return "readmore";
	}
}
