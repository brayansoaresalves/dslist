package com.devsuperior.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devsuperior.dslist.dto.GameListDTO;
import com.devsuperior.dslist.entities.GameList;
import com.devsuperior.dslist.repositories.GameListRepository;

@Service
public class GameListService {
	
	@Autowired
	private GameListRepository listRepository;
	
	public List<GameListDTO> buscarTodos(){
		List<GameList> lista = listRepository.findAll();
		return lista.stream().map(x -> new GameListDTO(x)).toList();
	}

}
