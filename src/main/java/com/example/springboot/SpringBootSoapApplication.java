package com.example.springboot;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class SpringBootSoapApplication {

//	private static final Logger LOGGER = LoggerFactory.getLogger(SpringBootSoapApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(SpringBootSoapApplication.class, args);
	}

//	@Bean
//	CommandLineRunner init(SoapClient soapClient){
//		return args -> {
//			soapClient.getAllCountries().forEach(counttry -> {
//				LOGGER.info("Country code: " + counttry.getSCode());
//				LOGGER.info("Country name: " + counttry.getSName());
//			});
//		};
//	}
}
