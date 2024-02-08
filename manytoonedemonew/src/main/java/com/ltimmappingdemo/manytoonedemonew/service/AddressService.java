package com.ltimmappingdemo.manytoonedemonew.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ltimmappingdemo.manytoonedemonew.entity.Address;
import com.ltimmappingdemo.manytoonedemonew.repository.AddressRepository;

@Service
public class AddressService {
    
    @Autowired
    private AddressRepository addressRepository;

    public List<Address> getAllAddresses()
    {
        return addressRepository.findAll();
    }

    public Optional<Address> getAddressById(Long id)
    {
        return addressRepository.findById(id);
    }

    public Address saveAddress(Address address)
    {
        return addressRepository.save(address);
    }

    public void deleteAddressById(Long id)
    {
        addressRepository.deleteById(id);
    }

}
