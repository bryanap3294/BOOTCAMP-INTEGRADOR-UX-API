package com.bootcamp.uxapi.repository;

import com.bootcamp.uxapi.model.Favorite;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface FavoriteRepository {

    Flux<Favorite> findAll();
    Mono<Favorite> save(Favorite favorite);

}
