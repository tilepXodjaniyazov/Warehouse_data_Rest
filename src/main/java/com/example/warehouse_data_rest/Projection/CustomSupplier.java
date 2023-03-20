package com.example.warehouse_data_rest.Projection;

import com.example.warehouse_data_rest.Entity.Supplier;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = Supplier.class)
public interface CustomSupplier {
    Integer getId();
    String getName();
    Boolean getActive();
    String getPhoneNumber();
}
