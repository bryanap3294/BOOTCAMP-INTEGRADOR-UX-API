package com.bootcamp.uxapi.service;

import com.bootcamp.uxapi.model.Favorite;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface FavoriteService {

    Flux<Favorite> findAll();
    Mono<Favorite> save(Favorite favorite);

}
