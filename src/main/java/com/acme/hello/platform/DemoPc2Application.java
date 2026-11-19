package com.acme.hello.platform;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class DemoPc2Application {

    public static void main(String[] args) {
        SpringApplication.run(DemoPc2Application.class, args);
    }

}
