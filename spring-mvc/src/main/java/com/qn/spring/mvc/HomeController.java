package com.qn.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
   @RequestMapping("/")
    public String welcome() {
    	return "welcome";
    	}
}
