package com.sgtrain.company.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "ipo")
public class IpoDto {

	@Id
	String id;
	float ipoPrice;
	int numberOfShares;
	String date;
	String remarks;
	
	@OneToOne
	CompanyDto companyDto;
}
