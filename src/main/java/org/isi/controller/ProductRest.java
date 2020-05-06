package org.isi.controller;

import java.util.List;
import org.isi.model.Product;
import org.isi.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/products-api/products")
public class ProductRest {

    @Autowired
    private ProductService productService;

    @PostMapping("/")
    public Product saveProduct(@RequestBody Product product) {
        return productService.save(product);
    }

    @GetMapping("/")
    public List<Product> findAll() {
        return productService.findAll();
    }

    @DeleteMapping("/product/{id}")
    public void deleteProductById(@PathVariable Long id) {
        this.productService.deleteById(id);
    }
}
