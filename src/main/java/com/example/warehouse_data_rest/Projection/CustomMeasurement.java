package com.example.warehouse_data_rest.Projection;

import com.example.warehouse_data_rest.Entity.Category;
import com.example.warehouse_data_rest.Entity.Measurement;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = Measurement.class)
public interface CustomMeasurement {
    Integer getId();
    String getName();
     Boolean getActive();
}
