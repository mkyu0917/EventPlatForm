package com.mkc.eventplatform.member;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MemberController {

    final private MemberService memberService;

    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }

    @PostMapping("/memberJoin")
    //@RequestMapping(value="/memberJoin", method = RequestMethod.POST)
    public MemberJoinResponse memberJoin(@RequestBody MemberJoinRequest memberJoinRequest){

        MemberJoinResponse memberJoinResponse =memberService.memberJoin(memberJoinRequest);
        return memberJoinResponse;
    }


}
