package com.example.prueba_comercio.Controladores;

import com.example.prueba_comercio.Modelos.Cliente;
import com.example.prueba_comercio.ServiciosImp.ClienteServicioImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/cliente")
public class ClienteControlador {

    @Autowired
    ClienteServicioImp clienteServicioImp;

    @PostMapping("/guardar")
    public ResponseEntity<Cliente> guardarClientes(@RequestBody Cliente cliente){
        return new ResponseEntity<>(clienteServicioImp.guardar(cliente), HttpStatus.CREATED);
    }
}
