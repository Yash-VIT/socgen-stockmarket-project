package com.sgtrain.company.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sgtrain.company.dao.IpoRepository;
import com.sgtrain.company.dto.IpoDto;

@Service
public class IpoServiceImpl implements IpoService{

	@Autowired
	IpoRepository ipoRepository;
	
	public boolean createIpo(IpoDto ipoDto) {
		ipoRepository.save(ipoDto);
		return  true;
	}
	
	public Iterable<IpoDto> getIpo() {
		return ipoRepository.findAll();
	}
	
	public Optional<IpoDto> getIpoById(String id) {
		return ipoRepository.findById(id);
	}
	
	public boolean deleteIpo(String id) {
		ipoRepository.deleteById(id);
		return true;
	}
	
	public IpoDto getIpoByCompanyId(String id) {
		return ipoRepository.findIpoByCompanyId(id);
	}
}
