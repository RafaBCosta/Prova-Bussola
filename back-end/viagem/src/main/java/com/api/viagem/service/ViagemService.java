package com.api.viagem.service;

import com.api.viagem.model.ViagemEntity;
import com.api.viagem.repository.ViagemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class ViagemService {

    @Autowired
    ViagemRepository viagemRepository;

    public List<ViagemEntity> findAll(){
        return viagemRepository.findAll();
    }

    public {

    }

    public

    void delete(@PathVariable Long id){
        this.viagemRepository.delete();
    }
}
