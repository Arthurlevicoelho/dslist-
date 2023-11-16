package com.arthurlevi.dslist.repositories;

import com.arthurlevi.dslist.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game,Long> {
}
