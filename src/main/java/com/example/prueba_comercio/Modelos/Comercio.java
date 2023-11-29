package com.example.prueba_comercio.Modelos;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="tb_comercio")
public class Comercio {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name ="codigo_comercio")
    private UUID codigoComercio;

    @Column(name = "nombre", length= 25)
    private String nombre;

    @OneToMany(mappedBy = "comercio", cascade = CascadeType.ALL)
    private Set<Compra> compras = new HashSet<>();

    public Set<Compra> getCompras() {
        return compras;
    }

    public void setCompras(Set<Compra> compras) {
        this.compras = compras;
    }
}
