package com.peso.elBuenSabor.controllers;

import com.peso.elBuenSabor.entities.MPDatos;
import com.peso.elBuenSabor.services.MPDatosServiceImpl;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.awt.print.Pageable;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "elbuensabor/v1/mpdatos")
public class MPDatosController extends BaseControllerImpl<MPDatos, MPDatosServiceImpl> {
    @Override
    public ResponseEntity<?> getAll(Pageable pageable) {
        return null;
    }
}