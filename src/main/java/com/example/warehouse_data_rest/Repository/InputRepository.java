package com.example.warehouse_data_rest.Repository;

import com.example.warehouse_data_rest.Entity.Input;
import com.example.warehouse_data_rest.Projection.CustomInput;
import com.example.warehouse_data_rest.Projection.CustomInputProduct;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "input",excerptProjection = CustomInput.class)
public interface InputRepository extends JpaRepository<Input,Integer> {

}
