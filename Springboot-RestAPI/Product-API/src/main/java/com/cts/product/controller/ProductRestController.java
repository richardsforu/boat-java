package com.cts.product.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cts.product.dao.ProductDao;
import com.cts.product.entity.Product;

@RestController
@CrossOrigin
@RequestMapping("/api/products")
public class ProductRestController {

	@Autowired
	private ProductDao prodDao;

	// list all products using get method
	@GetMapping
	List<Product> listAll() {
		return prodDao.findAll();
	}

	// find a Specific product by id
	@GetMapping("/{id}")
	public Product findById(@PathVariable int id) {
		return prodDao.findById(id).orElse(null);
	}

	// save product
	@PostMapping
	public Product save(@RequestBody Product product) {
		return prodDao.save(product);
	}

	// delete by id
	@DeleteMapping("/{id}")
	public void delete(@PathVariable int id) {
		prodDao.deleteById(id);
	}

	// update product
	@PutMapping
	public Product update(@RequestBody Product product) {
		return prodDao.save(product);
	}

}
