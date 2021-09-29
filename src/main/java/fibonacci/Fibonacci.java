/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fibonacci;

/**
 *
 * @author iampa
 */
public class Fibonacci {
    public static void main(String args[]){
        int i = 0, a = 0, b = 1, c = 0;
        System.out.println("Sucesión for: ");
        for(i = 0; i < 10; i++){
            if(i < 9){
                System.out.print(a + ",");
                c = a + b;
                a = b;
                b = c;
            } else {
                System.out.print(a);
            }
        }
        System.out.println("");
        i = 0;
        b = 1;
        a = 0;
        c = 0;
        System.out.println("Sucesión while: ");
        while(i < 10){
            if(i < 9){
                System.out.print(a + ",");
                c = a + b;
                a = b;
                b = c;
            } else {
                System.out.print(a);
            }
            i++;
        }
         System.out.println("");
        i = 0;
        b = 1;
        a = 0;
        c = 0;
        System.out.println("Sucesión do while: ");
        do {
             if(i < 9){
                System.out.print(a + ",");
                c = a + b;
                a = b;
                b = c;
            } else {
                System.out.print(a);
            }
            i++;
        }while(i < 10);
    }
    
}
