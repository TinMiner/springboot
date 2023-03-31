package com.sec.security3.product;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class ProductController {
	
	@GetMapping(path="/products")
    public List<Product> getProducts() {
        return new ArrayList<>(Arrays.asList(
          new Product("Product 1", "Description 1", 1.0),
          new Product("Product 2", "Description 2", 2.0)
        ));
    }

    @GetMapping(path = "/hello-world")
    public String helloWorld() {
      return "Hello World v2"; 
    }
    


}
