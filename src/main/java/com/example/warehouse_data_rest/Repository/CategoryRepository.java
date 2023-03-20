package com.example.warehouse_data_rest.Repository;

import com.example.warehouse_data_rest.Entity.Category;
import com.example.warehouse_data_rest.Projection.CustomCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;
@RepositoryRestResource(path = "category",excerptProjection = CustomCategory.class)
public interface CategoryRepository extends JpaRepository<Category,Integer> {
}
