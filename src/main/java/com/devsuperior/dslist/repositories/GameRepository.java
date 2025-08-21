package com.devsuperior.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.dslist.entities.Game;

// acesso a dados, consulta no banco, devolve entidade
public interface GameRepository extends JpaRepository<Game, Long>{
	

}
