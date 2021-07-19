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
public class CompamyDto {
	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	int id;
	String companyName;
	float trunover;
	String ceo;
	boolean exchangeListing;
	String sector;
	String writeup;
	String companyCode;
}
