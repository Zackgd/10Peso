package com.peso.elBuenSabor.controllers;

import com.peso.elBuenSabor.entities.Usuario;
import com.peso.elBuenSabor.services.UsuarioServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.awt.print.Pageable;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "elbuensabor/v1/usuarios")
public class UsuarioController extends BaseControllerImpl<Usuario, UsuarioServiceImpl> {

    @GetMapping("/findByUsername")
    public ResponseEntity<?> findByUsername(@RequestParam String username) {
        try {
            return ResponseEntity.status(HttpStatus.OK).body(servicio.findByUsername(username));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"Error\":\"Error, por favor intente mas tarde\"}");
        }
    }

    @GetMapping("/findByUsernameJPQL")
    public ResponseEntity<?> findByUsernameJPQL(@RequestParam String username) {
        try {
            return ResponseEntity.status(HttpStatus.OK).body(servicio.findByUsername(username));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"Error\":\"Error, por favor intente mas tarde\"}");
        }
    }


}

