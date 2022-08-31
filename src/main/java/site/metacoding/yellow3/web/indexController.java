package site.metacoding.yellow3.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class indexController {
	
	
	@GetMapping("/yellow")
	public String index() {
		return "index";
	}
}
