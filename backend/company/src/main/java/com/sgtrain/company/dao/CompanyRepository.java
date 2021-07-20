package com.sgtrain.company.dao;

import org.springframework.data.repository.CrudRepository;

import com.sgtrain.company.dto.CompanyDto;

public interface CompanyRepository extends CrudRepository<CompanyDto, String>{

}
