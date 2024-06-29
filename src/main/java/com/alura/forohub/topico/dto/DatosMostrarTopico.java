package com.alura.forohub.topico.dto;

import java.time.LocalDateTime;

import com.alura.forohub.topico.Topico;

public record DatosMostrarTopico(
    String titulo,
    String mensaje,
    LocalDateTime fecha,
    String estado,
    String autor
) {
    public DatosMostrarTopico(Topico topico){
        this(topico.getTitulo(), topico.getMensaje(), topico.getFecha(), topico.getEstado(), topico.getAutor().getNombre());
    }
}
