package com.savy.Adv.dto;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.annotation.Id;

@Getter
@Entity
@Table(name = "client")
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Client {

    @PersistenceContext
    @Autowired
    EntityManager em;

    public void persist(Object obj) {

        em.persist(obj);

    }

    @Id
    @GeneratedValue
    @Setter private Long id;

    @Setter private String name;
    @Setter private String email;

    // getter, setters, contructors
}