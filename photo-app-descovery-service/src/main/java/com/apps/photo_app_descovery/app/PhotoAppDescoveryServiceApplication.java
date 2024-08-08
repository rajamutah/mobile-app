package com.apps.photo_app_descovery.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class PhotoAppDescoveryServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(PhotoAppDescoveryServiceApplication.class, args);
	}

}
