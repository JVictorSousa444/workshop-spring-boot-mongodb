package com.nelio.alves.workshopmongo.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.nelio.alves.workshopmongo.domain.Post;
import com.nelio.alves.workshopmongo.services.PostService;

@RestController
@RequestMapping(value = "/posts")
public class PostResource {

	@Autowired
	private	PostService service;
	
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET )
	public ResponseEntity<Post>FindById(@PathVariable String id){
		Post obj = service.findById(id);				
		return ResponseEntity.ok().body(obj);
	}
}
	