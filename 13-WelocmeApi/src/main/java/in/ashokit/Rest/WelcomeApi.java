package in.ashokit.Rest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WelcomeApi {
	@GetMapping("/")
	public String getApi() {
		return "index";
	}

}
