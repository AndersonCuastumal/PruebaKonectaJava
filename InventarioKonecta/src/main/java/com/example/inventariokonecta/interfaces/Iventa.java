/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.inventariokonecta.interfaces;

import com.example.inventariokonecta.modelo.Venta;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Anderson C
 */
@Repository
public interface Iventa extends CrudRepository <Venta,Integer>{
    
}

