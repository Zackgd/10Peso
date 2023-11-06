package com.peso.elBuenSabor.controllers;

import com.peso.elBuenSabor.entities.Usuario;
import com.peso.elBuenSabor.services.UsuarioServiceImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "elbuensabor/v1/usuarios")
public abstract class UsuarioController extends BaseControllerImpl<Usuario, UsuarioServiceImpl> {

}

