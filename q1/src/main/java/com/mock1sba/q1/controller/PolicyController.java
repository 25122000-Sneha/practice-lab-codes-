package com.mock1sba.q1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mock1sba.q1.entity.Policy;
import com.mock1sba.q1.service.PolicyService;


@RestController
@RequestMapping("/api/policies")
public class PolicyController {

    @Autowired
    private PolicyService policyService;

    @PostMapping
    public Policy addPolicy(@RequestBody Policy policy)
    {
        return policyService.addPolicy(policy);
    }

    @GetMapping
    public List<Policy> getAllPolicies()
    {
        return policyService.getAllPolicies();
    }

    @GetMapping("/{id}")
    public Policy getPolicyById(@PathVariable Long id)
    {
        return policyService.getPolicyById(id);
    }

    @DeleteMapping("/{id}")
    public void deletePolicyById(@PathVariable Long id)
    {
        policyService.deleteById(id);
    }


    
}
