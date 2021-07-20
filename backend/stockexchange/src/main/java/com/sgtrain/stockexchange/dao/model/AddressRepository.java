package com.sgtrain.stockexchange.dao.model;

import org.springframework.data.repository.CrudRepository;

import com.sgtrain.stockexchange.dto.model.StockExAddress;

public interface AddressRepository extends CrudRepository<StockExAddress, Integer>{

}
