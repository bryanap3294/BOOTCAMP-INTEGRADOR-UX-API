package com.bootcamp.uxapi.repository.impl;

import com.bootcamp.uxapi.model.PaymentServices;
import com.bootcamp.uxapi.repository.PaymentServicesRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
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
        return null;
    }

    @Override
    public Mono<PaymentServices> save() {
        return null;
    }
}
