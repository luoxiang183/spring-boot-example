/**   
* @Title: HelloWorld.java 
* @Package com.example.exampleDemo.controller 
* @Description: TODO(用一句话描述该文件做什么) 
* @author luoxiang   
* @date 2018年7月24日 下午4:40:06 
*/
package com.example.exampleDemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.exampleDemo.model.Person;

@RestController
public class HelloWorld {
	
	@Value("${name}")  // application配置文件里的属性name
	private String name;
	@Value("${age}")   // application配置文件里的属性age
	private String age;
	
	@Autowired
	private Person person;  // person组件对象
	
	@RequestMapping("/hello")
	public String Hello(String name) {
		return "Hello " + name;
	}
	
	@RequestMapping("/getUser")
	public String getUser() {
		return "name: " + name + ";age:" + age;
	}
	
	@RequestMapping("/getPerson")
	public String getPerson() {
	    return person.toString();
	}
}