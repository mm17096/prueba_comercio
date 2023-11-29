package com.example.prueba_comercio.Repositorios;

import com.example.prueba_comercio.Modelos.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface ClienteRepositorio extends JpaRepository<Cliente, UUID> {

}
