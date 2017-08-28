package com.reality.scout.tstub.boss.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ChinaMobile {

	@RequestMapping(value = {"/10086", "/10086/", "/10086/index", "/10086/index/", "/10086/index.html"})
	public @ResponseBody ModelAndView index() {
		ModelAndView mv = new ModelAndView("10086/index");
		return mv;
	}
	
	@RequestMapping(value = {"/10086/roaming", "/10086/roaming/"})
	public @ResponseBody ModelAndView roaming(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView mv = new ModelAndView("10086/roaming/index");
		return mv;
	}
}
