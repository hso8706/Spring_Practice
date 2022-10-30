package com.example.v1.member.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class MemberResponseDto {
    //TODO Validation 필요
    private long memberId;
    private String name;
    private String email;
    private String phone;
}
