package com.sgtrain.stockexchange.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.sgtrain.stockexchange.dao.StockExRepository;
import com.sgtrain.stockexchange.dao.model.AddressRepository;
import com.sgtrain.stockexchange.dto.StockEx;
import com.sgtrain.stockexchange.response.StockExResponse;

public interface StockExService {
	
	public List<StockEx> getStockEx();
	public StockExResponse createStockEx(StockEx ex);
	
}
