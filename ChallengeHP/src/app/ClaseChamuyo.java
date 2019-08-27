package app;

import java.util.Scanner;

/**
 * ClaseChamuyo
 */
public class ClaseChamuyo {

    public void metodoChamuyo(){

        Scanner Teclado = new Scanner(System.in);
            
        int a, b, c, b;

        System.out.println("INGRESE EL MULTIPLICANDO:");
        a = Teclado.nextInt();
        
        System.out.println("INGRESE EL MULTIPLICADOR:");
        b = Teclado.nextInt();

        System.out.println("INGRESE EL SUSTRAENDO:");
        c = Teclado.nextDouble();

        
        d = ((a * b) - c);

        System.out.println("EL RESULTADO DE LA OPERACION ES: "+ d);

    }
}