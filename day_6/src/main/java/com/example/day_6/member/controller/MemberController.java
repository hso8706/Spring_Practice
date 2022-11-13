package com.example.day_6.member.controller;

import com.example.day_6.member.dto.MemberDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.Positive;

@RestController
@RequestMapping("/d6/members")
@Validated
@Slf4j
public class MemberController {
    //회원 정보 저장
    @PostMapping
    public ResponseEntity postMember(@Valid @RequestBody MemberDto.Post memberDtoPost){
        return new ResponseEntity(new SingleResponseDto(),HttpStatus.CREATED);
    };
    //회원 정보 수정
    @PatchMapping("/{member-id}")
    public ResponseEntity patchMember(
            @PathVariable("member-id") @Positive  long memberId,
            @Valid @RequestBody MemberDto.Patch memberDtoPatch){
        return new ResponseEntity();
    }
    //회원 정보 조회(특정)
    @GetMapping("/{member-id}")
    public ResponseEntity getMember(@PathVariable("member-id") @Positive long memberId){
        return new ResponseEntity();
    }
    //회원 정보 조회(모든)
    //페이지네이션 사용
        //쿼리 파라미터 요청 수용
        //data[] 로 응답 제공
    @GetMapping
    public ResponseEntity getMembers(@RequestParam @Positive int page,
                                     @RequestParam @Positive int size){
        return new ResponseEntity(new MultiResponseDto(), HttpStatus.OK);
    }
    //회원 정보 삭제(특정)
    @DeleteMapping("/{member-id}")
    public ResponseEntity deleteMember(@PathVariable("member-id") long memberId){
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
