package com.thales.usuario.Business;

import com.thales.usuario.Business.converter.UsuarioConverter;
import com.thales.usuario.Business.dto.UsuarioDTO;
import com.thales.usuario.infraStructure.entity.Usuario;
import com.thales.usuario.infraStructure.repository.UsuarioRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UsuarioService {
    private final UsuarioRepository usuarioRepository;
    private final UsuarioConverter usuarioConverter;

    public UsuarioDTO salvaUsuario(UsuarioDTO usuarioDTO){
        Usuario usuario = usuarioConverter.paraUsuario(usuarioDTO);
        return usuarioConverter.paraUsuarioDTO(usuarioRepository.save(usuario));
    }
}
