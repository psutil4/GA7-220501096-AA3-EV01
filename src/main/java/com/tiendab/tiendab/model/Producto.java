
package com.tiendab.tiendab.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Producto {
    @Id
    @Column
    private Long idProducto;
    
    @Column
    private String nombre;
    
    @Column
    private double precio;
    
    private String descripcion;
}
