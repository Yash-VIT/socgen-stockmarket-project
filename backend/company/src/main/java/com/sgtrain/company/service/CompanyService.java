package com.sgtrain.company.service;

import java.util.Optional;

import com.sgtrain.company.dto.CompanyDto;

public interface CompanyService {
	
	public boolean createCompany(CompanyDto companyDto);
	public Iterable<CompanyDto> getCompany();
	public Optional<CompanyDto> getCompanyById(String id);
	public boolean deleteCompany(String id);
	public CompanyDto editCompany(String id, CompanyDto companyDto);

}
