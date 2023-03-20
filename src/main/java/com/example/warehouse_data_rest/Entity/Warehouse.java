package com.example.warehouse_data_rest.Entity;

import com.example.warehouse_data_rest.Entity.tamplate.AbsEntity;
import jakarta.persistence.Entity;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
@Entity
public class Warehouse extends AbsEntity {
}
