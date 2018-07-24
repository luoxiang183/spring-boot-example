/**   
* @Title: Person.java 
* @Package com.example.exampleDemo.model 
* @Description: TODO(用一句话描述该文件做什么) 
* @author luoxiang   
* @date 2018年7月24日 下午5:19:18 
*/
package com.example.exampleDemo.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
@Component
@ConfigurationProperties(prefix="user")
public class Person {
	@Value("${name}")
	private String name;
	
	@Value("${age}")
	private Integer age;
	private String addr;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", addr=" + addr + "]";
	}
}