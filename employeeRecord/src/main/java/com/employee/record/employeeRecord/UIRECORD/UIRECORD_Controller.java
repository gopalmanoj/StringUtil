package com.employee.record.employeeRecord.UIRECORD;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class UIRECORD_Controller {

	@RequestMapping("/index")
	public String getIndex()
	{
		return "index";
	}
	@RequestMapping("/registration")
	public String postRegistration(@ModelAttribute User user, Model model)
	{
		System.out.println(user.toString());
		model.addAttribute("fname", user.getFname());
		model.addAttribute("lname",user.getLname());
		model.addAttribute("dob", user.getDob());
		model.addAttribute("pass",user.getPass());
		model.addAttribute("gender", user.getGender());
		if(user.getFname().equals("Gopal") & user.getPass().equals("123"))
		{
		return "registration.html";
		}
		else
		{
		return "There is something wrong";	
		}
		
	}
	
}
