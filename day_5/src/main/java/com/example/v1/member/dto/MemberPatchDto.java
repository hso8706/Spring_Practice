package com.example.v1.member.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Pattern;

@Getter
@Setter
@AllArgsConstructor
public class MemberPatchDto {
    //TODO Validation 필요
    private long memberId;
    @Pattern(regexp = "^\\S+(\\s?\\S+)*$")
    private String name;
    private String email;
    @Pattern(regexp = "^010-\\d{3,4}-\\d{4}$")
    private String phone;
}
