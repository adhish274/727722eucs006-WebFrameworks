package com.example.day14ce1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;

@OpenAPIDefinition(
		info =@Info(
				title = "Employee D11 ce1",
				version = "1.1.2",
				description = "swagger sample code",
				contact = @Contact(
						name = "DHARANEESH V",
						email = "727722EUIT039@SKCET.AC.IN"
						)
				)
		)


@SpringBootApplication
public class adhish_q1Application {

	public static void main(String[] args) {
		SpringApplication.run(adhish_q1Application.class, args);
	}

}
