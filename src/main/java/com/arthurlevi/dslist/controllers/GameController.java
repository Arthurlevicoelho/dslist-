package com.arthurlevi.dslist.controllers;

import com.arthurlevi.dslist.dto.GameDto;
import com.arthurlevi.dslist.dto.GameMinDto;
import com.arthurlevi.dslist.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/games")
public class GameController {

    @Autowired
    private GameService gameService;

    @GetMapping
    public List<GameMinDto> findAll(){

        return gameService.findAll();
    }

    @GetMapping(value = "/{id}")
    public GameDto findById(@PathVariable Long id){

        return gameService.findById(id);
    }

}
