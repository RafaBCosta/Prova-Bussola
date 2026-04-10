package com.api.viagem.service;

import com.api.viagem.model.Viagem;
import com.api.viagem.repository.ViagemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ViagemService {

    @Autowired
    ViagemRepository viagemRepository;

    public List<Viagem> findAll(){
        return viagemRepository.findAll();
    }

    public ResponseEntity<Viagem> criarDestino(){

    }
}
