package ecommerce_application.service.impl;

import ecommerce_application.entity.Product;
import ecommerce_application.repository.ProductRepository;
import ecommerce_application.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    ProductRepository productRepository;

    @Override
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    @Override
    public Product getProductById(Long id) throws Exception {
        Optional<Product> product = productRepository.findById(id);
        if(product.isEmpty())
            throw new Exception();
        return product.get();
    }
}
