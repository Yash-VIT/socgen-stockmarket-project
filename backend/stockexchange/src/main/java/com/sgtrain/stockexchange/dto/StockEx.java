package com.sgtrain.stockexchange.dto;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.sgtrain.stockexchange.dto.model.StockExAddress;

import lombok.Data;

@Data
@Entity
@Table(name="stockex")
public class StockEx {
	
	@Id
	@Column(name = "id")
	private int id;
	private String exchangeName;
	private String brief;
	private String remarks;
	private String exgId;

	@OneToOne(cascade = CascadeType.ALL)
	private StockExAddress stockExAddress;

	public StockEx() {
		
	}
	
	
	public StockEx(int id, String exchangeName, String brief, String remarks, String exgId,
			StockExAddress stockExAddress) {
		super();
		this.id = id;
		this.exchangeName = exchangeName;
		this.brief = brief;
		this.remarks = remarks;
		this.exgId = exgId;
		this.stockExAddress = stockExAddress;
	}

	
}
