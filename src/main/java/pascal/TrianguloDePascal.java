/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pascal;

import java.util.Scanner;

/**
 *
 * @author iampa
 */
public class TrianguloDePascal {
    public static void main(String[] args){
    Scanner leer = new Scanner(System.in);
    
        System.out.println("Ingrese un número: ");
        int rows = leer.nextInt();
        
        for(int i = 0; i < rows; i++){
        int num = 1;
            System.out.format("%"+(rows-i)*2+"s","");
            for(int j = 0; j <= i; j++){
                System.out.format("%4d", num);
                num = num * (i - j) / (j + 1);
            }
            System.out.println();
        }
    }
}
