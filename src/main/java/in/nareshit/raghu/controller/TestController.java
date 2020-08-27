package in.nareshit.raghu.controller;

import java.security.Principal;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {

	@RequestMapping("/secure")
	public String securedPage(Model model, Principal principal) {
		System.out.println(principal);
		return "secure";
	}

	@RequestMapping("/")
	public String index(Model model) {
		return "index";
	}
	
	

	
}
