package hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {

	@RequestMapping(value = "/hello")
	public String home() {
		System.out.println("Its Working!");
		return "oi";
	}
	
}
