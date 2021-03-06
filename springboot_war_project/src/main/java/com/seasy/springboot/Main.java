package com.seasy.springboot;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/**
 * 继承SpringBootServletInitializer让spring-boot项目在外部web容器中运行
 */
@SpringBootApplication
public class Main extends SpringBootServletInitializer {
	private static Logger logger = LoggerFactory.getLogger(Main.class);
	
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		logger.info("SpringBootApplication run by war...");
		return builder.sources(Main.class);
	}
	
	public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }
}
