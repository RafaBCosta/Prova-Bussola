package com.api.viagem.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Entity
@Data
public class Viagem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private Date dataSaida;
    private Date dataChegada;
    private Double real;

    @OneToMany(mappedBy = "viagem", cascade = CascadeType.ALL, orphanRemoval = false)
    private List<Destino> destino;



}
