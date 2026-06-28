package com.mkc.attendance.member;

import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class MemberServiceImpl implements MemberService {

    private final MemberRepository memberRepository;

    public MemberServiceImpl(MemberRepository memberRepository) {

        this.memberRepository = memberRepository;
    }

    @Override
    public MemberJoinResponse memberJoin(MemberJoinRequest memberJoinRequest) {

        Member member = Member.builder()
                .memberId(memberJoinRequest.getMemberId())
                .memberPassword(memberJoinRequest.getMemberPassword())
                .memberJoinDate(LocalDateTime.now())
                .build();

        try {
            memberRepository.save(member);
        } catch (DataIntegrityViolationException e) {
            e.getStackTrace();
            return new MemberJoinResponse("이미 존재하는 아이디입니다.");
        }


        return new MemberJoinResponse("회원가입 되었습니다.");
    }
}
