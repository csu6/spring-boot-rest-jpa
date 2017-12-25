package com.dev;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.dev.model.HelloWorld;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class SpringBootDemoApplication {

	public static void main(String[] args) {
		HelloWorld h = new HelloWorld();
		h.setMessage("Le monde !!");
		h.getMessage();
		System.out.printf("\n-------------------------------------------------------------------------\n");
		ApplicationContext context = new ClassPathXmlApplicationContext("app-config-ou-beans.xml");
		HelloWorld h2 = (HelloWorld) context.getBean("helloWorld");
		System.out.printf("\n-------------------------------helloWorld VIA BEAN-----------------------------------------\n");
		h2.getMessage();

		SpringApplication.run(SpringBootDemoApplication.class, args);
	}
}
