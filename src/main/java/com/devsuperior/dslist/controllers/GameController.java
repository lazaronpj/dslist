package com.devsuperior.dslist.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.dslist.dto.GameMinDTO;
import com.devsuperior.dslist.services.GameService;

@RestController
@RequestMapping(value = "/games") // caminho que vai ser respondido na api
public class GameController {
// É a porta de entrada do backend, vai disponibilizar a api. Endpoint
	
	// Injetar instância do gameService 
	@Autowired
	private GameService gameService;
	
	@GetMapping
	public List<GameMinDTO> findAll(){
		List<GameMinDTO> result = gameService.findall();
		return result;
		
	}
}
