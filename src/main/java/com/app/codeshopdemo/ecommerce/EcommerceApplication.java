package com.app.codeshopdemo.ecommerce;

import com.app.codeshopdemo.ecommerce.model.Product;
import com.app.codeshopdemo.ecommerce.service.ProductService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class EcommerceApplication {

    public static void main(String[] args) {
        SpringApplication.run(EcommerceApplication.class, args);
    }

    @Bean
    CommandLineRunner runner(ProductService productService) {
        return args -> {
            productService.save(new Product(1L, "Java code", 300.00, "http://placehold.it/200x100"));
            productService.save(new Product(2L, "Python code", 200.00, "http://placehold.it/200x100"));
            productService.save(new Product(3L, "C++ code", 100.00, "http://placehold.it/200x100"));
            productService.save(new Product(4L, "Go", 5.00, "http://placehold.it/200x100"));
            productService.save(new Product(5L, "PHP", 3.00, "http://placehold.it/200x100"));
            productService.save(new Product(6L, "Javascript", 500.00, "http://placehold.it/200x100"));
            productService.save(new Product(7L, "SQL", 30.00, "http://placehold.it/200x100"));
        };
    }
}
