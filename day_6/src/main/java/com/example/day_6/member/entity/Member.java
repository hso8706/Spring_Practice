package com.example.day_6.member.entity;

import org.springframework.core.annotation.Order;

import java.time.LocalDateTime;
import java.util.List;

public class Member {
    private long memberId;
    private String email;
    private String name;
    private String phone;
    private LocalDateTime createdAt;
    private LocalDateTime modifiedAt;

    //연관 관계 매핑
    private Stamp stamp;
    private List<Order> orders;
}
