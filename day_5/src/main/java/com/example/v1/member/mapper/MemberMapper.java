package com.example.v1.member.mapper;

import com.example.member.dto.MemberPatchDto;
import com.example.member.dto.MemberPostDto;
import com.example.member.dto.MemberResponseDto;
import com.example.member.entity.Member;
import org.mapstruct.Mapper;

//@Component //mapper 를 빈으로 등록하기 위함. => MapStruct 로 대신함.
@Mapper(componentModel = "spring") // MapStruct 의 사용과 속성값으로 bean 등록까지
public interface MemberMapper {
    //memberPostDto -> member
    Member memberPostDtoToMember(MemberPostDto memberPostDto);
    //memberPatchDto -> member
    Member memberPatchDtoToMember(MemberPatchDto memberPatchDto);
    //member -> memberResponseDto
    MemberResponseDto memberResponseDtoToMember(Member member);
}
