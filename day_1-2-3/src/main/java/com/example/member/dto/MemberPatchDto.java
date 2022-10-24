package com.example.member.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MemberPatchDto {
    private long memberId;
    private String name;
    private String email;
    private String phone;
}
