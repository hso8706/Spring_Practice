package com.example.v1.order.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/order")
public class OrderController {
//POST
//PATCH
//GET(ONE)
//GET(ALL)
//DELETE
}

/*
Class MemberController
-API End Point : Member 기능의 시작점. Member 의 기능을 사용하기 위해서는 MemberController 부터 거친다.

@RestController
-API End Point 표시
-@RestController < @Controller < @Component : 자동으로 Spring Bean 등록

@RequestMapping("/v1/members")
-핸들러 메서드 매핑 : 클라이언트의 요청과 핸들러 메서드를 매핑.
-URL Path : MemberController 전체에 사용되는 공통 URL 설정
*/
