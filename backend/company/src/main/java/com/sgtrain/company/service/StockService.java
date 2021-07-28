package com.sgtrain.company.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.sgtrain.company.dto.Stock;

@Service
public interface StockService {

	public List<Stock> getAllStocks();
	public Stock addStock(Stock stock);
	
}
