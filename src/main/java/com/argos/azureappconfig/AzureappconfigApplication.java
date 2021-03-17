package com.argos.azureappconfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(MessageProperties.class)
public class AzureappconfigApplication {

	public static void main(String[] args) {

		SpringApplication.run(AzureappconfigApplication.class, args);
	}

}
