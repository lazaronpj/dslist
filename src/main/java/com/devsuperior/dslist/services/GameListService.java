package com.devsuperior.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.devsuperior.dslist.dto.GameListDTO;
import com.devsuperior.dslist.entities.GameList;
import com.devsuperior.dslist.projections.GameMinProjection;
import com.devsuperior.dslist.repositories.GameListRepository;
import com.devsuperior.dslist.repositories.GameRepository;



//Componente do sistema, sendo intermediário entre a classe de acesso ao banco e o controlador REST, devolve dto
@Component // ou @Service
public class GameListService {
	
	// Injetar instância do game repository
	@Autowired
	private GameListRepository gameListRepository;
	
	@Autowired
	private GameRepository gameRepository;
	//busca todos os games do banco	
    @Transactional(readOnly = true)
    public List<GameListDTO> findAll() {
        List<GameList> result = gameListRepository.findAll();
        return result.stream().map(GameListDTO::new).toList();
    }
    
    @Transactional(readOnly = true)
    public void move(Long listId, int sourceIndex, int destinationIndex) {
    	List<GameMinProjection> list = gameRepository.searchByList(listId);
    	
    	GameMinProjection obj = list.remove(sourceIndex);
    	list.add(destinationIndex, obj);
    	
    	int min = sourceIndex < destinationIndex ? sourceIndex : destinationIndex;
    	int max = sourceIndex > destinationIndex ? destinationIndex : sourceIndex;
    	
    	for(int i = min; i <= max; i++) {
    		gameListRepository.updateBelongingPosition(listId, list.get(i).getId(), i);
    	}
    }
}
