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
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sgtrain.company.dao.CompanyDao;
import com.sgtrain.company.service.CompanyService;

@RestController
@RequestMapping("/company")
public class CompanyController {

	@Autowired
	CompanyService companyService;
	
	@PostMapping("/add")
	public boolean createCompany(@RequestBody CompanyDao companyDao) {
		return companyService.createCompany(companyDao);
	}
	
	@GetMapping("/display")
	public ResponseEntity<Iterable<CompanyDao>> getCompany(){
		return ResponseEntity.ok(companyService.getCompany());
	}
	
	@GetMapping("/display/{id}")
	public ResponseEntity getCompanyById(@PathVariable String id){
		
		Optional<CompanyDao> optional = companyService.getCompanyById(id);
		
		if(optional.isPresent()) {
			return  ResponseEntity.ok(optional.get());
		}
		
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Company with id "+ id+" not found.");
	}
	
	@DeleteMapping("delete/{id}")
	public boolean deleteCompany(@PathVariable String id) {
		return companyService.deleteCompany(id);
	}
	
}
