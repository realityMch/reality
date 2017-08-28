package com.reality.scout.tstub.boss.controller;

import java.util.concurrent.Callable;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.reality.scout.tstub.boss.inter.InterFacade;

@Controller
@RequestMapping("/inter")
public class InterController {

	@Resource(name = "interFacade")
	private InterFacade interFacade;
	
	@RequestMapping(value = "/Receiver", method = RequestMethod.POST, produces = "text/html;charset=UTF-8")
	public @ResponseBody Callable<String> receive(HttpServletRequest request, HttpServletResponse response) {
		return new Callable<String>() {

			@Override
			public String call() throws Exception {
				System.out.println("yes!");
				return interFacade.handle(request, response);
			}
			
		};
	}
}
