package com.example.member.mapper;

import com.example.member.dto.MemberPatchDto;
import com.example.member.dto.MemberPostDto;
import com.example.member.dto.MemberResponseDto;
import com.example.member.entity.Member;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface MemberMapper {
    Member memberPostDtoToMember(MemberPostDto memberPostDto);
    Member memberPatchDtoToMember(MemberPatchDto memberPatchDto);
    MemberResponseDto memberToMemberResponseDto(Member member);
}
