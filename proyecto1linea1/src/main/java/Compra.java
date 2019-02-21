/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Johann alejandro torres soler 
 * @version 1.0
 */
public class Compra {//incio de clase
    
    //incio declaracion de variables
   private int numeroFactura; // variable  numero de factura asignada automaticamente por el sistema 
   private String  detalleFactura; // campo  detalle factura donde  se asignara los datos de la compra
    private String valorCompra;  // variable donde se dara el costo total de la compra 
    private String impuestos; // impuestos que pague la empresa 
    
    
   //fin declaracion de variables
    
    
    //inciio de constructor
    
       public Compra(int numeroFactura, String detalleFactura, String valorCompra, String impuestos) {
        this.numeroFactura = numeroFactura;
        this.detalleFactura = detalleFactura;
        this.valorCompra = valorCompra;
        this.impuestos = impuestos;
    }
    
    //fin de constructor

   //inciio de metodos
       public void inmpuestos(){ }// en este metodo el admin asigna los impuetos dependiendo de su pais o estado
    public void compra(){} // en este metodo retornamos al cliente su factura con los datos    









}//fin de clase

