package org.jetbrains.assignment;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Initializer {

    private static final Logger log = LoggerFactory.getLogger(Initializer.class);

    @Bean
    CommandLineRunner initController() {
        return args -> log.info("Starting server");
    }
}
