package com.alura.forohub.usuario.dto;

import jakarta.validation.constraints.NotBlank;

public record DatosUsuario(
    @NotBlank
    String nombre,
    @NotBlank
    String correo,
    @NotBlank
    String clave
) {

}
