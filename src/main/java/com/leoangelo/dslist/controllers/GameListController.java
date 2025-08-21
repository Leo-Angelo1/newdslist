package com.leoangelo.dslist.controllers;

import com.leoangelo.dslist.DTO.GameDTO;
import com.leoangelo.dslist.DTO.GameListDTO;
import com.leoangelo.dslist.DTO.GameMinDTO;
import com.leoangelo.dslist.services.GameListService;
import com.leoangelo.dslist.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/lists")
public class GameListController {

    @Autowired
    private GameListService GameListService;

    @GetMapping
    public List<GameListDTO> findAll(){
        List<GameListDTO> result = GameListService.findAll();
        return result;
    }
}
