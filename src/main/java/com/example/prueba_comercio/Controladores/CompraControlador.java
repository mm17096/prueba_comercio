package com.example.prueba_comercio.Controladores;

import com.example.prueba_comercio.Modelos.Cliente;
import com.example.prueba_comercio.Modelos.Compra;
import com.example.prueba_comercio.ServiciosImp.CompraServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/compra")
public class CompraControlador {
    @Autowired
    CompraServiceImp compraServiceImp;

    @PostMapping("/guardar")
    public ResponseEntity<Compra> guardarcompra(@RequestBody Compra compra){
        return new ResponseEntity<>(compraServiceImp.guardar(compra), HttpStatus.CREATED);
    }
}
