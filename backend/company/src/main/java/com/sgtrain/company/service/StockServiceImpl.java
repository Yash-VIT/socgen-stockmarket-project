package com.sgtrain.company.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.sgtrain.company.dao.StockRepository;
import com.sgtrain.company.dto.Stock;

@Component
public class StockServiceImpl implements StockService{

	@Autowired
	private StockRepository stockRepository;
	
	public List<Stock> getAllStocks() {
		return stockRepository.findAll();
	}
	
	public Stock addStock(Stock stock) {
		return stockRepository.save(stock);
	}
	
}
