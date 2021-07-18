package com.sgtrain.stockexchange.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sgtrain.stockexchange.entities.StockEx;
import com.sgtrain.stockexchange.entities.StockExResponse;
import com.sgtrain.stockexchange.services.StockExService;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/stock")
public class StockExController {
	
	@Autowired
	StockExService exService;
	
	@GetMapping("/get")
	@ApiOperation(value = "Get Value of Stock Exchange")
	public List<StockEx> getExchange(StockEx ex) {
		return exService.getStockEx() ;
	}
	
	@PostMapping("/save")
	@ApiOperation(value = "Create New Stock Exchange")
	public StockExResponse createExchange(@RequestBody StockEx ex) {
		return exService.createStockEx(ex);
	}
	


}
