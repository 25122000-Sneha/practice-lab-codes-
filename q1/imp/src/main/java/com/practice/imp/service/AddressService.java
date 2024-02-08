package com.practice.imp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.practice.imp.entity.Address;
import com.practice.imp.repository.AddressRepository;

@Service
public class AddressService {
    
    @Autowired
    private AddressRepository addressRepository;

    @Autowired
    private EmployeeRepository employeeRepository;

    public Address saveAddress(Address address)
    {
        return addressRepository.save(address);
    }

    public Address saveAddressWithExistentEmployee(Address address)
    {
        Address address1 = new Address();
        address1.setEname(address.getStreet());
        address1.setCity(address.getCity());
        address1.setPincode(address.getPincode());

        address1.setEmployee(employeeRepository.findById(address.getEmployee().getEid()).get());

        return addressRepository.save(address1);
    }

    public List<Address> getAllAddresses()
    {
        return addressRepository.findAll();
    }

    public Address getAddressById(Long id)
    {
        return addressRepository.findById(id).get();
    }

    public void deleteAddress(Long id)
    {
        addressRepository.deleteById(id);
    }


}
