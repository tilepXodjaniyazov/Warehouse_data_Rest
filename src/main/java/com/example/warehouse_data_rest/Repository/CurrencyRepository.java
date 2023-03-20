package com.example.warehouse_data_rest.Repository;

import com.example.warehouse_data_rest.Entity.Currency;
import com.example.warehouse_data_rest.Projection.CustomCurrency;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "currency",excerptProjection = CustomCurrency.class)
public interface CurrencyRepository extends JpaRepository<Currency,Integer> {
}
