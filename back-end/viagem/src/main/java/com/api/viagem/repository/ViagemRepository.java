package com.api.viagem.repository;

import com.api.viagem.model.ViagemEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ViagemRepository extends JpaRepository<ViagemEntity, Long> {
}
