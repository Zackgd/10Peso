package com.peso.elBuenSabor.entities;

import jakarta.persistence.*;
import lombok.*;
import org.antlr.v4.runtime.misc.NotNull;

import java.math.BigDecimal;

import java.util.Date;


@Entity
@Data
@Table(name = "articulo_insumo")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class ArticuloInsumo extends Base{

    @NotNull
    private String denominacion;

    @Column(name = "url_imagen")
    private String urlImagen;

    @NotNull
    @Column(name = "precio_compra", precision = 10, scale = 2)
    private BigDecimal precioCompra;

    @NotNull
    @Column(name = "stock_actual", precision = 10, scale = 2)
    private BigDecimal stockActual;

    @NotNull
    @Column(name = "stock_minimo", precision = 10, scale = 2)
    private BigDecimal stockMinimo;

    @NotNull
    @Column(name = "fecha_alta")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaAlta;

    @Column(name = "fecha_modificacion")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaModificacion;

    @Column(name = "fecha_baja")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaBaja;

    //agregue esto
    @NotNull
    @ManyToOne()
    @JoinColumn(name = "id_unidad_medida")
    private UnidadMedida unidadMedida;
// esto tambien
    @NotNull
    @ManyToOne()
    @JoinColumn(name = "id_rubro_articulo")
    private RubroArticulo rubroArticulo;

    //@OneToMany(cascade = CascadeType.ALL,orphanRemoval = true, fetch = FetchType.EAGER)
    //@JoinColumn(name = "ArticuloInsumo_id")
    //private List<DetallePedido> detallePedidos = new ArrayList<>();

    //@OneToMany(cascade = CascadeType.ALL,orphanRemoval = true, fetch = FetchType.EAGER)
    //@JoinColumn(name = "ArticuloInsumo_id")
    //private List<DetalleArticuloManufacturado> detalleArticuloManufacturados = new ArrayList<>();

    //@OneToMany(cascade = CascadeType.ALL,orphanRemoval = true, fetch = FetchType.EAGER)
    //@JoinColumn(name = "ArticuloInsumo_id")
    //private List<DetalleFactura> detalleFacturas = new ArrayList<>();
}
