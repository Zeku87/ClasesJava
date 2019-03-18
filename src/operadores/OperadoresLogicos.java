/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operadores;

/**
 *
 * @author JoséEzequiel
 */
public class OperadoresLogicos {

    public static void main(String [] args){
        
        //Operadores lógicos && -> AND || -> OR  ! -> NOT
        //Comparadores !=, ==, <, >, <=, >=
        
        //Tipos double y float para representar números grandes en decimal
        //El double es para números mas grandes que float
        double sueldo = 1556.35;
        
        //Comprobamos que el sueldo sea mayor que 1000 y menor que 2000
        if(sueldo > 1000 && sueldo < 2000){
            System.out.println("Sueldo " + sueldo);
        }
     
        //El tipo string contiene una secuencia de caracteres
        String nombre = "Juan";
        String vacio = "";
        //null y vacio son cosas diferentes en el String
        //el int, float, double, char no pueden ser null
        
        //Queremos comprobar que el nombre no es nulo ni esta vacío
        if(  nombre != null && !nombre.isEmpty()){
            System.out.println("Nombre " + nombre);
        }else{
            System.out.println("El nombre no debe ser null ni tampoco vacío");            
        }
        
        
        char genero = 'f';
        
        //  || -> que cualquiera de las comparaciones se cumpla
        if( genero == 'f' || genero == 'm' ){
            System.out.println("Masculino o Femenino. Me da igual");
        }else{
            System.out.println("No es ni femenino ni masculino");            
        }
        
        
        
    }
    
}


