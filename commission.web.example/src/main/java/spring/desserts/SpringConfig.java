package spring.desserts;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import spring.desserts.repository.Dessert.DessertRepository;
import spring.desserts.repository.Dessert.SqlSessionTemplateDessertRepository;
import spring.desserts.repository.Event.EventRepository;
import spring.desserts.repository.Event.SqlSessionTemplateEventRepository;

@Configuration
public class SpringConfig {
	
	@Bean
	public static DessertRepository dessertRepository() {
		return new SqlSessionTemplateDessertRepository();
	}

	@Bean
	public static EventRepository eventRepository() {
		return new SqlSessionTemplateEventRepository();
	}
	
}
