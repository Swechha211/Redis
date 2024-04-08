package com.example.data_redis;

import com.example.data_redis.entity.Product;
import com.example.data_redis.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@SpringBootApplication

//@RestController
//@RequestMapping("/product")
public class DataRedisApplication {

//	@Autowired
//	private ProductRepo dao;
//
//	@PostMapping
//	public Product save(@RequestBody Product product) {
//		return dao.save(product);
//	}
//
//	@GetMapping
//	public List<Product> getAllProducts() {
//		return dao.findAll();
//	}
//
//	@GetMapping("/{id}")
//	public Product findProduct(@PathVariable int id) {
//		return dao.findProductById(id);
//	}
//	@DeleteMapping("/{id}")
//	public String remove(@PathVariable int id)   {
//		return dao.deleteProduct(id);
//	}


	public static void main(String[] args) {
		SpringApplication.run(DataRedisApplication.class, args);
	}

}
