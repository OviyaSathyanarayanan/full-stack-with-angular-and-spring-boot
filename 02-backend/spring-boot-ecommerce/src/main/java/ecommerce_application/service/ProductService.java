package ecommerce_application.service;

import ecommerce_application.entity.Product;

import java.util.List;

public interface ProductService {

    public List<Product> getAllProducts();

    public Product getProductById(Long id) throws Exception;
}
