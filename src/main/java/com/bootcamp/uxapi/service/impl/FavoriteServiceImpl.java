package com.bootcamp.uxapi.service.impl;

import com.bootcamp.uxapi.model.Favorite;
import com.bootcamp.uxapi.repository.FavoriteRepository;
import com.bootcamp.uxapi.service.FavoriteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class FavoriteServiceImpl implements FavoriteService {

    @Autowired
    private FavoriteRepository favoriteRepository;

    @Override
    public Flux<Favorite> findAll() {
        return favoriteRepository.findAll();
    }

    @Override
    public Mono<Favorite> save(Favorite favorite) {
        return favoriteRepository.save(favorite);
    }
}
