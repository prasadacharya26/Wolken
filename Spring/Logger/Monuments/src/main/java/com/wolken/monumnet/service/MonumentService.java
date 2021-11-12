package com.wolken.monumnet.service;

import java.util.List;

import com.wolken.monumnet.dto.MonumentDTO;

public interface MonumentService {

	void validateandsave(MonumentDTO dto);

	List getAll();

}
