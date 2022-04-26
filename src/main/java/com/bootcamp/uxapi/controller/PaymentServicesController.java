package com.bootcamp.uxapi.controller;

import com.bootcamp.uxapi.model.PaymentServices;
import com.bootcamp.uxapi.model.Services;
import com.bootcamp.uxapi.service.PaymentServicesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/ux-api/payment-services")
public class PaymentServicesController {

    @Autowired
    private PaymentServicesService paymentServicesService;

    @GetMapping("/{channelCode}")
    public Flux<Services> findAllByChannelCode(@PathVariable String channelCode){
        return paymentServicesService.findAllByChannelCode(channelCode);
    }

    @PostMapping()
    public Mono<PaymentServices> save(@RequestBody PaymentServices paymentServices){
        return save(paymentServices);
    }

}
