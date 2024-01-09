package spring.desserts;

import org.springframework.stereotype.Service;

@Service
public class SpringIoCTest {
	private String message;
	
	public void set(String message) {
		this.message = message;
	}
	
	public String getMessage() {
		return message;
	}
}
