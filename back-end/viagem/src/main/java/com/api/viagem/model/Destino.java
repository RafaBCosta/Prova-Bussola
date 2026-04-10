package com.api.viagem.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Destino {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;

    @ManyToOne
    @JoinColumn(name = "viagens_id")
    private Viagem viagem;



}
