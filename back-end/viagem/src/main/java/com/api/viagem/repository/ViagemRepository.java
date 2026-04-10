package com.api.viagem.repository;

import com.api.viagem.model.Destino;
import com.api.viagem.model.Viagem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ViagemRepository extends JpaRepository<Viagem, Long> {
    public interface DestinoRepository extends JpaRepository<Destino, Long>{}
}
