package com.sgtrain.sector.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sgtrain.sector.dto.SectorDto;
import com.sgtrain.sector.service.SectorService;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/sector")
public class SectorController {
	
	@Autowired
	SectorService sectorService;
	
	@PutMapping("/create")
	@ApiOperation(value = "Create Sector")
	public ResponseEntity<Boolean> createSector(@RequestBody SectorDto sectorDto) {
		return  ResponseEntity.ok(sectorService.createSector(sectorDto));
	}
	
	@GetMapping("/display")
	@ApiOperation(value = "Get All Sector Value")
	public ResponseEntity<List<SectorDto>> findSector(){
		return  ResponseEntity.ok(sectorService.findSector());
	}
	
	@GetMapping("/display/{id}")
	public ResponseEntity findSectorById(@PathVariable int id){
		
		Optional<SectorDto> optional = sectorService.findSectorById(id);
		if(optional.isPresent()) {
			return  ResponseEntity.ok(optional.get());
		}
		
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Sector with id "+ id+" not found.");
	}

}
