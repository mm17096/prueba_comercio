package com.example.prueba_comercio.ServiciosImp;

import com.example.prueba_comercio.Modelos.Compra;
import com.example.prueba_comercio.Repositorios.CompraRepositorio;
import com.example.prueba_comercio.Servicios.ICompraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CompraServiceImp implements ICompraService {
    @Autowired
    CompraRepositorio compraRepositorio;

    @Override
    public Compra guardar(Compra compra) {
        return compraRepositorio.save(compra);
    }
}
