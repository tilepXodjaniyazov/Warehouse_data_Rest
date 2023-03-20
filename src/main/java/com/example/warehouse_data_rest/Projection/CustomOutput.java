package com.example.warehouse_data_rest.Projection;

import com.example.warehouse_data_rest.Entity.*;
import org.springframework.boot.autoconfigure.integration.IntegrationProperties;
import org.springframework.data.rest.core.config.Projection;

import java.sql.Timestamp;

@Projection(types = Output.class)
public interface CustomOutput {
    Integer getId();
    Timestamp getDate();
    Warehouse getWarehouse();
    Client  getClient();
    Currency getCurrency();
    String getFacturNumber();
    String getCode();
}
