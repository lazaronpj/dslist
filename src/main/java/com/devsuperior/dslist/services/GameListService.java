package com.devsuperior.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.devsuperior.dslist.dto.GameListDTO;
import com.devsuperior.dslist.entities.GameList;
import com.devsuperior.dslist.repositories.GameListRepository;



//Componente do sistema, sendo intermediário entre a classe de acesso ao banco e o controlador REST, devolve dto
@Component // ou @Service
public class GameListService {
	
	// Injetar instância do game repository
	@Autowired
	private GameListRepository gameListRepository;
	
	//busca todos os games do banco	
    @Transactional(readOnly = true)
    public List<GameListDTO> findAll() {
        List<GameList> result = gameListRepository.findAll();
        return result.stream().map(GameListDTO::new).toList();
    }
}
