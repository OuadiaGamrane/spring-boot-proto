package com.ouadia.sboot;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;

@SpringBootApplication
@EnableAutoConfiguration
public class SbootProtoApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(SbootProtoApplication.class, args);
    }

    @Override
    public void run(String... strings) throws Exception {

    }
}
