package com.example.warehouse_data_rest.Projection;

import com.example.warehouse_data_rest.Entity.Currency;
import com.example.warehouse_data_rest.Entity.Input;
import com.example.warehouse_data_rest.Entity.Supplier;
import com.example.warehouse_data_rest.Entity.Warehouse;
import org.springframework.data.rest.core.config.Projection;

import java.sql.Timestamp;

@Projection(types = Input.class)
public interface CustomInput {
    Integer getId();
    Timestamp getDate();
    Warehouse getWarehouse();
    Supplier getSupplier();
    Currency getCurrency();
    Supplier getFacturNumber();
    String getCode();
}
