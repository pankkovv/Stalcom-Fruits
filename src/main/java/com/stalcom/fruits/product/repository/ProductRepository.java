package com.stalcom.fruits.product.repository;

import com.stalcom.fruits.product.dto.StatsProductDto;
import com.stalcom.fruits.product.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
    @Query("select new com.stalcom.fruits.product.dto.StatsProductDto(p.supplier, p.timeDelivery, p.type, p.sort, sum(p.count), sum(p.price)) " +
            "from Product as p " +
            "where p.timeDelivery between ?1 and ?2 " +
            "group by p.supplier.id, p.timeDelivery, p.type, p.sort")
    List<StatsProductDto> getStats(LocalDate start, LocalDate end);
}
