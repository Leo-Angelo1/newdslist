package com.leoangelo.dslist.repositories;

import com.leoangelo.dslist.entities.Game;
import com.leoangelo.dslist.entities.GameList;
import com.leoangelo.dslist.projection.GameMinProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface GameListRepository extends JpaRepository<GameList, Long> {

}
