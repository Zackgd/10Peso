package com.peso.elBuenSabor.entities;

<<<<<<< HEAD
import jakarta.persistence.*;
=======
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
>>>>>>> a55d6106025a893e5069729f97cc51353050d032
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.antlr.v4.runtime.misc.NotNull;

import java.math.BigDecimal;

@Entity
@Table(name = "detalle_articulo_manufacturado")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class DetalleArticuloManufacturado extends Base{

    @NotNull
    @Column(name = "cantidad", precision = 10, scale = 2)
    private BigDecimal cantidad;
<<<<<<< HEAD
// agregue esto
    @NotNull
    @ManyToOne()
    @JoinColumn(name = "id_articulo_insumo")
    private ArticuloInsumo articuloInsumo;
//esto tambien
    @NotNull
    @ManyToOne()
    @JoinColumn(name = "id_articulo_manufacturado")
    private ArticuloManufacturado articuloManufacturado;
=======

>>>>>>> a55d6106025a893e5069729f97cc51353050d032
}
