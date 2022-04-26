package com.bootcamp.uxapi.controller;

import com.bootcamp.uxapi.model.Favorite;
import com.bootcamp.uxapi.service.FavoriteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/ux-api/favorites")
public class FavoriteController {

    @Autowired
    private FavoriteService favoriteService;

    @GetMapping("/")
    public Flux<Favorite> findAll(){
        return favoriteService.findAll();
    }

    @PostMapping("/")
    public Mono<Favorite> save(@RequestBody Favorite favorite){
        return favoriteService.save(favorite);
    }

}
