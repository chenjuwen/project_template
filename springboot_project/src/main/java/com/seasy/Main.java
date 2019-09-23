package com.seasy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
@Controller
public class Main{
	public static void main(String[] args){
		//关闭图案
//		new SpringApplicationBuilder(Main.class).bannerMode(Banner.Mode.OFF).run(args);
		
		SpringApplication.run(Main.class, args);
	}
	
	@RequestMapping("/index")
	public String index(){
		return "index";
	}
}
