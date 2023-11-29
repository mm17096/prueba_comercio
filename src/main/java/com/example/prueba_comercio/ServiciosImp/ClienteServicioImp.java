package com.example.prueba_comercio.ServiciosImp;

import com.example.prueba_comercio.Modelos.Cliente;
import com.example.prueba_comercio.Repositorios.ClienteRepositorio;
import com.example.prueba_comercio.Servicios.IClienteServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClienteServicioImp implements IClienteServicio {

    @Autowired
    ClienteRepositorio clienteRepositorio;

    @Override
    public Cliente guardar(Cliente cliente) {
        return clienteRepositorio.save(cliente);
    }
}
