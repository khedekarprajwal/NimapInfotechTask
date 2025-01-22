package com.springboot.Restapi.Services;

import org.springframework.data.domain.Page;
import com.springboot.Restapi.entity.Product;
import java.util.Optional;

public interface ProductService {

    Page<Product> getAllProducts(int page);

    Product createProduct(Product product);

    Optional<Product> getProductById(Long id);

    Product updateProduct(Long id, Product product);

    void deleteProduct(Long id);
}
