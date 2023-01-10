package com.du.drools.droolsengine;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DroolsengineApplication {

	public static void main(String[] args) {
		//SpringApplication.run(DroolsengineApplication.class, args);
		ConfigurableApplicationContext ctx = new 
  SpringApplicationBuilder(DroolsengineApplication.class).web(WebApplicationType.NONE).run();
System.out.println("Spring Boot application started");
ctx.close();
		System.out.println("Welcome");
	}

	@Bean
	public KieContainer kieContainer() {
		return KieServices.Factory.get().getKieClasspathContainer();
	}

}
