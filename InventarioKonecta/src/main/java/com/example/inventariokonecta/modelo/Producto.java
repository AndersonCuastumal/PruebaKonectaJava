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
@Table(name="productos")
public class Producto {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int ID ;
    private String nombre;
    private String referencia;
    private int precio;
    private float peso;
    private String categoria;
    private int stock;
    private String fechaDeCreacion;

    public Producto(int ID, String nombre, String referencia, int precio, float peso, String categoria, int stock, String fechaDeCreacion) {
        this.ID = ID;
        this.nombre = nombre;
        this.referencia = referencia;
        this.precio = precio;
        this.peso = peso;
        this.categoria = categoria;
        this.stock = stock;
        this.fechaDeCreacion = fechaDeCreacion;
    }

    public Producto() {
        
    }
}