package com.peso.elBuenSabor.services;

import com.peso.elBuenSabor.DTOs.RankingProductoYProdDto;
import com.peso.elBuenSabor.entities.ArticuloManufacturado;
import com.peso.elBuenSabor.entities.DetalleArticuloManufacturado;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.query.Param;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public interface ArticuloManufacturadoService extends BaseService<ArticuloManufacturado, Long> {

    List<ArticuloManufacturado> findByDenominacion(String denominacion) throws Exception;

    List<ArticuloManufacturado> findArticulosConPrecioMayorQue(BigDecimal precio) throws Exception;

    List<RankingProductoYProdDto> findTopSellingProducts() throws Exception;

}
