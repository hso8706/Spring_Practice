package com.example.member.service;

import com.example.member.entity.Member;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MemberService {
    public Member createMember(Member member) {
        //TODO : Business Logic
        return member;
    }

    public Member updateMember(Member member) {
        //TODO : Business Logic
        return member;
    }

    public Member findMember(long memberId) {
        //TODO : Stub DATA
        Member response = new Member(1L, "김코딩", "Kim@gmail.com", "010-3333-4444");
        return response;
    }

    public List<Member> findMembers() {
        List<Member> response = List.of(
                new Member(1L, "김코딩", "Kim@gmail.com", "010-3333-4444"),
                new Member(2L, "하박사", "Ha@naver.com", "010-1111-2222")
        );
        return response;
    }

    public void deleteMember() {
        //TODO : Business Logic
    }

}
