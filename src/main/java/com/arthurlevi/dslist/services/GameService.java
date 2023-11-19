package com.arthurlevi.dslist.services;

import com.arthurlevi.dslist.dto.GameDto;
import com.arthurlevi.dslist.dto.GameMinDto;
import com.arthurlevi.dslist.entities.Game;
import com.arthurlevi.dslist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameService {
    @Autowired
    GameRepository gameRepository;

    @Transactional(readOnly = true)//garante que a transacao aconteca com o banco de dados, indica que nao ocorrera escrita
    public List<GameMinDto> findAll(){
        List<Game> result = gameRepository.findAll();
        List<GameMinDto> dtoList = result.stream().map(x -> new GameMinDto(x)).toList();
        return dtoList;
    }
@Transactional(readOnly = true)
    public GameDto findById(Long id){
         Game game = gameRepository.findById(id).get();
        return new GameDto(game);
    }
}
