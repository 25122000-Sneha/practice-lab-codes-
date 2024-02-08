package com.practice1.practicemapping.service;

import java.util.List;

import org.hibernate.boot.jaxb.mapping.LifecycleCallback;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.practice1.practicemapping.entity.Address;
import com.practice1.practicemapping.repository.AddressRepository;
import com.practice1.practicemapping.repository.EmployeeRepository;

@Service
public class AddressService {
    
    @Autowired
    private AddressRepository addressRepository;

    @Autowired
    private EmployeeRepository employeeRepository;

    public List<Address> getAllAddresses()
    {
        return addressRepository.findAll();
    }


    public Address getAddressById(Long id)
    {
        return addressRepository.findById(id).get();
    }

    public Address saveAddress(Address address)
    {
        return addressRepository.save(address);
    }

    

    public void deleteAddressById(Long id)
    {
        addressRepository.deleteById(id);
    }

    public Address saveAddressWithExistingEmployee(Address address)
    {
        Address ad1 = new Address();
        ad1.setCity(address.getCity());
        ad1.setStreet(address.getStreet());
        ad1.setPincode(address.getPincode());

        ad1.setEmployee(employeeRepository.findById(address.getEmployee().getEid()).get());

        return addressRepository.save(ad1);
    }

    public List<Address> getAllAddressesForEmployee(Long emp_id)
    {
        return addressRepository.findAllAddressForEmployee(emp_id);
    }
}
