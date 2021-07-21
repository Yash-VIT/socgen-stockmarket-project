package com.sgtrain.company.service;

import java.util.Optional;

import com.sgtrain.company.dto.IpoDto;

public interface IpoService {
	
	public boolean createIpo(IpoDto ipoDto);
	public Iterable<IpoDto> getIpo();
	public Optional<IpoDto> getIpoById(String id);
	public boolean deleteIpo(String id);
	public IpoDto getIpoByCompanyId(String id);

}
