package com.devsuperior.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.dslist.entities.GameList;

// acesso a dados, consulta no banco, devolve entidade
public interface GameListRepository extends JpaRepository<GameList, Long>{
	

}
