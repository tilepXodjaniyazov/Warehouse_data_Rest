package com.example.warehouse_data_rest.Repository;

import com.example.warehouse_data_rest.Entity.AttachmentContent;
import com.example.warehouse_data_rest.Entity.Warehouse;
import com.example.warehouse_data_rest.Projection.CustomWarehouse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.Optional;
@RepositoryRestResource(path = "warehouse",excerptProjection = CustomWarehouse.class)
public interface WarehouseRepository extends JpaRepository<Warehouse,Integer> {

}
