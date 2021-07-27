package com.sgtrain.stockexchange.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sgtrain.stockexchange.dto.StockEx;
import com.sgtrain.stockexchange.response.StockExResponse;
import com.sgtrain.stockexchange.services.StockExService;

import io.swagger.annotations.ApiOperation;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class StockExController {
	
	@Autowired
	StockExService exService;
	
	@GetMapping("/stockex")
	@ApiOperation(value = "Get Value of Stock Exchange")
	public ResponseEntity<Iterable<StockEx>> getExchange(StockEx ex) {
		return ResponseEntity.ok(exService.getStockEx()) ;
	}
	
	@PostMapping("/stockex")
	@ApiOperation(value = "Create New Stock Exchange")
	public ResponseEntity<StockExResponse> createExchange(@RequestBody StockEx ex) {
		return ResponseEntity.ok(exService.createStockEx(ex));
	}
	
	@GetMapping("/stockex/{id}")
	public ResponseEntity getStockExById(@PathVariable int id){
		Optional<StockEx> optional = exService.getStockExById(id);;
		
		if(optional.isPresent()) {
			return  ResponseEntity.ok(optional.get());
		}
		
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Stock Exchange with id "+ id+" not found.");
	}
	
	@DeleteMapping("/stockex/{id}")
	public boolean deleteStockExById(@PathVariable int id) {
		return exService.deleteStockExById(id);
	}


}
