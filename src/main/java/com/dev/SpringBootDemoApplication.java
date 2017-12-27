package com.dev;

import org.springframework.beans.factory.xml.XmlBeanFactory;
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
		System.out.printf("\n-------------------------------helloWorld via BEAN-----------------------------------------\n");
		h2.getMessage();
		System.out.printf("\n-------------------------------helloWorld via BEAN avec BeanFactory-----------------------------------------\n");
		XmlBeanFactory factory = new XmlBeanFactory(new ClassPathResource("app-config-ou-beans.xml"));
		HelloWorld h3 = new HelloWorld();
		h3.setMessage("Bonjour monde BeanFactory !!");
		h3.getMessage();

		SpringApplication.run(SpringBootDemoApplication.class, args);
	}
}
