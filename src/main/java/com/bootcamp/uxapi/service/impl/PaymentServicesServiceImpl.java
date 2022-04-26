package com.bootcamp.uxapi.service.impl;

import com.bootcamp.uxapi.model.PaymentServices;
import com.bootcamp.uxapi.model.Services;
import com.bootcamp.uxapi.service.PaymentServicesService;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class PaymentServicesServiceImpl implements PaymentServicesService {
    @Override
    public Flux<Services> findAll() {
        return null;
    }

    @Override
    public Mono<PaymentServices> save() {
        return null;
    }
}
