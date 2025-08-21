package com.leoangelo.dslist.services;

import com.leoangelo.dslist.DTO.GameDTO;
import com.leoangelo.dslist.DTO.GameListDTO;
import com.leoangelo.dslist.DTO.GameMinDTO;
import com.leoangelo.dslist.entities.Game;
import com.leoangelo.dslist.entities.GameList;
import com.leoangelo.dslist.repositories.GameListRepository;
import com.leoangelo.dslist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameListService {

    @Autowired
    private GameListRepository gameListRepository;

    @Transactional(readOnly = true)
    public List<GameListDTO> findAll(){
        List<GameList> result = gameListRepository.findAll();
       return result.stream().map(x -> new GameListDTO(x)).toList();
    }

}
