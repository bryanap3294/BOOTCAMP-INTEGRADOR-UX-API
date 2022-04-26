package com.bootcamp.uxapi.repository.impl;

import com.bootcamp.uxapi.model.Favorite;
import com.bootcamp.uxapi.model.PaymentServices;
import com.bootcamp.uxapi.repository.PaymentServicesRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Repository;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Repository
@Slf4j
public class PaymentServicesRepositoryImpl implements PaymentServicesRepository {

    private final WebClient client;

    public PaymentServicesRepositoryImpl(WebClient.Builder builder,
                                  @Value( "${application.urlApiPaymentServices:http://localhost/payment-services}" ) String urlApiBlog){
        log.info("urlApiBlog = " + urlApiBlog);

        this.client = builder.baseUrl(urlApiBlog)
                .build();
    }

    @Override
    public Flux<PaymentServices> findAll() {
        return this.client.get().accept(MediaType.APPLICATION_JSON)
                .retrieve()
                .bodyToFlux(PaymentServices.class);
    }

    @Override
    public Mono<PaymentServices> save() {
        return this.client.post()
                .header(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE)
                .body(Mono.just(favorite), PaymentServices.class)
                .retrieve()
                .bodyToMono(PaymentServices.class);
    }
}
