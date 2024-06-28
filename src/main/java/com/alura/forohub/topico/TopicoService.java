package com.alura.forohub.topico;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alura.forohub.usuario.Usuario;
import com.alura.forohub.usuario.UsuarioRepository;

@Service
public class TopicoService {
    @Autowired
    private TopicoRepository topicoRepository;
    @Autowired
    private UsuarioRepository usuarioRepository;

    public Topico RegistrarNuevoTopico(DatosTopico datosTopico){
        if (!usuarioRepository.findById(datosTopico.autor()).isPresent()) {
            throw new RuntimeException("No se encontro al usuario");
        }
        Usuario usuario = usuarioRepository.findById(datosTopico.autor()).get();
        Topico topico = new Topico(null, datosTopico.titulo(), datosTopico.mensaje(), LocalDateTime.now(), "Sin respuestas", usuario);
        topicoRepository.save(topico);
        return topico;
    }
}
