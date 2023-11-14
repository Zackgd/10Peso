package com.peso.elBuenSabor.services;

import com.peso.elBuenSabor.DTOs.DTORankingProducto;
import com.peso.elBuenSabor.entities.ArticuloManufacturado;

import java.math.BigDecimal;
import java.util.List;

public interface ArticuloManufacturadoService extends BaseService<ArticuloManufacturado, Long> {

    List<ArticuloManufacturado> findByDenominacion(String denominacion) throws Exception;

    List<ArticuloManufacturado> findArticulosConPrecioMayorQue(BigDecimal precio) throws Exception;

    List<DTORankingProducto> findTopSellingProducts() throws Exception;


}
