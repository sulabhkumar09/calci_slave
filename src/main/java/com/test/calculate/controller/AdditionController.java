package com.test.calculate.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AdditionController {
	ModelAndView mv = new ModelAndView();

	@RequestMapping(value="/add") 
	public ModelAndView addNumber(HttpServletRequest request, HttpServletResponse response ) {
		
		
		
		int a = Integer.parseInt(request.getParameter("t1"));
		int b = Integer.parseInt(request.getParameter("t2"));
		
	int c =add(a,b);
		
		
		mv.addObject("result",c);
		mv.setViewName("add-result");
		return mv;
	}
	
	
	@RequestMapping(value="/subtract") 
	public ModelAndView subtractNumber(HttpServletRequest request, HttpServletResponse response ) {
		
		
		
		int a = Integer.parseInt(request.getParameter("t1"));
		int b = Integer.parseInt(request.getParameter("t2"));
		int c = subtract(a, b);
		
		mv.addObject("result",c);
		mv.setViewName("subtract-result");
		return mv;
	}
	
	
	@RequestMapping(value="/multiply") 
	public ModelAndView multiplyNumber(HttpServletRequest request, HttpServletResponse response ) {
		
		
		
		int a = Integer.parseInt(request.getParameter("t1"));
		int b = Integer.parseInt(request.getParameter("t2"));
		int c = multiply(a, b);
		
		mv.addObject("result",c);
		mv.setViewName("multiply-result");
		return mv;
	}
	
	
	@RequestMapping(value="/divide") 
	public ModelAndView divideNumber(HttpServletRequest request, HttpServletResponse response ) {
		
		
		
		double a = Float.parseFloat(request.getParameter("t1"));
		double b = Float.parseFloat(request.getParameter("t2"));
		double c = divide(a,b);
		
		mv.addObject("result",c);
		mv.setViewName("divide-result");
		return mv;
	}
	
	public int add(int x,int y) {
		int s= x+y;
		return s;
	}
	public int subtract(int x,int y) {
		int s= x-y;
		return s;
	}
	public int multiply(int x,int y) {
		int s= x*y;
		return s;
	}
	public double divide(double x,double y) {
		double s= x/y;
		return s;
	}
}
