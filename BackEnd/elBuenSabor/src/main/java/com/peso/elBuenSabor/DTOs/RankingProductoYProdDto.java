package com.peso.elBuenSabor.DTOs;
import lombok.Data;

@Data
public class RankingProductoYProdDto {
    private Long idArticulo;
    private String nombre;
    private int cantidad;

    public Long getIdArticulo() {
        return idArticulo;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setIdArticulo(Long idArticulo) {
        this.idArticulo = idArticulo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public RankingProductoYProdDto(Long aLong, String s, Integer integer) {
        this.idArticulo = idArticulo;
        this.nombre = nombre;
        this.cantidad = cantidad;
    }
}