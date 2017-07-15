package com.ic2c;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

/**
 *   <br>
 * Application <br>
 * @author Allister.Liu(刘继鹏) <br>
 * 时间：2017年7月14日-下午9:20:00  <br>
 * @version 1.0.0
 * 
 */
@SpringBootApplication
public class Application extends SpringBootServletInitializer{
	
	
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(Application.class);
	}

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
