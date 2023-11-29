package com.example.prueba_comercio.Servicios;

import com.example.prueba_comercio.Modelos.Comercio;

import java.util.List;
import java.util.UUID;

public interface IComercioServicio {
    public List<Comercio> obtenerTodo();
    public Comercio guardar(Comercio comercio);
    public Comercio obtenerPorId(UUID id);
}
