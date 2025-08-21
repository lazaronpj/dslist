package com.devsuperior.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.devsuperior.dslist.dto.GameMinDTO;
import com.devsuperior.dslist.entities.Game;
import com.devsuperior.dslist.repositories.GameRepository;

//Componente do sistema, sendo intermediário entre a classe de acesso ao banco e o controlador REST, devolve dto
@Component // ou @Service
public class GameService {
	
	// Injetar instância do game repository
	@Autowired
	private GameRepository gameRepository;
	
	//busca todos os games do banco	
	public List<GameMinDTO> findall(){ 
		List<Game> result = gameRepository.findAll();
		return result.stream().map(x -> new GameMinDTO(x)).toList(); // sequência de dados, transforma um objeto de um tipo pra outro, pra voltar para uma lista normal usa tolist
	}
}
