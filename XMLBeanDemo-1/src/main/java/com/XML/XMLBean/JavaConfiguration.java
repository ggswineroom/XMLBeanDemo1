package com.XML.XMLBean;

// Loading beans from Java Configuration

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfiguration {
	
	@Bean
	public String SomeDummyBean1() {
		return "SomeDummyBean1 ****************";
	}
	
	@Bean
	public String SomeDummyBean2() {
		return "SomeDummyBean2 **************";
	}

}
