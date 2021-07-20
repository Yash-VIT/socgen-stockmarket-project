package com.sgtrain.stockexchange.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.sgtrain.stockexchange.dao.StockExRepository;
import com.sgtrain.stockexchange.dto.StockEx;
import com.sgtrain.stockexchange.response.StockExResponse;

@Service
public class StockExServiceImpl implements StockExService{
	
	@Autowired
	StockExRepository exRepository;
	
	public Iterable<StockEx> getStockEx(){
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
	
	public Optional<StockEx> getStockExById(int id){
		return exRepository.findById(id);
	}
	
	public boolean deleteStockExById(int id) {
		exRepository.deleteById(id);
		return true;
	}

}
