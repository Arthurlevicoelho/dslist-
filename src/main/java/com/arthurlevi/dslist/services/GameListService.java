package com.arthurlevi.dslist.services;

import com.arthurlevi.dslist.dto.GameDto;
import com.arthurlevi.dslist.dto.GameListDto;
import com.arthurlevi.dslist.dto.GameMinDto;
import com.arthurlevi.dslist.entities.Game;
import com.arthurlevi.dslist.entities.GameList;
import com.arthurlevi.dslist.repositories.GameListRepository;
import com.arthurlevi.dslist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameListService {
    @Autowired
    private GameListRepository gameListRepository;

    @Transactional(readOnly = true)//garante que a transacao aconteca com o banco de dados, indica que nao ocorrera escrita
    public List<GameListDto> findAll(){
        List<GameList> result = gameListRepository.findAll();
        List<GameListDto> dtoList = result.stream().map(x -> new GameListDto(x)).toList();
        return dtoList;
    }
@Transactional(readOnly = true)
    public GameListDto findById(Long id){
         GameList gameList = gameListRepository.findById(id).get();
        return new GameListDto(gameList);
    }
}
