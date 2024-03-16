package in.ashokit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import ch.qos.logback.core.model.Model;

@Controller
public class HelloController {
	@GetMapping({"/","/hello"})
	public String hello(@RequestParam(value="name",
	defaultValue="World",required=true)String name,Model model) {
	.addAttribute("name",name);
		return "hello";
	}

}
