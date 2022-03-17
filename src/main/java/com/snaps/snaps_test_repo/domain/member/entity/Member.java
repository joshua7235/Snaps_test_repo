package com.snaps.snaps_test_repo.domain.member.entity;

import com.snaps.snaps_test_repo.global.enumerate.Role;
import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor (access = AccessLevel.PROTECTED)
@AllArgsConstructor (access = AccessLevel.PRIVATE)
public class Member {

    @Id
    @GeneratedValue
    private Long id;

    @Column ()
    private Role role;


}
