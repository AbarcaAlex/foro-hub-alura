package com.alura.forohub.controller;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alura.forohub.topico.DatosMostrarTopico;
import com.alura.forohub.topico.DatosTopico;
import com.alura.forohub.topico.TopicoService;

import jakarta.validation.Valid;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;





@RestController
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
        return ResponseEntity.ok(service.BuscarTodosLostopicos(pageable));
    }

    @GetMapping("/{id}")
    public ResponseEntity<DatosMostrarTopico> mostrarUnTopico(@PathVariable Long id) {
        return ResponseEntity.ok(service.buscarUnTopicoPorId(id));
    }
    
    
}
