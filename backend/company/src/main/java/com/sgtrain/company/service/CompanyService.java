package com.sgtrain.company.service;

import java.util.Optional;

import com.sgtrain.company.dao.CompanyDao;

public interface CompanyService {
	
	public boolean createCompany(CompanyDao companyDao);
	public Iterable<CompanyDao> getCompany();
	public Optional<CompanyDao> getCompanyById(String id);
	public boolean deleteCompany(String id);
	public boolean editCompany(String id, CompanyDao companyDao);

}
