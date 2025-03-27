package com.estudotiago.dscommerce.controllers;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.estudotiago.dscommerce.dto.ProductDTO;
import com.estudotiago.dscommerce.services.ProductService;

@RestController
@RequestMapping(value = "/products")
public class ProductController {

	@Autowired
	private ProductService service;

	@GetMapping(value = "/{id}")
	public ProductDTO findById(@PathVariable Long id) {
		ProductDTO dto = service.findById(id);
		return dto;

	}
	
	@GetMapping
	public Page<ProductDTO> findByAll(Pageable pageable) {
		Page<ProductDTO> dto = service.findAll(pageable);
		return dto;

	}
	
	@PostMapping
	public ProductDTO insert(@RequestBody ProductDTO dto) {
		dto = service.insert(dto);
		return dto;

	}

}
