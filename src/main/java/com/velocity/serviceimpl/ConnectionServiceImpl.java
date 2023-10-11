package com.velocity.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.velocity.Service.ConnectionService;
import com.velocity.model.Connection;
import com.velocity.repository.ConnectionRepository;

@Service
public class ConnectionServiceImpl implements ConnectionService {
	
	@Autowired
	private ConnectionRepository connectionRepository;

	@Override
	public Connection getConnectionById(Integer connectionId) {
		Connection connections=connectionRepository.getByConnectionId(connectionId);
		
		return connections;
	}

}
