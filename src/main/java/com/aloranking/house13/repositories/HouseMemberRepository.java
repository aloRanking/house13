package com.aloranking.house13.repositories;

import com.aloranking.house13.models.HouseMember;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HouseMemberRepository extends JpaRepository<HouseMember, Long> {
}
