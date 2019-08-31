package com.challenge.invoice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class InvoiceApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(InvoiceApplication.class, args);
    }

}
