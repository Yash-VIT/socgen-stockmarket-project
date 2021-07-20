package com.sgtrain.stockexchange.services;

import java.util.Optional;

import com.sgtrain.stockexchange.dto.StockEx;
import com.sgtrain.stockexchange.response.StockExResponse;

public interface StockExService {
	
	public Iterable<StockEx> getStockEx();
	public StockExResponse createStockEx(StockEx ex);
	public Optional<StockEx> getStockExById(int id);
	public boolean deleteStockExById(int id);
	
}
