package com.springmvc.web.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AddController {

	@RequestMapping("/add")
	public ModelAndView add(@RequestParam("t1") int num1,@RequestParam("t2") int num2)
	{
		ModelAndView mav=new ModelAndView();
		int k=num1+num2;
		mav.addObject("result",k);
		mav.setViewName("result.jsp");
		return mav;
		
	}
}
