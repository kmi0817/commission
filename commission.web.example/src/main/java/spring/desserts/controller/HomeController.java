package spring.desserts.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import spring.desserts.domain.Dessert;
import spring.desserts.service.DessertService;

@Controller
public class HomeController {

	private final DessertService dessertService;

	public HomeController(DessertService dessertService) {
		this.dessertService = dessertService;
	}
	
	@GetMapping("/")
	public String home(Model model) {
		List<Dessert> desserts = dessertService.findDesserts();
		model.addAttribute("desserts", desserts);

		return "home";
	}

	@GetMapping("/readmore")
	public String readmore(@RequestParam(name = "id", required = true) String id, Model model) {
		Dessert dessert = dessertService.findOne((long) Integer.parseInt(id));
		
		model.addAttribute("id", dessert.getId());
		model.addAttribute("name", dessert.getName());
		model.addAttribute("description", dessert.getDescription());
		
		return "readmore";
	}
	
}
