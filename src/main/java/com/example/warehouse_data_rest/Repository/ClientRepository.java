package com.example.warehouse_data_rest.Repository;
import com.example.warehouse_data_rest.Entity.Client;
import com.example.warehouse_data_rest.Projection.CustomClient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.Path;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "client",excerptProjection = CustomClient.class)
public interface ClientRepository extends JpaRepository<Client,Integer> {

}
