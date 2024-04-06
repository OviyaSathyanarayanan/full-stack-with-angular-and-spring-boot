package ecommerce_application.service.impl;

import ecommerce_application.entity.ProductCatogory;
import ecommerce_application.repository.ProductCategoryRepository;
import ecommerce_application.service.ProductCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductCategoryServiceImpl implements ProductCategoryService {

    @Autowired
    ProductCategoryRepository productCategoryRepository;

    @Override
    public List<ProductCatogory> getAllProductCategories() {
        return productCategoryRepository.findAll();
    }
}
