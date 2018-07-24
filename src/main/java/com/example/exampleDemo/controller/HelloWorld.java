/**   
* @Title: HelloWorld.java 
* @Package com.example.exampleDemo.controller 
* @Description: TODO(用一句话描述该文件做什么) 
* @author luoxiang   
* @date 2018年7月24日 下午4:40:06 
*/
package com.example.exampleDemo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {
	
	@RequestMapping("/hello")
	public String Hello(String name) {
		return "Hello " + name;
	}
}