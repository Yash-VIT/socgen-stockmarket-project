package com.sgtrain.company.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sgtrain.company.dao.CompanyDao;
import com.sgtrain.company.dto.CompanyRepository;

@Service
public class CompanyServiceImpl implements CompanyService{
	
	@Autowired
	CompanyRepository companyRepository;
	
	public boolean createCompany(CompanyDao companyDao) {
		companyRepository.save(companyDao);
		return  true;
	}
	
	public Iterable<CompanyDao> getCompany(){
		return companyRepository.findAll();
	}
	
	public Optional<CompanyDao> getCompanyById(String id) {
		return companyRepository.findById(id);
	}
	
	public boolean editCompany(CompanyDao companyDao) {
		companyRepository.save(companyDao);
		return true;
	}
	
	public boolean deleteCompany(String id) {
		companyRepository.deleteById(id);
		return true;
	}

}
