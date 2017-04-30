package urouen.sepa.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {
	@RequestMapping(value="/", method=RequestMethod.GET)
	
	public @ResponseBody String home() {
	    return "<html><head><head><body><h1>hello world</h1><body></html>";
	}
}
