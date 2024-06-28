package com.alura.forohub.controller;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.util.UriComponentsBuilder;

import com.alura.forohub.topico.DatosTopico;
import com.alura.forohub.topico.Topico;
import com.alura.forohub.topico.TopicoService;

import jakarta.validation.Valid;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@Controller
@RequestMapping("/topico")
public class TopicoController {
    @Autowired
    private TopicoService service;

    @PostMapping
    public ResponseEntity<DatosTopico> postMethodName(@RequestBody @Valid DatosTopico datos) {
        Topico topico = service.RegistrarNuevoTopico(datos);
        URI uri = UriComponentsBuilder.fromPath("/topico/{id}").buildAndExpand(topico.getId()).toUri();
        return ResponseEntity.created(uri).body(datos); 
    }
    
}
