package com.bootcamp.uxapi.service;

import com.bootcamp.uxapi.model.PaymentServices;
import com.bootcamp.uxapi.model.Services;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface PaymentServicesService {

    Flux<Services> findAll();
    Mono<PaymentServices> save();
    Flux<Services> findAllByChannelCode(String channelCode);

}
