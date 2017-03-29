package com.example;

import com.configurations.AspectScanConfig;
import com.configurations.ComponentScanConfig;
import com.configurations.ServiceScanConfig;
import com.service.TestService;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

@SpringBootApplication
public class SampleApplication {

	public static void main(String[] args) {
//		SpringApplication.run(SampleApplication.class, args);

		AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext(ServiceScanConfig.class, AspectScanConfig.class, ComponentScanConfig.class);

		TestService service = (TestService) context.getBean("testService");
		service.test();

		service.defaultV();

		context.close();
	}
}
