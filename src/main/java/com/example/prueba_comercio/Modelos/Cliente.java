package com.example.prueba_comercio.Modelos;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="tb_cliente")
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name ="codigo_cliente")
    private UUID codigoCliente;
    @Column(name = "nombre", length= 25)
    private String nombre;

    @Column(name = "correo", length= 50)
    private String correo;

    @OneToMany(mappedBy = "cliente", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Compra> compra = new ArrayList<>();
}
