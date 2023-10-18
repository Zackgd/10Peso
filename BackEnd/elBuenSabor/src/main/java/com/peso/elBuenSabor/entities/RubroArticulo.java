package com.peso.elBuenSabor.entities;

<<<<<<< HEAD

=======
import ch.qos.logback.core.BasicStatusManager;
>>>>>>> a55d6106025a893e5069729f97cc51353050d032
import jakarta.persistence.*;
import lombok.*;
import org.antlr.v4.runtime.misc.NotNull;

<<<<<<< HEAD

=======
import java.util.ArrayList;
>>>>>>> a55d6106025a893e5069729f97cc51353050d032
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "rubro_articulo")
@NoArgsConstructor
@AllArgsConstructor
<<<<<<< HEAD
@Data
@Builder
=======
@Getter
@Setter
>>>>>>> a55d6106025a893e5069729f97cc51353050d032
public class RubroArticulo extends Base{

    @NotNull
    private String denominacion;

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

<<<<<<< HEAD
=======
    @OneToMany(cascade = CascadeType.ALL,orphanRemoval = true, fetch = FetchType.EAGER)
    @JoinColumn(name = "RubroArticulo_id")
    private List<ArticuloInsumo> articuloInsumos = new ArrayList<>();
    @OneToMany(cascade = CascadeType.ALL,orphanRemoval = true, fetch = FetchType.EAGER)
    @JoinColumn(name = "RubroArticulo_id")
    private List<ArticuloManufacturado> articuloManufacturados = new ArrayList<>();
>>>>>>> a55d6106025a893e5069729f97cc51353050d032

    @ManyToOne()
    @JoinColumn(name = "id_rubro_padre")
    private RubroArticulo rubroPadre;
<<<<<<< HEAD
// agregue esto
    @OneToMany(mappedBy = "rubroPadre")
    private List<RubroArticulo> subRubros;

=======

    @OneToMany(cascade = CascadeType.ALL,orphanRemoval = true, fetch = FetchType.EAGER)
    @JoinColumn(name = "ArticuloManufacturado_id")
    private List<DetalleArticuloManufacturado> detalleArticuloManufacturados = new ArrayList<>();

    @OneToMany(cascade = CascadeType.ALL,orphanRemoval = true, fetch = FetchType.EAGER)
    @JoinColumn(name = "ArticuloManufacturado_id")
    private List<DetalleFactura> detalleFacturas = new ArrayList<>();
>>>>>>> a55d6106025a893e5069729f97cc51353050d032

    public RubroArticulo(String denominacion, RubroArticulo rubroPadre) {
        this.denominacion = denominacion;
        this.rubroPadre = rubroPadre;
    }

    public void setSubRubros(List<RubroArticulo> subRubros) {
<<<<<<< HEAD
        this.subRubros.clear();
        this.subRubros.addAll(subRubros);
=======
        this.setSubRubros().clear();
        this.setSubRubros().addAll(subRubros);
    }

    public void agregarArticuloInsumo(ArticuloInsumo articuloInsumo) {
        articuloInsumos.add(articuloInsumo);
    }

    public void agregarArticuloManufacturado(ArticuloManufacturado articuloManufacturado) {
        articuloManufacturados.add(articuloManufacturado);
    }
    // Faltaria:



    public void mostrarArticuloInsumo() {
        System.out.println("Los articulos Insumo de este rubro son: ");
        for (ArticuloInsumo articuloInsumo : articuloInsumos) {
            System.out.println("Denominacion: " + articuloInsumo.getDenominacion() + ", Modificacion: " + articuloInsumo.getFechaModificacion()
                    +  ", Precio Compra: " + articuloInsumo.getPrecioCompra()
                     + ", Stock Actual: " + articuloInsumo.getStockActual()
                    + ", Fecha Alta: " + articuloInsumo.getFechaAlta() + ", Fecha Baja: " + articuloInsumo.getFechaBaja()
                    + ", Tipo: " + articuloInsumo.getUrlImagen());
        }
    }

    public void mostrarArticuloManufacturado() {
        System.out.println("Los articulos Manufacturados de este rubro son: ");
        for (ArticuloManufacturado articuloManufacturado : articuloManufacturados) {
            System.out.println("Denominacion: " + articuloManufacturado.getDenominacion() + ", Modificacion: " + articuloManufacturado.getFechaModificacion()
                    +  ", Tiempo Estimado: " + articuloManufacturado.getTiempoEstimadoCocina()
                    + ", Costo : " + articuloManufacturado.getCosto()
                    + ", Fecha Alta: " + articuloManufacturado.getFechaAlta() + ", Fecha Baja: " + articuloManufacturado.getFechaBaja()
                    + ", Tipo: " + articuloManufacturado.getUrlImagen());
        }
>>>>>>> a55d6106025a893e5069729f97cc51353050d032
    }

}
