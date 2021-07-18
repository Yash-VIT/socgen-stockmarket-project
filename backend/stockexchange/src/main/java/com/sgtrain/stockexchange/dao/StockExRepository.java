package com.sgtrain.stockexchange.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sgtrain.stockexchange.dto.StockEx;

public interface StockExRepository extends JpaRepository<StockEx, Integer>{
	
}
