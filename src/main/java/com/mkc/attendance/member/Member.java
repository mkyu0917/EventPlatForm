package com.mkc.attendance.member;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity // 클래스가 DB 테이블과 매핑되는 jpa 엔티티임을 선언
@Getter // lombok이 모든 필드의 getter 생성
@AllArgsConstructor // 모든 필드의 생성자 생성
@NoArgsConstructor // lombok이 기본생성자 자동생성 @builder가 있으면 알아서 생성자를 만들어서 기본생성자를 안만들어줘서 명시적으로 추가
@Builder// lombok이 빌더 패턴 자동생성( 객체 생성을 이름으로 편하게 생성가능 )
@ToString // toString 필드 만들어줌
public class Member {

    @Id // 명시적으로 이게 pk라는 것을 선언
    @GeneratedValue(strategy = GenerationType.IDENTITY) //PK값을 DB가 자동증가시킴
    private Long memberNo;
    @Column(unique = true) //컬럼이 유니크하다고 알려줌
    private String memberId;
    private String memberPassword;
    private LocalDateTime memberJoinDate;
}
