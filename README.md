# spring-boot-example
1.打开https://start.spring.io/，默认的选项，点击“Generate Project”按钮生成一个Maven的项目。

2.将生成的项目解压并导入到eclipse里

3.新建一个Controller类HelloWorld，打印一个helloworld的请求

4.在pom.xml文件中天剑springboot的基础包spring-boot-starter-web

	<dependency>
		<groupId>org.springframework.boot</groupId>
		<artifactId>spring-boot-starter-web</artifactId>
	</dependency>
	
5.在浏览器中输入：http://localhost:8080/hello?name=World
