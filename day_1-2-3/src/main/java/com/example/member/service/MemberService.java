package com.example.member.service;

import com.example.member.entity.Member;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MemberService {
    public Member createMember(Member member){
        //No Business Logics
        return member;
    }
    public Member updateMember(Member member){
        //No Business Logics
        return member;
    }
    public Member findMember(long memberId){
        //Stub Data
        Member response = new Member(1L, "김코딩", "Kim@naver.com", "010-1234-5678");
        return response;
    }
    public List<Member> findMembers(){
        //Stub Data
        List<Member> response = List.of(
                new Member(1L, "김코딩", "Kim@naver.com", "010-1234-5678"),
                new Member(2L, "박자바", "Park@gmail.com", "010-1111-6666")
        );
        return response;
    }
    public void deleteMember(long memberId){
        //No Business Logics
    }

}
