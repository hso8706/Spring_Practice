package com.example.v1.coffee.controller;

import com.example.v1.coffee.dto.CoffeePatchDto;
import com.example.v1.coffee.dto.CoffeePostDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/coffees")
public class CoffeeController{
//POST
    @PostMapping
    public ResponseEntity postCoffee(@RequestBody CoffeePostDto coffeePostDto){
        return new ResponseEntity(coffeePostDto, HttpStatus.CREATED);
    }
//PATCH
    @PatchMapping("/{coffee-id}")
    public ResponseEntity patchCoffee(@PathVariable("coffee-id")long coffeeId,
                                      @RequestBody CoffeePatchDto coffeePatchDto){
        coffeePatchDto.setCoffeeId(coffeeId);
        return new ResponseEntity(coffeePatchDto, HttpStatus.OK);
    }
//GET(ONE)
    @GetMapping("/{coffee-id}")
    public ResponseEntity getCoffee(@PathVariable("coffee-id")long coffeeId){
        return new ResponseEntity(HttpStatus.OK);
    }
//GET(ALL)
    @GetMapping
    public ResponseEntity getCoffees(){
        return new ResponseEntity(HttpStatus.OK);
    }
//DELETE
    @DeleteMapping("/{coffee-id}")
    public ResponseEntity deleteCoffee(@PathVariable("coffee-id")long coffeeId){
        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }
}

/*
Class Controller
-API End Point : Member 기능의 시작점. Member 의 기능을 사용하기 위해서는 MemberController 부터 거친다.

@RestController
-API End Point 표시
-@RestController < @Controller < @Component : 자동으로 Spring Bean 등록

@RequestMapping("/v1/members")
-핸들러 메서드 매핑 : 클라이언트의 요청과 핸들러 메서드를 매핑.
-URL Path : MemberController 전체에 사용되는 공통 URL 설정
*/
