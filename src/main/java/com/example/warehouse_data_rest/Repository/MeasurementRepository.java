package com.example.warehouse_data_rest.Repository;


import com.example.warehouse_data_rest.Entity.Measurement;
import com.example.warehouse_data_rest.Projection.CustomMeasurement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@RepositoryRestResource(path = "measurement", excerptProjection = CustomMeasurement.class)
public interface MeasurementRepository extends JpaRepository<Measurement,Integer> {

}
