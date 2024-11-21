package com.qn.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
   @RequestMapping("/")
    public String mainMenu() {
    	return "main-menu";
    	}
   @RequestMapping("displayName")
   public String display() {
      	return "display-menu";
   	}
}
