package com.practice.imp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.practice.imp.entity.Address;

@Repository
public interface AddressRepository extends JpaRepository<Address, Long>{
    
}
