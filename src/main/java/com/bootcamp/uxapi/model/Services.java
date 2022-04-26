package com.bootcamp.uxapi.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Services {

    private String serviceCode;
    private String description;

    private List<Channel> channels;

}
