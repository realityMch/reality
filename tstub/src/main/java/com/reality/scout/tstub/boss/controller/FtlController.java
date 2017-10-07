package com.reality.scout.tstub.boss.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/ftl")
public class FtlController {

	@RequestMapping(value = "/test")
	public @ResponseBody ModelAndView test(@RequestBody String man, HttpServletRequest request, HttpServletResponse response) {
		System.out.println("test");
		ModelAndView mv = new ModelAndView("test");
		mv.addObject("name", man == null ? "freemarker" : man);
		mv.addObject("message", "Hi");
		return mv;
	}
	
	@RequestMapping(value = "/test2")
	public String test2(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("test2");
//		ModelAndView mv = new ModelAndView("test");
//		mv.addObject("name", "freemarker");
//		mv.addObject("message", "Hi");
		return "redirect:/ftl/test";
	}
}
