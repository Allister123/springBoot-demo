/**
 * 刘继鹏博客系统 <br>
 * JpSpringBoot01 <br>
 * com.ic2c.web <br>
 * HelloController.java <br>
 * @author Allister.Liu(刘继鹏) <br>
 * Email：laujip@163.com <br>
 * 时间：2017年7月15日-下午3:36:35 <br>
 * 2017Allister-版权所有 <br>
 */
package com.ic2c.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *   <br>
 * HelloController <br>
 * @author Allister.Liu(刘继鹏) <br>
 * 时间：2017年7月15日-下午3:36:35  <br>
 * @version 1.0.0
 * 
 */
@RestController
public class HelloController {
	
	//获取application.yml配置文件中的值
	@Value("${user.username}")
	private String username;
	
	@Value("${user.age}")
	private Integer age;
	
	@RequestMapping("/index")
	public String initIndex(){
		return "大家好，我叫 " + username + "， 今年+ " + age + "岁！！！";
	}
	
}
