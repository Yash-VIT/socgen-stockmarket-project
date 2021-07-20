package com.sgtrain.company.dto;

import org.springframework.data.repository.CrudRepository;

import com.sgtrain.company.dao.CompanyDao;

public interface CompanyRepository extends CrudRepository<CompanyDao, String>{

}
