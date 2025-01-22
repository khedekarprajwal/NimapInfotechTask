package com.springboot.Restapi.Services;
import java.util.Optional;
import org.springframework.data.domain.Page;
import com.springboot.Restapi.entity.Category;

public interface CategoryService {

    Page<Category> getAllCategories(int page);

    Category createCategory(Category category);

    Optional<Category> getCategoryById(Long id);

    Category updateCategory(Long id, Category category);

    void deleteCategory(Long id);
}