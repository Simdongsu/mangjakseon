package com.mangjakseon.entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@ToString


public class Member extends BaseEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long mno;
    private String email;
    private String nickname;
}
