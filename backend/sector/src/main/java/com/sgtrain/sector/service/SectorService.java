package com.sgtrain.sector.service;

import java.util.List;
import java.util.Optional;

import com.sgtrain.sector.dto.SectorDto;

public interface SectorService {
	
	public boolean createSector(SectorDto sectorDto);
	public List<SectorDto> findSector();
	public Optional<SectorDto> findSectorById(int id);

}
