package com.velocity.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.velocity.Service.ConnectionService;
import com.velocity.model.Connection;

@RestController
public class ConnectionRestController {

	@Autowired
	public ConnectionService connectionService;
	
	@GetMapping("/getConnectionById/{connectionId}")
	public Connection getConnectionById(@PathVariable("connectionId") Integer connectionId) {
		
		Connection connections=connectionService.getConnectionById(connectionId);
		
		return connections;
	}
	
	
}
