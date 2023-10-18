package com.peso.elBuenSabor.repositories;

import com.peso.elBuenSabor.entities.DetalleArticuloManufacturado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DetalleArticuloManufacturadoRepository extends JpaRepository<DetalleArticuloManufacturado, Long> {
}
