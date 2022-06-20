package com.mangjakseon.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@ToString(exclude = {"movie","member"})
public class Review extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long rno;
    private String title;
    private String content;
    private int grade;

    @ManyToOne(fetch = FetchType.LAZY)
    private Movie movie;

    @ManyToOne(fetch = FetchType.LAZY)
    private Member member;

}
