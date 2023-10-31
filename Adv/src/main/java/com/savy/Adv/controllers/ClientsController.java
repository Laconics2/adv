package com.savy.Adv.controllers;

import com.savy.Adv.dto.Client;
import com.savy.Adv.services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

@RestController
@RequestMapping("/clients")
public class ClientsController {

   @Autowired
   private final ClientService clientService;

    public ClientsController(ClientService clientService) {
        this.clientService = clientService;
    }

    @GetMapping
    public List<Client> getClients() {
        return clientService.getAllClients();
    }

    @GetMapping("/{id}")
    public Client getClient(@PathVariable Long id) {
        return clientService.getClientById(id);
    }

    @PostMapping
    public ResponseEntity<Object> createClient(@RequestBody Client client) throws URISyntaxException {
        clientService.saveOrUpdate(client);
        return ResponseEntity.created(new URI("/clients/" + client.getId())).body(client);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Object> updateClient(@PathVariable Long id, @RequestBody Client client) {
        Client currentClient = clientService.getClientById(id);
        currentClient.setName(client.getName());
        currentClient.setEmail(client.getEmail());
        clientService.saveOrUpdate(client);

        return ResponseEntity.ok(currentClient);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Object> deleteClient(@PathVariable Long id) {
        clientService.delete(id);
        return ResponseEntity.ok().build();
    }
}
