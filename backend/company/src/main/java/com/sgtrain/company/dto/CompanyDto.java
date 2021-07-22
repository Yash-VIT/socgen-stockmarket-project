package com.sgtrain.company.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "company")
public class CompanyDto {
	
	@Id
	String id;
	String companyName;
	float turnover;
	String ceo;
	boolean exchangeListing;
	String sector;
	String writeup;
	String companyCode;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public float getTurnover() {
		return turnover;
	}
	public void setTurnover(float turnover) {
		this.turnover = turnover;
	}
	public String getCeo() {
		return ceo;
	}
	public void setCeo(String ceo) {
		this.ceo = ceo;
	}
	public boolean isExchangeListing() {
		return exchangeListing;
	}
	public void setExchangeListing(boolean exchangeListing) {
		this.exchangeListing = exchangeListing;
	}
	public String getSector() {
		return sector;
	}
	public void setSector(String sector) {
		this.sector = sector;
	}
	public String getWriteup() {
		return writeup;
	}
	public void setWriteup(String writeup) {
		this.writeup = writeup;
	}
	public String getCompanyCode() {
		return companyCode;
	}
	public void setCompanyCode(String companyCode) {
		this.companyCode = companyCode;
	}
	public CompanyDto(String id, String companyName, float turnover, String ceo, boolean exchangeListing, String sector,
			String writeup, String companyCode) {
		super();
		this.id = id;
		this.companyName = companyName;
		this.turnover = turnover;
		this.ceo = ceo;
		this.exchangeListing = exchangeListing;
		this.sector = sector;
		this.writeup = writeup;
		this.companyCode = companyCode;
	}
	
	public CompanyDto() {
		
	}
	

	
}
