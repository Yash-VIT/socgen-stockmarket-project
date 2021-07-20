package com.sgtrain.sector.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
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
}
