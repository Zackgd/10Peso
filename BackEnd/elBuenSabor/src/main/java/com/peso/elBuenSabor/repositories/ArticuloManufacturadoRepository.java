package com.peso.elBuenSabor.repositories;

import com.peso.elBuenSabor.entities.ArticuloManufacturado;
import com.peso.elBuenSabor.entities.Cliente;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.List;

@Repository
public interface ArticuloManufacturadoRepository extends BaseRepository<ArticuloManufacturado, Long> {

    // (Buscar un Articulo Manufacturado segun su denominacion)
    List<ArticuloManufacturado> findByDenominacion(String denominacion);
    List<ArticuloManufacturado> findByDenominacion(String denominacion, Pageable pageable);

    // Anotacion JPQL parametros indexados (Buscar artículos manufacturados con un precio de venta mayor que cierto valor)

    @Query("SELECT am FROM ArticuloManufacturado am WHERE am.precioVenta > :precio")
    List<ArticuloManufacturado> findArticulosConPrecioMayorQue(@Param("precio")BigDecimal precio);

    @Query("SELECT am FROM ArticuloManufacturado am WHERE am.precioVenta > :precio")
    List<ArticuloManufacturado> findArticulosConPrecioMayorQue(@Param("precio")BigDecimal precio, Pageable pageable);

    // (Buscar articulos manufacturados por tiempo estimado de cocina)
    @Query("SELECT am FROM ArticuloManufacturado am WHERE am.tiempoEstimadoCocina = :tiempo")
    List<ArticuloManufacturado> findArticulosPorTiempoEstimadoCocina(@Param("tiempo") Integer tiempo);

    @Query("SELECT am FROM ArticuloManufacturado am WHERE am.tiempoEstimadoCocina = :tiempo")
    List<ArticuloManufacturado> findArticulosPorTiempoEstimadoCocina(@Param("tiempo") Integer tiempo, Pageable pageable);

    @Query(value = "SELECT * FROM ArticuloManufacturado WHERE ArticuloManufacturado.denominacion LIKE %:filtro%",
            nativeQuery = true)
    static List<ArticuloManufacturado> searchNativo(@Param("filtro") String filtro) {
        return null;
    }

    @Query(value = "SELECT * FROM ArticuloManufacturado WHERE ArticuloManufacturado.ddenominacion LIKE %:filtro",
            countQuery = "SELECT count(*) FROM ArticuloManufacturado",
            nativeQuery = true)
    static Page<ArticuloManufacturado> searchNativo(@Param("filtro") String filtro, Pageable pageable) {
        return null;
    }
}
