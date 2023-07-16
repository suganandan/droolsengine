package com.du.drools.droolsengine;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DroolsengineApplication {

	public static void main(String[] args) {

		ConfigurableApplicationContext ctx = new SpringApplicationBuilder(DroolsengineApplication.class)
				.web(WebApplicationType.NONE).run();
		ctx.close();

		// SpringApplication.run(DroolsengineApplication.class, args);
	}

	/*
	 * @Bean public KieContainer kieContainer() { return
	 * KieServices.Factory.get().getKieClasspathContainer(); }
	 */

}
