package com.example.prueba_comercio.Repositorios;

import com.example.prueba_comercio.Modelos.Compra;
import jdk.jfr.Registered;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

@Registered
public interface CompraRepositorio extends JpaRepository<Compra, UUID> {

}
