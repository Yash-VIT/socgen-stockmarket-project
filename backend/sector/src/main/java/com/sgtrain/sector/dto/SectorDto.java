package com.sgtrain.sector.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "sector")
public class SectorDto {
	
	@Id
	String id;
	String name;
	String brief;

}
