package com.arthurlevi.dslist.controllers;

import com.arthurlevi.dslist.dto.GameDto;
import com.arthurlevi.dslist.entities.Game;
import com.arthurlevi.dslist.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/games")
public class GameController {

    @Autowired
    GameService gameService;

    @GetMapping
    public List<GameDto> findAll(){

        return gameService.findAll();    
    }

}
