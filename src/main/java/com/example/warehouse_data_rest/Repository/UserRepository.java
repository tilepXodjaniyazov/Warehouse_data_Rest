package com.example.warehouse_data_rest.Repository;

import com.example.warehouse_data_rest.Entity.User;
import com.example.warehouse_data_rest.Projection.CustomerUser;
import org.springframework.data.domain.Example;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "user",excerptProjection = CustomerUser.class)
public interface UserRepository extends JpaRepository<User,Integer> {

}
