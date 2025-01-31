package com.handson.restAPIDemo;

import java.util.Collections;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


@SpringBootApplication
public class CloudVendorApiApplication {

	private static final Logger logInfo = LoggerFactory.getLogger(CloudVendorApiApplication.class);
	public static void main(String[] args) {

		SpringApplication.run(CloudVendorApiApplication.class, args);
		logInfo.info("HELLO TO CLOUD VENDOR API");
	}
	
//	@Bean
//	public Docket swaggerConfiguration(){
//		return new Docket(DocumentationType.SWAGGER_2)
//				.select()
//				.paths(PathSelectors.ant("/cloudvendor/*"))
//				.apis(RequestHandlerSelectors.basePackage("com.thinkconstructive.restdemo"))
//				.build()
//				.apiInfo(apiCustomData());
//	}
//
//	private ApiInfo apiCustomData(){
//		return new ApiInfo(
//				"Cloud Vendor API Application",
//				"Cloud Vendor Documentation",
//				"1.0",
//				"Cloud Vendor Service Terms",
//				new Contact("Esha Puri", "http://thinkconstructive.com",
//						"contact@thinkconstructive.com"),
//				"Think Constructive License",
//				"http://thinkconstructive.com",
//				Collections.EMPTY_LIST()
//				//Collections.emptyList()
//		);
//	}

}
