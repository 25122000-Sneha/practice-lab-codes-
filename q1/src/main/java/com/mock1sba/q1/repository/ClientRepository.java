package com.mock1sba.q1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mock1sba.q1.entity.Client;


@Repository
public interface ClientRepository extends JpaRepository<Client, Long>{
    

}
