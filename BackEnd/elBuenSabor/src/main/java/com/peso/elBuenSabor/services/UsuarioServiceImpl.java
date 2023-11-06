package com.peso.elBuenSabor.services;

import com.peso.elBuenSabor.entities.Usuario;
import com.peso.elBuenSabor.repositories.BaseRepository;
import com.peso.elBuenSabor.repositories.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioServiceImpl extends BaseServiceImpl<Usuario, Long> implements UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    public UsuarioServiceImpl(BaseRepository<Usuario, Long> baseRepository) {
        super(baseRepository);
    }
}