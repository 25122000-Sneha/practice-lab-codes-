package com.practice1.practicemapping.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.practice1.practicemapping.entity.Address;

@Repository
public interface AddressRepository extends JpaRepository<Address, Long>{
    
    @Query("select a from Address a where a.employee.eid = :emp_id")
    List<Address> findAllAddressForEmployee(Long emp_id);
}
