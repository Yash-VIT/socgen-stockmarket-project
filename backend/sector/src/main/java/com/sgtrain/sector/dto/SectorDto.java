package com.sgtrain.sector.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class SectorDto {
	
	@GeneratedValue(strategy =GenerationType.AUTO )
	@Id
	int id;
	String name;
	String brief;

}
