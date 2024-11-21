package com.qnx.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class Homecontroller {
	@RequestMapping("/")
	public String mainMenu() {
		return "main-menu";
	}
	@RequestMapping("/displayName")

		public String displayName(HttpServletRequest request,Model model) {
		String name=request.getParameter("studentName");
	
		name=name.toUpperCase();
		model.addAttribute("mname",name);
		return "display-menu";
	}
	
	
	

}