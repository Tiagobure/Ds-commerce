package com.estudotiago.dscommerce.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.estudotiago.dscommerce.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
	

}
