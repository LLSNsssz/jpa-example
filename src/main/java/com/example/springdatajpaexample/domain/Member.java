package com.example.springdatajpaexample.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

import java.time.LocalDateTime;
import java.util.Date;
import lombok.Getter;

@Entity
@Getter
@Table(name = "member")
public class Member {

    @Id
    @Column(name = "id")
    private String id;

    @Column(name = "name")
    private String userName;

    @Column(name = "age")
    private Integer age;

    @Enumerated(EnumType.STRING)
    private Roletype roletype;

    @Temporal(TemporalType.TIMESTAMP)
    private LocalDateTime createAt;

    public Member(String id, String userName, Integer age, Roletype roletype) {
        this.id = id;
        this.userName = userName;
        this.age = age;
        this.roletype = roletype;
        this.createAt = LocalDateTime.now();
    }
}
