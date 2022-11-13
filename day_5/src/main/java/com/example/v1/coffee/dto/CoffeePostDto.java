package com.example.v1.coffee.dto;

import com.example.v1.validation.NotSpace;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.hibernate.validator.constraints.Range;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

@Getter
@AllArgsConstructor
public class CoffeePostDto {
    @NotBlank
    private String korName;
    @NotBlank
    @Pattern(regexp = "^[A-Za-z]+(\\s?[A-Za-z])*$")
    private String engName;
    @NotBlank
    @Range(min = 100, max = 50000)
    private int Price;
}
