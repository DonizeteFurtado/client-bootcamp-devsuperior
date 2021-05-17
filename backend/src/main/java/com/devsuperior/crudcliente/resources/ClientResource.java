package com.devsuperior.crudcliente.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.crudcliente.entities.Client;

@RestController
@RequestMapping(value = "/clients")
public class ClientResource {
	
	@GetMapping
	public ResponseEntity<List<Client>> findAll(){
		List<Client> list = new ArrayList<>();
		list.add(new Client(1L, "Carlos", "052-065-089-98", 1546.52,null, 5));
		list.add(new Client(1L, "Carlos", "052-065-089-98", 1546.52,null, 5));
		return ResponseEntity.ok().body(list);
	}
}
