package com.tmane.observabilityspringgrafana.repository;

import com.tmane.observabilityspringgrafana.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
