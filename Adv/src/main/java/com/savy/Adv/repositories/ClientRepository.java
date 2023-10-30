package com.savy.Adv.repositories;

import com.savy.Adv.dto.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {
}