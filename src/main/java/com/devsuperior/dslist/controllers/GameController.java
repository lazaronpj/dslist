package com.devsuperior.dslist.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.dslist.dto.GameDTO;
import com.devsuperior.dslist.dto.GameMinDTO;
import com.devsuperior.dslist.services.GameService;

@RestController
@RequestMapping(value = "/games") // caminho que vai ser respondido na api
public class GameController {
// É a porta de entrada do backend, vai disponibilizar a api. Endpoint
	
	// Injetar instância do gameService 
	@Autowired
	private GameService gameService;
	
	@GetMapping(value = "/{id}") // Configuro que terá um id nessa configuração
	public GameDTO findById(@PathVariable Long id){
		 GameDTO result = gameService.findbyId(id);
		 return result;
	}
	
	// FALTAM UNS 38 MINUTOS DA AULA 2
	
	@GetMapping
	public List<GameMinDTO> findAll(){
		List<GameMinDTO> result = gameService.findall();
		return result;
	}
}
