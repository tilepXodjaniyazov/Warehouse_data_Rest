package com.example.warehouse_data_rest.Repository;

import com.example.warehouse_data_rest.Entity.Output;
import com.example.warehouse_data_rest.Projection.CustomOutput;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "output",excerptProjection = CustomOutput.class)
public interface OutputRepository extends JpaRepository<Output,Integer> {
}
