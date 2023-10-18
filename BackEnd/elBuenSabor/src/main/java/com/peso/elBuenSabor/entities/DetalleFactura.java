package com.peso.elBuenSabor.entities;

<<<<<<< HEAD
import jakarta.persistence.*;

import lombok.*;
=======
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
>>>>>>> a55d6106025a893e5069729f97cc51353050d032
import org.antlr.v4.runtime.misc.NotNull;

import java.math.BigDecimal;

@Entity
@Table(name = "detalle_factura")
@NoArgsConstructor
@AllArgsConstructor
<<<<<<< HEAD
@Data
@Builder

=======
@Getter
@Setter
>>>>>>> a55d6106025a893e5069729f97cc51353050d032
public class DetalleFactura extends Base{

    @NotNull
    private Integer cantidad;

    @NotNull
    @Column(name = "subtotal", precision = 10, scale = 2)
    private BigDecimal subtotal;
<<<<<<< HEAD
// agregue esto
    @ManyToOne()
    @JoinColumn(name = "id_articulo_insumo")
    private ArticuloInsumo articuloInsumo;
    // esto tambien
    @ManyToOne()
    @JoinColumn(name = "id_articulo_manufacturado")
    private ArticuloManufacturado articuloManufacturado;

    // esto tambien
    @NotNull
    @ManyToOne()
    @JoinColumn(name = "id_factura")
    private Factura factura;
=======

>>>>>>> a55d6106025a893e5069729f97cc51353050d032
}
