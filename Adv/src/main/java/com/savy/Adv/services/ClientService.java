package com.savy.Adv.services;

import com.savy.Adv.dto.Client;
import com.savy.Adv.repositories.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ClientService {
    @Autowired
    private final ClientRepository clientRepository;
    public ClientService( ClientRepository clientRepository1) {

        this.clientRepository = clientRepository1;
    }

    public List<Client> getAllClients() {
        List<Client> clients = new ArrayList<Client>();
        clientRepository.findAll().forEach(clients::add);
        return clients;
    }

    public Client getClientById(long id) {
        return clientRepository.findById(id).get();
    }

    public void saveOrUpdate(Client client) {
        clientRepository.save(client);
    }

    public void delete(long id) {
        clientRepository.deleteById(id);
    }

    public void update(Client client, long id) {
        clientRepository.save(client);
    }
}
