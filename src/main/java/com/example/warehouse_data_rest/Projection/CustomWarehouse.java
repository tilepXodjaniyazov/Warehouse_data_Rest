package com.example.warehouse_data_rest.Projection;

import com.example.warehouse_data_rest.Entity.Warehouse;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = Warehouse.class)
public interface CustomWarehouse {
    Integer getId();
    String getName();
    Boolean getActive();
}
