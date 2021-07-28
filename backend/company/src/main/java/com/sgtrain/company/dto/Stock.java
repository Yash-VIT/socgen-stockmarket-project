package com.sgtrain.company.dto;

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
	
	@ManyToOne
	private CompanyDto company;
	
	@ManyToOne
	private StockExchange stockExchange;

	public Stock() {
		super();
	}

	public Stock(int id, String stockCode, CompanyDto company, StockExchange stockExchange) {
		super();
		this.id = id;
		this.stockCode = stockCode;
		this.company = company;
		this.stockExchange = stockExchange;
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

	public CompanyDto getCompany() {
		return company;
	}

	public void setCompany(CompanyDto company) {
		this.company = company;
	}

	public StockExchange getStockExchange() {
		return stockExchange;
	}

	public void setStockExchange(StockExchange stockExchange) {
		this.stockExchange = stockExchange;
	}
	
}