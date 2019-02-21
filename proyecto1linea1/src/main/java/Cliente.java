/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author johann alejandro torres soler 
 * @version  1.0
 */
public class Cliente {// incio clase
    
    //inicio creacion de variables 
    private String nombreUser; // variable nombre de usuario
    private String apellidoUser;// variable apellido del usuario
    private String sexoUser;   // vatiable sexo del usuario
    private String fechaNacimiento; // variable fecha de nacimiento del usuario
    private  int   edad;   // variable edad del usuario
    private String correo;  // variable correo electronico del usuario
    private int saldoActual;  // variable saldo actual que tiene el usuario
    private int saldoNuevo;  // variable saldo nuevo asignado despues de realizar una compra 
    //fin declaracion de variables

    
        //inicio creacion de constructor
    public Cliente(String nombreUser, String apellidoUser, String sexoUser, String fechaNacimiento, int edad, String correo, int saldoActual, int saldoNuevo) {
        this.nombreUser = nombreUser;
        this.apellidoUser = apellidoUser;
        this.sexoUser = sexoUser;
        this.fechaNacimiento = fechaNacimiento;
        this.edad = edad;
        this.correo = correo;
        this.saldoActual = saldoActual;
        this.saldoNuevo = saldoNuevo;
    }
    //fin creacion de constructor

   
    
    
    
    //inicio creacion de metodos 
    
    
    public void crearCliente(){} // el metodo crear cliente permitira al usuario registrarse o al admin crear un cliente
    
    
    //el metodo realizar compra , es el encargado de verificar saldo actual del cliente y
    //compararlo  con el valor del libro y asi permitr la operacion de comprar el libro
     public void realizarCompra(){
         
         while (saldoActual >= valorLibro){//esta parte se encarga de verificar el salfo con el valor del libro
         
             this.saldoNuevo= valorLibro - saldoActual;// aca nos encargamos de restarle el valor al saldo
             this.saldoActual = saldoNuevo; // aca asignamos el nuevo saldo 
         }
         
     }
         
       public void consultaSaldo(){} // en este metodo el usuario podra ver su saldo disponible  
         
         
     // fin de creacion de metodos    
         
         
     
    
    
    
    
}//fin clase
