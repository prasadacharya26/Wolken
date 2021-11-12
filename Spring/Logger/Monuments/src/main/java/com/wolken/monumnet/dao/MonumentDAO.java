package com.wolken.monumnet.dao;

import java.util.List;

import com.wolken.monumnet.entity.MonumentEntity;

public interface MonumentDAO {

	void save(MonumentEntity entity);

	List getAll();

	

}
