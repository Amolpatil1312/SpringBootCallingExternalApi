package com.csi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class SpringBootCallingExternalApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootCallingExternalApiApplication.class, args);
	}

}
