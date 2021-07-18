package com.sgtrain.stockexchange.dao.model;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sgtrain.stockexchange.dto.model.StockExAddress;

public interface AddressRepository extends JpaRepository<StockExAddress, Integer>{

}
