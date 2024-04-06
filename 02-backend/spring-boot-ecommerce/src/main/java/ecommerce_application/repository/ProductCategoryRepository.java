package ecommerce_application.repository;

import ecommerce_application.entity.ProductCatogory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductCategoryRepository extends JpaRepository<ProductCatogory, Long> {
}
