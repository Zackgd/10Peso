package com.peso.elBuenSabor.controllers;

import com.peso.elBuenSabor.entities.Pedido;
import com.peso.elBuenSabor.services.PedidoServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.yaml.snakeyaml.events.Event;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "elbuensabor/v1/clientes")
public abstract class PedidoController extends BaseControllerImpl<Pedido, PedidoServiceImpl> {


    @GetMapping("/pedidos")
    public ResponseEntity<?> findBycliente_id(@PathVariable Long cliente_id) {
        try {
            return ResponseEntity.status(HttpStatus.OK).body(servicio.findBycliente_id(cliente_id));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"Error\":\"Error, por favor intente mas tarde\"}");
        }
    }
}
