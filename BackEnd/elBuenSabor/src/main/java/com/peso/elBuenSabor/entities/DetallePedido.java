package com.peso.elBuenSabor.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
<<<<<<< HEAD

import lombok.*;

=======
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
>>>>>>> a55d6106025a893e5069729f97cc51353050d032
import org.antlr.v4.runtime.misc.NotNull;

import java.math.BigDecimal;

@Entity
@Table(name = "detalle_pedido")
@NoArgsConstructor
@AllArgsConstructor
<<<<<<< HEAD
@Data
@Builder

=======
@Getter
@Setter
>>>>>>> a55d6106025a893e5069729f97cc51353050d032
public class DetallePedido extends Base{

    @NotNull
    private Integer cantidad;

    @NotNull
    @Column(name = "subtotal", precision = 10, scale = 2)
    private BigDecimal subtotal;

    @NotNull
    @Column(name = "subtotal_costo", precision = 10, scale = 2)
    private BigDecimal subtotalCosto;

    @ManyToOne()
    @JoinColumn(name = "articuloManufacturado_id")
    private ArticuloManufacturado articuloManufacturado;
<<<<<<< HEAD

    // agregue esto
    @ManyToOne()
    @JoinColumn(name = "id_articulo_insumo")
    private ArticuloInsumo articuloInsumo;
    //esto tambien
    @NotNull
    @ManyToOne()
    @JoinColumn(name = "id_pedido")
    private Pedido pedido;
=======
>>>>>>> a55d6106025a893e5069729f97cc51353050d032
}
