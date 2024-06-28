package com.alura.forohub.controller;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.alura.forohub.topico.DatosMostrarTopico;
import com.alura.forohub.topico.DatosTopico;
import com.alura.forohub.topico.TopicoService;

import jakarta.validation.Valid;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;




@Controller
@RequestMapping("/topicos")
public class TopicoController {
    @Autowired
    private TopicoService service;

    @PostMapping
    public ResponseEntity<DatosTopico> registrarNuevoTopico(@RequestBody @Valid DatosTopico datos) {
        URI uri = service.RegistrarNuevoTopico(datos);
        return ResponseEntity.created(uri).body(datos); 
    }
    
    @GetMapping
    public ResponseEntity<Page<DatosMostrarTopico>> mostrarTodosLosTopicos(@PageableDefault(page = 0,size = 10,sort = "fecha", direction = Direction.ASC) Pageable pageable) {
        Page<DatosMostrarTopico> topicos = service.BuscarTodosLostopicos(pageable);
        return ResponseEntity.ok(topicos);
    }
    
}
