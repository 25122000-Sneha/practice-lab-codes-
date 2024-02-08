package com.mock1sba.q1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mock1sba.q1.entity.Client;
import com.mock1sba.q1.repository.ClientRepository;

@Service
public class ClientService {
    
    @Autowired
    private ClientRepository clientRepository;

    public Client addClient(Client client)
    {
        return clientRepository.save(client);
    }

    public List<Client> getAllClients()
    {
        return clientRepository.findAll();
    }

    public Client getClientById(Long id)
    {
        return clientRepository.findById(id).get();
    }

    public void deleteClientById(Long id)
    {
        clientRepository.deleteById(id);
    }    



}
