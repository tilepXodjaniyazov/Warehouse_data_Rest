package com.example.warehouse_data_rest.Projection;

import com.example.warehouse_data_rest.Entity.Output;
import com.example.warehouse_data_rest.Entity.OutputProduct;
import com.example.warehouse_data_rest.Entity.Product;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = OutputProduct.class)
public interface CustomOutputProduct {
    Integer getId();
    Product getProduct();
    Double getAmount();
    Double getPrice();
    Output getOutput();
}
