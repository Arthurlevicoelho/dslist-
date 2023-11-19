package com.arthurlevi.dslist.controllers;

import com.arthurlevi.dslist.dto.GameDto;
import com.arthurlevi.dslist.dto.GameListDto;
import com.arthurlevi.dslist.dto.GameMinDto;
import com.arthurlevi.dslist.services.GameListService;
import com.arthurlevi.dslist.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/lists")
public class GameListController {

    @Autowired
    GameListService gameListService;

    @GetMapping
    public List<GameListDto> findAll(){

        return gameListService.findAll();
    }

    @GetMapping(value = "/{id}")
    public GameListDto findById(@PathVariable Long id){

        return gameListService.findById(id);
    }

}
