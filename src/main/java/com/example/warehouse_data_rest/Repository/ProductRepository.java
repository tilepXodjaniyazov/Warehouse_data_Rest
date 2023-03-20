package com.example.warehouse_data_rest.Repository;

import com.example.warehouse_data_rest.Entity.Product;
import com.example.warehouse_data_rest.Projection.CustomProduct;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "product",excerptProjection = CustomProduct.class)
public interface ProductRepository extends JpaRepository<Product,Integer> {
}
