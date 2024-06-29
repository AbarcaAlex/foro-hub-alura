package com.alura.forohub.topico.dto;

import jakarta.validation.constraints.NotBlank;

public record DatosTopicoActualizado(
    @NotBlank
    String titulo,
    @NotBlank
    String mensaje
) {

}
