package com.arthurlevi.dslist.services;

import com.arthurlevi.dslist.dto.GameDto;
import com.arthurlevi.dslist.entities.Game;
import com.arthurlevi.dslist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {
    @Autowired
    GameRepository gameRepository;

    public List<GameDto> findAll(){
        List<Game> result = gameRepository.findAll();
        List<GameDto> dtoList = result.stream().map( x -> new GameDto(x)).toList();
        return dtoList;
    }
}
