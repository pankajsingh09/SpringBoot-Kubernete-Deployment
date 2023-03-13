package com.springkubernetes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringKubernetesApplication {
	
	@GetMapping("/message")
	public String getMessage()
	{
		return "Congratulation you have successfully deployed your application to Kubernetes !! ";
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringKubernetesApplication.class, args);
	}

}
