/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.inventariokonecta.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author Anderson C
 */
@Getter
@Setter
@Entity
@Table(name="ventas")
public class Venta {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int ID ;
    private int idProducto;
    private int cantidad;

    public Venta(int ID, int idProducto, int cantidad) {
        this.ID = ID;
        this.idProducto = idProducto;
        this.cantidad = cantidad;
    }

    public Venta() {
    }
    
    
}
