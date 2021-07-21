package com.sgtrain.company.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.sgtrain.company.dto.IpoDto;

public interface IpoRepository extends JpaRepository<IpoDto, String>{

	public IpoDto findIpoByCompanyDtoId(@Param("companyId") String companyId);
	
}
