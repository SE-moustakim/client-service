package com.example.salaheddine.dao;

import enset.glsid.clientservice.models.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {
}
