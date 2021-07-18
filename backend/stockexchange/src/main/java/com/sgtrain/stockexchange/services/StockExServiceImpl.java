package com.sgtrain.stockexchange.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.sgtrain.stockexchange.dao.StockExRepository;
import com.sgtrain.stockexchange.dto.StockEx;
import com.sgtrain.stockexchange.response.StockExResponse;

@Component
public class StockExServiceImpl {
	
	@Autowired
	StockExRepository exRepository;
	
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
