package com.sgtrain.company.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sgtrain.company.dto.IpoDto;
import com.sgtrain.company.service.IpoService;

@RestController
public class ipoController {
	
	@Autowired
	IpoService ipoService;
	
	@PostMapping("/ipo")
	public ResponseEntity<Boolean> createIpo(@RequestBody IpoDto ipoDto) {
		return ResponseEntity.ok(ipoService.createIpo(ipoDto));
	}
	
	@GetMapping("/ipo")
	public ResponseEntity<Iterable<IpoDto>> getIpo(){
		return ResponseEntity.ok(ipoService.getIpo());
	}
	
	@GetMapping("/ipo/{id}")
	public ResponseEntity getIpoById(@PathVariable String id){
		Optional<IpoDto> optional = ipoService.getIpoById(id);
		if(optional.isPresent()) {
			return ResponseEntity.ok(optional.get());
		}
		
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body("IPO with id "+ id+" not found.");
	}
	

	@DeleteMapping("/ipo/{id}")
	public ResponseEntity<Boolean> deleteIpo(@PathVariable String id) {
		return ResponseEntity.ok(ipoService.deleteIpo(id));
	}
	
	@GetMapping("ipo/company/{companyId}")
	public IpoDto getIpoByCompanyId(@PathVariable(value="companyId") String id) {
		return ipoService.getIpoByCompanyId(id);
	}
	
}
