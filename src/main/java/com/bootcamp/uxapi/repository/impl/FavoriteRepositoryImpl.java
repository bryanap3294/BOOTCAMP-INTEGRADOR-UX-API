package com.bootcamp.uxapi.repository.impl;

import com.bootcamp.uxapi.model.Favorite;
import com.bootcamp.uxapi.repository.FavoriteRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Repository;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Slf4j
@Repository
public class FavoriteRepositoryImpl implements FavoriteRepository {

    private final WebClient client;

    public FavoriteRepositoryImpl(WebClient.Builder builder,
                              @Value( "${application.urlApiFavorites:http://localhost/favorites}" ) String urlApiBlog){
        log.info("urlApiBlog = " + urlApiBlog);

        this.client = builder.baseUrl(urlApiBlog)
                .build();
    }

    @Override
    public Flux<Favorite> findAll() {
        return this.client.get().accept(MediaType.APPLICATION_JSON)
                .retrieve()
                .bodyToFlux(Favorite.class);
    }

    @Override
    public Mono<Favorite> save(Favorite favorite) {
        return this.client.post()
                .header(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE)
                .body(Mono.just(favorite), Favorite.class)
                .retrieve()
                .bodyToMono(Favorite.class);
    }
}
