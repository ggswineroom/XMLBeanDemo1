package com.XML.XMLBean;

import org.springframework.beans.factory.ListableBeanFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class XmlBeanDemo1Application {

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(XmlBeanDemo1Application.class, args);
	
	for (String name: applicationContext.getBeanDefinitionNames()) {
		System.out.println("This is a name ***********:" + name);
	}
	}

}
