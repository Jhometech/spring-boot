package in.javahome.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class WelcomeBootController {
	@RequestMapping("/welcome")
	@ResponseBody
	public String welcome() {
		return "Welcome to Spring boot";
	}
}
