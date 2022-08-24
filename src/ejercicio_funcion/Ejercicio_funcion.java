
package ejercicio_funcion;

import java.util.Scanner;


public class Ejercicio_funcion {

    public static void main(String[] args) {               
        Scanner entrada = new Scanner(System.in);
        int num1,num2,num3,suma;
        
        System.out.print ("Digite 3 nùmeros: ");
        num1 = entrada.nextInt();
        num2 = entrada.nextInt();
        num3 = entrada.nextInt();

        suma = num1+num2+num3;
                
        System.out.println("\nLa suma es: "+suma);
        
    }
    
}
