/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.inventariokonecta.interfaces;

/**
 *
 * @author Anderson C
 */
import com.example.inventariokonecta.modelo.Venta;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 *
 * @author user
 */
@Service
public interface IventaService {
    public List <Venta>listar();
    
    public int guardar(Venta item);
}
