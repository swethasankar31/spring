package com.qnx.springhibernate;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.qnx.springmodel.HibernateManager;

@Controller
public class AccountController {
 @RequestMapping("/")
 public String index() {
	 return "index";
 }
 @RequestMapping("/register")
 public String register() {
	 return "register";
 }
 @RequestMapping("/registerForm")
 public String registerForm(@RequestParam("name") String name,@RequestParam("username") String username,
		 @RequestParam("password") String password,@RequestParam("email") String email,Model model){
	HibernateManager hm=new HibernateManager();
	int status=hm.register(name,username,password,email);
	if(status==1) {
		return "register-success";
//		return "success";
	}
	else {
		return "register-failure";
	}
 }
 @RequestMapping("/login")
 public String login() {
	 return "login";
 }
  @RequestMapping("/loginForm")
 public String loginForm(@RequestParam("username") String username,@RequestParam("password") String password) {
	  HibernateManager hm=new HibernateManager();
	  int status=hm.login(username,password);
	  if(status==1) {
			return "login-success";
//			return "success";
		}
		else {
			return "login-failure";
		}
  }
}
