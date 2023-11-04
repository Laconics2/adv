package com.savy.Adv.repositories;

import com.savy.Adv.dto.Client;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


public interface ClientRepository extends CrudRepository<Client, Long> {
}