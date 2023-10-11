package com.velocity.repository;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.velocity.model.Connection;

@Repository
public interface ConnectionRepository extends CrudRepository<Connection, Serializable>{

	public Connection getByConnectionId(Integer id);

	
}
