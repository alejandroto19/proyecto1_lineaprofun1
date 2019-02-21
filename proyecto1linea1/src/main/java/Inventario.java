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
public class Inventario {
    //inicio declaracion de variables
    
  private int codigoLibro;  // codigo unico que se le asigna a cada libro 
  private int cantidad; // cantidad de libros que llegan por codigo de libro
  private String ubicacion; // ubicacion fisica de donde se encuentra el  fisico ( como numero de stand)
  private int valorCompra;// valor de compra de libro 
      //fin  declaracion de variables

  
      //inicio  creacion de constructor

    public Inventario(int codigoLibro, int cantidad, String ubicacion,int valorCompra) {
        this.codigoLibro = codigoLibro;
        this.cantidad = cantidad;
        this.ubicacion = ubicacion;
        this.valorCompra= valorCompra;
    }
      //fin  declaracion de constructor


//incio de metodos
public void registrarPedidoprovee(){}// este metodo se encarga de recibir el nuevo pedido que es traido por los proveedores y registrarlos en el sistema  
  


//fin de metodos


}//fin de clase
