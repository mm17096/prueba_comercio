package com.example.prueba_comercio.Repositorios;

import com.example.prueba_comercio.Modelos.Comercio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface ComercioRepositorio extends JpaRepository<Comercio, UUID> {

}
