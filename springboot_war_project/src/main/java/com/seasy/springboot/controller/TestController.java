package com.seasy.springboot.controller;

import java.util.Date;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class TestController {
	private static Logger logger = LoggerFactory.getLogger(TestController.class);
	
	@RequestMapping(value="/test", method=RequestMethod.GET)
	public String test(Map<String, Object> model, HttpServletRequest request) {
		logger.info("test...");
		
		request.getSession().setAttribute("requestURL", request.getRequestURL().toString());
		
		model.put("time", new Date());
		model.put("requestURL", request.getSession().getAttribute("requestURL"));
		
		return "test";
	}
	
}
