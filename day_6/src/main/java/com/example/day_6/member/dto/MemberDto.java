package com.example.day_6.member.dto;

import lombok.Getter;

public class MemberDto {

    public class Post{
        //필수 입력 사항
        private String email;
        private String name;
        private String phone;
    }

    @Getter
    public class Patch{
        //필요 이유 : DB에 저장되기전에 mapping 할 때 필요해서 그런가?
        private long memberId;
        //선택 입력 사항
        private String email;
        private String name;
        private String phone;
        //어플리케이션 내부적으로 변경(입력받지 않음)
        private Member.MemberStatus memberStatus;
        private Stamp stamp;
    }

    public class Response{
        //응답 요소
        private long memberId;
        private String email;
        private String name;
        private String phone;
        private Member.MemberStatus memberStatus;
        private Stamp stamp;
    }
}
