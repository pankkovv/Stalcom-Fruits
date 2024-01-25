package com.stalcom.fruits.product.model;

import com.stalcom.fruits.supplier.model.Supplier;
import com.stalcom.fruits.warehouse.model.Warehouse;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Enumerated(EnumType.STRING)
    private Type type;
    @Enumerated(EnumType.STRING)
    private Sort sort;
    private int count;
    private float price;
    @Column(name = "delivery_time")
    private LocalDate timeDelivery;
    @ManyToOne
    @JoinColumn(name = "ware_id")
    private Warehouse warehouse;
    @ManyToOne
    @JoinColumn(name = "sup_id")
    private Supplier supplier;
}
