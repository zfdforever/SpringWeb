package cn.org.freid.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class FrontPageController {

	@RequestMapping(method = RequestMethod.GET)
	public String toHomePage(ModelMap model){
		model.addAttribute("1", "");
		return "home";
	}

}
