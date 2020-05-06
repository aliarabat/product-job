package org.isi.service;

import java.util.List;
import org.isi.model.Product;

public interface ProductService {

    public Product save(Product p);

    public List<Product> findAll();

    public void deleteById(Long id);
}
