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
public class OperadoresAritmeticos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Operadores aritmeticos son: +, -, *, /, %
        //Los números pueden ser int long float double
        int numero1 = 100;
        int numero2 = 20;
        int resultado;
        
        //asignamos las operaciones a la variable resultado
        resultado = numero1 + numero2;
        System.out.println(resultado);
        
        resultado = numero1 - numero2;
        System.out.println(resultado);
        
        resultado = numero1 * numero2;
        System.out.println(resultado);
        
        //operación modulo nos da el resto de la división
        resultado = numero1 % numero2;
        System.out.println(resultado);
        

    }
    
}
