/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays;

/**
 *
 * @author JoséEzequiel
 */
public class While {

    public static void main(String[] argumentos) {
        //Al igual que el for el while también nos va a servir
        //para recorrer el array y además establecer condiciones
        int[] numeros = {2, 3, 4, 5, 6, 8, 13};

        for (int i = 0; i < numeros.length; i++) {

            //Por ejemplo queremos sacar los elementos pares del vector
            if (numeros[i] % 2 == 0) {
                System.out.println(numeros[i]);
            }
        }

        //Para recorrer un array podemos usar un while
        //condición inicial
        int i = 0;

        //condición de continuación
        while (i < numeros.length) {

            //Por ejemplo queremos sacar los elementos pares del vector
            if (numeros[i] % 2 == 0) {
                System.out.println(numeros[i]);
            }

            //esta i++ sería la hermana de la i++ del for
            i++;
        }

        //El while necesita para ejecutar su cuerpo
        //que la condición se cumpla
        int contadorDeDisparos = 0;
        
        while(contadorDeDisparos < 3){
            System.out.println("Dispara");
            contadorDeDisparos ++;
        }
    }

}
