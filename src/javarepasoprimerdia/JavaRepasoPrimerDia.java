/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javarepasoprimerdia;

import java.util.Scanner;

/**
 *
 * @author JoséEzequiel
 */
public class JavaRepasoPrimerDia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Preparamos un objeto Scanner para pedirle datos por teclado
        //al usuario más adelante
        Scanner entradaUsuario = new Scanner(System.in);
                        
        System.out.println("Hola y bienvenida");
        
        Cliente unCliente = new Cliente();
        
        System.out.println("Ingresa tu nombre");
        String nombre = entradaUsuario.nextLine();
        
        System.out.println("Ingresa tu email");
        String email = entradaUsuario.nextLine();
        
        unCliente.nombre = nombre;
        unCliente.email = email;
        
        
        ////FUNCIONES
        
        int resultado = sumaUno(5);
        System.out.println("Cinco mas uno = " + resultado);
                            //"Cinco mas uno = 6"
    }
    
    
    public static int sumaUno(int numero)
    {
        return numero + 1;
    }
    
    
}
