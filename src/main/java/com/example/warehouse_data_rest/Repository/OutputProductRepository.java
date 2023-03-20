package com.example.warehouse_data_rest.Repository;

import com.example.warehouse_data_rest.Entity.OutputProduct;
import com.example.warehouse_data_rest.Projection.CustomOutputProduct;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "outputProduct",excerptProjection = CustomOutputProduct.class)
public interface OutputProductRepository extends JpaRepository<OutputProduct,Integer> {
}
