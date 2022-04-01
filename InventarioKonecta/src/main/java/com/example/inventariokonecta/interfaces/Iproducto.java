/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.inventariokonecta.interfaces;

import com.example.inventariokonecta.modelo.Producto;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Anderson C
 */
@Repository
public interface Iproducto extends CrudRepository <Producto,Integer>{
    @Query(value = "SELECT id_producto FROM ventas GROUP BY id_producto ORDER BY SUM(cantidad) DESC LIMIT 1", nativeQuery = true)
    public int masVendido ();
    
    @Query(value = "SELECT ID FROM productos ORDER BY stock desc LIMIT 1", nativeQuery = true)
    public int masStock ();
}
