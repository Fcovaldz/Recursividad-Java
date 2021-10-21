/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mcd;

import java.util.Scanner;

/**
 *
 * @author iampa
 */
public class Euclides {
     public static void main(String[] args){
     Scanner leer = new Scanner(System.in);
   
        int num1,num2;
         System.out.println("Ingrese el primer numero: ");
        num1=leer.nextInt();
         System.out.println("Ingrese el segundo numero: ");
        num2=leer.nextInt();
        
        while(num1 != num2)
            if(num1>num2)
                num1= num1-num2;
            else
                num2= num2 -num1;
        
         System.out.println("El MCD es: " + num1);
     }
}
