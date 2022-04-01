/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.inventariokonecta.servicio;

import com.example.inventariokonecta.interfaces.Iproducto;
import com.example.inventariokonecta.interfaces.IproductoService;
import com.example.inventariokonecta.modelo.Producto;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Anderson C
 */
@Service
public class ServiciosProducto implements IproductoService{

    @Autowired
    private Iproducto interProducto;

    @Override
    public List<Producto> listar() {
        return (List<Producto>) interProducto.findAll();
    }

    @Override
    public int guardar(Producto item) {
        Producto prod = interProducto.save(item);
        int respuesta = 0;
        if(!prod.equals(null)){
            respuesta = 1;
        }
        return respuesta;               
    }

    @Override
    public void eliminar(int ID) {
        interProducto.deleteById(ID);
    }

    @Override
    public Optional<Producto> buscarId(int ID) {
        return interProducto.findById(ID);
    }

    @Override
    public int masVendido() {
        return interProducto.masVendido();
    }

    @Override
    public int masStock() {
        return interProducto.masStock();
    }
    
    
}
