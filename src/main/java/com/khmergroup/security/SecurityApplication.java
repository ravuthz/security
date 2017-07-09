package com.khmergroup.security;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import javax.annotation.PostConstruct;

@EntityScan(basePackages = { "com.khmergroup.security.model" })
@EnableJpaRepositories(basePackages = { "com.khmergroup.security.repository" })
@SpringBootApplication
public class SecurityApplication {

	private static final Logger logger = LoggerFactory.getLogger(SecurityApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(SecurityApplication.class, args);
        logger.info("====================================================================================================================================");
        logger.info("=================================================  SpringBootApplication ================================================");
        logger.info("====================================================================================================================================");
	}

}
