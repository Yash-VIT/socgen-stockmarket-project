package com.sgtrain.company.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.sgtrain.company.dto.IpoDto;

public interface IpoRepository extends CrudRepository<IpoDto, String>{

	public IpoDto findIpoByCompanyId(@Param("companyId") String companyId);
	
}
