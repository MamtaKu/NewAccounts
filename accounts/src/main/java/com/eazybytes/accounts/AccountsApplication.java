package com.eazybytes.accounts;

import com.eazybytes.accounts.dtos.AccountContactInfoDto;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing(auditorAwareRef = "auditAwareImpl")
@EnableConfigurationProperties(value= {AccountContactInfoDto.class})
@OpenAPIDefinition(
		info = @Info(
				title = "Accounts Microservice REST API Documentation",
				version = "v1.0",
				description = "API Documentation for Accounts Microservice",
				contact = @Contact(
						name = "Mamta Kumawat",
						email = "mamtakumawat44@gmail.com"
		)
		)
)
public class AccountsApplication {

	public static void main(String[] args) {

		SpringApplication.run(AccountsApplication.class, args);
		System.out.println("Hello Hello");
	}

}
