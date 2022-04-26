package com.bootcamp.uxapi.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class PaymentServices {

    private String id;
    private String supplyCode;
    private String serviceCode;
    private String amount;
    private String transactionDate;

}
