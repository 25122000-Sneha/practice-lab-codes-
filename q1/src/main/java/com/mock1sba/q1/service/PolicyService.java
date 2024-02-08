package com.mock1sba.q1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mock1sba.q1.entity.Policy;
import com.mock1sba.q1.repository.ClientRepository;
import com.mock1sba.q1.repository.PolicyRepository;

@Service
public class PolicyService {
    
    @Autowired
    private PolicyRepository policyRepository;

    @Autowired
    private ClientRepository clientRepository;

    public Policy addPolicy(Policy policy)
    {
        Policy policy1 = new Policy();
        policy1.setPolicyName(policy.getPolicyName());
        policy1.setCoverageType(policy.getCoverageType());
        policy1.setIssueDate(policy.getIssueDate());
        policy1.setClient(clientRepository.findById(policy.getClient().getClientId()).get());

        return policyRepository.save(policy1);
    }

    public List<Policy> getAllPolicies()
    {
        return policyRepository.findAll();
    }

    public Policy getPolicyById(Long id)
    {
        return policyRepository.findById(id).get();
    }

    public void deleteById(Long id)
    {
        policyRepository.deleteById(id);
    }


    

}
