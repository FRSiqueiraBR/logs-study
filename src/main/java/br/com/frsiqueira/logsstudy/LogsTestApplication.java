package br.com.frsiqueira.logsstudy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class LogsTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(LogsTestApplication.class, args);
	}

}
