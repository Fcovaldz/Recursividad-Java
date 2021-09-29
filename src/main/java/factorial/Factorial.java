/*Calcular factorial de un numero.*/

package factorial;

import java.util.Scanner;

/**
 *
 * @author iampa
 */

public class Factorial {
    public static void main(String args[]){
        
        Scanner leer = new Scanner(System.in);
        int numero = 0; //almacenara el numero
        int factorial = 1; // " valor final.
        System.out.println("Digite el número a calcular su factorial");
        numero = leer.nextInt();
        int numero1 = numero;
        while(numero != 0){
            factorial *= numero;
            numero --;
        }
        System.out.println("Factorial de " + numero1 + "es: " + factorial);
    }
}



    /*Scanner sc = new Scanner(System.in);
    System.out.print("Digite un número: ");
    int num = sc.nextInt();
    //Mostamos resultado
    System.out.printf("El factorial de %d es %.0f", num, fact(num));
    
    }
    
public static double fact(int n) {
double aux = 1;
for(int i = 2; 1 <= n; i++) {
aux = aux * i;
}
return aux;
}
}
*/