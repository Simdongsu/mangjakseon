package com.mangjakseon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing

public class MangjakseonApplication {

    public static void main(String[] args) {
        SpringApplication.run(MangjakseonApplication.class, args);
    }

}
