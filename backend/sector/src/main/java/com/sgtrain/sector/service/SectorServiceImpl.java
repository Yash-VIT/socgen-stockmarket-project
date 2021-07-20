package com.sgtrain.sector.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.sgtrain.sector.dao.SectorRepository;
import com.sgtrain.sector.dto.SectorDto;

@Component
public class SectorServiceImpl implements SectorService{
	
	@Autowired
	SectorRepository sectorRepository;
	
	public boolean createSector(SectorDto sectorDto){
		sectorRepository.save(sectorDto);
		return true;
	}
	
	public Iterable<SectorDto> findSector() {
		return sectorRepository.findAll();	
	}
	
	public Optional<SectorDto> findSectorById(String id){
		return sectorRepository.findById(id);
	}
	
	public boolean deleteSectorById(String id) {
		sectorRepository.deleteById(id);
		return true;
	}

}
