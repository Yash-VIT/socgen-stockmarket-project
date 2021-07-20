package com.sgtrain.sector.service;

import java.util.Optional;

import com.sgtrain.sector.dto.SectorDto;

public interface SectorService {
	
	public boolean createSector(SectorDto sectorDto);
	public Iterable<SectorDto> findSector();
	public Optional<SectorDto> findSectorById(String id);
	public boolean deleteSectorById(String id);

}
