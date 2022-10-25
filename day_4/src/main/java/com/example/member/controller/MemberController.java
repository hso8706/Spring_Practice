package com.example.member.controller;

import com.example.member.dto.MemberPatchDto;
import com.example.member.dto.MemberPostDto;
import com.example.member.mapper.MemberMapper;
import com.example.member.service.MemberService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/d4/members")
@Validated
public class memberController {
    private MemberMapper memberMapper;
    private MemberService memberService;

    public memberController(MemberMapper memberMapper, MemberService memberService) {
        this.memberMapper = memberMapper;
        this.memberService = memberService;
    }

    @PostMapping
    public ResponseEntity postMember(@Valid  @RequestBody MemberPostDto memberPostDto) {

        return new ResponseEntity<>(memberPostDto, HttpStatus.CREATED);
    }

    @PatchMapping("/{member-id}")
    public ResponseEntity patchMember(@PathVariable("member-id") long memberId,
                                      @Valid @RequestBody MemberPatchDto memberPatchDto) {
        memberPatchDto.setMemberId(memberId);
        return new ResponseEntity(memberPatchDto, HttpStatus.OK);
    }

    @GetMapping("/{member-id}")
    public ResponseEntity getMember(@PathVariable("member-id") long memberId) {

        return new ResponseEntity(HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity getMembers() {
        return new ResponseEntity(HttpStatus.OK);
    }

    @DeleteMapping("/{member-id}")
    public ResponseEntity deleteMember(@PathVariable("member-id") long memberId) {
        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }
}
