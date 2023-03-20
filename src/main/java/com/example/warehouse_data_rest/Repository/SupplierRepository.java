package com.example.warehouse_data_rest.Repository;

import com.example.warehouse_data_rest.Entity.Supplier;
import com.example.warehouse_data_rest.Projection.CustomSupplier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "supplier",excerptProjection = CustomSupplier.class)
public interface SupplierRepository extends JpaRepository<Supplier,Integer> {

}
