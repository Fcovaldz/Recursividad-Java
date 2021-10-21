/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglo;

/**
 *
 * @author iampa
 */
public class ImprimeArreglo {
    static String [] arreglo = {"¡Que", "onda!","Mundo,", "Soy", "Un", "Arreglo."};
    static String acum = "";
    public static void main(String[] args){
        for(int i = 0; i <arreglo.length; i++){
            acum+=arreglo[i]+" ";
            
        }
        System.out.println(acum);
    }
}
