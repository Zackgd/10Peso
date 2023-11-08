package com.peso.elBuenSabor.controllers;

import com.peso.elBuenSabor.entities.ArticuloManufacturado;
import com.peso.elBuenSabor.services.ArticuloManufacturadoServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.awt.print.Pageable;
import java.math.BigDecimal;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "elbuensabor/v1/articulosmanufacturados")
public class ArticuloManufacturadoController extends BaseControllerImpl<ArticuloManufacturado, ArticuloManufacturadoServiceImpl> {

    @GetMapping("/denominacion")
    public ResponseEntity<?> findByDenominacion(@RequestParam String denominacion) {
        try {
            return ResponseEntity.status(HttpStatus.OK).body(servicio.findByDenominacion(denominacion));
        } catch (Exception e){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"Error\":\"Error, por favor, intente mas tarde\"}");
        }
    }

    @GetMapping("/precioMayor")
    public ResponseEntity<?> findArticulosConPrecioMayorQue(@RequestParam BigDecimal precio) {
        try {
            return ResponseEntity.status(HttpStatus.OK).body(servicio.findArticulosConPrecioMayorQue(precio));
        } catch (Exception e){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"Error\":\"Error, por favor, intente mas tarde\"}");
        }
    }

    @Override
    public ResponseEntity<?> getAll(Pageable pageable) {
        return null;
    }
}
