package ecommerce_application.controller;

import ecommerce_application.entity.Product;
import ecommerce_application.entity.ProductCatogory;
import ecommerce_application.service.ProductCategoryService;
import ecommerce_application.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("http://localhost:4200")
@RestController
@RequestMapping("/api/v1")
public class ProductController {

    @Autowired
    private ProductService productService;

    @Autowired
    ProductCategoryService productCategoryService;

    @GetMapping(value = "products")
    public List<Product> getAllProducts() {
        return productService.getAllProducts();
    }

    @GetMapping(value = "products/{id}")
    public Product getProductById(@PathVariable Long id) {
        Product product = null;
        try {
             product = productService.getProductById(id);
        } catch (Exception e) {
            System.out.println("No Product found for the given id " + id);
        }
        return product;
    }

    @GetMapping(value = "product-category")
    private List<ProductCatogory> getAllProductCategory() {
        return productCategoryService.getAllProductCategories();
    }
}
