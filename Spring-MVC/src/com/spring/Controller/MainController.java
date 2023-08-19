package com.spring.Controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {
	
	@RequestMapping("/")
	public String getName() {
		return "index";
	}
	
	
	@RequestMapping("/log")
	public String getInf(@RequestParam("fname") String newFname  ,@RequestParam("lname") String newLname  , Model model) {
		
//		String fname=request.getParameter("fname");
//		String lname=request.getParameter("lname");
		

		
		
		model.addAttribute("nfname",newFname);
		model.addAttribute("nlname",newLname);
		
		
		
		return "info";
	}

}
