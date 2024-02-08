package com.practice1.practicemapping.controller;

import org.springframework.web.bind.annotation.RestController;

import com.practice1.practicemapping.entity.Address;
import com.practice1.practicemapping.service.AddressService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;




@RestController
@RequestMapping("/api/addresses")
public class AddressController {
    
    @Autowired
    private AddressService addressService;

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

    @PostMapping
    public Address saveAddress(@RequestBody Address address)
    {
        return addressService.saveAddress(address);
    }

    @DeleteMapping("/{id}")
    public void deleteAddressById(@PathVariable Long id)
    {
        addressService.deleteAddressById(id);
    }

    @PostMapping("/existing/post")
    public Address saveAddressWithExistingEmployee(@RequestBody Address address)
    {
        return addressService.saveAddressWithExistingEmployee(address);
    }

    @GetMapping("/for employee/{emp_id}")
    public List<Address> getAllAddressesForEmployee(@PathVariable Long emp_id)
    {
        return addressService.getAllAddressesForEmployee(emp_id);
    }
}
