package com.sgtrain.company.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sgtrain.company.dto.CompanyDto;

public interface CompanyRepository extends JpaRepository<CompanyDto, String>{

}
