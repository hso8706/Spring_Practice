package com.example.v1.member.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

@Getter // dto 클래스 필수 항목
@AllArgsConstructor // Mapper 에서 사용됨.
public class MemberPostDto {
    //TODO Validation 필요
    @NotBlank
    private String name;
    @Email
    @NotBlank
    private String email;
    @Pattern(regexp = "^010-\\d{3,4}-\\d{4}$")
    private String phone;
}

/*
DTO Class
-데이터 전송을 위한 객체 : RequestBody 에 대한 직렬화와 역직렬화를 담당함.
-유효성 검증의 단순화 : Validation 을 Controller 의 각각에서 진행하지 않고 DTO 클래스에서 진행함으로써 코드 단순화

@Getter
-Lombok 애너테이션 : Lombok 에서 지원하는 애너테이션으로 각 필드의 getter 를 생성
-@Settser 도 있다.

@AllArgsConstructor
-Lombok 애너테이션 : 모든 필드를 매개변수로하는 생성자 자동 생성

 */
