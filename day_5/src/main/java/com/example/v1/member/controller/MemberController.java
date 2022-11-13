package com.example.v1.member.controller;

import com.example.v1.member.dto.MemberPatchDto;
import com.example.v1.member.dto.MemberPostDto;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.Positive;

@RestController
@RequestMapping("/v1/members")
@Validated
public class MemberController {
    //POST
    @PostMapping
    public ResponseEntity postMember(@Valid @RequestBody MemberPostDto memberPostDto){
        return new ResponseEntity(memberPostDto, HttpStatus.CREATED);
    }
    //PATCH
    @PatchMapping("/{member-id}")
    public ResponseEntity patchMember(@PathVariable("member-id") @Positive long memberId,
                                      @Valid @RequestBody MemberPatchDto memberPatchDto){
        memberPatchDto.setMemberId(memberId);
        return new ResponseEntity(memberPatchDto, HttpStatus.OK);
    }
    //GET(ONE)
    @GetMapping("/{member-id}")
    public ResponseEntity getMember(@PathVariable("member-id")long memberId){
        return new ResponseEntity(HttpStatus.OK);
    }
    //GET(ALL)
    @GetMapping
    public ResponseEntity getMembers(){
        return new ResponseEntity(HttpStatus.OK);
    }
    //DELETE
    @DeleteMapping("/{member-id}")
    public ResponseEntity deleteMember(@PathVariable("member-id")long memberId){
        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }
}

/*
Class MemberController
-API End Point : Member 기능의 시작점. Member 의 기능을 사용하기 위해서는 MemberController 부터 거친다.
-핸들러 메서드 : Controller 의 메서드를 지칭하며 요청을 받아 응답으로 반환하는 메서드. 기본적으로 받은 요청의 형식과 같은 형식으로 응답을 반환한다. 요즘엔 JSON 으로 받고 JSON 으로 반환하는게 기본이다.

@RestController
-API End Point 표시
-@RestController < @Controller < @Component : 자동으로 Spring Bean 등록

@RequestMapping("/v1/members")
-핸들러 메서드 매핑 : 클라이언트의 요청과 핸들러 메서드를 매핑.
-URL Path : MemberController 전체에 사용되는 공통 URL 설정

@RequestParam
-낱개 요청 처리 : x-www-form-urlencoded 형식의 요청을 낱개로 받을 때 사용하는 애너테이션

@RequestBody
-묶음 요청 처리 : JSON 형식의 요청을 묶음으로 받을 때 사용하는 애너테이션

ResponseEntity
-JSON + HttpStatus : 반환하길 원하는 값을 JSON 으로 변환한 응답을 생성하고, 동시에 응답 메세지에 HttpStatus 를 묶어주는 객체(참조형).

HttpMessageConverter
-JSON 반환 방법 : 핸들러 메서드에 @RequestBody 애너테이션이 있거나, ResponseEntity 을 반환형으로 사용하는 경우 내부적으로 HttpMessageConverter 이 작동하여 응답 객체를 JSON 형식으로 바꿔준다.

@Valid
-Validation : 애너테이션을 붙인 대상을 유효성 검증하겠다는 의미의 애너테이션

@Validated //TODO 추가 공부 필요
-Validation : 클래스 단위에 붙이는 애너테이션
*/
