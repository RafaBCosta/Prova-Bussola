package com.api.viagem.controller;

import com.api.viagem.model.Viagem;
import com.api.viagem.service.ViagemService;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@Getter
@Setter
@RestController
@RequestMapping("/api/viagens")
public class ViagemController {

    @Autowired
    ViagemService viagemService;

    @GetMapping

    @GetMapping("/{id}")

    @PostMapping
    public Viagem addDestino(@RequestBody Viagem viagem){
        return this.viagemService.
    }

}
