package com.springboot.oauth.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;

@SpringBootApplication
@EnableOAuth2Sso
public class SpringBootOAuth2ClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootOAuth2ClientApplication.class, args);
	}

}
