package com.example.v1.coffee.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class CoffeePatchDto {
    private long coffeeId;
    private String korName;
    private String engName;
    private int price;
}
