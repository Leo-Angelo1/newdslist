package com.leoangelo.dslist.repositories;

import com.leoangelo.dslist.entities.Game;
import com.leoangelo.dslist.entities.GameList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameListRepository extends JpaRepository<GameList, Long> {
}
