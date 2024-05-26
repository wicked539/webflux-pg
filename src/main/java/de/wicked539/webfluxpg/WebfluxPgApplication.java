package de.wicked539.webfluxpg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.r2dbc.repository.config.EnableR2dbcRepositories;

@SpringBootApplication
@EnableR2dbcRepositories
public class WebfluxPgApplication {

    public static void main(String[] args) {
        SpringApplication.run(WebfluxPgApplication.class, args);
    }

}
