package com.diegomagalhaes.agenda.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.diegomagalhaes.agenda.model.Contato;
import com.diegomagalhaes.agenda.repository.ContatoRepository;

@RestController
@RequestMapping("/contatos")
public class ContatoController {
	
	@Autowired
	private ContatoRepository contatoRepository;
	
	@GetMapping(produces = "application/json")
	public List<Contato> listar(){
		System.out.println("ESTE É O VALOR ");
		var x = contatoRepository.findAll();
		
		return x;
	}
	
}
