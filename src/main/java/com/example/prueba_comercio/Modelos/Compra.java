package com.example.prueba_comercio.Modelos;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="tb_compra")
public class Compra {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name ="codigo_compra")
    private UUID codigoCompra;
    private Date fecha;
    private String medioPago;
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "comercio_id") //nombre del campo para la relacion en la tabla donde estara
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private Comercio comercio;

    @ManyToOne
    @JoinColumn(name = "cliente_id")
    private Cliente cliente;

    private String lugar;
    private double montoTotal;

}
