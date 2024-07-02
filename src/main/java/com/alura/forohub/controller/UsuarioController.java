package com.alura.forohub.controller;

import org.springframework.web.bind.annotation.RestController;

import com.alura.forohub.usuario.UsuarioService;
import com.alura.forohub.usuario.dto.DatosMostrarUsuario;
import com.alura.forohub.usuario.dto.DatosUsuario;

import jakarta.validation.Valid;

import org.springframework.web.bind.annotation.RequestMapping;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;





@RestController
@RequestMapping("/usuarios")
public class UsuarioController {
    @Autowired
    private UsuarioService usuarioService;

    @SuppressWarnings("rawtypes")
    @PostMapping("/registrarse")
    public ResponseEntity registrarNuevoUsuario(@RequestBody @Valid DatosUsuario datos) {
        URI uri = usuarioService.registrarUsuario(datos);
        return ResponseEntity.created(uri).build();
    }
    
    @GetMapping
    public ResponseEntity<Page<DatosMostrarUsuario>> listarTodosLosUsuarios(@PageableDefault(size = 5, page = 0, sort = "nombre", direction = Direction.DESC) Pageable pageable) {
        return ResponseEntity.ok(usuarioService.buscarTodosLosUsuarios(pageable));
    }

    @GetMapping("/{id}")
    public ResponseEntity<DatosMostrarUsuario> getMethodName(@PathVariable Long id) {
        return ResponseEntity.ok(usuarioService.buscarUnUsuario(id));
    }
    
    
}
