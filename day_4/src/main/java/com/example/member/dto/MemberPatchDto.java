package com.example.member.dto;

import com.example.member.validation.NotSpace;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Pattern;

@Getter
@Setter
public class MemberPatchDto {
    private long memberId;
    @NotSpace(message = "회원 이름은 공백이 아니어야 합니다")
    private String name;
    private String email;
    @NotSpace(message = "휴대폰 번호는 공백이 아니어야 합니다")
    @Pattern(regexp = "^010-\\d{3,4}-\\d{4}$",
            message = "휴대폰 번호는 010으로 시작하는 11자리 숫자와 '-'로 구성되어야 합니다")
    private String phone;
}
