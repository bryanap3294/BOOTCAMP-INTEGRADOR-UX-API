package com.bootcamp.uxapi.repository;

import com.bootcamp.uxapi.model.PaymentServices;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface PaymentServicesRepository {

    Flux<PaymentServices> findAll();
    Mono<PaymentServices> save();

}
