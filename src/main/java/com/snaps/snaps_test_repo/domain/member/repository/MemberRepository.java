package com.snaps.snaps_test_repo.domain.member.repository;

import com.snaps.snaps_test_repo.domain.member.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Long> {
}
