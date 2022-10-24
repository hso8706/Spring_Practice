package com.example.member.controller;


import com.example.member.dto.MemberPatchDto;
import com.example.member.dto.MemberPostDto;
import com.example.member.dto.MemberResponseDto;
import com.example.member.entity.Member;
import com.example.member.mapper.MemberMapper;
import com.example.member.service.MemberService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/v1/members")
@Validated
public class MemberController {
    private MemberMapper memberMapper;
    private MemberService memberService;

    public MemberController(MemberMapper memberMapper, MemberService memberService) {
        this.memberMapper = memberMapper;
        this.memberService = memberService;
    }

    @PostMapping
    public ResponseEntity postMember(@RequestBody MemberPostDto memberPostDto) {
        Member member = memberMapper.memberPostDtoToMember(memberPostDto);
        Member response = memberService.createMember(member);
        return new ResponseEntity<>(memberMapper.memberToMemberResponseDto(response), HttpStatus.CREATED);
    }

    @PatchMapping("/{member-id}")
    public ResponseEntity patchMember(@PathVariable("member-id") long memberId,
                                      @RequestBody MemberPatchDto memberPatchDto) {
        memberPatchDto.setMemberId(memberId);
        Member response = memberService.updateMember(memberMapper.memberPatchDtoToMember(memberPatchDto));
        return new ResponseEntity<>(memberMapper.memberToMemberResponseDto(response), HttpStatus.OK);
    }

    @GetMapping("/{member-id}")
    public ResponseEntity getMember(@PathVariable("member-ic") long memberId) {
        Member response = memberService.findMember(memberId);
        return new ResponseEntity(memberMapper.memberToMemberResponseDto(response), HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity getMembers() {
        List<Member> members = memberService.findMembers();
        List<MemberResponseDto> response =
                members.stream()
                .map(member -> memberMapper.memberToMemberResponseDto(member))
                .collect(Collectors.toList());
        return new ResponseEntity(response, HttpStatus.OK);
    }

    @DeleteMapping("/{member-id}")
    public ResponseEntity deleteMember(@PathVariable("member-ic") long memberId) {
        System.out.println("Delete Member : " + memberId);
        memberService.deleteMember(memberId);
        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }
}
