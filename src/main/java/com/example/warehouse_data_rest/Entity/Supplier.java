package com.example.warehouse_data_rest.Entity;

import com.example.warehouse_data_rest.Entity.tamplate.AbsEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Supplier extends AbsEntity {
    @Column(unique = true,nullable = false)
    private String phoneNumber;
}
