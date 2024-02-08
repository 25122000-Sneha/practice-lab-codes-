package com.ltimmappingdemo.manytoonedemonew.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ltimmappingdemo.manytoonedemonew.entity.Address;

@Repository
public interface AddressRepository extends JpaRepository<Address, Long>{
    
}
