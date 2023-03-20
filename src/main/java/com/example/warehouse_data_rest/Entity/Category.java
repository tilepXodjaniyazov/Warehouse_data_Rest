package com.example.warehouse_data_rest.Entity;


import com.example.warehouse_data_rest.Entity.tamplate.AbsEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class  Category extends AbsEntity {
    @ManyToOne
    private Category parentCategory;
}
