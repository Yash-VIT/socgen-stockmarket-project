package com.sgtrain.sector.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
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
	
	@PostMapping("/create")
	@ApiOperation(value = "Create Sector")
	public ResponseEntity<Boolean> createSector(@RequestBody SectorDto sectorDto) {
		return  ResponseEntity.ok(sectorService.createSector(sectorDto));
	}
	
	@GetMapping("/display")
	@ApiOperation(value = "Get All Sector Value")
	public ResponseEntity<Iterable<SectorDto>> findSector(){
		return  ResponseEntity.ok(sectorService.findSector());
	}
	
	@GetMapping("/display/{id}")
	@ApiOperation(value = "Get Sector By ID")
	public ResponseEntity findSectorById(@PathVariable String id){
		
		Optional<SectorDto> optional = sectorService.findSectorById(id);
		if(optional.isPresent()) {
			return  ResponseEntity.ok(optional.get());
		}
		
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Sector with id "+ id+" not found.");
	}
	
	@DeleteMapping("/delete/{id}")
	@ApiOperation(value = "Delete Sector By ID")
	public ResponseEntity<Boolean> deleteSectorById(@PathVariable String id) throws Exception{
		return ResponseEntity.ok(sectorService.deleteSectorById(id));
	}

}
