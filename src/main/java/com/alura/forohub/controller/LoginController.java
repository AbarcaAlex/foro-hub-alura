package com.alura.forohub.controller;

import org.springframework.web.bind.annotation.RestController;

import com.alura.forohub.security.TokenService;
import com.alura.forohub.usuario.Usuario;
import com.alura.forohub.usuario.dto.DatosLoginUsuario;
import com.alura.forohub.usuario.dto.DatosToken;

import jakarta.validation.Valid;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
@RequestMapping("/login")
public class LoginController {
    @Autowired
    private AuthenticationManager authenticationManager;
    @Autowired
    private TokenService tokenService;

    @PostMapping
    public ResponseEntity<DatosToken> iniciarSesion(@RequestBody @Valid DatosLoginUsuario datos) {
        
        Authentication authentication = new UsernamePasswordAuthenticationToken(datos.correo(), datos.clave());
        var usuarioAuth = authenticationManager.authenticate(authentication);
        var token = tokenService.generarToken((Usuario)usuarioAuth.getPrincipal());
        return ResponseEntity.ok(new DatosToken(token));
    }
    
}
