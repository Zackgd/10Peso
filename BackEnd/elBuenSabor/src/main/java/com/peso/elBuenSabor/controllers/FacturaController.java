package com.peso.elBuenSabor.controllers;

import com.peso.elBuenSabor.entities.Factura;
import com.peso.elBuenSabor.services.FacturaServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "elbuensabor/v1/facturas")
public abstract class FacturaController extends BaseControllerImpl<Factura, FacturaServiceImpl> {

}
