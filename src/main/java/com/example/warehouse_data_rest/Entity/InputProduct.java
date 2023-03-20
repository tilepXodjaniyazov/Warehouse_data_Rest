package com.example.warehouse_data_rest.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.domain.PageRequest;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class InputProduct {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @ManyToOne
    private Product product;
    @Column(nullable = false)
    private Double amount;
    private Double price;
    private Date expireData;
    @ManyToOne
    private Input input;


}
