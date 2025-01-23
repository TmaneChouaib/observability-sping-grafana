package com.tmane.observabilityspringgrafana.web;

import com.tmane.observabilityspringgrafana.entity.Product;
import com.tmane.observabilityspringgrafana.model.Post;
import com.tmane.observabilityspringgrafana.repository.ProductRepository;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestClient;

import java.lang.reflect.Type;
import java.util.List;

@RestController
public class ProductController {
    private ProductRepository productRepository;
    private RestClient restClient;


    public ProductController(ProductRepository productRepository, RestClient.Builder builder) {
        this.productRepository = productRepository;
        this.restClient = RestClient.builder().baseUrl("https://jsonplaceholder.typicode.com").build();
    }

    @GetMapping("/products")
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    @GetMapping("/posts")
    public List<Post> getAllPosts() {
        return restClient.get().uri("/posts").retrieve().body(new ParameterizedTypeReference<List<Post>>() {});
    }
}
