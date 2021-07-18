package com.sgtrain.stockexchange.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.sgtrain.stockexchange.entities.StockEx;
import com.sgtrain.stockexchange.entities.StockExRepository;
import com.sgtrain.stockexchange.entities.StockExResponse;
import com.sgtrain.stockexchange.entities.model.AddressRepository;

@Component
public class StockExService {

	@Autowired
	StockExRepository exRepository;
	
	@Autowired
	AddressRepository addressRepository;
	
	public List<StockEx> getStockEx(){
		return exRepository.findAll();
	}
	
	public StockExResponse createStockEx(StockEx ex) {
		StockExResponse exResponse = new StockExResponse();
		exRepository.save(ex);
		exResponse.setStatus(true);
		exResponse.setMessage("Stock Exchange Added successfully");
		exResponse.setError(null);
		return exResponse;
	}
	

}
