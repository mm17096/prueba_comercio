package com.example.prueba_comercio.ServiciosImp;

import com.example.prueba_comercio.Modelos.Comercio;
import com.example.prueba_comercio.Repositorios.ComercioRepositorio;
import com.example.prueba_comercio.Servicios.IComercioServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class ComercioServicioImp implements IComercioServicio {

    @Autowired
    ComercioRepositorio comercioRepositorio;

    @Override
    public List<Comercio> obtenerTodo() {
        return comercioRepositorio.findAll();
    }
    @Override
    public Comercio guardar(Comercio comercio) {
        return comercioRepositorio.save(comercio);
    }
    @Override
    public Comercio obtenerPorId(UUID id) {
        return comercioRepositorio.findById(id).orElse(null);
    }

}
