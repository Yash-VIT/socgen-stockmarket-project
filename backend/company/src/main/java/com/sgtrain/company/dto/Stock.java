package com.sgtrain.company.dto;

import java.security.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Stock {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name="stock_code")
	private String stockCode;
	
	private double price;
	
	private String timestamp;
	
//	@ManyToOne
//	private CompanyDto company;
	
//	@ManyToOne
//	private StockExchange stockExchange;

	public Stock() {
		super();
	}

	public Stock(int id, String stockCode, double price, String timestamp) {
		super();
		this.id = id;
		this.stockCode = stockCode;
		this.price = price;
		this.timestamp = timestamp;
//		this.company = company;
//		this.stockExchange = stockExchange;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getStockCode() {
		return stockCode;
	}

	public void setStockCode(String stockCode) {
		this.stockCode = stockCode;
	}
	
	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}

//	public CompanyDto getCompany() {
//		return company;
//	}
//
//	public void setCompany(CompanyDto company) {
//		this.company = company;
//	}
//
//	public StockExchange getStockExchange() {
//		return stockExchange;
//	}
//
//	public void setStockExchange(StockExchange stockExchange) {
//		this.stockExchange = stockExchange;
//	}
	
}