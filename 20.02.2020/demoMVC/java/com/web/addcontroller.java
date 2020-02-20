package com.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.web.services.Addservices;

@Controller
public class addcontroller {
	
	@RequestMapping("/hello")
	public ModelAndView add(HttpServletRequest request,HttpServletResponse response)
	{
		int i= Integer.parseInt(request.getParameter("t1"));
		int j= Integer.parseInt(request.getParameter("t2"));
		
		Addservices Adser= new Addservices();
		int k =Adser.Add(i, j);
		
		
		ModelAndView mv= new ModelAndView();
		mv.setViewName("display.jsp");
		mv.addObject("Result",k);
		
		return mv;
	}	
	
}
