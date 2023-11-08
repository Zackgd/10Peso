package com.peso.elBuenSabor.repositories;

import com.peso.elBuenSabor.entities.Cliente;
import com.peso.elBuenSabor.entities.Usuario;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface UsuarioRepository extends BaseRepository<Usuario, Long> {

    // (Buscar un usuario por nombre de usuario)
    Usuario findByUsername(String username);

    // Anotacion JPQL parametros indexados (Buscar un usuario por nombre de usuario)
    @Query("SELECT u FROM Usuario u WHERE u.username LIKE %:username%")
    Usuario findByUsernameJPQL(@Param("username")String username);

//     Anotacion JPQL parametros indexados (Buscar usuarios registrados despues de una fecha especifica)
    @Query("SELECT u FROM Usuario u WHERE u.fechaAlta > :fecha")
    List<Usuario> findUsuariosRegistradosDespuesDe(@Param("fecha")Date fecha);
    @Query("SELECT u FROM Usuario u WHERE u.fechaAlta > :fecha")
    List<Usuario> findUsuariosRegistradosDespuesDe(@Param("fecha")Date fecha, Pageable pageable);

    @Query(value = "SELECT * FROM Usuario WHERE Usuario.fechaAlta > :fecha",
            nativeQuery = true)
    static List<Usuario> searchNativo(@Param("fecha") Date fecha) {
        return null;
    }

    @Query(value = "SELECT * FROM Usuario WHERE Usuario.fechaAlta > :fecha",
            countQuery = "SELECT count(*) FROM Usuario",
            nativeQuery = true)
    static Page<Usuario> searchNativo(@Param("fecha") String fecha, Pageable pageable) {
        return null;
    }
}
