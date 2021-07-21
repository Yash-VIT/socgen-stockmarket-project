package com.sgtrain.company.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sgtrain.company.dao.CompanyRepository;
import com.sgtrain.company.dto.CompanyDto;

@Service
public class CompanyServiceImpl implements CompanyService{
	
	@Autowired
	CompanyRepository companyRepository;
	
	public boolean createCompany(CompanyDto companyDto) {
		companyRepository.save(companyDto);
		return  true;
	}
	
	public Iterable<CompanyDto> getCompany(){
		return companyRepository.findAll();
	}
	
	public Optional<CompanyDto> getCompanyById(String id) {
		return companyRepository.findById(id);
	}
	
	public CompanyDto editCompany(String id, CompanyDto companyDto) {
		
		Optional<CompanyDto> companyOptional = companyRepository.findById(id);
		if(companyOptional!= null) {
			CompanyDto newCompanyDao = companyOptional.get();	
			newCompanyDao.setCompanyName(companyDto.getCompanyName());
			newCompanyDao.setTurnover(companyDto.getTurnover());
			newCompanyDao.setCeo(companyDto.getCeo());
			newCompanyDao.setExchangeListing(companyDto.isExchangeListing());
			newCompanyDao.setSector(companyDto.getSector());
			newCompanyDao.setWriteup(companyDto.getWriteup());
			newCompanyDao.setCompanyCode(companyDto.getCompanyCode());
			return companyRepository.save(newCompanyDao);
			
		}
		
		return null;
	}
	
	public boolean deleteCompany(String id) {
		companyRepository.deleteById(id);
		return true;
	}

}
