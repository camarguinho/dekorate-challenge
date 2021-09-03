package com.santander.games.challenges.dekorate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class DekorateChallengeApplication {

	public static void main(String[] args) {
		SpringApplication.run(DekorateChallengeApplication.class, args);
	}

	@RestController
	public static class DekorateChallengeController {

		@RequestMapping("/")
		public String hello() {
			return "Hello world";
		}
	}
}
