package com.practice.imp.controller;

import org.springframework.web.bind.annotation.RestController;

import com.practice.imp.entity.Address;
import com.practice.imp.repository.AddressRepository;
import com.practice.imp.service.AddressService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;


@RestController
@RequestMapping("/api/addresses")
public class AddressController {

    @Autowired
    private AddressService addressService;
    
    @PostMapping
    public Address saveAddress(@RequestBody Address address)
    {
        return addressService.saveAddress(address);
    }

    /*@PostMapping("/existing_employee")
    public Address saveAddressWithExistentEmployee(@RequestBody Address address)
    {
        return addressService.saveAddressWithExistentEmployee(address);
    }*/

    @GetMapping
    public List<Address> getAllAddresses()
    {
        return addressService.getAllAddresses();
    }

    @GetMapping("/{id}")
    public Address getAddressById(@PathVariable Long id)
    {
        return addressService.getAddressById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteAddress(@PathVariable Long id)
    {
        addressService.deleteAddress(id);
    }
}
