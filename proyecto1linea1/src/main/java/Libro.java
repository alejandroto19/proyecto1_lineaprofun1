/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author johann alejandro torres soler
 * @version 1.0
 */
public class Libro { // incio de la clase 
    
// incio de declaracion de variables
    public int codigoLibro;  // codigo unico de libro 
    public String nombreLibro;// nombre de libro 
    public String versionLibro;// version del libro 
    public String editorialLibro; // editorial del libro
    public int valorLibro; // valor  de venta  del libro 
    public int cantidadInventario; // cantidad disponible en el inventario 
    
    // fin declaracion de variables 
    
    
    //inicio de constructor
    public Libro(int codigoLibro, String nombreLibro, String versionLibro, String editorialLibro, int valorLibro, int cantidadInventario) {
        this.codigoLibro = codigoLibro;
        this.nombreLibro = nombreLibro;
        this.versionLibro = versionLibro;
        this.editorialLibro = editorialLibro;
        this.valorLibro = valorLibro;
        this.cantidadInventario = cantidadInventario;
    }
    //fin de constructor
 
    
    //incio de meotodos
   public void crearLibro(){ } // el metodo crear libro se encarga de capturar todos los datos del libro
   
   public void listarLibroMasBarato(){// el metodo listar libro mas barato se encarga de comparar los precios de venta de  lo libros y mostrar  los mas baratos
       
   }
   public void listarLibroMasCaro(){// el metodo listar libro mas caro se encarga de comparar los precios de venta todos los libros y mostrarnos los mas caros
       
   }
    public void listarLibroMenosVendido(){ // el metodo listar libro menos vendido se encarga de comparar entre el historial de ventas todos los libros y mostrarnos cual fue el menos vendido 
        
    }
    public void listarLibroMasVendido(){// el metodo libro ma svendido se encarga de comparar entre el historial de ventas de todos los libros y mostrarnos el mas vendido
        
    }
    
    public void mostrarStock(){// el metodo mostrar stock se encarga de lisar el estock disponible siempre y cuando en el inventario minimo queden 10 unidades del libro
        
    }
    
    //fin de metodos
     
}//fin de la clase 
