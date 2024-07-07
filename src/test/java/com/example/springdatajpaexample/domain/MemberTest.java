package com.example.springdatajpaexample.domain;

import static org.junit.jupiter.api.Assertions.*;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class MemberTest {
    @Test
    void creat() {
        Member member = new Member("", "lee", 30, Roletype.ADMIN);

        System.out.println(member.getCreateAt());
        Assertions.assertThat(member.getRoletype()).isEqualTo(Roletype.ADMIN);
    }
}