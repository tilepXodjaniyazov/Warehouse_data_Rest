package com.example.warehouse_data_rest.Projection;

import com.example.warehouse_data_rest.Entity.Category;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = Category.class)
public interface CustomCategory {
    Integer getId();
    String getName();
    Boolean getActive();
    Category getParentCategory();
}
