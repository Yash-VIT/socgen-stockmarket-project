package com.sgtrain.stockexchange.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/stock")
public class HomeController {

	@GetMapping(path="/home")
	@ApiOperation(value = "Welcome Page")
	public String print() {
		return "Welcome User!";
	}
	
}
