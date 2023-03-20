package com.example.warehouse_data_rest.Projection;

import com.example.warehouse_data_rest.Entity.Client;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = Client.class)
public interface CustomClient {
    Integer getId();
    String getName();
    Boolean getActive();
    String getPhoneNumber();
}
