package com.alura.forohub.usuario.dto;

import jakarta.validation.constraints.NotBlank;

public record DatosLoginUsuario(
    @NotBlank
    String correo,
    @NotBlank
    String clave
) {

}
