package com.mangjakseon.repository;

import com.mangjakseon.entity.Member;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.stream.IntStream;

@SpringBootTest
public class MemberRepositoryTests {
    @Autowired
    private MemberRepository memberRepository;

    @Test
    public void insertMembers(){
        IntStream.rangeClosed(1,100).forEach(i -> {
            Member member = Member.builder()
                    .email("User"+i+"@naver.com")
                    .nickname("리뷰남김"+i)
                    .build();
            memberRepository.save(member);
        });
    }
}
