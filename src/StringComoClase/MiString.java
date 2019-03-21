/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StringComoClase;

import java.util.Arrays;

/**
 *
 * @author JoséEzequiel
 */
public class MiString {
    
    
    public static void main(String [] parametros){
        String palabra = "Alberto";
        
        //podemos concatenar palabras mediante el símbolo +
        //estamos concatenando a palabra la cadena " es listo"
        palabra = palabra + " es listo";
        System.out.println(palabra);
        
        //hay otra forma de concatenar y es llamando a concat
        //debemos guardar la concatenación porque es temporal
        palabra = palabra.concat(" y además amable");
        System.out.println(palabra);
        
        //nos saca el caracter asociado a la posición i
        int i = 0;
        char primeraLetra = palabra.charAt(i);
        System.out.println(primeraLetra);
        
        //sacamos el caracter representado por un entero
        //en la posición dada como parametro de entrada
        int caracter = palabra.codePointAt(1);
        System.out.println(caracter);//97 = a
        
        
        //vamos a mirar si la cadena contiene la palabra aprender
        //contains devuelve true si aprender está contenida en la cadena
        if( palabra.contains("larg") ){
            System.out.println("Sí la palabra largo está dentro");
        }else{
            System.out.println("Esa palabra no está");
        }
        
        //normalmente no vamos a usar compareTo en tipos primitivos
        //porque ya tienen algoritmos diseñados para ordenar y comparar automaticamente
        //aun así el número que te devuelve es la distancia lexicográfica
        //es decir el número de letras de distancia de una palabra a otra
        int comparador = palabra.compareTo("Ana");
        System.out.println(comparador);
        
        
        String [] nombres = {"Ana", "Juan", "Alberto", "Patricia", "Laura", "Estefanía"};
        //internamente utiliza para ordenar el método compareTo
        Arrays.sort(nombres);
        System.out.println(Arrays.toString(nombres));
        
        
        
        //más utilidades
        //Otra forma de definir un String es mediante la palabra new
        String estacion = new String("              La primavera la sangre altera. La primavera huele bien                ");
        //estacion.length() numero de caracteres de un String
        System.out.println("Tamaño del string: " + estacion.length());
        System.out.println("Subcadena: " + estacion.substring(3));
        System.out.println("Subcadena2: " + estacion.substring(3, 12));
        System.out.println("Mayúsculas: " + estacion.toUpperCase());
        System.out.println("Minúsculas: " + estacion.toLowerCase());
        System.out.println("A partir de que posición se encuentra primavera: " + estacion.indexOf("primavera"));
        System.out.println("A partir de que posición se encuentra la última primavera: " + estacion.lastIndexOf("primavera"));
        System.out.println("Eliminamos espacios en blanco laterales " + estacion.trim());
        
        //Vamos iterar, es decir, vamos a recorrer un String
        //usando un for
        for(int indice = 0; indice < estacion.length(); indice++){
            System.out.println(estacion.charAt(indice));
        }
        
        
        ///comprobar que dos cadenas son iguales
        String str = "Hola";
        String str2 = "Hola";
        if(str.equals(str2)){
            System.out.println("Ambos son iguales");
        }
        
        if(str.compareTo(str2) == 0){
            System.out.println("Ambos son iguales");
        }
        
        String opcion = "";
        String noEsLoMismoQueNull = null;
        
        if(opcion.isEmpty()){
            System.out.println("Has dejado la opción vacía");
        }
        
        //Lo que se suele hacer es comprobar primero si el String es null
        //y ya luego hacemos las demas comprobaciones y operaciones
        // != diferente de
        if(noEsLoMismoQueNull != null){
            if(noEsLoMismoQueNull.isEmpty()){
                System.out.println("Está vacío");
            }
        }else{
                System.out.println("En este caso no está vacío sino que es null");
        }

        //Split, match, replace, replaceAll, startsWith
        String articulos = "Manzana, platano, uvas, papaya, melocotón";
        
        String [] articulosArray = articulos.split(", ");
        System.out.println(Arrays.toString(articulosArray));
        
        String jeroglifico = "fd98fysd9fuihd9f8hshudiofn32eefwef";
        //sustituye las letras minúsculas por el símbolo +
        jeroglifico = jeroglifico.replaceAll("[a-z]", "+");
        System.out.println(jeroglifico);
    }
    
}
