package com.mock1sba.q1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mock1sba.q1.entity.Policy;

@Repository
public interface PolicyRepository extends JpaRepository<Policy, Long>{
    
}
