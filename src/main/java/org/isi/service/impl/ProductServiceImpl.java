package org.isi.service.impl;

import java.util.List;
import org.isi.dao.ProductRepository;
import org.isi.model.Product;
import org.isi.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {

    public ProductServiceImpl() {
        // TODO Auto-generated constructor stub
    }

    @Autowired
    private ProductRepository productRepository;

    @Override
    public Product save(Product p) {
        Product product = productRepository.findByReference(p.getDescription());
        if (product != null) {
            return null;
        } else {
            productRepository.save(p);
            return p;
        }
    }

    @Override
    public List<Product> findAll() {
        return productRepository.findAll();
    }

    @Override
    public void deleteById(Long id) {
        productRepository.deleteById(id);
    }

}
