/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author JoséEzequiel
 */
public class ArrayTradicional {
    
    public static void main(String [] args){
        
        //El array te permite almacenar más de un valor para un tipo de dato
        //double sueldo = 1200;
        double sueldos [] = {1200, 1300, 1400};
        
        //los corchetes puede ir antes del identificador si quieres
        String [] nombre  = { "Juan", "Ana", "Fernando"};
        
        //Tienes que amoldarte siempre a los tipos de datos
        //si son char pues entre comillas simples
        char generos [] = { 'f', 'm'};
        
        //Hay otras formas de inicializar los arrays
        int dias [] = new int[]{1,2,4,5,6,7,8,9};
        char [] diasSemana = new char[]{'l', 'm', 'x', 'j', 'v', 's', 'd'};
        String [] meses = new String[]{"Enero", "Febrero"};
        
        //Sueldos ordenados ascendentemente
        Arrays.sort(sueldos);
        
        //Cuando necesites sacar el vector por pantalla y
        //quieras ahorrarte el for puedes usar lo siguiente
        System.out.println(Arrays.toString(sueldos));
        
        //recorrer un array, lista, arreglo, vector
        //int i = 0 es la condicion inicial
        //i < sueldos.length condición de continuación
        //i++ lo que quieres que haga i en cada vuelta
        System.out.println("Orden ascendente");
        for(int i = 0; i < sueldos.length; i++){
            System.out.println(sueldos[i]);
        }
        
        //recorrer en orden inverso
        System.out.println("Orden descendente");
        for(int i = sueldos.length - 1; i >= 0; i--){
            System.out.println(sueldos[i]);            
        }
        
        
        //Scanner permite que el usuario escriba datos al programa
        Scanner entradaEstandarUsuario = new Scanner(System.in);
        
        //Podrias simplemente tener la declaración y luego la definicion
        //Eso significa que le indicas el número de elementos que va a haber
        String articulos [] = new String[5];
        
        //length te dice que tu array articulos tiene 40 espacios
        for( int i = 0; i < articulos.length; i++){
            System.out.println("Introduce artículo");
            //lee lo que escriba el usuario transformandolo a String
            articulos[i] = entradaEstandarUsuario.nextLine();
        }
        
        //Arrays.toString realiza un represtación 
        //Por ejemplo articulos tiene ["Tomate", "aguacate", "pimiento", "platano", "mango"]
        //Arrays.toString tomaria los elementos los devuelve todos juntos en un String
        //y si metemos esto dentro de un System.out.println tendremos por pantalla el resultado
        System.out.println(Arrays.toString(articulos));
        //si no usamos lo anterior e intentamos sacar directamente el array veremos una cadena
        //java.lang.String;@61651651
        //java.lang.String significa que el array es de tipo String
        //@61651651 esto es un identificador hexadecimal creado por Java
        //pero no nos saca los elementos que contiene que es lo que nos interesa
        System.out.println(articulos); 
        
    }
    
}
