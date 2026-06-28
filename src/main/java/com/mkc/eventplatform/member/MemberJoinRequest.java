package com.mkc.eventplatform.member;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class MemberJoinRequest {

    private String memberId;
    private String memberPassword;

}
