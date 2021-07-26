package com.sgtrain.company.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sgtrain.company.dto.CompanyDto;
import com.sgtrain.company.service.CompanyService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class CompanyController {

	@Autowired
	CompanyService companyService;
	
	@CrossOrigin(origins = "http://localhost:4200")
	@PostMapping("/company/create")
	public boolean createCompany(@RequestBody CompanyDto companyDto) {
		return companyService.createCompany(companyDto);
	}
	
	@GetMapping("/company/display")
	public ResponseEntity<Iterable<CompanyDto>> getCompany(){
		return ResponseEntity.ok(companyService.getCompany());
	}
	
	@GetMapping("/company/display/{id}")
	public ResponseEntity getCompanyById(@PathVariable String id){
		
		Optional<CompanyDto> optional = companyService.getCompanyById(id);
		
		if(optional.isPresent()) {
			return  ResponseEntity.ok(optional.get());
		}
		
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Company with id "+ id+" not found.");
	}
	
	@DeleteMapping("/company/remove/{id}")
	public ResponseEntity<Boolean> deleteCompany(@PathVariable String id) {
		return ResponseEntity.ok(companyService.deleteCompany(id));
	}
	
	@PutMapping("/company/editCompany/{id}")
	public ResponseEntity editCompany(@PathVariable String id, @RequestBody CompanyDto companyDto) {
		CompanyDto result = companyService.editCompany(id, companyDto);
		System.out.println(result);
		return (result!=null)?ResponseEntity.ok(true):ResponseEntity.status(HttpStatus.NOT_FOUND).body("Company with id "+ id+" not found.");
	}
	
}
