package com.example.prueba_comercio.Controladores;

import com.example.prueba_comercio.Modelos.Comercio;
import com.example.prueba_comercio.ServiciosImp.ComercioServicioImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/comercio")
public class ComercioControlador {

    @Autowired
    ComercioServicioImp comercioServicioImp;

    @GetMapping("/todos")
    public List<Comercio> ObtenerComercios(){
        return comercioServicioImp.obtenerTodo();
    }

    @PostMapping("/guardar")
    public ResponseEntity<Comercio> guardarComercio(@RequestBody Comercio comercio){
        return new ResponseEntity<>(comercioServicioImp.guardar(comercio), HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Comercio> obtenerComercioId(@PathVariable UUID id){
        return ResponseEntity.ok(comercioServicioImp.obtenerPorId(id));
    }
}
