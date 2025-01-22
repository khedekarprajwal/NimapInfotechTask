package com.springboot.Restapi.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.Restapi.entity.Category;
@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {
 

}
