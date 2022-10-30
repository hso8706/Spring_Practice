package com.example.v1.member.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter // dto 클래스 필수 항목
@AllArgsConstructor // Mapper 에서 사용됨.
public class MemberPostDto {
    //TODO Validation 필요
    private String name;
    private String email;
    private String phone;
}

/*
DTO Class
-데이터 전송을 위한 객체 : RequestBody 에 대한 직렬화와 역직렬화를 담당함.
-유효성 검증의 단순화 : Validation 을 Controller 의 각각에서 진행하지 않고 DTO 클래스에서 진행함으로써 코드 단순화
@Getter
 */
