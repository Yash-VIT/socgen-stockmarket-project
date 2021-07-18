package com.sgtrain.stockexchange.dto.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.sgtrain.stockexchange.dto.StockEx;

import lombok.Data;

@Data
@Entity
@Table(name="address")
public class StockExAddress {
	
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Id
	@Column(name = "id")
	private int id;
	private int houseNo;
	private String city;
	private int pin;
	private String state;

	public StockExAddress() {
		
	}
	
	public StockExAddress(int id, int houseNo, String city, int pin, String state, StockEx stockex) {
		super();
		this.id = id;
		this.houseNo = houseNo;
		this.city = city;
		this.pin = pin;
		this.state = state;
		
	}

}
