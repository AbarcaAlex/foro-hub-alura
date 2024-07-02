package com.alura.forohub.usuario.dto;

import com.alura.forohub.usuario.Usuario;

public record DatosMostrarUsuario(
    String nombre,
    String correo
) {
    public DatosMostrarUsuario(Usuario usuario){
        this(usuario.getNombre(), usuario.getCorreo());
    }
}
