package com.springboot.Restapi.Dao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import com.springboot.Restapi.Repository.CategoryRepository;
import com.springboot.Restapi.Repository.ProductRepository;
import com.springboot.Restapi.Services.ProductService;
import com.springboot.Restapi.entity.Category;
import com.springboot.Restapi.entity.Product;
import java.util.Optional;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
     ProductRepository productRepository;

    @Autowired
     CategoryRepository categoryRepository;

    @Override
    public Page<Product> getAllProducts(int page) {
        return productRepository.findAll(PageRequest.of(page, 10));
    }

    @Override
    public Product createProduct(Product product) {
        Optional<Category> category = categoryRepository.findById(product.getCategory().getId());
        if (category.isPresent()) {
            product.setCategory(category.get());
            return productRepository.save(product);
        }
        throw new RuntimeException("Category not found");
    }

    @Override
    public Optional<Product> getProductById(Long id) {
        return productRepository.findById(id);
    }

    @Override
    public Product updateProduct(Long id, Product product) {
        Optional<Product> existingProduct = productRepository.findById(id);
        if (existingProduct.isPresent()) {
            product.setId(id);
            return productRepository.save(product);
        }
        throw new RuntimeException("Product not found");
    }

    @Override
    public void deleteProduct(Long id) {
        productRepository.deleteById(id);
    }
}