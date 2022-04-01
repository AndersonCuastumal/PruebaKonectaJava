/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.inventariokonecta.controlador;

import com.example.inventariokonecta.interfaces.IproductoService;
import com.example.inventariokonecta.interfaces.IventaService;
import com.example.inventariokonecta.modelo.Producto;
import com.example.inventariokonecta.modelo.Venta;
import java.sql.Timestamp;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Anderson C
 */
@Controller
@RequestMapping
public class ControladorInventario {
    @Autowired
    private IproductoService interfProducto;
    
    @Autowired
    private IventaService interfVenta;
    
    @GetMapping("/")
    public String vender(Model modelo){
        List<Producto> productos = interfProducto.listar();
        List<Venta> ventas = interfVenta.listar();
        Optional<Producto> producto = interfProducto.buscarId(interfProducto.masVendido());
        String masVendido =  producto.get().getNombre();
        Optional<Producto> productoStock = interfProducto.buscarId(interfProducto.masStock());
        String masStock =  productoStock.get().getNombre();
        
        modelo.addAttribute("productos", productos);
        modelo.addAttribute("ventas", ventas);
        modelo.addAttribute("Venta", new Venta());
        modelo.addAttribute("masVendido", masVendido);
        modelo.addAttribute("masStock", masStock);
        return "Vender";
    }
    
    
    @PostMapping("/guardarProducto")
    public String Agregar(Model modelo, Producto item){
        item.setFechaDeCreacion(new Timestamp(System.currentTimeMillis()).toString());
        interfProducto.guardar(item);
        return "redirect:/Stock";
    }
    
    @GetMapping("/nuevoProducto")
    public String nuevoProducto(Model modelo){
        modelo.addAttribute("Producto", new Producto());
        return "Formulario";
    }
    
    @GetMapping("/Stock/editarProducto/{ID}")
    public String editarProducto(Model modelo, @PathVariable int ID){
        Optional<Producto> producto = interfProducto.buscarId(ID);
        modelo.addAttribute("Producto", producto);
        return "Actualizar"; 
    }
    
    @GetMapping("/eliminarProducto/{ID}")
    public String eliminarProducto(Model modelo, @PathVariable int ID){
        interfProducto.eliminar(ID);
        return "redirect:/Stock"; 
    }
    
    @PostMapping("/ventaProducto")
    public String vender(Model modelo, Venta item){
        Optional<Producto> producto = interfProducto.buscarId(item.getIdProducto());
        int valor=producto.get().getStock()-item.getCantidad();
        
        if(valor<0){
            System.out.println("-----------OPERACION INVALIDA-------------");
            System.out.println(valor);
        }else{
            System.out.println("-----------OPERACION VALIDA----------------");
            System.out.println(valor);
            producto.get().setStock(valor);
            interfProducto.guardar(producto.get());
            interfVenta.guardar(item);
        }

        return "redirect:/";
    }
    

    
    @GetMapping("/Stock")
    public String Stock(Model modelo){
        List<Producto> productos = interfProducto.listar();
        List<Venta> ventas = interfVenta.listar();
        Optional<Producto> producto = interfProducto.buscarId(interfProducto.masVendido());
        String masVendido =  producto.get().getNombre();
        Optional<Producto> productoStock = interfProducto.buscarId(interfProducto.masStock());
        String masStock =  productoStock.get().getNombre();
        
        modelo.addAttribute("productos", productos);
        modelo.addAttribute("ventas", ventas);
        modelo.addAttribute("Venta", new Venta());
        modelo.addAttribute("masVendido", masVendido);
        modelo.addAttribute("masStock", masStock);
        return "Stock";
    }
    
    @GetMapping("/Historial")
    public String Historial(Model modelo){
        List<Producto> productos = interfProducto.listar();
        List<Venta> ventas = interfVenta.listar();
        Optional<Producto> producto = interfProducto.buscarId(interfProducto.masVendido());
        String masVendido =  producto.get().getNombre();
        Optional<Producto> productoStock = interfProducto.buscarId(interfProducto.masStock());
        String masStock =  productoStock.get().getNombre();
        

        modelo.addAttribute("productos", productos);
        modelo.addAttribute("ventas", ventas);
        modelo.addAttribute("Venta", new Venta());
        modelo.addAttribute("masVendido", masVendido);
        modelo.addAttribute("masStock", masStock);
        return "Historial";
    }
}
