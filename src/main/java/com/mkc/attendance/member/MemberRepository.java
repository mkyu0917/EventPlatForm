package com.mkc.attendance.member;

import org.springframework.data.jpa.repository.JpaRepository;

//jpaRepository를 상속받음 인터페이스는 인터페이스끼리 상속가능
//JpaRepository 통해서 crud 를 전부 상속 가능
public interface MemberRepository extends JpaRepository<Member,Long> {
}
