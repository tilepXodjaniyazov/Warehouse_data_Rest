package com.example.warehouse_data_rest.Projection;

import com.example.warehouse_data_rest.Entity.User;
import com.example.warehouse_data_rest.Entity.Warehouse;
import org.springframework.data.rest.core.config.Projection;

import java.util.Set;

@Projection(types = User.class)
public interface CustomerUser {
    Integer getId();
    String getFirst_name();
    String getLast_name();
    String getPhone_number();
    String getCode();
    String getPassword();
    Boolean getActive();
    Set<Warehouse> getWarehouse();
}
