package com.sgtrain.company.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sgtrain.company.dto.Stock;

@Repository
public interface StockRepository extends JpaRepository<Stock, Integer>{

}
