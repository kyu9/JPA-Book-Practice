package com.example.jpa_project;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAdminServer
public class JpaProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(JpaProjectApplication.class, args);
    }

}
