package com.example.warehouse_data_rest.Repository;

import com.example.warehouse_data_rest.Entity.InputProduct;
import com.example.warehouse_data_rest.Projection.CustomInputProduct;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "inputProduct",excerptProjection = CustomInputProduct.class)
public interface InputProductRepository extends JpaRepository<InputProduct,Integer> {
}
