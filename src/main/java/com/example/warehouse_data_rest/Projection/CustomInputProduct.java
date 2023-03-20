package com.example.warehouse_data_rest.Projection;

import com.example.warehouse_data_rest.Entity.Input;
import com.example.warehouse_data_rest.Entity.InputProduct;
import com.example.warehouse_data_rest.Entity.Product;
import lombok.Data;
import org.springframework.data.rest.core.config.Projection;

import java.util.Date;

@Projection(types = InputProduct.class)
public interface CustomInputProduct {
    Integer getId();
    Product getProduct();
    Double getAmount();
    Double getPrice();
    Data getExpireData();
    Input getInput();
}
