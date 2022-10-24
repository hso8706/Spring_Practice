package com.example.member.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@AllArgsConstructor
public class MemberResponseDto {
    private long memberId;
    private String name;
    private String email;
    private String phone;
}
