package com.arthurlevi.dslist.repositories;

import com.arthurlevi.dslist.entities.Game;
import com.arthurlevi.dslist.entities.GameList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameListRepository extends JpaRepository<GameList,Long> {
}
