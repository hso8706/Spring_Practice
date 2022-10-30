package com.example.v1.member.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class MemberPatchDto {
    //TODO Validation 필요
    private long memberId;
    private String name;
    private String email;
    private String phone;
}
