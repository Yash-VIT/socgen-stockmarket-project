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
	
	public boolean editCompany(String id, CompanyDao companyDao) {
		
		Optional<CompanyDao> companyOptional = companyRepository.findById(id);
		if(companyOptional!= null) {
			CompanyDao newCompanyDao = companyOptional.get();	
			newCompanyDao.setCompanyName(companyDao.getCompanyName());
			newCompanyDao.setTurnover(companyDao.getTurnover());
			newCompanyDao.setCeo(companyDao.getCeo());
			newCompanyDao.setExchangeListing(companyDao.isExchangeListing());
			newCompanyDao.setSector(companyDao.getSector());
			newCompanyDao.setWriteup(companyDao.getWriteup());
			newCompanyDao.setCompanyCode(companyDao.getCompanyCode());
			companyRepository.save(newCompanyDao);
			return true;
		}
		
		companyRepository.save(companyDao);
		return true;
	}
	
	public boolean deleteCompany(String id) {
		companyRepository.deleteById(id);
		return true;
	}

}
