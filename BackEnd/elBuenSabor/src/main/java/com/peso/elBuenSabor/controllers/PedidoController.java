package com.peso.elBuenSabor.controllers;

import com.peso.elBuenSabor.entities.Pedido;
import com.peso.elBuenSabor.services.PedidoServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "elbuensabor/v1/clientes")
public class PedidoController extends BaseControllerImpl<Pedido, PedidoServiceImpl> {

}
