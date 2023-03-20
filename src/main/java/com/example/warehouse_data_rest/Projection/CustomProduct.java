package com.example.warehouse_data_rest.Projection;

import com.example.warehouse_data_rest.Entity.Attachment;
import com.example.warehouse_data_rest.Entity.Category;
import com.example.warehouse_data_rest.Entity.Measurement;
import com.example.warehouse_data_rest.Entity.Product;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = Product.class)
public interface CustomProduct {
    Category getCategory();
    Attachment getAttachment();
    String getCode();
    Measurement getMeasurement();
}
