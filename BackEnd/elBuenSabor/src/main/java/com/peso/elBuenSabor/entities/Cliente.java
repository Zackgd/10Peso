package com.peso.elBuenSabor.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "cliente")
@NoArgsConstructor
@AllArgsConstructor
<<<<<<< HEAD
@Data

@Builder
public class Cliente extends Base{

    private String nombre;

    private String apellido;

    private String telefono;

    private String email;

    @OneToOne(optional = true, cascade = CascadeType.ALL, fetch = FetchType.EAGER)

    @JoinColumn(name = "id_usuario")
    private Usuario usuario;

    @Column(name = "fecha_alta")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaAlta;

=======
@Getter
@Setter
public class Cliente extends Base{

    private String nombre;
    private String apellido;
    private String telefono;
    private String email;

>>>>>>> a55d6106025a893e5069729f97cc51353050d032
    @Column(name = "fecha_modificacion")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaModificacion;

    @Column(name = "fecha_baja")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaBaja;

<<<<<<< HEAD
    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.EAGER)
    @JoinColumn(name = "cliente_id")
    @Builder.Default
=======
    @OneToOne
    @JoinColumn(name = "id_usuario")
    private Usuario usuario;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.EAGER)
    @JoinColumn(name = "cliente_id")
    private List<Pedido> pedidos = new ArrayList<>();

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.EAGER)
    @JoinColumn(name = "cliente_id")
>>>>>>> a55d6106025a893e5069729f97cc51353050d032
    private List<Domicilio> domicilios = new ArrayList<>();

    public void agregarDomicilio(Domicilio domi) {
        domicilios.add(domi);
    }
<<<<<<< HEAD
}

    //public void agregarPedido(Pedido pedi) {
       // pedidos.add(pedi);
   //}

    //public void mostrarDomicilios() {
      //  System.out.println("- Domicilios de " + nombre + " " + apellido + ": ");
        //for (Domicilio domicilio : domicilios) {
         //   System.out.println("- Localidad: " + domicilio.getLocalidad() + ", calle: " + domicilio.getCalle() + ", numero: " + domicilio.getNumero());
        //}
    //}

    //public void mostrarPedidos() {
      //  System.out.println("- Pedidos de " + nombre + " " + apellido + ": ");
        //for (Pedido pedido: pedidos) {
          //  System.out.println("- Fecha: " + pedido.getFechaPedido() + ", Total: " + pedido.getTotal());
            //int contador = 0;
            //for (DetallePedido detalle: pedido.getDetallePedidos()) {
              //  contador += 1;
                //System.out.println("- Producto " + contador + ": " + detalle.getArticuloManufacturado().getDenominacion()
                  //      + ", cantidad: " + detalle.getCantidad() + ", subtotal: " + detalle.getSubtotal());
            //}
        //}
   // }

=======

    public void agregarPedido(Pedido pedi) {
        pedidos.add(pedi);
    }

    public void mostrarDomicilios() {
        System.out.println("- Domicilios de " + nombre + " " + apellido + ": ");
        for (Domicilio domicilio : domicilios) {
            System.out.println("- Localidad: " + domicilio.getLocalidad() + ", calle: " + domicilio.getCalle() + ", numero: " + domicilio.getNumero());
        }
    }

    public void mostrarPedidos() {
        System.out.println("- Pedidos de " + nombre + " " + apellido + ": ");
        for (Pedido pedido: pedidos) {
            System.out.println("- Fecha: " + pedido.getFechaPedido() + ", Total: " + pedido.getTotal());
            int contador = 0;
            for (DetallePedido detalle: pedido.getDetallePedidos()) {
                contador += 1;
                System.out.println("- Producto " + contador + ": " + detalle.getArticuloManufacturado().getDenominacion()
                        + ", cantidad: " + detalle.getCantidad() + ", subtotal: " + detalle.getSubtotal());
            }
        }
    }
}
>>>>>>> a55d6106025a893e5069729f97cc51353050d032
