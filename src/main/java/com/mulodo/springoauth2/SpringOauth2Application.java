package com.mulodo.springoauth2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;

@SpringBootApplication(scanBasePackages = "com.mulodo")
@EnableResourceServer
public class SpringOauth2Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringOauth2Application.class, args);
	}

}
