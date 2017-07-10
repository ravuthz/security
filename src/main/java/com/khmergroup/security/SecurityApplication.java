package com.khmergroup.security;

import com.khmergroup.security.model.User;
import com.khmergroup.security.repository.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.Transactional;

import javax.sql.DataSource;
import java.util.stream.Stream;

import static java.lang.System.exit;

@EntityScan(basePackages = { "com.khmergroup.security.model" })
@EnableJpaRepositories(basePackages = { "com.khmergroup.security.repository" })
@SpringBootApplication
public class SecurityApplication implements CommandLineRunner {

	private static final Logger logger = LoggerFactory.getLogger(SecurityApplication.class);

    @Autowired
    DataSource dataSource;

    @Autowired
    private UserRepository userRepository;

	public static void main(String[] args) {
		SpringApplication.run(SecurityApplication.class, args);
        logger.info("====================================================================================================================================");
        logger.info("=================================================  SpringBootApplication ================================================");
        logger.info("====================================================================================================================================");
	}

    @Transactional(readOnly = true)
	@Override
	public void run(String... strings) throws Exception {
        logger.debug("DATASOURCE = " + dataSource);

        logger.debug("\n1.findAll()...");
        for (User user : userRepository.findAll()) {
            logger.debug(user.toString());
        }

//        logger.debug("\n2.findByEmail(String email)...");
//        for (User user : userRepository.findByEmail("ravuthz@gmail.com")) {
//            logger.debug(user);
//        }

        // For Stream, need @Transactional
        logger.debug("\n2.findByEmailReturnStream(@Param(\"email\") String email)...");
        try (Stream<User> stream = userRepository.findByEmailReturnStream("ravuth1@gmail.com")) {
            stream.forEach(x -> logger.debug(x.toString()));
        }

        logger.debug("Done!");

        exit(0);
	}
}
