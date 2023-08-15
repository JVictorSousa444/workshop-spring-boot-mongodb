package com.nelio.alves.workshopmongo.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.nelio.alves.workshopmongo.domain.User;
import com.nelio.alves.workshopmongo.services.UserService;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

	@Autowired
	private	UserService service;
	
	
	@RequestMapping(method = RequestMethod.GET )
	public ResponseEntity<List<User>> FindAll(){
		
		List<User> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
	
}
