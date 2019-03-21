/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructuras_condicionales;

/**
 *
 * @author JoséEzequiel
 */
public class Switch {
    
    //Switch solo puede leer variables discretas
    //es decir con un valor determinado
    //un valor decimal no es un valor determinado
    //por lo tanto el switch solo lee de tipos como: byte, int, long, char, String
    public static void main(String [] args){
        
        //Imaginate que tienes una hoja de preferencias
        //de usuarios donde almacenas mediante un valor
        //el estilo de la interfaz gráfica
        int estiloInterfaz;
        
        //el usuario elige un estilo
        estiloInterfaz = 451;
        
        //hay que poner break al final de cada caso
        //porque si no se pasa automaticamente al caso siguiente
        switch(estiloInterfaz){
            case 0:
                System.out.println("Estilo normal");
                break;
            case 1:
                System.out.println("Estilo Rap");
                break;
            case 2:
                System.out.println("Estilo Gotico");
                break;
            default:
                System.out.println("Por defecto estilo Horas de aventura");
        }
        
    }
    
}
