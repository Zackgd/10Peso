package com.peso.elBuenSabor.services;

import com.peso.elBuenSabor.entities.Usuario;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.query.Param;

import java.util.Date;
import java.util.List;

public interface UsuarioService extends BaseService<Usuario, Long> {

    Usuario findByUsername(String username) throws Exception;
    Usuario findByUsernameJPQL(String username) throws Exception;

//    List<Usuario> findUsuariosRegistradosDespuesDe(Date fecha);
//    List<Usuario> findUsuariosRegistradosDespuesDe(Date fecha, Pageable pageable);

}
