/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.inventariokonecta.interfaces;

import com.example.inventariokonecta.modelo.Producto;
import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;


/**
 *
 * @author Anderson C
 */
@Service
public interface IproductoService {
    public List <Producto>listar();
    
    public int guardar(Producto item);
    
    public void eliminar (int ID);
    
    public Optional <Producto> buscarId(int ID);
    
    public int masVendido ();
    
    public int masStock ();
}
