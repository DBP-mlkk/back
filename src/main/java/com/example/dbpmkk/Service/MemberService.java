package com.example.dbpmkk.Service;

import com.example.dbpmkk.Domain.Member;
import com.example.dbpmkk.Repository.MemberRepository;
import com.example.dbpmkk.Repository.MemoryMemberRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MemberService {
    private final MemberRepository memberRepository = new MemoryMemberRepository();

    //회원가입
    public Long join(Member member) {
        //중복회원(이름) X
        validateDuplicateMember(member); // 중복 회원 검증 (컨 + 알 + M)
        memberRepository.save(member);
        return member.getId();
    }

    private void validateDuplicateMember(Member member) {
        memberRepository.findByName(member.getName())
                .ifPresent(member1 -> {
                    throw new IllegalStateException("이미 존재하는 회원");
                });
    }

    //전체 회원 조회
    public List<Member> findMembers() {
        return memberRepository.findall();
    }
    //하나의 회원 조회
    public Optional<Member> findOne(Long memberId){
        return memberRepository.findById(memberId);
    }
}
