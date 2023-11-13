package com.peso.elBuenSabor.services;

import com.peso.elBuenSabor.DTOs.RankingProductoYProdDto;
import com.peso.elBuenSabor.entities.ArticuloManufacturado;
import com.peso.elBuenSabor.entities.DetalleArticuloManufacturado;
import com.peso.elBuenSabor.repositories.ArticuloManufacturadoRepository;
import com.peso.elBuenSabor.repositories.BaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ArticuloManufacturadoServiceImpl extends BaseServiceImpl<ArticuloManufacturado, Long> implements ArticuloManufacturadoService {


    @Autowired
    private ArticuloManufacturadoRepository articuloManufacturadoRepository;

    public ArticuloManufacturadoServiceImpl(BaseRepository<ArticuloManufacturado, Long> baseRepository) {
        super(baseRepository);
    }

    @Override
    public List<ArticuloManufacturado> findByDenominacion(String denominacion) throws Exception {
        try {
            List<ArticuloManufacturado> articulosManufacturados = articuloManufacturadoRepository.findByDenominacion(denominacion);
            return articulosManufacturados;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Override
    public List<ArticuloManufacturado> findArticulosConPrecioMayorQue(BigDecimal precio) throws Exception {
        try {
            List<ArticuloManufacturado> articulosManufacturados = articuloManufacturadoRepository.findArticulosConPrecioMayorQue(precio);
            return articulosManufacturados;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Override
    public List<RankingProductoYProdDto> findTopSellingProducts() throws Exception {
        try {
            return articuloManufacturadoRepository.findTopSellingProducts().stream()
                    .map(row -> new RankingProductoYProdDto(
                    (Long) row[0],
                    (String) row[1],
                    (Integer) row[2]))
                    .collect(Collectors.toList());
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }
}
