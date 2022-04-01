/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.inventariokonecta.servicio;

import com.example.inventariokonecta.interfaces.Iventa;
import com.example.inventariokonecta.interfaces.IventaService;
import com.example.inventariokonecta.modelo.Venta;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Anderson C
 */
@Service
public class ServiciosVenta implements IventaService{

    @Autowired
    private Iventa interVenta;
    
    @Override
    public List<Venta> listar() {
        return (List<Venta>) interVenta.findAll();
    }

    @Override
    public int guardar(Venta item) {
        Venta prod = interVenta.save(item);
        int respuesta = 0;
        if(!prod.equals(null)){
            respuesta = 1;
        }
        return respuesta; 
    }
    
}
