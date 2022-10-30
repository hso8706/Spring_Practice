package com.example.v1.member.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Member {
    private long memberId;
    private String name;
    private String email;
    private String phone;
}
