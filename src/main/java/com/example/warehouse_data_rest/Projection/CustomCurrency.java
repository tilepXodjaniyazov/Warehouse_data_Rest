package com.example.warehouse_data_rest.Projection;

import com.example.warehouse_data_rest.Entity.Currency;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = Currency.class)
public interface CustomCurrency {
    Integer getId();
    String getName();
    Boolean getActive();
}
