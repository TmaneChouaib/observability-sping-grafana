package com.tmane.observabilityspringgrafana;

import com.tmane.observabilityspringgrafana.entity.Product;
import com.tmane.observabilityspringgrafana.repository.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ObservabilitySpringGrafanaApplication {

    public static void main(String[] args) {
        SpringApplication.run(ObservabilitySpringGrafanaApplication.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner(ProductRepository productRepository) {
        return args -> {
            productRepository.save(Product.builder().name("Computer").price(3000).build());
            productRepository.save(Product.builder().name("SmartPhone").price(2000).build());
            productRepository.save(Product.builder().name("Printer").price(1000).build());
            productRepository.findAll().forEach(System.out::println);
        };
    }
}
