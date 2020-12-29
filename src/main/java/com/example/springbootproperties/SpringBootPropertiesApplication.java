package com.example.springbootproperties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;

@SpringBootApplication
//@EnableConfigurationProperties
//@ConfigurationPropertiesScan
public class SpringBootPropertiesApplication implements CommandLineRunner {

	@Autowired
	private AwsProperties awsProperties;

	@Autowired
	ConfigProperties configProperties;


	public static void main(String[] args) {
		SpringApplication.run(SpringBootPropertiesApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println(this.awsProperties);
//		System.out.println(this.configProperties.name());
	}
}
