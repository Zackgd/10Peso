package com.peso.elBuenSabor.services;

import com.peso.elBuenSabor.entities.Factura;
import com.peso.elBuenSabor.repositories.FacturaRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;
import java.util.List;

public interface FacturaService extends BaseService<Factura, Long> {

    @Autowired
    FacturaRepository facturaRepository = null;

    public default List<Factura> obtenerFacturasEnRangoDeFechas(Date fechaInicio, Date fechaFin) {
        return facturaRepository.findFacturasByFechaBetween(fechaInicio, fechaFin);
    }

}
