package com.practice1.practicemapping.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.practice1.practicemapping.entity.Address;

@Entity
public class Employee {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)    
    private Long eid;
    private String ename, email;

    @OneToMany(mappedBy = "employee", cascade = CascadeType.ALL)
    @JsonIgnore
    private List<Address> addressList;
    
    public Employee(String ename, String email, List<Address> addressList) {
        this.ename = ename;
        this.email = email;
        this.addressList = addressList;
    }
    public Employee() {
    }
    public Long getEid() {
        return eid;
    }
    public void setEid(Long eid) {
        this.eid = eid;
    }
    public String getEname() {
        return ename;
    }
    public void setEname(String ename) {
        this.ename = ename;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public List<Address> getAddressList() {
        return addressList;
    }
    public void setAddressList(List<Address> addressList) {
        this.addressList = addressList;
    }

    

    


}
